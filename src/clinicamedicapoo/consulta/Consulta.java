/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.consulta;

import clinicamedicapoo.medico.Medico;
import clinicamedicapoo.paciente.Paciente;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author miche
 */
@Entity
@Table(name = "Consulta")
public class Consulta implements Serializable {
    public static EntityManagerFactory factory = Persistence.createEntityManagerFactory("ClinicaMedicaPOO");
    public static EntityManager manager = factory.createEntityManager();
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id; 
    
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date hora;
    
    @OneToOne(fetch = FetchType.EAGER)
    private Medico medico;
    
    @OneToOne(fetch = FetchType.EAGER)
    private Paciente paciente;

    @Column(nullable = false)
    private TipoConsulta tipo;

    public Consulta(String data, Medico medico, Paciente paciente, TipoConsulta tipo, String hora) {
        setData(data);
        setHora(hora);
        this.medico = medico;
        this.paciente = paciente;
        this.tipo = tipo;
    }

    public Consulta() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        String data = null;        
        String[] datahora = null;
        SimpleDateFormat formatDateTime = new SimpleDateFormat("dd/MM/yyyy");      
        if(this.data != null ){
            data = formatDateTime.format(this.data);
            datahora = data.split(" ");
        }
        return datahora[0];
    }
    
    public void setData(String data) {
        if(!(data.length() > 0)){
            this.data = null;
        }
        String[] g = data.split("/");
        int dia = Integer.parseInt(g[0]);
        int mes = Integer.parseInt(g[1]) - 1;
        int ano = Integer.parseInt(g[2]);
        if (ano > 99) {
            ano = ano - 1900;
        }
        if (ano < 50) {
            ano = ano + 2000;
        }
        Date dt = new Date(ano, mes, dia);
        this.data = dt;
    }

    public String getHora() {
        String data = null;        
        SimpleDateFormat formatDateTime = new SimpleDateFormat("HH:mm");      
        if(this.hora != null ){
            data = formatDateTime.format(this.hora);
        }
        return data;
    }

    public void setHora(String hora) {
        if(hora != null || hora.length() > 0){
            String[] time = hora.split(":");
            int horario = Integer.parseInt(time[0]);
            int minuto = Integer.parseInt(time[1]);
            Date dt = new Date(0, 0, 0, horario, minuto);
            this.hora = dt;
        }else{
            this.hora = null;
        }
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public TipoConsulta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConsulta tipo) {
        this.tipo = tipo;
    }
    
    public List<Consulta> getConsulta(String data_inicial, String hora_inicial, String data_final, String hora_final){
        System.out.println("Data inicial: " + data_inicial);
        System.out.println("hora_inicial: " + hora_inicial);
        System.out.println("data_final: " + data_final);
        System.out.println("hora_final: " + hora_final);
        Query query;
        if(data_inicial.equals("") && hora_inicial.equals("") && data_final.equals("") && hora_final.equals("")){
            query = manager.createQuery("select p FROM Consulta p");
        }else{
            query = manager.createQuery("select p FROM Consulta p WHERE p.data BETWEEN '"+ data_inicial +"' and '" + data_final + "' and p.hora BETWEEN '" + hora_inicial + "' and '" + hora_final + "'");
        }
        List<Consulta> lista_consulta = query.getResultList();
        return lista_consulta;
    }
    
    public Consulta findConsulta(int id){
        Consulta consulta = null;
        try{
            consulta = manager.find(Consulta.class, id);
        }
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
        return consulta;
    }
    
    public Consulta inserirConsulta(String data, Medico medico, Paciente paciente, TipoConsulta tipo_consulta, String hora){
        Consulta c = new Consulta(data, medico, paciente, tipo_consulta, hora);
        try{
           manager.getTransaction().begin();
           manager.persist(c);
           manager.getTransaction().commit();
           return c;
        }
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }
    
    public void povoarConsulta(){
        Medico medico_consulta = new Medico();
        Medico medico_adicionar = medico_consulta.findMedico(2);
        Paciente paciente_consulta = new Paciente();
        Paciente paciente_adicionar = paciente_consulta.findPaciente(3);
        System.out.println("Medico: " + medico_adicionar);
        System.out.println("Paciente: " + paciente_adicionar);
        inserirConsulta("24/07/2018", medico_adicionar, paciente_adicionar, TipoConsulta.Normal, "20:00");
    }
    
    public Consulta atualizarConsulta(Integer id,String data, Medico medico, Paciente paciente, TipoConsulta tipo, String hora) {
        
        try{
           manager.getTransaction().begin();
           Consulta c = findConsulta(id);
           c.setData(data);
           c.setHora(hora);
           c.setMedico(medico);
           c.setPaciente(paciente);
           c.setTipo(tipo);
           manager.merge(c);
           manager.getTransaction().commit();
           return c;
        }
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }
    public boolean deletarConsulta(int id){
        try{
            manager.getTransaction().begin();
            Consulta c = manager.find(Consulta.class, id);
            manager.remove(c);
            manager.getTransaction().commit();
            return true;
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }
}
