/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.utilitarios;

import java.util.Date;

/**
 *
 * @author miche
 */
public abstract class Pessoa {
    protected String nome;
    protected String sobrenome;
    protected String cpf;
    protected String rg;
    protected Date dataNascimento;
    protected String rua;
    protected String numero;
    protected String bairro;
    protected String cep;
    protected String telefone_residencial;
    protected String telefone_celular;
    protected String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + ", rg=" + rg + ", dataNascimento=" + dataNascimento + ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cep=" + cep + ", telefone_residencial=" + telefone_residencial + ", telefone_celular=" + telefone_celular + ", email=" + email + '}';
    }
    
    public boolean emailPreenchido(){
        return (this.email.length() > 0);
    }
}
