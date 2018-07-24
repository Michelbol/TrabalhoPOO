/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.prontuario;

import clinicamedicapoo.medico.Medico;
import clinicamedicapoo.paciente.Paciente;
import clinicamedicapoo.usuario.Usuario;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author miche
 */
@Entity
@Table(name = "Prontuario")
public class Prontuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id; 
    
    @OneToOne(fetch = FetchType.EAGER)
//    @Column(nullable = false)
    private Paciente paciente;
    
    @OneToOne(fetch = FetchType.EAGER)
//    @Column(nullable = false)
    private Medico medico;
    
    @Column(nullable = false, length = 1000)
    private String sintomas;
    
    @Column(nullable = false, length = 1000)
    private String diagnostico;
    
    @Column(nullable = false, length = 1000)
    private String prescricao;
    
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataProntuario;

    public Prontuario(Paciente paciente, Medico medico, String sintomas, String diagnostico, String prescricao, String dataProntuario) {
        this.paciente = paciente;
        this.medico = medico;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.prescricao = prescricao;
        this.setDataProntuario(dataProntuario);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }
    
    public String getDataProntuario() {
        String data = null;        
        String[] datahora = null;
        SimpleDateFormat formatDateTime = new SimpleDateFormat("dd/MM/yyyy");        
        if(this.dataProntuario != null ){
            data = formatDateTime.format(this.dataProntuario);
            datahora = data.split(" ");
        }
        return datahora[0];
    }

    public void setDataProntuario(String dataNascimento) {
        if(!(dataNascimento.length() > 0)){
            this.dataProntuario = null;
        }
        String[] g = dataNascimento.split("/");
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
        this.dataProntuario = dt;
    }
    
    public void povoarPaciente(Usuario usuario){
        inserirProntuario(Paciente.findPaciente(1),usuario,"");
    }
    
    public void inserirPaciente(Paciente paciente, Medico medico, String sintomas, String diagnostico,String prescricao,String dataProntuario){
        Prontuario prontuario = new Prontuario(paciente,medico,sintomas,diagnostico,prescricao,dataProntuario);
        
    }
}
