/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.consulta;

import clinicamedicapoo.medico.Medico;
import clinicamedicapoo.medico.MedicoTableModel;
import clinicamedicapoo.paciente.Paciente;
import clinicamedicapoo.paciente.PacienteTableModel;
import clinicamedicapoo.secretaria.Secretaria;
import clinicamedicapoo.usuario.UsuarioController;
import clinicamedicapoo.view.TelaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;

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
    private PacienteTableModel paciente_table_model;
    private MedicoTableModel medico_table_model;

    public ConsultaController(UsuarioController usuarioController, Secretaria secretaria, Medico medico, ConsultaTableModel consulta_table_model, TelaPrincipal tela_principal, MedicoTableModel medico_table_model) {
        this.usuarioController = usuarioController;
        this.secretaria = secretaria;
        this.medico = medico;
        this.consulta_table_model = consulta_table_model;
        this.tela_principal = tela_principal;
        this.medico_table_model = medico_table_model;
    }
    
    public void telaConsultas(){
        actionlistener = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                List<Consulta> consulta = null;
                consulta_table_model = tela_principal.getConsulta_view().getConsulta_table_model();
                consulta_table_model.limpar();
                if(usuarioController.getUsuarioLogado().getMedico() == null){
                    consulta = secretaria.consultarConsultas("", "", "", "");
                }else{
                    JOptionPane.showMessageDialog(null, "O usúario deve ser secretária para acessar as consultas!");
                    return;
                }
                consulta_table_model.addListaDeConsultas(consulta);
                tela_principal.getConsulta_view().setVisible(true);
                tela_principal.getConsulta_view().setConsulta_table_model(consulta_table_model);
            }
        };
        tela_principal.getjButton_consulta().addActionListener(actionlistener);
    }
    
    public void adicionarConsulta(){
        actionlistener = new ActionListener() {            
            public void actionPerformed(ActionEvent ae) {
                tela_principal.getConsulta_view().getConsulta_registro_view().setVisible(true);
                limparTelaRegistroConsulta();
            }
        };
        tela_principal.getConsulta_view().getJbutton_adicionar().addActionListener(actionlistener);
    }
    
    public void limparTelaRegistroConsulta(){
        ConsultaRegistroView cr = tela_principal.getConsulta_view().getConsulta_registro_view();
        cr.getjCombo_tipo_consulta().setSelectedIndex(0);
        cr.getjText_Paciente().setText("");
        cr.getjText_hora().setText("");
        cr.getjText_medico().setText("");
        cr.getJtext_data().setText("");
    }
    
    public void editarPaciente(){
        actionlistener = new ActionListener() {            
            public void actionPerformed(ActionEvent ae) {
                Consulta c = null;
                int linhaselecionada = tela_principal.getConsulta_view().getjTable_consulta().getSelectedRow();
                if(linhaselecionada == -1){
                    JOptionPane.showMessageDialog(null, "Selecione um registro");
                    return;
                }
                int consulta_id = Integer.parseInt(tela_principal.getConsulta_view().getjTable_consulta().getValueAt(linhaselecionada, 0).toString());
                if(usuarioController.getUsuarioLogado().getMedico() == null){
                    c = secretaria.buscarConsulta(consulta_id);
                }else{
//                    p = medico.buscarPaciente(pacienteId);
                }
                if(c != null){
                    tela_principal.getConsulta_view().getConsulta_registro_view().setVisible(true);
                    preencherTelaRegistrarConsulta(c);
                }
            }
        };
        tela_principal.getConsulta_view().getJbutton_editar().addActionListener(actionlistener);
    }
    
    public void preencherTelaRegistrarConsulta(Consulta c){
        ConsultaRegistroView cr = tela_principal.getConsulta_view().getConsulta_registro_view();
        cr.getjCombo_tipo_consulta().setSelectedItem(c.getTipo());
        cr.getjText_Paciente().setText(c.getPaciente().toStringCompleto());
        cr.getjText_hora().setText(c.getHora());
        cr.getjText_medico().setText(c.getMedico().toString());
        cr.getJtext_data().setText(c.getData());
    }
    
    public void salvarPaciente(){
        actionlistener = new ActionListener() {            
            public void actionPerformed(ActionEvent ae) {
                List<Consulta> consulta = null;
                ConsultaRegistroView cr = tela_principal.getConsulta_view().getConsulta_registro_view();
                if(usuarioController.getUsuarioLogado().getMedico() == null){
                    if(cr.getjText_codigo().getText() == null && cr.getjText_codigo().getText().equals("")){
                        secretaria.salvarConsulta(
                                                    cr.getJtext_data().getText(),
                                                    cr.getMedico_selecionado(),
                                                    cr.getPaciente_selecionado(),
                                                    (TipoConsulta) cr.getjCombo_tipo_consulta().getSelectedItem(),
                                                    cr.getjText_hora().getText()
                                                    );
                                
                    }else{
                        secretaria.atualizarConsulta(
                                                    Integer.parseInt(cr.getjText_codigo().getText()),
                                                    cr.getJtext_data().getText(),
                                                    cr.getMedico_selecionado(),
                                                    cr.getPaciente_selecionado(),
                                                    (TipoConsulta) cr.getjCombo_tipo_consulta().getSelectedItem(),
                                                    cr.getjText_hora().getText());
                    }
                }else{
    //                medico..salvarConsulta(
//                                                    cr.getJtext_data().getText(),
//                                                    cr.getMedico_selecionado(),
//                                                    cr.getPaciente_selecionado(),
//                                                    (TipoConsulta) cr.getjCombo_tipo_consulta().getSelectedItem(),
//                                                    cr.getjText_hora().getText()
//                                                    );
                }
                limparTelaRegistroConsulta();
                cr.setVisible(false);
                String filtro_data_inicial = tela_principal.getConsulta_view().getjText_data_inicial().getText();
                String filtro_hora_inicial = tela_principal.getConsulta_view().getjText_hora_inicial().getText();
                String filtro_data_final = tela_principal.getConsulta_view().getjText_data_final().getText();
                String filtro_hora_final = tela_principal.getConsulta_view().getjtext_hora_final().getText();
                if(usuarioController.getUsuarioLogado().getMedico() == null){
                    consulta = secretaria.consultarConsultas(filtro_data_inicial, filtro_hora_inicial, filtro_data_final, filtro_hora_final);
                }else{
//                    paciente = medico.consultarPacientes(filtro);
                }
                consulta_table_model.limpar();
                consulta_table_model.addListaDeConsultas(consulta);
                tela_principal.getConsulta_view().setConsulta_table_model(consulta_table_model);
            }
        };
        tela_principal.getConsulta_view().getConsulta_registro_view().getjButton_salvar().addActionListener(actionlistener);
    }
    
    public void excluirPaciente(){
        actionlistener = new ActionListener() {            
            public void actionPerformed(ActionEvent ae) {
                int resposta = JOptionPane.showConfirmDialog(null, "Deseja Realmente excluir este registro?");
                List<Consulta> consulta = null;
                if(resposta == 0){
                    int linhaselecionada = tela_principal.getConsulta_view().getjTable_consulta().getSelectedRow();
                    int consulta_id = Integer.parseInt(tela_principal.getConsulta_view().getjTable_consulta().getValueAt(linhaselecionada, 0).toString());
                    if(usuarioController.getUsuarioLogado().getMedico() == null){
                        secretaria.deletarConsulta(consulta_id);
                    }else{
//                        medico.deletarConsulta(consulta_id)
                    }
                }
                String filtro_data_inicial = tela_principal.getConsulta_view().getjText_data_inicial().getText();
                String filtro_hora_inicial = tela_principal.getConsulta_view().getjText_hora_inicial().getText();
                String filtro_data_final = tela_principal.getConsulta_view().getjText_data_final().getText();
                String filtro_hora_final = tela_principal.getConsulta_view().getjtext_hora_final().getText();
                if(usuarioController.getUsuarioLogado().getMedico() == null){
                    consulta = secretaria.consultarConsultas(filtro_data_inicial, filtro_hora_inicial, filtro_data_final, filtro_hora_final);
                }else{
//                    paciente = medico.consultarPacientes(filtro);
                }
                consulta_table_model.limpar();
                consulta_table_model.addListaDeConsultas(consulta);
                tela_principal.getConsulta_view().setConsulta_table_model(consulta_table_model);
            }
        };
            tela_principal.getConsulta_view().getJbutton_excluir().addActionListener(actionlistener);
    }
    
    public void filtrarConsultas(){
        actionlistener = new ActionListener() {            
            public void actionPerformed(ActionEvent ae) {
                List<Consulta> consulta = null;
                String filtro_data_inicial = tela_principal.getConsulta_view().getjText_data_inicial().getText();
                String filtro_hora_inicial = tela_principal.getConsulta_view().getjText_hora_inicial().getText();
                String filtro_data_final = tela_principal.getConsulta_view().getjText_data_final().getText();
                String filtro_hora_final = tela_principal.getConsulta_view().getjtext_hora_final().getText();
                if(usuarioController.getUsuarioLogado().getMedico() == null){
                    consulta = secretaria.consultarConsultas(filtro_data_inicial, filtro_hora_inicial, filtro_data_final, filtro_hora_final);
                }else{
//                    paciente = medico.consultarPacientes(filtro);
                }
                consulta_table_model.limpar();
                consulta_table_model.addListaDeConsultas(consulta);
                tela_principal.getConsulta_view().setConsulta_table_model(consulta_table_model);
            }
        };
        tela_principal.getConsulta_view().getjButton_pesquisar().addActionListener(actionlistener);
    }
    
    public void cancelarRegistroConsulta(){
        actionlistener = new ActionListener() {            
            public void actionPerformed(ActionEvent ae) {
                limparTelaRegistroConsulta();
                tela_principal.getConsulta_view().getConsulta_registro_view().setVisible(false);
            }
        };
        tela_principal.getConsulta_view().getConsulta_registro_view().getjButton_cancelar().addActionListener(actionlistener);
    }
    
    public void selecionarPaciente(){
        actionlistener = new ActionListener() {            
            public void actionPerformed(ActionEvent ae) {
                    int linhaselecionada = tela_principal.getConsulta_view().getConsulta_registro_view().getSelecionar_paciente_view().getjTable_selecionar_paciente().getSelectedRow();
                    if(linhaselecionada == -1){
                        JOptionPane.showMessageDialog(null, "Selecione um registro");
                        return;
                    }
                    int paciente_id = Integer.parseInt(tela_principal.getConsulta_view().getConsulta_registro_view().getSelecionar_paciente_view().getjTable_selecionar_paciente().getValueAt(linhaselecionada, 0).toString());
                    if(usuarioController.getUsuarioLogado().getMedico() == null){
                        Paciente pacienteselecionado = secretaria.buscarPaciente(paciente_id);
                        tela_principal.getConsulta_view().getConsulta_registro_view().setPaciente_selecionado(pacienteselecionado);
                        tela_principal.getConsulta_view().getConsulta_registro_view().getjText_Paciente().setText(pacienteselecionado.toString());
                        tela_principal.getConsulta_view().getConsulta_registro_view().getSelecionar_paciente_view().setVisible(false);
                    }else{
//                        medico.deletarConsulta(consulta_id)
                    }
            }
        };
            tela_principal.getConsulta_view().getConsulta_registro_view().getSelecionar_paciente_view().getjButton_salvar().addActionListener(actionlistener);
    }
    
    public void cancelarSelecaoPaciente(){
        actionlistener = new ActionListener() {            
            public void actionPerformed(ActionEvent ae) {
                tela_principal.getConsulta_view().getConsulta_registro_view().getSelecionar_paciente_view().setVisible(false);
            }
        };
        tela_principal.getConsulta_view().getConsulta_registro_view().getSelecionar_paciente_view().getjButton_cancelar().addActionListener(actionlistener);
    }
    
    public void abrirSelecaoPaciente(){
        actionlistener = new ActionListener() {            
            public void actionPerformed(ActionEvent ae) {
                List<Paciente> paciente = null;
                paciente_table_model = tela_principal.getConsulta_view().getConsulta_registro_view().getSelecionar_paciente_view().getPaciente_table_model();
                paciente_table_model.limpar();
                if(usuarioController.getUsuarioLogado().getMedico() == null){
                    paciente = secretaria.consultarPacientes("");
                }else{
//                    List<Paciente> paciente = medico.consultarPacientes("");
                }
                paciente_table_model.addListaDePacientes(paciente);                
                tela_principal.getPaciente_consulta().setPaciente_table_model(paciente_table_model);
                tela_principal.getConsulta_view().getConsulta_registro_view().getSelecionar_paciente_view().setVisible(true);
            }
        };
        tela_principal.getConsulta_view().getConsulta_registro_view().getjButton_selecionar_paciente().addActionListener(actionlistener);
    }
    
    public void abrirSelecaoMedico(){
        actionlistener = new ActionListener() {            
            public void actionPerformed(ActionEvent ae) {
                List<Medico> medico = null;
                medico_table_model = tela_principal.getConsulta_view().getConsulta_registro_view().getSelecionar_medico_view().getMedico_table_model();
                medico_table_model.limpar();
                if(usuarioController.getUsuarioLogado().getMedico() == null){
                    medico = secretaria.consultarMedicos("");
                }else{
//                    List<Paciente> paciente = medico.consultarPacientes("");
                }
                medico_table_model.addListaDeMedicos(medico);
                tela_principal.getConsulta_view().getConsulta_registro_view().getSelecionar_medico_view().setMedico_table_model(medico_table_model);
                tela_principal.getConsulta_view().getConsulta_registro_view().getSelecionar_paciente_view().setVisible(true);
            }
        };
        tela_principal.getConsulta_view().getConsulta_registro_view().getjButton_selecionar_medico().addActionListener(actionlistener);
    }
    
    public void cancelarSelecaoMedico(){
        actionlistener = new ActionListener() {            
            public void actionPerformed(ActionEvent ae) {
                tela_principal.getConsulta_view().getConsulta_registro_view().getSelecionar_medico_view().setVisible(false);
            }
        };
        tela_principal.getConsulta_view().getConsulta_registro_view().getSelecionar_medico_view().getjButton_cancelar().addActionListener(actionlistener);
    }
    
    public void selecionarMedico(){
        actionlistener = new ActionListener() {            
            public void actionPerformed(ActionEvent ae) {
                    int linhaselecionada = tela_principal.getConsulta_view().getConsulta_registro_view().getSelecionar_medico_view().getjTable_selecionar_medico().getSelectedRow();
                    if(linhaselecionada == -1){
                        JOptionPane.showMessageDialog(null, "Selecione um registro");
                        return;
                    }
                    int medico_id = Integer.parseInt(tela_principal.getConsulta_view().getConsulta_registro_view().getSelecionar_medico_view().getjTable_selecionar_medico().getValueAt(linhaselecionada, 0).toString());
                    if(usuarioController.getUsuarioLogado().getMedico() == null){
                        Medico medicoselecionado = secretaria.buscarMedico(medico_id);
                        tela_principal.getConsulta_view().getConsulta_registro_view().setMedico_selecionado(medicoselecionado);
                        tela_principal.getConsulta_view().getConsulta_registro_view().getjText_medico().setText(medicoselecionado.toString());
                        tela_principal.getConsulta_view().getConsulta_registro_view().getSelecionar_medico_view().setVisible(false);
                    }else{
//                        medico.deletarConsulta(consulta_id)
                    }
            }
        };
            tela_principal.getConsulta_view().getConsulta_registro_view().getSelecionar_paciente_view().getjButton_salvar().addActionListener(actionlistener);
    }
}
