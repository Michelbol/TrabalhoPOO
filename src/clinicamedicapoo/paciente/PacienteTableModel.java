/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.paciente;

import clinicamedicapoo.utilitarios.Sexo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author miche
 */
public class PacienteTableModel extends AbstractTableModel {
    private List<Paciente> pacientes;
    private final String[] colunas = new String[]{
        "Código","Nome", "Sexo", "Convênio", "Telefone Res."
    };
    
    public PacienteTableModel(List<Paciente> pacientes) {
        this.pacientes = null;
        this.pacientes = pacientes;
      }
    public PacienteTableModel(){
       this.pacientes = new ArrayList<>();
      }
    
    
    @Override
    public int getRowCount() {
        return pacientes.size();
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
    
    public void setValueAt(Paciente aValue, int rowIndex) {  
        Paciente paciente = pacientes.get(rowIndex);

        paciente.setId_pessoa(aValue.getId_pessoa());
        paciente.setNome(aValue.getNome());        
        paciente.setSexo(aValue.getSexo());        
        paciente.setTipoconvenio(aValue.getTipoconvenio());        
        paciente.setTelefone_residencial(aValue.getTelefone_residencial());        

        fireTableCellUpdated(rowIndex, 0);  
        fireTableCellUpdated(rowIndex, 1);  
        fireTableCellUpdated(rowIndex, 2);  
        fireTableCellUpdated(rowIndex, 3);  
        fireTableCellUpdated(rowIndex, 4);  
    }
    
    @Override  
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {  
      Paciente paciente = pacientes.get(rowIndex);

     switch (columnIndex) {
         case 0: 
             paciente.setId_pessoa((Integer) aValue);
         case 1:  
             paciente.setNome(aValue.toString());
         case 2:
             paciente.setSexo((Sexo) aValue);
         case 3:
             paciente.setTipoconvenio((TipoConvenio) aValue);
         case 4:
             paciente.setTelefone_residencial(aValue.toString());
         default:  
             System.err.println("Índice da coluna inválido");
     }  
     fireTableCellUpdated(rowIndex, columnIndex);  
     }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {          
        Paciente pacienteSelecionado = pacientes.get(rowIndex);
          String valueObject = null;
          switch(columnIndex){
              case 0: valueObject = pacienteSelecionado.getId_pessoa().toString(); break;
              case 1: valueObject = pacienteSelecionado.getNome(); break;
              case 2: valueObject = pacienteSelecionado.getSexo().toString(); break;
              case 3: valueObject = pacienteSelecionado.getTipoconvenio().toString(); break;
              case 4: valueObject = pacienteSelecionado.getTelefone_residencial(); break;
              default: System.err.println("Índice inválido para propriedade do bean Usuario.class");
          }
          
          return valueObject;
      }
      
      @Override  
      public boolean isCellEditable(int rowIndex, int columnIndex) {  
          return false;  
      }  
    
    
      public Paciente getPaciente(int indiceLinha) {  
          return pacientes.get(indiceLinha);  
      }  
      
      public void addPaciente(Paciente p) {      
          pacientes.add(p);  
    
    
          int ultimoIndice = getRowCount() - 1;  
    
          fireTableRowsInserted(ultimoIndice, ultimoIndice);  
      }  
    
      
      public void removePaciente(int indiceLinha) {  
          pacientes.remove(indiceLinha);  
    
          fireTableRowsDeleted(indiceLinha, indiceLinha);  
      }  
      
      
      public void addListaDeDoctor(List<Paciente> novosDoctors) {  
          
          int tamanhoAntigo = getRowCount();      
          pacientes.addAll(novosDoctors);    
          fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);  
      }  
      
      public void limpar() {  
          pacientes.clear();    
          fireTableDataChanged();  
      }  
    
      public boolean isEmpty() {  
          return pacientes.isEmpty();  
      }  
    
}
