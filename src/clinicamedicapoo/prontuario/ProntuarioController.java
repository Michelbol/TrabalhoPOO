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
import java.util.List;

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
                List<Prontuario> prontuarios = null;
                prontuario_table_model = tela_principal.getProntuario_Consulta_view().getProntuario_table_model();
                prontuario_table_model.limpar();
                if(usuarioController.getUsuarioLogado().getMedico() == null){
                    prontuarios = medico.consultarProntuarios("", "");
                }else{
                    //List<Paciente> paciente = medico.consultarPacientes("");
                }
                prontuario_table_model.addListaDeProntuarios(prontuarios);
                tela_principal.getProntuario_Consulta_view().setVisible(true);
                tela_principal.getProntuario_Consulta_view().setProntuario_table_model(prontuario_table_model);
            }
        };
        tela_principal.getjButton_prontuario().addActionListener(actionlistener);
    }
}
