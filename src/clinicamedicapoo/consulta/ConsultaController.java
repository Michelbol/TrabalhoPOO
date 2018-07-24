/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.consulta;

import clinicamedicapoo.medico.Medico;
import clinicamedicapoo.paciente.PacienteTableModel;
import clinicamedicapoo.secretaria.Secretaria;
import clinicamedicapoo.usuario.UsuarioController;
import clinicamedicapoo.view.TelaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 *
 * @author miche
 */
public class ConsultaController {
    private ActionListener actionlistener;
    private UsuarioController usuarioController;
    private Secretaria secretaria;
    private Medico medico;
    private ConsultaTableModel consulta_table_model;
    private TelaPrincipal tela_principal;

    public ConsultaController(UsuarioController usuarioController, Secretaria secretaria, Medico medico, ConsultaTableModel consulta_table_model, TelaPrincipal tela_principal) {
        this.usuarioController = usuarioController;
        this.secretaria = secretaria;
        this.medico = medico;
        this.consulta_table_model = consulta_table_model;
        this.tela_principal = tela_principal;
    }
    
    public void telaConsultas(){
        actionlistener = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                List<Consulta> consulta = null;
                consulta_table_model = tela_principal.getConsulta_view().getConsulta_table_model();
                consulta_table_model.limpar();
                if(usuarioController.getUsuarioLogado().getMedico() == null){
                    consulta = secretaria.consultarConsultas("", "");
                }else{
//                    List<Paciente> paciente = medico.consultarPacientes("");
                }
                consulta_table_model.addListaDeConsultas(consulta);
                tela_principal.getConsulta_view().setVisible(true);
                tela_principal.getConsulta_view().setConsulta_table_model(consulta_table_model);
            }
        };
        tela_principal.getjButton_consulta().addActionListener(actionlistener);
    }
}
