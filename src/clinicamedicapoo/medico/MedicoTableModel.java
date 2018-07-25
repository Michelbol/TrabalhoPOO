/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.medico;

import clinicamedicapoo.utilitarios.Sexo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author miche
 */
public class MedicoTableModel extends AbstractTableModel {
    private List<Medico> medicos;
    private final String[] colunas = new String[]{
        "Código","Nome", "Sexo", "Telefone Res."
    };
    
    public MedicoTableModel(List<Medico> medicos) {
        this.medicos = null;
        this.medicos = medicos;
      }
    public MedicoTableModel(){
       this.medicos = new ArrayList<>();
      }
    
    
    @Override
    public int getRowCount() {
        return medicos.size();
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
    
    public void setValueAt(Medico aValue, int rowIndex) {  
        Medico medico = medicos.get(rowIndex);

        medico.setId_pessoa(aValue.getId_pessoa());
        medico.setNome(aValue.getNome());        
        medico.setSexo(aValue.getSexo());               
        medico.setTelefone_residencial(aValue.getTelefone_residencial());        

        fireTableCellUpdated(rowIndex, 0);  
        fireTableCellUpdated(rowIndex, 1);  
        fireTableCellUpdated(rowIndex, 2);  
        fireTableCellUpdated(rowIndex, 3);    
    }
    
    @Override  
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {  
      Medico medico = medicos.get(rowIndex);

     switch (columnIndex) {
         case 0: 
             medico.setId_pessoa((Integer) aValue);
         case 1:  
             medico.setNome(aValue.toString());
         case 2:
             medico.setSexo((Sexo) aValue);
         case 3:
             medico.setTelefone_residencial(aValue.toString());
         default:  
             System.err.println("Índice da coluna inválido");
     }  
     fireTableCellUpdated(rowIndex, columnIndex);  
     }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {          
        Medico medicoSelecionado = medicos.get(rowIndex);
          String valueObject = null;
          switch(columnIndex){
              case 0: valueObject = medicoSelecionado.getId_pessoa().toString(); break;
              case 1: valueObject = medicoSelecionado.getNome(); break;
              case 2: valueObject = medicoSelecionado.getSexo().toString(); break;              
              case 3: valueObject = medicoSelecionado.getTelefone_residencial(); break;
              default: System.err.println("Índice inválido para propriedade do bean Usuario.class");
          }
          
          return valueObject;
      }
      
      @Override  
      public boolean isCellEditable(int rowIndex, int columnIndex) {  
          return false;  
      }  
    
    
      public Medico getMedico(int indiceLinha) {  
          return medicos.get(indiceLinha);  
      }  
      
      public void addMedico(Medico c) {      
          medicos.add(c);  
    
    
          int ultimoIndice = getRowCount() - 1;  
    
          fireTableRowsInserted(ultimoIndice, ultimoIndice);  
      }  
    
      
      public void removeMedico(int indiceLinha) {  
          medicos.remove(indiceLinha);  
    
          fireTableRowsDeleted(indiceLinha, indiceLinha);  
      }  
      
      
      public void addListaDeMedicos(List<Medico> novosMedicos) {  
          int tamanhoAntigo = getRowCount();      
          medicos.addAll(novosMedicos);    
          fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);  
      }  
      
      public void limpar() {  
          medicos.clear();    
          fireTableDataChanged();  
      }  
    
      public boolean isEmpty() {  
          return medicos.isEmpty();  
      }  
    
}
