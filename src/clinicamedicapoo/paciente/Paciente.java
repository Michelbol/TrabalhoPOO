/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.paciente;

import clinicamedicapoo.utilitarios.Pessoa;
import clinicamedicapoo.utilitarios.Sexo;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author miche
 */
@Entity
public class Paciente extends Pessoa implements Serializable {
    
    @Embedded
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

    @Column(nullable = false)
    private boolean ativo;

    public Paciente(String nome, String sobrenome, String cpf, String rg, Sexo sexo, String dataNascimento, String rua, String numero, String bairro, String cep, String telefone_residencial, String telefone_celular, String email) {
        super(nome, sobrenome, cpf, rg, sexo, dataNascimento, rua, numero, bairro, cep, telefone_residencial, telefone_celular, email);
    }
    
    public Paciente(TipoConvenio tipoconvenio, boolean isFumante, boolean isAlcolatra, boolean isColesterol, boolean isDiabetico, boolean doencasCardiacas, String cirurgias, String alergias, boolean ativo, String nome, String sobrenome, String cpf, String rg, Sexo sexo, String dataNascimento, String rua, String numero, String bairro, String cep, String telefone_residencial, String telefone_celular, String email) {
        super(nome, sobrenome, cpf, rg, sexo, dataNascimento, rua, numero, bairro, cep, telefone_residencial, telefone_celular, email);
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
        return "Paciente{" + "tipoconvenio=" + tipoconvenio + ", isFumante=" + isFumante + ", isAlcolatra=" + isAlcolatra + ", isColesterol=" + isColesterol + ", isDiabetico=" + isDiabetico + ", doencasCardiacas=" + doencasCardiacas + ", cirurgias=" + cirurgias + ", alergias=" + alergias + '}';
    }
        
}
