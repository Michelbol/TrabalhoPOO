/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.paciente;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author miche
 */
public class PacienteConsultaView extends javax.swing.JFrame {
    private PacienteRegistroView paciente_registro;
    private PacienteTableModel paciente_table_model;
    
    public PacienteConsultaView(PacienteRegistroView paciente_registro, PacienteTableModel paciente_table_model) {
        this.paciente_table_model = paciente_table_model;
        initComponents();
        setLocationRelativeTo(null);
        this.paciente_registro = paciente_registro;
    }

    public PacienteTableModel getPaciente_table_model() {
        return paciente_table_model;
    }

    public void setPaciente_table_model(PacienteTableModel paciente_table_model) {
        this.paciente_table_model = paciente_table_model;
    }

    public PacienteRegistroView getPaciente_registro() {
        return paciente_registro;
    }

    public void setPaciente_registro(PacienteRegistroView paciente_registro) {
        this.paciente_registro = paciente_registro;
    }
    
    public JButton adicionarButton(){
        return jbutton_adicionar;
    }
    
    public JButton editarButton(){
        return jbutton_editar;
    }
    
    public JTable pacienteTable(){
        return jtable_consulta_paciente;
    }
    
    public JButton filtrarButton(){
        return jButton_filtrar;
    }

    public JTextField getJtext_filtro_nome() {
        return jtext_filtro_nome;
    }

    public void setJtext_filtro_nome(JTextField jtext_filtro_nome) {
        this.jtext_filtro_nome = jtext_filtro_nome;
    }

    public JButton getJbutton_excluir() {
        return jbutton_excluir;
    }

    public void setJbutton_excluir(JButton jbutton_excluir) {
        this.jbutton_excluir = jbutton_excluir;
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
        jtable_consulta_paciente = new javax.swing.JTable();
        jbutton_adicionar = new javax.swing.JButton();
        jbutton_editar = new javax.swing.JButton();
        jbutton_excluir = new javax.swing.JButton();
        jlabel_filtro_nome = new javax.swing.JLabel();
        jtext_filtro_nome = new javax.swing.JTextField();
        jButton_filtrar = new javax.swing.JButton();

        setTitle("Consulta Pacientes");

        jtable_consulta_paciente.setModel(paciente_table_model);
        jScrollPane1.setViewportView(jtable_consulta_paciente);

        jbutton_adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/icons/add.png"))); // NOI18N
        jbutton_adicionar.setText("Adicionar");

        jbutton_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/icons/pencil.png"))); // NOI18N
        jbutton_editar.setText("Editar");

        jbutton_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/icons/cross.png"))); // NOI18N
        jbutton_excluir.setText("Excluir");

        jlabel_filtro_nome.setText("Filtrar:");

        jButton_filtrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/icons/magnifier.png"))); // NOI18N
        jButton_filtrar.setText("Pesquisa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jlabel_filtro_nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtext_filtro_nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_filtrar)
                .addGap(70, 70, 70)
                .addComponent(jbutton_adicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbutton_editar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbutton_excluir)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbutton_adicionar)
                    .addComponent(jbutton_editar)
                    .addComponent(jbutton_excluir)
                    .addComponent(jlabel_filtro_nome)
                    .addComponent(jtext_filtro_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_filtrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_filtrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbutton_adicionar;
    private javax.swing.JButton jbutton_editar;
    private javax.swing.JButton jbutton_excluir;
    private javax.swing.JLabel jlabel_filtro_nome;
    private javax.swing.JTable jtable_consulta_paciente;
    private javax.swing.JTextField jtext_filtro_nome;
    // End of variables declaration//GEN-END:variables
}
