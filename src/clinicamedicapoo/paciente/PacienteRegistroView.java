/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.paciente;

import clinicamedicapoo.secretaria.Secretaria;
import clinicamedicapoo.usuario.UsuarioController;
import clinicamedicapoo.utilitarios.Sexo;

/**
 *
 * @author miche
 */
public class PacienteRegistroView extends javax.swing.JFrame {

    /**
     * Creates new form PacienteRegistroView
     */
    public PacienteRegistroView() {
        initComponents();
        if(UsuarioController.usuarioLogado != null && UsuarioController.usuarioLogado.getMedico() != null){
            ativarDadosAdicionais();
        }else{
            desativarDadosAdicionais();
        }
    }    
    
    public void ativarDadosAdicionais(){
        jPanel_dados_Adicionais.setEnabled(true);
        jCheckBox_isFumante.setEnabled(true);
        jCheckBox_isAlcolatra.setEnabled(true);
        jCheckBox_isColesterol.setEnabled(true);
        jCheckBox_isDiabetico.setEnabled(true);
        jCheckBox_isDoencasCardiacas.setEnabled(true);
        jText_cirurgias.setEnabled(true);
        jText_alergias.setEnabled(true);
    }
    
    public void desativarDadosAdicionais(){
        jPanel_dados_Adicionais.setEnabled(false);
        jCheckBox_isFumante.setEnabled(false);
        jCheckBox_isAlcolatra.setEnabled(false);
        jCheckBox_isColesterol.setEnabled(false);
        jCheckBox_isDiabetico.setEnabled(false);
        jCheckBox_isDoencasCardiacas.setEnabled(false);
        jText_cirurgias.setEnabled(false);
        jText_alergias.setEnabled(false);
    }
    
    public void recuperarTela(){
        PacienteController.inserirPaciente(TipoConvenio.valueOf(jCombo_tipo_convenio.getSelectedItem().toString()),
                jCheckBox_isFumante.isSelected(),
                jCheckBox_isAlcolatra.isSelected(),
                jCheckBox_isColesterol.isSelected(),
                jCheckBox_isDiabetico.isSelected(),
                jCheckBox_isDoencasCardiacas.isSelected(),
                jText_cirurgias.getText(),
                jText_alergias.getText(),
                jCombo_ativo.getSelectedItem() == "Sim",
                jText_nome.getText(),
                jText_sobrenome.getText(),
                jText_cpf.getText(),
                jText_rg.getText(),
                Sexo.valueOf(jCombo_sexo.getSelectedItem().toString()),
                jText_dt_nascimento.getText(),
                Jtext_rua.getText(),
                jText_nro.getText(),
                jText_bairro.getText(),
                jText_cep.getText(),
                jText_telefone_Residencial.getText(),
                jText_telefone_celular.getText(),
                jText_email.getText());
        this.limparTela();
        this.setVisible(false);
    }
    
    public void limparTela(){
        jCombo_ativo.setSelectedItem(0);
        jCombo_tipo_convenio.setSelectedIndex(0);
        jCheckBox_isFumante.setSelected(false);
        jCheckBox_isAlcolatra.setSelected(false);
        jCheckBox_isColesterol.setSelected(false);
        jCheckBox_isDiabetico.setSelected(false);
        jCheckBox_isDoencasCardiacas.setSelected(false);
        jText_cirurgias.setText("");
        jText_alergias.setText("");
        jText_nome.setText("");
        jText_sobrenome.setText("");
        jText_cpf.setText("");
        jText_rg.setText("");
        jCombo_sexo.setSelectedIndex(0);
        jText_dt_nascimento.setText("");
        Jtext_rua.setText("");
        jText_nro.setText("");
        jText_bairro.setText("");
        jText_cep.setText("");
        jText_telefone_Residencial.setText("");
        jText_telefone_celular.setText("");
        jText_email.setText("");
    }
    
