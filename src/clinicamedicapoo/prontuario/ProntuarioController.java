/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.prontuario;

import clinicamedicapoo.medico.Medico;
import clinicamedicapoo.secretaria.Secretaria;
import clinicamedicapoo.usuario.Usuario;
import clinicamedicapoo.usuario.UsuarioController;
import clinicamedicapoo.view.TelaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author joaov
 */
public class ProntuarioController {
    private ActionListener actionlistener;
    private UsuarioController usuarioController;
    private ProntuarioTableModel prontuario_table_model;
    private TelaPrincipal tela_principal;
    private Secretaria secretaria;
    private Medico medico;
    
    public Usuario getUsuarioLogado() {
        return usuarioController.getUsuarioLogado();
    }

    public ProntuarioController(UsuarioController usuarioController, Secretaria secretaria, Medico medico, ProntuarioTableModel prontuario_table_model, TelaPrincipal tela_principal) {
        this.usuarioController = usuarioController;
        this.secretaria = secretaria;
        this.medico = medico;        
        this.prontuario_table_model = prontuario_table_model;
        this.tela_principal = tela_principal;
    }
    
    public void telaProntuario(){
        actionlistener = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (getUsuarioLogado().getMedico() == null){
                    JOptionPane.showMessageDialog(null, "O usuário deve ser médico para ver os prontuários.", "", ERROR_MESSAGE);
                    return;
                }
                List<Prontuario> prontuarios = new ArrayList();
                prontuario_table_model = tela_principal.getProntuario_Consulta_view().getProntuario_table_model();
                prontuario_table_model.limpar();
                prontuarios = medico.consultarProntuarios("", "");                
                prontuario_table_model.addListaDeProntuarios(prontuarios);
                tela_principal.getProntuario_Consulta_view().setVisible(true);
                tela_principal.getProntuario_Consulta_view().setProntuario_table_model(prontuario_table_model);
            }
        };
        tela_principal.getjButton_prontuario().addActionListener(actionlistener);
    }
    
    public void fecharConsulta(){
        actionlistener = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                tela_principal.getProntuario_Consulta_view().setVisible(false);
            }
        };
        tela_principal.getProntuario_Consulta_view().getBtFechar().addActionListener(actionlistener);
    }
    
    public void fecharRegistro(){
        actionlistener = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                tela_principal.getProntuario_Consulta_view().getProntuario_registro_view().setVisible(false);
            }
        };
        tela_principal.getProntuario_Consulta_view().getProntuario_registro_view().getBtCancelar().addActionListener(actionlistener);
    }
    
    public void adicionarProntuarios(){
        actionlistener = new ActionListener() {            
            public void actionPerformed(ActionEvent ae) {
                tela_principal.getProntuario_Consulta_view().getProntuario_registro_view().setVisible(true);
                limparTelaRegistroProntuario();
            }
        };
        tela_principal.getProntuario_Consulta_view().getBtNovoProntuario().addActionListener(actionlistener);
    }
    
    
    
    
    public void limparTelaRegistroProntuario(){
        ProntuarioRegistroView view = tela_principal.getProntuario_Consulta_view().getProntuario_registro_view();
        view.getInputId().setText("");
        view.getInputData().setText("");
        view.getTextAreaSintomas().setText("");
        view.getTextAreaDiagnostico().setText("");
        view.getTextAreaPrescricao().setText("");        
    }
}
