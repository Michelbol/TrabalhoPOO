/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.consulta;

import clinicamedicapoo.medico.Medico;
import clinicamedicapoo.paciente.Paciente;
import clinicamedicapoo.paciente.SelecionarPacienteView;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

/**
 *
 * @author miche
 */
public class ConsultaRegistroView extends javax.swing.JFrame {
    private Medico medico_selecionado;
    private Paciente paciente_selecionado;
    private SelecionarPacienteView selecionar_paciente_view;

    public ConsultaRegistroView(SelecionarPacienteView selecionar_paciente_view) {
        this.selecionar_paciente_view = selecionar_paciente_view;
        initComponents();
    }

    public SelecionarPacienteView getSelecionar_paciente_view() {
        return selecionar_paciente_view;
    }

    public void setSelecionar_paciente_view(SelecionarPacienteView selecionar_paciente_view) {
        this.selecionar_paciente_view = selecionar_paciente_view;
    }

    public Medico getMedico_selecionado() {
        return medico_selecionado;
    }

    public void setMedico_selecionado(Medico medico_selecionado) {
        this.medico_selecionado = medico_selecionado;
    }

    public Paciente getPaciente_selecionado() {
        return paciente_selecionado;
    }

    public void setPaciente_selecionado(Paciente paciente_selecionado) {
        this.paciente_selecionado = paciente_selecionado;
    }

    public JButton getjButton_selecionar_medico() {
        return jButton_selecionar_medico;
    }

    public void setjButton_selecionar_medico(JButton jButton_selecionar_medico) {
        this.jButton_selecionar_medico = jButton_selecionar_medico;
    }

    public JButton getjButton_selecionar_paciente() {
        return jButton_selecionar_paciente;
    }

    public void setjButton_selecionar_paciente(JButton jButton_selecionar_paciente) {
        this.jButton_selecionar_paciente = jButton_selecionar_paciente;
    }

    public JComboBox<String> getjCombo_tipo_consulta() {
        return jCombo_tipo_consulta;
    }

    public void setjCombo_tipo_consulta(JComboBox<String> jCombo_tipo_consulta) {
        this.jCombo_tipo_consulta = jCombo_tipo_consulta;
    }

    public JTextField getjText_Paciente() {
        return jText_Paciente;
    }

    public void setjText_Paciente(JTextField jText_Paciente) {
        this.jText_Paciente = jText_Paciente;
    }

    public JFormattedTextField getjText_hora() {
        return jText_hora;
    }

    public void setjText_hora(JFormattedTextField jText_hora) {
        this.jText_hora = jText_hora;
    }

    public JTextField getjText_medico() {
        return jText_medico;
    }

    public void setjText_medico(JTextField jText_medico) {
        this.jText_medico = jText_medico;
    }

    public JFormattedTextField getJtext_data() {
        return jtext_data;
    }

    public void setJtext_data(JFormattedTextField jtext_data) {
        this.jtext_data = jtext_data;
    }

    public JTextField getjText_codigo() {
        return jText_codigo;
    }

    public void setjText_codigo(JTextField jText_codigo) {
        this.jText_codigo = jText_codigo;
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_data = new javax.swing.JLabel();
        jtext_data = new javax.swing.JFormattedTextField();
        jLabel_hora = new javax.swing.JLabel();
        jText_hora = new javax.swing.JFormattedTextField();
        jLabel_medico = new javax.swing.JLabel();
        jLabel_paciente = new javax.swing.JLabel();
        jLabel_tipo_consulta = new javax.swing.JLabel();
        jCombo_tipo_consulta = new javax.swing.JComboBox<>();
        jText_medico = new javax.swing.JTextField();
        jText_Paciente = new javax.swing.JTextField();
        jButton_selecionar_medico = new javax.swing.JButton();
        jButton_selecionar_paciente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jText_codigo = new javax.swing.JTextField();
        jButton_salvar = new javax.swing.JButton();
        jButton_cancelar = new javax.swing.JButton();

        setTitle("Registrar Consulta");

        jLabel_data.setText("Data:");

        try {
            jtext_data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel_hora.setText("Hora:");

        try {
            jText_hora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel_medico.setText("Medico:");

        jLabel_paciente.setText("Paciente:");

        jLabel_tipo_consulta.setText("Tipo:");

        jCombo_tipo_consulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Retorno" }));

        jText_medico.setEditable(false);

        jText_Paciente.setEditable(false);

        jButton_selecionar_medico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/icons/mouse_add.png"))); // NOI18N
        jButton_selecionar_medico.setText("Selecionar Medico");

        jButton_selecionar_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/icons/mouse_add.png"))); // NOI18N
        jButton_selecionar_paciente.setText("Selecionar paciente");

        jLabel1.setText("Código:");

        jText_codigo.setEditable(false);

        jButton_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/icons/tick.png"))); // NOI18N
        jButton_salvar.setText("Salvar");

        jButton_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/icons/cancel.png"))); // NOI18N
        jButton_cancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_paciente)
                        .addComponent(jLabel_medico))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jText_Paciente, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(jText_medico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_selecionar_paciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_selecionar_medico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jText_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_data)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtext_data, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel_hora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_tipo_consulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCombo_tipo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jButton_salvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_cancelar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_data)
                    .addComponent(jtext_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_hora)
                    .addComponent(jText_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_tipo_consulta)
                    .addComponent(jCombo_tipo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jText_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_medico)
                    .addComponent(jText_medico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_selecionar_medico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_paciente)
                    .addComponent(jText_Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_selecionar_paciente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_cancelar;
    private javax.swing.JButton jButton_salvar;
    private javax.swing.JButton jButton_selecionar_medico;
    private javax.swing.JButton jButton_selecionar_paciente;
    private javax.swing.JComboBox<String> jCombo_tipo_consulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_data;
    private javax.swing.JLabel jLabel_hora;
    private javax.swing.JLabel jLabel_medico;
    private javax.swing.JLabel jLabel_paciente;
    private javax.swing.JLabel jLabel_tipo_consulta;
    private javax.swing.JTextField jText_Paciente;
    private javax.swing.JTextField jText_codigo;
    private javax.swing.JFormattedTextField jText_hora;
    private javax.swing.JTextField jText_medico;
    private javax.swing.JFormattedTextField jtext_data;
    // End of variables declaration//GEN-END:variables
}
