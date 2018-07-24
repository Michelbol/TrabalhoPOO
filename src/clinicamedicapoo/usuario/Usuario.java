/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.usuario;

import clinicamedicapoo.medico.Medico;
import clinicamedicapoo.secretaria.Secretaria;
import clinicamedicapoo.utilitarios.Sexo;
import java.io.Serializable;
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

/**
 *
 * @author miche
 */
@Entity
@Table(name="Usuario")
public class Usuario implements Serializable {
    public static EntityManagerFactory factory = Persistence.createEntityManagerFactory("ClinicaMedicaPOO");
    public static EntityManager manager = factory.createEntityManager();
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(length = 20, nullable=false)
    private String login;
    
    @Column(length = 20, nullable=false)
    private String senha;
    
    @OneToOne(fetch = FetchType.EAGER, optional = true)
    private Medico medico;
    
    @OneToOne(fetch = FetchType.EAGER, optional = true)
    private Secretaria secretaria;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }

    public Usuario(String login, String senha, Medico medico, Secretaria secretaria) {
        this.login = login;
        this.senha = senha;
        this.medico = medico;
        this.secretaria = secretaria;
    }

    public Usuario() {
    }
    
    public Usuario logar(String senha, String login){
        Query query = manager.createQuery("select u FROM Usuario u WHERE u.login = '"+login+"' and u.senha = '"+senha+"'");        
        List<Usuario> lista_usuario = query.getResultList();
        if(lista_usuario.size() == 1){     
            return lista_usuario.get(0);
        }else{
            return null;
        }
    }
    
    public boolean inserirUsuario(String login, String senha, Medico medico, Secretaria secretaria) {
        Usuario u = new Usuario(login, senha, medico, secretaria);
        try{
           manager.getTransaction().begin();
           manager.persist(u);
           manager.getTransaction().commit();
           return true;
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }
    
    public void povoarUsuarios(){
        inserirUsuario("secretaria", "123456", null, new Secretaria().inserirSecretaria("Maria", "", "", "", Sexo.Feminino, "11/10/1995", "", "", "", "", "", "", "", ""));
//        inserirUsuario("medico", "123456", new Medico("Jose"), null);
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", login=" + login + ", senha=" + senha + ", medico=" + medico + ", secretaria=" + secretaria + '}';
    }
    
}
