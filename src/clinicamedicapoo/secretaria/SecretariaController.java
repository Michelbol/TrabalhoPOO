/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.secretaria;

import clinicamedicapoo.paciente.Paciente;
import static clinicamedicapoo.paciente.Paciente.inserirPaciente;
import clinicamedicapoo.paciente.PacienteTableModel;
import clinicamedicapoo.paciente.TipoConvenio;
import clinicamedicapoo.utilitarios.Sexo;
import clinicamedicapoo.view.TelaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author miche
 */
public class SecretariaController {
    private ActionListener actionlistener;
    private TelaPrincipal tela_principal;
    private Secretaria secretaria;
    private PacienteTableModel paciente_table_model;
    
    public SecretariaController(Secretaria secretaria, TelaPrincipal tela_principal) {
        this.tela_principal = tela_principal;
        this.secretaria = secretaria;
    }
    
    public void consultarPacientes(){
        actionlistener = new ActionListener() {            
            public void actionPerformed(ActionEvent ae) {
                paciente_table_model = tela_principal.getPaciente_consulta().getPaciente_table_model();
                paciente_table_model.limpar();
                List<Paciente> paciente = secretaria.consultarPacientes("");
                paciente_table_model.addListaDePacientes(paciente);
                tela_principal.getPaciente_consulta().setVisible(true);
                tela_principal.getPaciente_consulta().setPaciente_table_model(paciente_table_model);
            }
        };
        tela_principal.view_paciente().addActionListener(actionlistener);
    }
    
    public void adicionarPaciente(){
        actionlistener = new ActionListener() {            
            public void actionPerformed(ActionEvent ae) {
                tela_principal.getPaciente_consulta().getPaciente_registro().setVisible(true);
            }
        };
        tela_principal.getPaciente_consulta().adicionarButton().addActionListener(actionlistener);
    }
    
    public void editarPaciente(){
        actionlistener = new ActionListener() {            
            public void actionPerformed(ActionEvent ae) {
                int linhaselecionada = tela_principal.getPaciente_consulta().pacienteTable().getSelectedRow();
                if(linhaselecionada == -1){
                    JOptionPane.showMessageDialog(null, "Selecione um registro");
                    return;
                }
                int pacienteId = Integer.parseInt(jtable_consulta_paciente.getValueAt(linhaselecionada, 0).toString());
                Paciente p = PacienteController.findPaciente();
//                if(p != null){
//                    paciente_registro.setVisible(true);
//                    paciente_registro.preencherTela(p);
//                }
                
                tela_principal.getPaciente_consulta().getPaciente_registro().setVisible(true);
                
            }
        };
        tela_principal.getPaciente_consulta().adicionarButton().addActionListener(actionlistener);
    }
}
