/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.paciente;

import clinicamedicapoo.utilitarios.Sexo;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
    }    

    public JTextField getJtext_Codigo() {
        return Jtext_Codigo;
    }

    public void setJtext_Codigo(JTextField Jtext_Codigo) {
        this.Jtext_Codigo = Jtext_Codigo;
    }

    public JTextField getJtext_rua() {
        return Jtext_rua;
    }

    public void setJtext_rua(JTextField Jtext_rua) {
        this.Jtext_rua = Jtext_rua;
    }

    public JButton getjButton_cancelar() {
        return jButton_cancelar;
    }

    public void setjButton_cancelar(JButton jButton_cancelar) {
        this.jButton_cancelar = jButton_cancelar;
    }

    public JButton getjButton_salvar() {
        return jButton_salvar;
    }

    public void setjButton_salvar(JButton jButton_salvar) {
        this.jButton_salvar = jButton_salvar;
    }

    public JCheckBox getjCheckBox_isAlcolatra() {
        return jCheckBox_isAlcolatra;
    }

    public void setjCheckBox_isAlcolatra(JCheckBox jCheckBox_isAlcolatra) {
        this.jCheckBox_isAlcolatra = jCheckBox_isAlcolatra;
    }

    public JCheckBox getjCheckBox_isColesterol() {
        return jCheckBox_isColesterol;
    }

    public void setjCheckBox_isColesterol(JCheckBox jCheckBox_isColesterol) {
        this.jCheckBox_isColesterol = jCheckBox_isColesterol;
    }

    public JCheckBox getjCheckBox_isDiabetico() {
        return jCheckBox_isDiabetico;
    }

    public void setjCheckBox_isDiabetico(JCheckBox jCheckBox_isDiabetico) {
        this.jCheckBox_isDiabetico = jCheckBox_isDiabetico;
    }

    public JCheckBox getjCheckBox_isDoencasCardiacas() {
        return jCheckBox_isDoencasCardiacas;
    }

    public void setjCheckBox_isDoencasCardiacas(JCheckBox jCheckBox_isDoencasCardiacas) {
        this.jCheckBox_isDoencasCardiacas = jCheckBox_isDoencasCardiacas;
    }

    public JCheckBox getjCheckBox_isFumante() {
        return jCheckBox_isFumante;
    }

    public void setjCheckBox_isFumante(JCheckBox jCheckBox_isFumante) {
        this.jCheckBox_isFumante = jCheckBox_isFumante;
    }

    public JComboBox<String> getjCombo_ativo() {
        return jCombo_ativo;
    }

    public void setjCombo_ativo(JComboBox<String> jCombo_ativo) {
        this.jCombo_ativo = jCombo_ativo;
    }

    public JComboBox<String> getjCombo_estado() {
        return jCombo_estado;
    }

    public void setjCombo_estado(JComboBox<String> jCombo_estado) {
        this.jCombo_estado = jCombo_estado;
    }

    public JComboBox<String> getjCombo_sexo() {
        return jCombo_sexo;
    }

    public void setjCombo_sexo(JComboBox<String> jCombo_sexo) {
        this.jCombo_sexo = jCombo_sexo;
    }

    public JComboBox<String> getjCombo_tipo_convenio() {
        return jCombo_tipo_convenio;
    }

    public void setjCombo_tipo_convenio(JComboBox<String> jCombo_tipo_convenio) {
        this.jCombo_tipo_convenio = jCombo_tipo_convenio;
    }

    public JPanel getjPanel_dados_Adicionais() {
        return jPanel_dados_Adicionais;
    }

    public void setjPanel_dados_Adicionais(JPanel jPanel_dados_Adicionais) {
        this.jPanel_dados_Adicionais = jPanel_dados_Adicionais;
    }

    public JTextField getjText_alergias() {
        return jText_alergias;
    }

    public void setjText_alergias(JTextField jText_alergias) {
        this.jText_alergias = jText_alergias;
    }

    public JTextField getjText_bairro() {
        return jText_bairro;
    }

    public void setjText_bairro(JTextField jText_bairro) {
        this.jText_bairro = jText_bairro;
    }

    public JFormattedTextField getjText_cep() {
        return jText_cep;
    }

    public void setjText_cep(JFormattedTextField jText_cep) {
        this.jText_cep = jText_cep;
    }

    public JTextField getjText_cidade() {
        return jText_cidade;
    }

    public void setjText_cidade(JTextField jText_cidade) {
        this.jText_cidade = jText_cidade;
    }

    public JTextField getjText_cirurgias() {
        return jText_cirurgias;
    }

    public void setjText_cirurgias(JTextField jText_cirurgias) {
        this.jText_cirurgias = jText_cirurgias;
    }

    public JFormattedTextField getjText_cpf() {
        return jText_cpf;
    }

    public void setjText_cpf(JFormattedTextField jText_cpf) {
        this.jText_cpf = jText_cpf;
    }

    public JFormattedTextField getjText_dt_nascimento() {
        return jText_dt_nascimento;
    }

    public void setjText_dt_nascimento(JFormattedTextField jText_dt_nascimento) {
        this.jText_dt_nascimento = jText_dt_nascimento;
    }

    public JTextField getjText_email() {
        return jText_email;
    }

    public void setjText_email(JTextField jText_email) {
        this.jText_email = jText_email;
    }

    public JTextField getjText_nome() {
        return jText_nome;
    }

    public void setjText_nome(JTextField jText_nome) {
        this.jText_nome = jText_nome;
    }

    public JTextField getjText_nro() {
        return jText_nro;
    }

    public void setjText_nro(JTextField jText_nro) {
        this.jText_nro = jText_nro;
    }

    public JTextField getjText_rg() {
        return jText_rg;
    }

    public void setjText_rg(JTextField jText_rg) {
        this.jText_rg = jText_rg;
    }

    public JTextField getjText_sobrenome() {
        return jText_sobrenome;
    }

    public void setjText_sobrenome(JTextField jText_sobrenome) {
        this.jText_sobrenome = jText_sobrenome;
    }

    public JTextField getjText_telefone_Residencial() {
        return jText_telefone_Residencial;
    }

    public void setjText_telefone_Residencial(JTextField jText_telefone_Residencial) {
        this.jText_telefone_Residencial = jText_telefone_Residencial;
    }

    public JTextField getjText_telefone_celular() {
        return jText_telefone_celular;
    }

    public void setjText_telefone_celular(JTextField jText_telefone_celular) {
        this.jText_telefone_celular = jText_telefone_celular;
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
        jLabel_cidade = new javax.swing.JLabel();
        jText_cidade = new javax.swing.JTextField();
        jLabel_estado = new javax.swing.JLabel();
        jCombo_estado = new javax.swing.JComboBox<>();

        setTitle("Registro Paciente");

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

        jButton_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/icons/cancel.png"))); // NOI18N
        jButton_cancelar.setText("Cancelar");

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

        jLabel_cidade.setText("Cidade:");

        jLabel_estado.setText("Estado:");

        jCombo_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RO", "RS", "RR", "SC", "SE", "SP", "TO" }));
        jCombo_estado.setSelectedIndex(15);

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
                                .addComponent(jCombo_ativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_cidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jText_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_estado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCombo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_salvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_cancelar)
                .addGap(245, 245, 245))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_cidade)
                    .addComponent(jText_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_estado)
                    .addComponent(jCombo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_dados_Adicionais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
    private javax.swing.JComboBox<String> jCombo_estado;
    private javax.swing.JComboBox<String> jCombo_sexo;
    private javax.swing.JComboBox<String> jCombo_tipo_convenio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Bairro;
    private javax.swing.JLabel jLabel_Cirurgias;
    private javax.swing.JLabel jLabel_Codigo;
    private javax.swing.JLabel jLabel_alergias;
    private javax.swing.JLabel jLabel_cep;
    private javax.swing.JLabel jLabel_cidade;
    private javax.swing.JLabel jLabel_cpf;
    private javax.swing.JLabel jLabel_dt_nascimento;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_estado;
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
    private javax.swing.JTextField jText_cidade;
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
