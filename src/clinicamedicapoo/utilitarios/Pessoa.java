/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.utilitarios;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author miche
 */
@Entity
@Table(name="Pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa implements Serializable {
    @Id
    @GeneratedValue
    private Integer id_pessoa; 
    
    @Column(nullable = false, length = 100)
    protected String nome;
    
    @Column(nullable = false, length = 100)
    protected String sobrenome;
    
    @Column(nullable = false, length = 14)
    protected String cpf;
    
    @Column(nullable = true, length = 20)
    protected String rg;
    
    @Column(nullable = false)
    protected Sexo sexo;
    
    @Column(nullable = true)
    @Temporal(javax.persistence.TemporalType.DATE)
    protected Date dataNascimento;
    
    @Column(nullable = true, length = 100)
    protected String rua;
    
    @Column(nullable = true, length = 20)
    protected String numero;
    
    @Column(nullable = true, length = 100)
    protected String bairro;
    
    @Column(nullable = true, length = 10)
    protected String cep;
    
    @Column(nullable = true, length = 20)
    protected String cidade;
    
    @Column(nullable = true, length = 10)
    protected String estado;
    
    @Column(nullable = true, length = 20)
    protected String telefone_residencial;
    
    @Column(nullable = true, length = 20)
    protected String telefone_celular;
    
    @Column(nullable = true, length = 30)
    protected String email;

    public Pessoa(String nome, String sobrenome, String cpf, String rg, Sexo sexo, String dataNascimento, String rua, String numero, String bairro, String cep, String cidade, String estado, String telefone_residencial, String telefone_celular, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.setDataNascimento(dataNascimento);
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone_residencial = telefone_residencial;
        this.telefone_celular = telefone_celular;
        this.email = email;
    }

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Integer getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(Integer id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        String data = null;        
        String[] datahora = null;
        SimpleDateFormat formatDateTime = new SimpleDateFormat("dd/MM/yyyy");        
        if(this.dataNascimento != null ){
            data = formatDateTime.format(this.dataNascimento);
            datahora = data.split(" ");
        }
        return datahora[0];
    }

    public void setDataNascimento(String dataNascimento) {
        if(!(dataNascimento.length() > 0)){
            this.dataNascimento = null;
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
        this.dataNascimento = dt;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone_residencial() {
        return telefone_residencial;
    }

    public void setTelefone_residencial(String telefone_residencial) {
        this.telefone_residencial = telefone_residencial;
    }

    public String getTelefone_celular() {
        return telefone_celular;
    }

    public void setTelefone_celular(String telefone_celular) {
        this.telefone_celular = telefone_celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + ", rg=" + rg + ", dataNascimento=" + dataNascimento + ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cep=" + cep + ", telefone_residencial=" + telefone_residencial + ", telefone_celular=" + telefone_celular + ", email=" + email + '}';
    }
    
    public boolean emailPreenchido(){
        return (this.email.length() > 0);
    }
}
