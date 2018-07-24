/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.paciente;

import static clinicamedicapoo.secretaria.Secretaria.manager;
import clinicamedicapoo.utilitarios.Pessoa;
import clinicamedicapoo.utilitarios.Sexo;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Embedded;
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
public class Paciente extends Pessoa implements Serializable {
    public static EntityManagerFactory factory = Persistence.createEntityManagerFactory("ClinicaMedicaPOO");
    public static EntityManager manager = factory.createEntityManager();
    
    @Column(nullable = false)
    private TipoConvenio tipoconvenio;
    
    @Column(nullable = true)
    private boolean isFumante;
    
    @Column(nullable = true)
    private boolean isAlcolatra;
    
    @Column(nullable = true)
    private boolean isColesterol;
    
    @Column(nullable = true)
    private boolean isDiabetico;
    
    @Column(nullable = true)
    private boolean doencasCardiacas;
    
    @Column(nullable = true, length = 1000)
    private String cirurgias;
    
    @Column(nullable = true, length = 1000)
    private String alergias;

    @Column(nullable = true)
    private boolean ativo;

    public Paciente(String nome, String sobrenome, String cpf, String rg, Sexo sexo, String dataNascimento, String rua, String numero, String bairro, String cep, String cidade, String estado, String telefone_residencial, String telefone_celular, String email) {
        super(nome, sobrenome, cpf, rg, sexo, dataNascimento, rua, numero, bairro, cep, cidade, estado, telefone_residencial, telefone_celular, email);
    }

    public Paciente() {
    }

    public Paciente(TipoConvenio tipoconvenio, boolean isFumante, boolean isAlcolatra, boolean isColesterol, boolean isDiabetico, boolean doencasCardiacas, String cirurgias, String alergias, boolean ativo, String nome, String sobrenome, String cpf, String rg, Sexo sexo, String dataNascimento, String rua, String numero, String bairro, String cep, String cidade, String estado, String telefone_residencial, String telefone_celular, String email) {
        super(nome, sobrenome, cpf, rg, sexo, dataNascimento, rua, numero, bairro, cep, cidade, estado, telefone_residencial, telefone_celular, email);
        this.tipoconvenio = tipoconvenio;
        this.isFumante = isFumante;
        this.isAlcolatra = isAlcolatra;
        this.isColesterol = isColesterol;
        this.isDiabetico = isDiabetico;
        this.doencasCardiacas = doencasCardiacas;
        this.cirurgias = cirurgias;
        this.alergias = alergias;
        this.ativo = ativo;
    }


    public TipoConvenio getTipoconvenio() {
        return tipoconvenio;
    }

    public void setTipoconvenio(TipoConvenio tipoconvenio) {
        this.tipoconvenio = tipoconvenio;
    }

    public boolean isIsFumante() {
        return isFumante;
    }

    public void setIsFumante(boolean isFumante) {
        this.isFumante = isFumante;
    }

    public boolean isIsAlcolatra() {
        return isAlcolatra;
    }

    public void setIsAlcolatra(boolean isAlcolatra) {
        this.isAlcolatra = isAlcolatra;
    }

    public boolean isIsColesterol() {
        return isColesterol;
    }

    public void setIsColesterol(boolean isColesterol) {
        this.isColesterol = isColesterol;
    }

    public boolean isIsDiabetico() {
        return isDiabetico;
    }

    public void setIsDiabetico(boolean isDiabetico) {
        this.isDiabetico = isDiabetico;
    }

    public boolean getDoencasCardiacas() {
        return doencasCardiacas;
    }

    public void setDoencasCardiacas(boolean doencasCardiacas) {
        this.doencasCardiacas = doencasCardiacas;
    }

    public String getCirurgias() {
        return cirurgias;
    }

    public void setCirurgias(String cirurgias) {
        this.cirurgias = cirurgias;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Paciente{" + "tipoconvenio=" + tipoconvenio + ", isFumante=" + isFumante + ", isAlcolatra=" + isAlcolatra + ", isColesterol=" + isColesterol + ", isDiabetico=" + isDiabetico + ", doencasCardiacas=" + doencasCardiacas + ", cirurgias=" + cirurgias + ", alergias=" + alergias + ", ativo=" + ativo + '}';
    }

    
    
    public Paciente inserirPaciente(TipoConvenio tipoconvenio,
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
            String estado) {
        
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
            cidade,
            estado,
            telefone_residencial,
            telefone_celular,
            email);
        try{
           manager.getTransaction().begin();
           manager.persist(p);
           manager.getTransaction().commit();
           return p;
        }
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            return null;
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
    
    public static boolean DeletarPaciente(int id){
        try{
            manager.getTransaction().begin();
            Paciente p = manager.find(Paciente.class, id);
            p.setAtivo(false);
            manager.getTransaction().commit();
            return true;
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }
    
        public List<Paciente> getPaciente(String filtro_nome){
        Query query = manager.createQuery("select p FROM Paciente p WHERE p.nome LIKE '%"+ filtro_nome+"%' and p.ativo = true");
        List<Paciente> lista_paciente = query.getResultList();
        return lista_paciente;
    }
    
    public void povoarPaciente(){
        inserirPaciente(TipoConvenio.Particular, false, false, false, false, true, "", "", true,"Michel", "Bolzon", "078.161.349-32", "97796033", Sexo.Masculino, "11/10/1995", "Rua ivinhema", "25", "Parque Avenida", "87025-490", "(44) 3028-2888", "(44) 99824-3108", "Michel.bolzon123@gmail.com", "Maringá", "PR");
        inserirPaciente(TipoConvenio.PlanoDeSaude, false, true, false, true,false, "", "", true, "Maria Aparecida", "Malvestio", "123.456.789-10", "132465789", Sexo.Feminino, "11/08/1995", "Rua dos moscados", "4989", "Zona 07", "78949-254", "(44) 3228-9999", "(44) 88978-3108", "maria.aparecoda@gmail.com", "São Paulo", "SP");
//        inserirMedico(new Medico("Maria Aparecida", "Malvestio", "123.456.789-10", "132465789", Sexo.Feminino, "11/03/1995", "Rua dos moscados", "4989", "Zona 07", "78949-254", "(44) 3228-9999", "(44) 88978-3108", "maria.aparecoda@gmail.com"));
    }
        
}
