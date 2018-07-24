/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.consulta;

import clinicamedicapoo.medico.Medico;
import clinicamedicapoo.paciente.Paciente;
import clinicamedicapoo.paciente.PacienteController;
import clinicamedicapoo.paciente.TipoConvenio;
import clinicamedicapoo.utilitarios.Sexo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author miche
 */
public class ConsultaController {
    public static EntityManagerFactory factory = Persistence.createEntityManagerFactory("ClinicaMedicaPOO");
    public static EntityManager manager = factory.createEntityManager();

    public static void inserirMedico(
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
            String estado) {
        
        Medico c = new Medico(
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
            cidade,
            estado,
            telefone_residencial,
            telefone_celular,
            email);
        try{
           manager.getTransaction().begin();
           manager.persist(c);
           manager.getTransaction().commit();
        }
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
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
//        PacienteController.inserirPaciente(TipoConvenio.PlanoDeSaude, false, true, false, true,false, "", "", true, "Maria Aparecida", "Malvestio", "123.456.789-10", "132465789", Sexo.Feminino, "11/08/1995", "Rua dos moscados", "4989", "Zona 07", "78949-254", "(44) 3228-9999", "(44) 88978-3108", "maria.aparecoda@gmail.com", "São Paulo", "SP");
        inserirMedico("Maria Aparecida", "Malvestio", "123.456.789-10", "132465789", Sexo.Feminino, "11/03/1995", "Rua dos moscados", "4989", "Zona 07", "78949-254", "(44) 3228-9999", "(44) 88978-3108", "maria.aparecoda@gmail.com", "Maringá", "PR");
    }
}
