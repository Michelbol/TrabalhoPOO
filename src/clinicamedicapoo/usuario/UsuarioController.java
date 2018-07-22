/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.usuario;

import clinicamedicapoo.medico.Medico;
import clinicamedicapoo.secretaria.Secretaria;
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
public class UsuarioController {
    public static EntityManagerFactory factory = Persistence.createEntityManagerFactory("ClinicaMedicaPOO");
    public static EntityManager manager = factory.createEntityManager();
    public static EntityTransaction tx = null;
    public static Usuario usuarioLogado;
    
    public static boolean logar(String senha, String login){        
        Query query = manager.createQuery("select u FROM Usuario u WHERE u.login = '"+ login +"' and u.senha = '"+senha+"'");
        List<Usuario> lista_usuario = query.getResultList();
        if(lista_usuario.size() == 1){
            usuarioLogado = lista_usuario.get(0);
            return true;
        }else{
            usuarioLogado = null;
            return false;
        }
    }
    
    public static void inserirUsuario(String login, String senha, Medico medico, Secretaria secretaria) {
        Usuario u = new Usuario(login, senha, medico, secretaria);
        try{
           manager.getTransaction().begin();
           manager.persist(u);
           manager.getTransaction().commit();
        }
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    public static void povoarUsuarios(){
        inserirUsuario("master", "master", null, null);
    }
}
