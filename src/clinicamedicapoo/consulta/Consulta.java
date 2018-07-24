/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.consulta;

import clinicamedicapoo.medico.Medico;
import clinicamedicapoo.paciente.Paciente;
import clinicamedicapoo.utilitarios.Sexo;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Embedded;
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
    private Date dataHora;
    
    @OneToOne(fetch = FetchType.EAGER)
//    @Column(nullable = false)
    private Medico medico;
    
    @OneToOne(fetch = FetchType.EAGER)
//    @Column(nullable = false)
    private Paciente paciente;

    @Embedded
    @Column(nullable = false)
    private TipoConsulta tipo;

    public Consulta(String dataHora, Medico medico, Paciente paciente, TipoConsulta tipo) {
        setDataHora(dataHora);
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

    public String getDataHora() {
        String data = null;        
        String[] datahora = null;
        SimpleDateFormat formatDateTime = new SimpleDateFormat("dd/MM/yyyy HH:mm");      
        if(this.dataHora != null ){
            data = formatDateTime.format(this.dataHora);
            datahora = data.split(" ");
        }
        return datahora[0] + " " + datahora[1];
    }

    public void setDataHora(String dataHora) {
        if(!(dataHora.length() > 0)){
            this.dataHora = null;
        }
        String[] g = dataHora.split("/");
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
        this.dataHora = dt;
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
    
    public List<Consulta> getConsulta(String hora_inicial, String hora_final){
        Query query = manager.createQuery("select p FROM Consulta p WHERE p.dataHora BETWEEN '"+ hora_inicial+"' and '"+hora_final+"'");
        List<Consulta> lista_consulta = query.getResultList();
        return lista_consulta;
    }
    
    public static void inserirConsulta(String data_hora, Medico medico, Paciente paciente, TipoConsulta tipo_consulta){
        Consulta c = new Consulta(data_hora, medico, paciente, tipo_consulta);
        try{
           manager.getTransaction().begin();
           manager.persist(c);
           manager.getTransaction().commit();
        }
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    public static void povoarConsulta(){
        Medico medico = new Medico();
        Paciente paciente = new Paciente();
        inserirConsulta("24/07/2018 20:00", medico.findMedico(1), paciente.findPaciente(1), TipoConsulta.Normal);
    }
    
}
