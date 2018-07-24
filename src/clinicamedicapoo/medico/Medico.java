/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.medico;

import clinicamedicapoo.utilitarios.Pessoa;
import clinicamedicapoo.utilitarios.Sexo;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author miche
 */
@Entity
public class Medico extends Pessoa {

    public Medico(String nome, String sobrenome, String cpf, String rg, Sexo sexo, String dataNascimento, String rua, String numero, String bairro, String cep, String cidade, String estado, String telefone_residencial, String telefone_celular, String email) {
        super(nome, sobrenome, cpf, rg, sexo, dataNascimento, rua, numero, bairro, cep, cidade, estado, telefone_residencial, telefone_celular, email);
    }

    public Medico() {
    }

    public Medico(String nome) {
        super(nome);
    }
    
}
