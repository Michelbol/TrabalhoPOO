/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.prontuario;

import clinicamedicapoo.medico.Medico;
import clinicamedicapoo.paciente.Paciente;
import clinicamedicapoo.prontuario.Prontuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author miche
 */
public class ProntuarioTableModel extends AbstractTableModel {
    private List<Prontuario> prontuarios;
    private final String[] colunas = new String[]{
        "Código","Data", "Paciente", "Médico"
    };
    
    public ProntuarioTableModel(List<Prontuario> pacientes) {
        this.prontuarios = null;
        this.prontuarios = pacientes;
      }
    public ProntuarioTableModel(){
       this.prontuarios = new ArrayList<>();
      }
    
    
    @Override
    public int getRowCount() {
        return prontuarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return colunas[columnIndex];
    }
    
    @Override  
    public Class<?> getColumnClass(int columnIndex) {  
        return String.class;  
    }
    
    public void setValueAt(Prontuario aValue, int rowIndex) {  
        Prontuario prontuario = prontuarios.get(rowIndex);

        prontuario.setId(aValue.getId());
        prontuario.setDataProntuario(aValue.getDataProntuario());        
        prontuario.setPaciente(aValue.getPaciente());        
        prontuario.setMedico(aValue.getMedico());        

        fireTableCellUpdated(rowIndex, 0);  
        fireTableCellUpdated(rowIndex, 1);  
        fireTableCellUpdated(rowIndex, 2);  
        fireTableCellUpdated(rowIndex, 3);  
        fireTableCellUpdated(rowIndex, 4);  
    }
    
    @Override  
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {  
        Prontuario prontuario = prontuarios.get(rowIndex);

        switch (columnIndex) {
            case 0: 
                prontuario.setId((Integer) aValue);
            case 1:  
                prontuario.setDataProntuario(aValue.toString());
            case 2:
                Paciente p = new Paciente();
                prontuario.setPaciente(p.findPaciente((Integer) aValue));
            case 3:
                Medico m = new Medico();
                prontuario.setMedico(m.findMedico((Integer) aValue));
            default:  
                System.err.println("Índice da coluna inválido");
        }  
        fireTableCellUpdated(rowIndex, columnIndex);  
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {          
        Prontuario prontuarioSelecionado = prontuarios.get(rowIndex);
            String valueObject = null;
            switch(columnIndex){
                case 0: valueObject = prontuarioSelecionado.getId().toString(); break;
                case 1: valueObject = prontuarioSelecionado.getDataProntuario(); break;
                case 2: valueObject = prontuarioSelecionado.getPaciente().getNome(); break;
                case 3: valueObject = prontuarioSelecionado.getMedico().getNome(); break;
                default: System.err.println("Índice inválido para propriedade do bean Usuario.class");
            }
            return valueObject;
      }
      
      @Override  
      public boolean isCellEditable(int rowIndex, int columnIndex) {  
          return false;  
      }  
    
    
    public Prontuario getProntuario(int indiceLinha) {  
        return prontuarios.get(indiceLinha);  
    }  
      
    public void addProntuario(Prontuario p) {      
        prontuarios.add(p);  
        
        int ultimoIndice = getRowCount() - 1;  
        
        fireTableRowsInserted(ultimoIndice, ultimoIndice);  
      }  
    
      
      public void removeProntuario(int indiceLinha) {  
          prontuarios.remove(indiceLinha);  
    
          fireTableRowsDeleted(indiceLinha, indiceLinha);  
      }  
      
      
    public void addListaDeProntuarios(List<Prontuario> novosProntuarios) {  
        int tamanhoAntigo = getRowCount();      
        prontuarios.addAll(novosProntuarios);    
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);  
    }  
      
    public void limpar() {  
        prontuarios.clear();    
        fireTableDataChanged();  
    }  
    
    public boolean isEmpty() {  
        return prontuarios.isEmpty();  
    }  
    
}
