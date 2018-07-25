/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.consulta;

/**
 *
 * @author miche
 */
public class ConsultaConsultaView extends javax.swing.JFrame {
    private ConsultaTableModel consulta_table_model;
    /**
     * Creates new form ConsultaConsultaView
     */
    public ConsultaConsultaView(ConsultaTableModel consulta_table_model) {
        this.consulta_table_model = consulta_table_model;
        initComponents();
        setLocationRelativeTo(null);
    }

    public ConsultaTableModel getConsulta_table_model() {
        return consulta_table_model;
    }

    public void setConsulta_table_model(ConsultaTableModel consulta_table_model) {
        this.consulta_table_model = consulta_table_model;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel_data_hora_inicial = new javax.swing.JLabel();
        jText_data_hora_final = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jbutton_adicionar = new javax.swing.JButton();
        jbutton_editar = new javax.swing.JButton();
        jbutton_excluir = new javax.swing.JButton();

        setTitle("Consultas");

        jTable1.setModel(consulta_table_model);
        jScrollPane1.setViewportView(jTable1);

        jLabel_data_hora_inicial.setText("Data/Hora Inicial:");

        jLabel3.setText("Data/Hora Final:");

        jbutton_adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/icons/add.png"))); // NOI18N
        jbutton_adicionar.setText("Adicionar");
        jbutton_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_adicionarActionPerformed(evt);
            }
        });

        jbutton_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/icons/pencil.png"))); // NOI18N
        jbutton_editar.setText("Editar");
        jbutton_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_editarActionPerformed(evt);
            }
        });

        jbutton_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/icons/cross.png"))); // NOI18N
        jbutton_excluir.setText("Excluir");
        jbutton_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_data_hora_inicial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jText_data_hora_final, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbutton_adicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbutton_editar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbutton_excluir)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_data_hora_inicial)
                    .addComponent(jText_data_hora_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbutton_adicionar)
                    .addComponent(jbutton_editar)
                    .addComponent(jbutton_excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbutton_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_adicionarActionPerformed
//        if(!paciente_registro.isVisible()){
//            paciente_registro.setVisible(true);
//        }
    }//GEN-LAST:event_jbutton_adicionarActionPerformed

    private void jbutton_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_editarActionPerformed
//        int linhaselecionada = jtable_consulta_paciente.getSelectedRow();
//        if(linhaselecionada == -1){
//            JOptionPane.showMessageDialog(null, "Selecione um registro");
//            return;
//        }
//        Paciente p = PacienteController.findPaciente(Integer.parseInt(jtable_consulta_paciente.getValueAt(linhaselecionada, 0).toString()));
//        if(p != null){
//            paciente_registro.setVisible(true);
//            paciente_registro.preencherTela(p);
//        }
    }//GEN-LAST:event_jbutton_editarActionPerformed

    private void jbutton_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_excluirActionPerformed
//        int resposta = JOptionPane.showConfirmDialog(null, "Deseja Realmente excluir este registro?");
//        if(resposta == 0){
//            int linhaselecionada = jtable_consulta_paciente.getSelectedRow();
//            PacienteController.DeletarPaciente(Integer.parseInt(jtable_consulta_paciente.getValueAt(linhaselecionada, 0).toString()));
//        }
//        paciente = new PacienteTableModel(PacienteController.getPaciente(jtext_filtro_nome.getText()));
//        jtable_consulta_paciente.setModel(paciente);
    }//GEN-LAST:event_jbutton_excluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_data_hora_inicial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField jText_data_hora_final;
    private javax.swing.JButton jbutton_adicionar;
    private javax.swing.JButton jbutton_editar;
    private javax.swing.JButton jbutton_excluir;
    // End of variables declaration//GEN-END:variables
}
