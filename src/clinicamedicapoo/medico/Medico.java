/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.medico;

import clinicamedicapoo.paciente.Paciente;
import clinicamedicapoo.paciente.TipoConvenio;
import clinicamedicapoo.prontuario.Prontuario;
import clinicamedicapoo.utilitarios.Pessoa;
import clinicamedicapoo.utilitarios.Sexo;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author miche
 */
@Entity
public class Medico extends Pessoa {  
    public static EntityManagerFactory factory = Persistence.createEntityManagerFactory("ClinicaMedicaPOO");
    public static EntityManager manager = factory.createEntityManager();

    public Medico(String nome, String sobrenome, String cpf, String rg, Sexo sexo, String dataNascimento, String rua, String numero, String bairro, String cep, String cidade, String estado, String telefone_residencial, String telefone_celular, String email) {
        super(nome, sobrenome, cpf, rg, sexo, dataNascimento, rua, numero, bairro, cep, cidade, estado, telefone_residencial, telefone_celular, email);
    }

    public Medico() {
    }

    public Medico(String nome) {
        super(nome);
    }
    
    public Medico inserirMedico(String nome, String sobrenome, String cpf, String rg, Sexo sexo, String dataNascimento, String rua, String numero, String bairro, String cep, String telefone_residencial, String telefone_celular, String email, String cidade, String estado){
        Medico medico = new Medico(nome,sobrenome,cpf,rg,sexo,dataNascimento,rua,numero,bairro,cep,cidade,estado,telefone_residencial,telefone_celular,email);
        try{
           manager.getTransaction().begin();
           manager.persist(medico);
           manager.getTransaction().commit();
           return medico;
        }
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }
    public List<Medico> getMedico(String filtro_nome){
        Query query = manager.createQuery("select m FROM Medico m");
        List<Medico> lista_medico = query.getResultList();
        return lista_medico;
    }
    
    public Medico findMedico(int id){
        Medico medico = null;
        try{
            medico = manager.find(Medico.class, id);
        }
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
        return medico;
    }
    
    public Prontuario buscarProntuario(int id){
        Prontuario p = new Prontuario();
        return p.findProntuario(id);
    }

    public void povoarMedico(){
        inserirMedico("Maria Aparecida", "Malvestio", "123.456.789-10", "132465789", Sexo.Feminino, "11/03/1995", "Rua dos moscados", "4989", "Zona 07", "78949-254", "(44) 3228-9999", "(44) 88978-3108", "maria.aparecoda@gmail.com","Maringá", "PR");
    }
    
    public List<Prontuario> consultarProntuarios(String data_inicial, String data_final){
        Prontuario prontuario = new Prontuario();
        return prontuario.getProntuario(data_inicial,data_final);
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
    public void incluirProntuario(String data, String idPaciente, String idMedico, String sintomas, String diagnostico, String prescricao){
        Prontuario prontuario = new Prontuario();
        Medico medico         = new Medico();
        Paciente paciente     = new Paciente();                
        
        prontuario.inserirProntuario(paciente.findPaciente(Integer.parseInt(idPaciente)), medico.findMedico(Integer.parseInt(idMedico)), sintomas, diagnostico, prescricao, data);
    }
    
    public void atualizarProntuario(String id, String data, String idPaciente, String idMedico, String sintomas, String diagnostico, String prescricao){
        Prontuario prontuario = new Prontuario();
        Medico medico         = new Medico();
        Paciente paciente     = new Paciente();                
        
        prontuario.atualizarProntuario(Integer.parseInt(id),paciente.findPaciente(Integer.parseInt(idPaciente)), medico.findMedico(Integer.parseInt(idMedico)), sintomas, diagnostico, prescricao, data);
    }
    
    public boolean deletarProntuario(Integer id){
        Prontuario prontuario = new Prontuario();
        return prontuario.deletarProntuario(id);
    }
    
    public List<Paciente> consultarPacientes(String filtro_nome){
        Paciente paciente = new Paciente();
        return paciente.getPaciente(filtro_nome);
    }
    
    public Paciente buscarPaciente(Integer id){
        Paciente paciente = new Paciente();
        return paciente.findPaciente(id);
    }
    
    public Paciente salvarPaciente(TipoConvenio tipoconvenio,
            boolean isFumante,
            boolean isAlcolatra,
            boolean isColesterol,
            boolean isDiabetico,
            boolean doencasCardiacas,
            String cirurgias,
            String alergias,
            boolean ativo,
            String nome,
            String sobrenome,
            String cpf,
            String rg,
            Sexo sexo,
            String dataNascimento,
            String rua,
            String numero,
            String bairro,
            String cep,
            String telefone_residencial,
            String telefone_celular,
            String email,
            String cidade,
            String estado){
       Paciente paciente = new Paciente();
       return paciente.inserirPaciente(tipoconvenio, isFumante, isAlcolatra, isColesterol, isDiabetico, doencasCardiacas, cirurgias, alergias, ativo, nome, sobrenome, cpf, rg, sexo, dataNascimento, rua, numero, bairro, cep, telefone_residencial, telefone_celular, email, cidade, estado);
    }
    
    public Paciente atualizarPaciente(Integer id,
            TipoConvenio tipoconvenio,
            boolean isFumante,
            boolean isAlcolatra,
            boolean isColesterol,
            boolean isDiabetico,
            boolean doencasCardiacas,
            String cirurgias,
            String alergias,
            boolean ativo,
            String nome,
            String sobrenome,
            String cpf,
            String rg,
            Sexo sexo,
            String dataNascimento,
            String rua,
            String numero,
            String bairro,
            String cep,
            String telefone_residencial,
            String telefone_celular,
            String email,
            String cidade,
            String estado){
       Paciente paciente = new Paciente();
       return paciente.atualizarPaciente(id, tipoconvenio, isFumante, isAlcolatra, isColesterol, isDiabetico, doencasCardiacas, cirurgias, alergias, ativo, nome, sobrenome, cpf, rg, sexo, dataNascimento, rua, numero, bairro, cep, telefone_residencial, telefone_celular, email, cidade, estado);
    }
    
    public boolean deletarPaciente(Integer id){
        Paciente paciente = new Paciente();
        return paciente.DeletarPaciente(id);
    }
}
