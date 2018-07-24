/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.secretaria;

import clinicamedicapoo.paciente.Paciente;
import static clinicamedicapoo.paciente.Paciente.inserirPaciente;
import clinicamedicapoo.paciente.PacienteRegistroView;
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
    
    public void telaPacientes(){
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
                int pacienteId = Integer.parseInt(tela_principal.getPaciente_consulta().pacienteTable().getValueAt(linhaselecionada, 0).toString());
                Paciente p = secretaria.buscarPaciente(pacienteId);
                if(p != null){
                    tela_principal.getPaciente_consulta().getPaciente_registro().setVisible(true);
                    preencherTelaRegistrarpaciente(p);
                }                
            }
        };
        tela_principal.getPaciente_consulta().editarButton().addActionListener(actionlistener);
    }
    
    public void recuperarTelaRegistroPaciente(){
//        PacienteController.inserirPaciente(TipoConvenio.valueOf(jCombo_tipo_convenio.getSelectedItem().toString()),
//                jCheckBox_isFumante.isSelected(),
//                jCheckBox_isAlcolatra.isSelected(),
//                jCheckBox_isColesterol.isSelected(),
//                jCheckBox_isDiabetico.isSelected(),
//                jCheckBox_isDoencasCardiacas.isSelected(),
//                jText_cirurgias.getText(),
//                jText_alergias.getText(),
//                jCombo_ativo.getSelectedItem() == "Sim",
//                jText_nome.getText(),
//                jText_sobrenome.getText(),
//                jText_cpf.getText(),
//                jText_rg.getText(),
//                Sexo.valueOf(jCombo_sexo.getSelectedItem().toString()),
//                jText_dt_nascimento.getText(),
//                Jtext_rua.getText(),
//                jText_nro.getText(),
//                jText_bairro.getText(),
//                jText_cep.getText(),
//                jText_telefone_Residencial.getText(),
//                jText_telefone_celular.getText(),
//                jText_email.getText(),
//                jText_cidade.getText(),
//                jCombo_estado.getSelectedItem().toString());
//        this.limparTela();
//        this.setVisible(false);
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
}
