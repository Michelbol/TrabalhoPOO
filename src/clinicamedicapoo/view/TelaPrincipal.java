/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.view;

import clinicamedicapoo.consulta.ConsultaConsultaView;
import clinicamedicapoo.paciente.PacienteConsultaView;
import javax.swing.JButton;

/**
 *
 * @author miche
 */
public class TelaPrincipal extends javax.swing.JFrame {
    PacienteConsultaView paciente_consulta;
    ConsultaConsultaView consulta_view;

    public TelaPrincipal(PacienteConsultaView paciente_consulta, ConsultaConsultaView consulta_view) {
        initComponents();
        setLocationRelativeTo(null);
        this.paciente_consulta = paciente_consulta;
        this.consulta_view = consulta_view;
    }

    public JButton view_paciente(){
        return jButton_paciente;
    }

    public PacienteConsultaView getPaciente_consulta() {
        return paciente_consulta;
    }

    public ConsultaConsultaView getConsulta_view() {
        return consulta_view;
    }

    public void setPaciente_consulta(PacienteConsultaView paciente_consulta) {
        this.paciente_consulta = paciente_consulta;
    }

    public JButton getjButton_consulta() {
        return jButton_consulta;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_consulta = new javax.swing.JButton();
        jButton_paciente = new javax.swing.JButton();
        jButton_medico = new javax.swing.JButton();
        jButton_prontuario = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/icons/calendar_view_day.png"))); // NOI18N
        jButton_consulta.setText("Consultas");

        jButton_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/icons/user.png"))); // NOI18N
        jButton_paciente.setText("Pacientes");

        jButton_medico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/icons/user_suit.png"))); // NOI18N
        jButton_medico.setText("Medicos");

        jButton_prontuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/icons/vcard.png"))); // NOI18N
        jButton_prontuario.setText("Prontuarios");

        jMenu1.setText("Relatórios");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jButton_medico, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_prontuario, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_medico, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_prontuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_consulta;
    private javax.swing.JButton jButton_medico;
    private javax.swing.JButton jButton_paciente;
    private javax.swing.JButton jButton_prontuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
