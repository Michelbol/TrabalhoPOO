/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.secretaria;

import clinicamedicapoo.consulta.Consulta;
import clinicamedicapoo.paciente.Paciente;
import clinicamedicapoo.paciente.TipoConvenio;
import clinicamedicapoo.utilitarios.Pessoa;
import clinicamedicapoo.utilitarios.Sexo;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author miche
 */
@Entity
public class Secretaria extends Pessoa {
    public static EntityManagerFactory factory = Persistence.createEntityManagerFactory("ClinicaMedicaPOO");
    public static EntityManager manager = factory.createEntityManager();
    public Secretaria(String nome, String sobrenome, String cpf, String rg, Sexo sexo, String dataNascimento, String rua, String numero, String bairro, String cep, String cidade, String estado, String telefone_residencial, String telefone_celular, String email) {
        super(nome, sobrenome, cpf, rg, sexo, dataNascimento, rua, numero, bairro, cep, cidade, estado, telefone_residencial, telefone_celular, email);
    }

    public Secretaria(String nome) {
        super(nome);
    }

    public Secretaria() {
    }
    
    public Secretaria inserirSecretaria(String nome, String sobrenome, String cpf, String rg, Sexo sexo, String dataNascimento, String rua, String numero, String bairro, String cep, String telefone_residencial, String email, String cidade, String estado){
        Secretaria s = new Secretaria(nome,sobrenome,cpf,rg,sexo,dataNascimento,rua,numero,bairro,cep,cidade,estado,telefone_residencial,telefone_celular,email);
        try{
           manager.getTransaction().begin();
           manager.persist(s);
           manager.getTransaction().commit();
           return s;
        }
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }    
    
    public List<Paciente> consultarPacientes(String filtro_nome){
        Paciente paciente = new Paciente();
        return paciente.getPaciente(filtro_nome);
    }
    
    public List<Consulta> consultarConsultas(String data_inicial, String data_final){
        Consulta consulta = new Consulta();
        return consulta.getConsulta(data_inicial, data_final);
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
