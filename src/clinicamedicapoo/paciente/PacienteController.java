/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.paciente;

import clinicamedicapoo.medico.Medico;
import clinicamedicapoo.utilitarios.Sexo;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author miche
 */
public class PacienteController {
    public static EntityManagerFactory factory = Persistence.createEntityManagerFactory("ClinicaMedicaPOO");
    public static EntityManager manager = factory.createEntityManager();
    public static EntityTransaction tx = null;
    
    public PacienteController(){

    }
    
    public static List<Paciente> getPaciente(String filtro_nome){
        Query query = manager.createQuery("select p FROM Paciente p WHERE p.nome LIKE '%"+ filtro_nome+"%'");
        List<Paciente> lista_paciente = query.getResultList();
        return lista_paciente;
    }
    
    public static void inserirPaciente(TipoConvenio tipoconvenio,
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
            String email) {
        
        Paciente p = new Paciente(tipoconvenio,
            isFumante,
            isAlcolatra,
            isColesterol,
            isDiabetico,
            doencasCardiacas,
            cirurgias,
            alergias,
            ativo,
            nome,
            sobrenome,
            cpf,
            rg,
            sexo,
            dataNascimento,
            rua,
            numero,
            bairro,
            cep,
            telefone_residencial,
            telefone_celular,
            email);
        try{
           manager.getTransaction().begin();
           manager.persist(p);
           manager.getTransaction().commit();
        }
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    public static Paciente findPaciente(int id){
        Paciente paciente = null;
        try{
            paciente = manager.find(Paciente.class, id);
        }
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
        return paciente;
    }
    
    public static void povoarPaciente(){
        inserirPaciente(TipoConvenio.Particular, false, false, false, false, true, "", "", true,"Michel", "Bolzon", "078.161.349-32", "97796033", Sexo.Masculino, "11/10/1995", "Rua ivinhema", "25", "Parque Avenida", "87025-490", "(44) 3028-2888", "(44) 99824-3108", "Michel.bolzon123@gmail.com");
        inserirPaciente(TipoConvenio.PlanoDeSaude, false, true, false, true,false, "", "", true, "Maria Aparecida", "Malvestio", "123.456.789-10", "132465789", Sexo.Feminino, "11/08/1995", "Rua dos moscados", "4989", "Zona 07", "78949-254", "(44) 3228-9999", "(44) 88978-3108", "maria.aparecoda@gmail.com");
//        inserirMedico(new Medico("Maria Aparecida", "Malvestio", "123.456.789-10", "132465789", Sexo.Feminino, "11/03/1995", "Rua dos moscados", "4989", "Zona 07", "78949-254", "(44) 3228-9999", "(44) 88978-3108", "maria.aparecoda@gmail.com"));
    }
}
