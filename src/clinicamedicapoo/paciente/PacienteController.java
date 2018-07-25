/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.paciente;

import clinicamedicapoo.medico.Medico;
import clinicamedicapoo.secretaria.Secretaria;
import clinicamedicapoo.usuario.UsuarioController;
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
public class PacienteController {
    private ActionListener actionlistener;
    private TelaPrincipal tela_principal;
    private Secretaria secretaria;
    private Medico medico;
    private PacienteTableModel paciente_table_model;
    UsuarioController usuarioController;
    
    public PacienteController(Secretaria secretaria, TelaPrincipal tela_principal, UsuarioController usuarioController, Medico medico) {
        this.tela_principal = tela_principal;
        this.secretaria = secretaria;
        this.usuarioController = usuarioController;
        this.medico = medico;
    }
    
    public void telaPacientes(){
        actionlistener = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                List<Paciente> paciente = null;
                paciente_table_model = tela_principal.getPaciente_consulta().getPaciente_table_model();
                paciente_table_model.limpar();
                if(usuarioController.getUsuarioLogado().getMedico() == null){
                    paciente = secretaria.consultarPacientes("");
                }else{
                    paciente = medico.consultarPacientes("");
                }
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
                limparTelaRegistroPaciente();
                if(usuarioController.getUsuarioLogado().getMedico() == null){
                    desativarDadosAdicionaisRegistroPaciente();
                }else{
                    ativarDadosAdicionaisRegistroPaciente();
                }
            }
        };
        tela_principal.getPaciente_consulta().adicionarButton().addActionListener(actionlistener);
    }
    
    public void editarPaciente(){
        actionlistener = new ActionListener() {            
            public void actionPerformed(ActionEvent ae) {
                Paciente p = null;
                int linhaselecionada = tela_principal.getPaciente_consulta().pacienteTable().getSelectedRow();
                if(linhaselecionada == -1){
                    JOptionPane.showMessageDialog(null, "Selecione um registro");
                    return;
                }
                int pacienteId = Integer.parseInt(tela_principal.getPaciente_consulta().pacienteTable().getValueAt(linhaselecionada, 0).toString());
                if(usuarioController.getUsuarioLogado().getMedico().equals(null)){
                    p = secretaria.buscarPaciente(pacienteId);
                }else{
                    p = medico.buscarPaciente(pacienteId);
                }
                if(p != null){
                    tela_principal.getPaciente_consulta().getPaciente_registro().setVisible(true);
                    preencherTelaRegistrarpaciente(p);
                }
                if(usuarioController.getUsuarioLogado().getMedico().equals(null)){
                    desativarDadosAdicionaisRegistroPaciente();
                }else{
                    ativarDadosAdicionaisRegistroPaciente();
                }
            }
        };
        tela_principal.getPaciente_consulta().editarButton().addActionListener(actionlistener);
    }
    
    public void salvarPaciente(){
        actionlistener = new ActionListener() {            
            public void actionPerformed(ActionEvent ae) {
                List<Paciente> paciente = null;
                PacienteRegistroView pc = tela_principal.getPaciente_consulta().getPaciente_registro();
                if(usuarioController.getUsuarioLogado().getMedico() == null){
                    if(pc.getJtext_Codigo().getText() == null && pc.getJtext_Codigo().getText().equals("")){
                        secretaria.salvarPaciente(
                        TipoConvenio.valueOf(pc.getjCombo_tipo_convenio().getSelectedItem().toString()),
                        pc.getjCheckBox_isFumante().isSelected(),
                        pc.getjCheckBox_isAlcolatra().isSelected(),
                        pc.getjCheckBox_isColesterol().isSelected(),
                        pc.getjCheckBox_isDiabetico().isSelected(),
                        pc.getjCheckBox_isDoencasCardiacas().isSelected(),
                        pc.getjText_cirurgias().getText(),
                        pc.getjText_alergias().getText(),
                        pc.getjCombo_ativo().getSelectedItem() == "Sim",
                        pc.getjText_nome().getText(),
                        pc.getjText_sobrenome().getText(),
                        pc.getjText_cpf().getText(),
                        pc.getjText_rg().getText(),
                        Sexo.valueOf(pc.getjCombo_sexo().getSelectedItem().toString()),
                        pc.getjText_dt_nascimento().getText(),
                        pc.getJtext_rua().getText(),
                        pc.getjText_nro().getText(),
                        pc.getjText_bairro().getText(),
                        pc.getjText_cep().getText(),
                        pc.getjText_telefone_Residencial().getText(),
                        pc.getjText_telefone_celular().getText(),
                        pc.getjText_email().getText(),
                        pc.getjText_cidade().getText(),
                        pc.getjCombo_estado().getSelectedItem().toString());
                    }else{
                        secretaria.atualizarPaciente(
                        Integer.parseInt(pc.getJtext_Codigo().getText()),
                        TipoConvenio.valueOf(pc.getjCombo_tipo_convenio().getSelectedItem().toString()),
                        pc.getjCheckBox_isFumante().isSelected(),
                        pc.getjCheckBox_isAlcolatra().isSelected(),
                        pc.getjCheckBox_isColesterol().isSelected(),
                        pc.getjCheckBox_isDiabetico().isSelected(),
                        pc.getjCheckBox_isDoencasCardiacas().isSelected(),
                        pc.getjText_cirurgias().getText(),
                        pc.getjText_alergias().getText(),
                        pc.getjCombo_ativo().getSelectedItem() == "Sim",
                        pc.getjText_nome().getText(),
                        pc.getjText_sobrenome().getText(),
                        pc.getjText_cpf().getText(),
                        pc.getjText_rg().getText(),
                        Sexo.valueOf(pc.getjCombo_sexo().getSelectedItem().toString()),
                        pc.getjText_dt_nascimento().getText(),
                        pc.getJtext_rua().getText(),
                        pc.getjText_nro().getText(),
                        pc.getjText_bairro().getText(),
                        pc.getjText_cep().getText(),
                        pc.getjText_telefone_Residencial().getText(),
                        pc.getjText_telefone_celular().getText(),
                        pc.getjText_email().getText(),
                        pc.getjText_cidade().getText(),
                        pc.getjCombo_estado().getSelectedItem().toString());
                    }
                }else{
                    if(pc.getJtext_Codigo().getText() == null && pc.getJtext_Codigo().getText().equals("")){
                        medico.salvarPaciente(
                        TipoConvenio.valueOf(pc.getjCombo_tipo_convenio().getSelectedItem().toString()),
                        pc.getjCheckBox_isFumante().isSelected(),
                        pc.getjCheckBox_isAlcolatra().isSelected(),
                        pc.getjCheckBox_isColesterol().isSelected(),
                        pc.getjCheckBox_isDiabetico().isSelected(),
                        pc.getjCheckBox_isDoencasCardiacas().isSelected(),
                        pc.getjText_cirurgias().getText(),
                        pc.getjText_alergias().getText(),
                        pc.getjCombo_ativo().getSelectedItem() == "Sim",
                        pc.getjText_nome().getText(),
                        pc.getjText_sobrenome().getText(),
                        pc.getjText_cpf().getText(),
                        pc.getjText_rg().getText(),
                        Sexo.valueOf(pc.getjCombo_sexo().getSelectedItem().toString()),
                        pc.getjText_dt_nascimento().getText(),
                        pc.getJtext_rua().getText(),
                        pc.getjText_nro().getText(),
                        pc.getjText_bairro().getText(),
                        pc.getjText_cep().getText(),
                        pc.getjText_telefone_Residencial().getText(),
                        pc.getjText_telefone_celular().getText(),
                        pc.getjText_email().getText(),
                        pc.getjText_cidade().getText(),
                        pc.getjCombo_estado().getSelectedItem().toString());
                    }else{
                        medico.atualizarPaciente(
                        Integer.parseInt(pc.getJtext_Codigo().getText()),
                        TipoConvenio.valueOf(pc.getjCombo_tipo_convenio().getSelectedItem().toString()),
                        pc.getjCheckBox_isFumante().isSelected(),
                        pc.getjCheckBox_isAlcolatra().isSelected(),
                        pc.getjCheckBox_isColesterol().isSelected(),
                        pc.getjCheckBox_isDiabetico().isSelected(),
                        pc.getjCheckBox_isDoencasCardiacas().isSelected(),
                        pc.getjText_cirurgias().getText(),
                        pc.getjText_alergias().getText(),
                        pc.getjCombo_ativo().getSelectedItem() == "Sim",
                        pc.getjText_nome().getText(),
                        pc.getjText_sobrenome().getText(),
                        pc.getjText_cpf().getText(),
                        pc.getjText_rg().getText(),
                        Sexo.valueOf(pc.getjCombo_sexo().getSelectedItem().toString()),
                        pc.getjText_dt_nascimento().getText(),
                        pc.getJtext_rua().getText(),
                        pc.getjText_nro().getText(),
                        pc.getjText_bairro().getText(),
                        pc.getjText_cep().getText(),
                        pc.getjText_telefone_Residencial().getText(),
                        pc.getjText_telefone_celular().getText(),
                        pc.getjText_email().getText(),
                        pc.getjText_cidade().getText(),
                        pc.getjCombo_estado().getSelectedItem().toString());
                    }
                }
                limparTelaRegistroPaciente();
                pc.setVisible(false);
                String filtro = tela_principal.getPaciente_consulta().getJtext_filtro_nome().getText();
                if(usuarioController.getUsuarioLogado().getMedico() == null){
                    paciente = secretaria.consultarPacientes(filtro);
                }else{
                    paciente = medico.consultarPacientes(filtro);
                }
                paciente_table_model.limpar();
                paciente_table_model.addListaDePacientes(paciente);
                tela_principal.getPaciente_consulta().setPaciente_table_model(paciente_table_model);
            }
        };
        tela_principal.getPaciente_consulta().getPaciente_registro().getjButton_salvar().addActionListener(actionlistener);
    }
    
    public void preencherTelaRegistrarpaciente(Paciente p){
        PacienteRegistroView pc = tela_principal.getPaciente_consulta().getPaciente_registro();
        pc.getjCombo_ativo().setSelectedItem(p.isAtivo() ? "Sim" : "Não");
        pc.getJtext_Codigo().setText(p.getId_pessoa().toString());
        pc.getjCombo_tipo_convenio().setSelectedIndex((p.getTipoconvenio() == TipoConvenio.Particular ? 0 : 1));
        pc.getjCheckBox_isFumante().setSelected(p.isIsFumante());
        pc.getjCheckBox_isAlcolatra().setSelected(p.isIsAlcolatra());
        pc.getjCheckBox_isColesterol().setSelected(p.isIsColesterol());
        pc.getjCheckBox_isDiabetico().setSelected(p.isIsDiabetico());
        pc.getjCheckBox_isDoencasCardiacas().setSelected(p.getDoencasCardiacas());
        pc.getjText_cirurgias().setText(p.getCirurgias());
        pc.getjText_alergias().setText(p.getAlergias());
        pc.getjText_nome().setText(p.getNome());
        pc.getjText_sobrenome().setText(p.getSobrenome());
        pc.getjText_cpf().setText(p.getCpf());
        pc.getjText_rg().setText(p.getRg());
        pc.getjCombo_sexo().setSelectedIndex(p.getSexo() == Sexo.Masculino ? 0 : 1);
        pc.getjText_dt_nascimento().setText(p.getDataNascimento());
        pc.getJtext_rua().setText(p.getRua());
        pc.getjText_nro().setText(p.getNumero());
        pc.getjText_bairro().setText(p.getBairro());
        pc.getjText_cep().setText(p.getCep());
        pc.getjText_telefone_Residencial().setText(p.getTelefone_residencial());
        pc.getjText_telefone_celular().setText(p.getTelefone_celular());
        pc.getjText_email().setText(p.getEmail());
        pc.getjText_cidade().setText(p.getCidade());
        pc.getjCombo_estado().setSelectedItem(p.getEstado());
    }
    
    public void limparTelaRegistroPaciente(){
        PacienteRegistroView pc = tela_principal.getPaciente_consulta().getPaciente_registro();
        pc.getJtext_Codigo().setText("");
        pc.getjCombo_ativo().setSelectedItem(0);
        pc.getjCombo_tipo_convenio().setSelectedIndex(0);
        pc.getjCheckBox_isFumante().setSelected(false);
        pc.getjCheckBox_isAlcolatra().setSelected(false);
        pc.getjCheckBox_isColesterol().setSelected(false);
        pc.getjCheckBox_isDiabetico().setSelected(false);
        pc.getjCheckBox_isDoencasCardiacas().setSelected(false);
        pc.getjText_cirurgias().setText("");
        pc.getjText_alergias().setText("");
        pc.getjText_nome().setText("");
        pc.getjText_sobrenome().setText("");
        pc.getjText_cpf().setText("");
        pc.getjText_rg().setText("");
        pc.getjCombo_sexo().setSelectedIndex(0);
        pc.getjText_dt_nascimento().setText("");
        pc.getJtext_rua().setText("");
        pc.getjText_nro().setText("");
        pc.getjText_bairro().setText("");
        pc.getjText_cep().setText("");
        pc.getjText_telefone_Residencial().setText("");
        pc.getjText_telefone_celular().setText("");
        pc.getjText_email().setText("");
        pc.getjText_cidade().setText("");
        pc.getjCombo_estado().setSelectedIndex(0);
    }
    
        public void ativarDadosAdicionaisRegistroPaciente(){
            PacienteRegistroView pc = tela_principal.getPaciente_consulta().getPaciente_registro();
            pc.getjPanel_dados_Adicionais().setEnabled(true);
            pc.getjCheckBox_isFumante().setEnabled(true);
            pc.getjCheckBox_isAlcolatra().setEnabled(true);
            pc.getjCheckBox_isColesterol().setEnabled(true);
            pc.getjCheckBox_isDiabetico().setEnabled(true);
            pc.getjCheckBox_isDoencasCardiacas().setEnabled(true);
            pc.getjText_cirurgias().setEnabled(true);
            pc.getjText_alergias().setEnabled(true);
    }
    
    public void desativarDadosAdicionaisRegistroPaciente(){
        PacienteRegistroView pc = tela_principal.getPaciente_consulta().getPaciente_registro();
        pc.getjPanel_dados_Adicionais().setEnabled(false);
        pc.getjCheckBox_isFumante().setEnabled(false);
        pc.getjCheckBox_isAlcolatra().setEnabled(false);
        pc.getjCheckBox_isColesterol().setEnabled(false);
        pc.getjCheckBox_isDiabetico().setEnabled(false);
        pc.getjCheckBox_isDoencasCardiacas().setEnabled(false);
        pc.getjText_cirurgias().setEnabled(false);
        pc.getjText_alergias().setEnabled(false);
    }
    
    public void cancelarRegistroPaciente(){
        actionlistener = new ActionListener() {            
            public void actionPerformed(ActionEvent ae) {
                limparTelaRegistroPaciente();
                tela_principal.getPaciente_consulta().getPaciente_registro().setVisible(false);
            }
        };
        tela_principal.getPaciente_consulta().getPaciente_registro().getjButton_cancelar().addActionListener(actionlistener);
    }
    
    public void filtrarPacientes(){
        actionlistener = new ActionListener() {            
            public void actionPerformed(ActionEvent ae) {
                List<Paciente> paciente = null;
                String filtro = tela_principal.getPaciente_consulta().getJtext_filtro_nome().getText();
                paciente_table_model = tela_principal.getPaciente_consulta().getPaciente_table_model();
                paciente_table_model.limpar();
                if(usuarioController.getUsuarioLogado().getMedico() == null){
                    paciente = secretaria.consultarPacientes(filtro);
                }else{
                    paciente = medico.consultarPacientes(filtro);
                }
                paciente_table_model.addListaDePacientes(paciente);
                tela_principal.getPaciente_consulta().setPaciente_table_model(paciente_table_model);
            }
        };
        tela_principal.getPaciente_consulta().filtrarButton().addActionListener(actionlistener);
    }
    
    public void excluirPaciente(){
        actionlistener = new ActionListener() {            
            public void actionPerformed(ActionEvent ae) {
                int resposta = JOptionPane.showConfirmDialog(null, "Deseja Realmente excluir este registro?");
                List<Paciente> paciente = null;
                if(resposta == 0){
                    int linhaselecionada = tela_principal.getPaciente_consulta().pacienteTable().getSelectedRow();
                    int paciente_id = Integer.parseInt(tela_principal.getPaciente_consulta().pacienteTable().getValueAt(linhaselecionada, 0).toString());
                    if(usuarioController.getUsuarioLogado().getMedico() == null){
                        secretaria.deletarPaciente(paciente_id);
                    }else{
                        medico.deletarPaciente(paciente_id);
                    }
                }
                String filtro = tela_principal.getPaciente_consulta().getJtext_filtro_nome().getText();
                if(usuarioController.getUsuarioLogado().getMedico() == null){
                    paciente = secretaria.consultarPacientes(filtro);
                }else{
                    paciente = medico.consultarPacientes(filtro);
                }
                paciente_table_model.limpar();
                paciente_table_model.addListaDePacientes(paciente);
                tela_principal.getPaciente_consulta().setPaciente_table_model(paciente_table_model);
            }
        };
            tela_principal.getPaciente_consulta().getJbutton_excluir().addActionListener(actionlistener);
    }
}
