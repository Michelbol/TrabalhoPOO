/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.medico;

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
    
    public static Medico findMedico(int id){
        Medico medico = null;
        try{
            medico = manager.find(Medico.class, id);
        }
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
        return medico;
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
    
}