    public void preencherTela(Paciente p){
        jCombo_ativo.setSelectedItem(p.isAtivo() ? "Sim" : "Não");
        Jtext_Codigo.setText(p.getId_pessoa().toString());
        jCombo_tipo_convenio.setSelectedIndex((p.getTipoconvenio() == TipoConvenio.Particular ? 0 : 1));
        jCheckBox_isFumante.setSelected(p.isIsFumante());
        jCheckBox_isAlcolatra.setSelected(p.isIsAlcolatra());
        jCheckBox_isColesterol.setSelected(p.isIsColesterol());
        jCheckBox_isDiabetico.setSelected(p.isIsDiabetico());
        jCheckBox_isDoencasCardiacas.setSelected(p.getDoencasCardiacas());
        jText_cirurgias.setText(p.getCirurgias());
        jText_alergias.setText(p.getAlergias());
        jText_nome.setText(p.getNome());
        jText_sobrenome.setText(p.getSobrenome());
        jText_cpf.setText(p.getCpf());
        jText_rg.setText(p.getRg());
        jCombo_sexo.setSelectedIndex(p.getSexo() == Sexo.Masculino ? 0 : 1);
        jText_dt_nascimento.setText(p.getDataNascimento());
        Jtext_rua.setText(p.getRua());
        jText_nro.setText(p.getNumero());
        jText_bairro.setText(p.getBairro());
        jText_cep.setText(p.getCep());
        jText_telefone_Residencial.setText(p.getTelefone_residencial());
        jText_telefone_celular.setText(p.getTelefone_celular());
        jText_email.setText(p.getEmail());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Codigo = new javax.swing.JLabel();
        Jtext_Codigo = new javax.swing.JTextField();
        jLabel_nome = new javax.swing.JLabel();
        jText_nome = new javax.swing.JTextField();
        jLabel_sobrenome = new javax.swing.JLabel();
        jText_sobrenome = new javax.swing.JTextField();
        jLabel_cpf = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jText_rg = new javax.swing.JTextField();
        jLabel_sexo = new javax.swing.JLabel();
        jCombo_sexo = new javax.swing.JComboBox<>();
        jLabel_dt_nascimento = new javax.swing.JLabel();
        jText_dt_nascimento = new javax.swing.JFormattedTextField();
        jLabel_rua = new javax.swing.JLabel();
        Jtext_rua = new javax.swing.JTextField();
        jLabel_nro = new javax.swing.JLabel();
        jText_nro = new javax.swing.JTextField();
        jLabel_Bairro = new javax.swing.JLabel();
        jText_bairro = new javax.swing.JTextField();
        jLabel_cep = new javax.swing.JLabel();
        jLabel_telefone_residencial = new javax.swing.JLabel();
        jText_telefone_Residencial = new javax.swing.JTextField();
        jLabel_telefone_celular = new javax.swing.JLabel();
        jText_telefone_celular = new javax.swing.JTextField();
        jLabel_email = new javax.swing.JLabel();
        jText_email = new javax.swing.JTextField();
        jLabel_tipo_convenio = new javax.swing.JLabel();
        jCombo_tipo_convenio = new javax.swing.JComboBox<>();
        jPanel_dados_Adicionais = new javax.swing.JPanel();
        jCheckBox_isFumante = new javax.swing.JCheckBox();
        jCheckBox_isColesterol = new javax.swing.JCheckBox();
        jCheckBox_isAlcolatra = new javax.swing.JCheckBox();
        jCheckBox_isDiabetico = new javax.swing.JCheckBox();
        jCheckBox_isDoencasCardiacas = new javax.swing.JCheckBox();
        jLabel_Cirurgias = new javax.swing.JLabel();
        jText_cirurgias = new javax.swing.JTextField();
        jText_alergias = new javax.swing.JTextField();
        jLabel_alergias = new javax.swing.JLabel();
        jButton_salvar = new javax.swing.JButton();
        jButton_cancelar = new javax.swing.JButton();
        jText_cpf = new javax.swing.JFormattedTextField();
        jText_cep = new javax.swing.JFormattedTextField();
        jCombo_ativo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Registro Paciente");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel_Codigo.setText("Código");

        Jtext_Codigo.setEditable(false);

        jLabel_nome.setText("Nome:");

        jLabel_sobrenome.setText("Sobrenome:");

        jLabel_cpf.setText("CPF:");

        jLabel1.setText("RG:");

        jLabel_sexo.setText("Sexo:");

        jCombo_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        jLabel_dt_nascimento.setText("Data Nascimento:");

        jText_dt_nascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jText_dt_nascimento.setToolTipText("");

        jLabel_rua.setText("Rua:");

        jLabel_nro.setText("Nro:");

        jLabel_Bairro.setText("Bairro:");

        jLabel_cep.setText("Cep:");

        jLabel_telefone_residencial.setText("Telefone Res.:");

        jLabel_telefone_celular.setText("Telefone Cel.:");

        jLabel_email.setText("E-mail:");

        jLabel_tipo_convenio.setText("Convênio:");

        jCombo_tipo_convenio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Particular", "Plano de Saúde" }));

        jPanel_dados_Adicionais.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Adicionais"));

        jCheckBox_isFumante.setText("Fumante");

        jCheckBox_isColesterol.setText("Colesterol");

        jCheckBox_isAlcolatra.setText("Alcolatra");
        jCheckBox_isAlcolatra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_isAlcolatraActionPerformed(evt);
            }
        });

        jCheckBox_isDiabetico.setText("Diabético");

        jCheckBox_isDoencasCardiacas.setText("Doenças Cardiacas");

        jLabel_Cirurgias.setText("Cirurgias:");

        jLabel_alergias.setText("Alergias:");

        javax.swing.GroupLayout jPanel_dados_AdicionaisLayout = new javax.swing.GroupLayout(jPanel_dados_Adicionais);
        jPanel_dados_Adicionais.setLayout(jPanel_dados_AdicionaisLayout);
        jPanel_dados_AdicionaisLayout.setHorizontalGroup(
            jPanel_dados_AdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dados_AdicionaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_dados_AdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_dados_AdicionaisLayout.createSequentialGroup()
                        .addComponent(jCheckBox_isFumante)
                        .addGap(54, 54, 54)
                        .addComponent(jCheckBox_isColesterol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(jCheckBox_isAlcolatra)
                        .addGap(53, 53, 53)
                        .addComponent(jCheckBox_isDiabetico)
                        .addGap(48, 48, 48)
                        .addComponent(jCheckBox_isDoencasCardiacas)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel_dados_AdicionaisLayout.createSequentialGroup()
                        .addGroup(jPanel_dados_AdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Cirurgias)
                            .addComponent(jLabel_alergias))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_dados_AdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_alergias)
                            .addComponent(jText_cirurgias))
                        .addContainerGap())))
        );
        jPanel_dados_AdicionaisLayout.setVerticalGroup(
            jPanel_dados_AdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dados_AdicionaisLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel_dados_AdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_isFumante)
                    .addComponent(jCheckBox_isColesterol)
                    .addComponent(jCheckBox_isAlcolatra)
                    .addComponent(jCheckBox_isDiabetico)
                    .addComponent(jCheckBox_isDoencasCardiacas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_dados_AdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Cirurgias)
                    .addComponent(jText_cirurgias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_dados_AdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_alergias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_alergias))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jButton_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/icons/tick.png"))); // NOI18N
        jButton_salvar.setText("Salvar");
        jButton_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_salvarMouseClicked(evt);
            }
        });

        jButton_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/icons/cancel.png"))); // NOI18N
        jButton_cancelar.setText("Cancelar");
        jButton_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_cancelarMouseClicked(evt);
            }
        });

        try {
            jText_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jText_cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jCombo_ativo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        jLabel2.setText("Ativo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_dados_Adicionais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_dt_nascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText_dt_nascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_sexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCombo_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_telefone_celular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText_telefone_celular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_telefone_residencial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText_telefone_Residencial, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_nome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jText_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_sobrenome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jText_sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_rua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Jtext_rua, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_nro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jText_nro, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_Bairro)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_cpf)
                                .addGap(1, 1, 1)
                                .addComponent(jText_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12)
                                .addComponent(jText_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jText_bairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_cep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jText_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jText_email, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_tipo_convenio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCombo_tipo_convenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_Codigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jtext_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCombo_ativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jButton_salvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Codigo)
                    .addComponent(Jtext_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCombo_ativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nome)
                    .addComponent(jText_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_sobrenome)
                    .addComponent(jText_sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_cpf)
                    .addComponent(jLabel1)
                    .addComponent(jText_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_cep)
                        .addComponent(jText_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_rua)
                        .addComponent(Jtext_rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_nro)
                        .addComponent(jText_nro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Bairro)
                        .addComponent(jText_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_telefone_residencial)
                        .addComponent(jText_telefone_Residencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_telefone_celular)
                        .addComponent(jText_telefone_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_sexo)
                        .addComponent(jCombo_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_dt_nascimento)
                        .addComponent(jText_dt_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_email)
                    .addComponent(jText_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_tipo_convenio)
                    .addComponent(jCombo_tipo_convenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel_dados_Adicionais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox_isAlcolatraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_isAlcolatraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_isAlcolatraActionPerformed

    private void jButton_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_cancelarMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jButton_cancelarMouseClicked

    private void jButton_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_salvarMouseClicked
        this.recuperarTela();
    }//GEN-LAST:event_jButton_salvarMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        if(UsuarioController.usuarioLogado != null && UsuarioController.usuarioLogado.getMedico() != null){
            ativarDadosAdicionais();
        }else{
            desativarDadosAdicionais();
        }
    }//GEN-LAST:event_formComponentShown

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PacienteConsultaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PacienteConsultaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PacienteConsultaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PacienteConsultaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PacienteRegistroView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jtext_Codigo;
    private javax.swing.JTextField Jtext_rua;
    private javax.swing.JButton jButton_cancelar;
    private javax.swing.JButton jButton_salvar;
    private javax.swing.JCheckBox jCheckBox_isAlcolatra;
    private javax.swing.JCheckBox jCheckBox_isColesterol;
    private javax.swing.JCheckBox jCheckBox_isDiabetico;
    private javax.swing.JCheckBox jCheckBox_isDoencasCardiacas;
    private javax.swing.JCheckBox jCheckBox_isFumante;
    private javax.swing.JComboBox<String> jCombo_ativo;
    private javax.swing.JComboBox<String> jCombo_sexo;
    private javax.swing.JComboBox<String> jCombo_tipo_convenio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Bairro;
    private javax.swing.JLabel jLabel_Cirurgias;
    private javax.swing.JLabel jLabel_Codigo;
    private javax.swing.JLabel jLabel_alergias;
    private javax.swing.JLabel jLabel_cep;
    private javax.swing.JLabel jLabel_cpf;
    private javax.swing.JLabel jLabel_dt_nascimento;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_nome;
    private javax.swing.JLabel jLabel_nro;
    private javax.swing.JLabel jLabel_rua;
    private javax.swing.JLabel jLabel_sexo;
    private javax.swing.JLabel jLabel_sobrenome;
    private javax.swing.JLabel jLabel_telefone_celular;
    private javax.swing.JLabel jLabel_telefone_residencial;
    private javax.swing.JLabel jLabel_tipo_convenio;
    private javax.swing.JPanel jPanel_dados_Adicionais;
    private javax.swing.JTextField jText_alergias;
    private javax.swing.JTextField jText_bairro;
    private javax.swing.JFormattedTextField jText_cep;
    private javax.swing.JTextField jText_cirurgias;
    private javax.swing.JFormattedTextField jText_cpf;
    private javax.swing.JFormattedTextField jText_dt_nascimento;
    private javax.swing.JTextField jText_email;
    private javax.swing.JTextField jText_nome;
    private javax.swing.JTextField jText_nro;
    private javax.swing.JTextField jText_rg;
    private javax.swing.JTextField jText_sobrenome;
    private javax.swing.JTextField jText_telefone_Residencial;
    private javax.swing.JTextField jText_telefone_celular;
    // End of variables declaration//GEN-END:variables
}
