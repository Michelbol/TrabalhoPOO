/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.consulta;

import clinicamedicapoo.medico.Medico;
import clinicamedicapoo.paciente.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author miche
 */
public class ConsultaTableModel extends AbstractTableModel {
    private List<Consulta> consultas;
    private final String[] colunas = new String[]{
        "Código","Data/Hora", "Médico", "Paciente", "Tipo Consulta"
    };
    
    public ConsultaTableModel(List<Consulta> consultas) {
        this.consultas = null;
        this.consultas = consultas;
    }
    
    public ConsultaTableModel(){
       this.consultas = new ArrayList<>();
    }
    
    
    @Override
    public int getRowCount() {
        return consultas.size();
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
    
    public void setValueAt(Consulta aValue, int rowIndex) {  
        Consulta consulta = consultas.get(rowIndex);

        consulta.setId(aValue.getId());
        consulta.setDataHora(aValue.getDataHora().toString());
        consulta.setMedico(aValue.getMedico());        
        consulta.setPaciente(aValue.getPaciente());        
        consulta.setTipo(aValue.getTipo());                    

        fireTableCellUpdated(rowIndex, 0);  
        fireTableCellUpdated(rowIndex, 1);  
        fireTableCellUpdated(rowIndex, 2);  
        fireTableCellUpdated(rowIndex, 3);  
        fireTableCellUpdated(rowIndex, 4);  
    }
    
    @Override  
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {  
      Consulta consulta = consultas.get(rowIndex);

     switch (columnIndex) {
         case 0: 
             consulta.setId((Integer) aValue);
         case 1:  
//             consulta.setDataHora((Date) aValue);
         case 2:
             consulta.setMedico((Medico) aValue);
         case 3:
             consulta.setPaciente((Paciente) aValue);
         case 4:
             consulta.setTipo((TipoConsulta) aValue);
         default:  
             System.err.println("Índice da coluna inválido");
     }  
     fireTableCellUpdated(rowIndex, columnIndex);  
     }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {          
        Consulta consultaSelecionado = consultas.get(rowIndex);
          String valueObject = null;
          switch(columnIndex){
              case 0: valueObject = consultaSelecionado.getId().toString(); break;
              case 1: valueObject = consultaSelecionado.getDataHora().toString(); break;
              case 2: valueObject = consultaSelecionado.getMedico().toString(); break;
              case 3: valueObject = consultaSelecionado.getPaciente().toString(); break;
              case 4: valueObject = consultaSelecionado.getTipo().toString(); break;
              default: System.err.println("Índice inválido para propriedade do bean Usuario.class");
          }
          
          return valueObject;
      }
      
      @Override  
      public boolean isCellEditable(int rowIndex, int columnIndex) {  
          return false;  
      }  
    
    
      public Consulta getConsulta(int indiceLinha) {  
          return consultas.get(indiceLinha);  
      }  
      
      public void addConsulta(Consulta c) {      
          consultas.add(c);  
    
    
          int ultimoIndice = getRowCount() - 1;  
    
          fireTableRowsInserted(ultimoIndice, ultimoIndice);  
      }  
    
      
      public void removeConsulta(int indiceLinha) {  
          consultas.remove(indiceLinha);  
    
          fireTableRowsDeleted(indiceLinha, indiceLinha);  
      }  
      
      
      public void addListaDeConsultas(List<Consulta> novasConsultas) {  
          
          int tamanhoAntigo = getRowCount();      
          consultas.addAll(novasConsultas);    
          fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);  
      }  
      
      public void limpar() {  
          consultas.clear();    
          fireTableDataChanged();  
      }  
    
      public boolean isEmpty() {  
          return consultas.isEmpty();  
      }  
    
}
