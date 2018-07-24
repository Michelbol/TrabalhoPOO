/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.usuario;

import clinicamedicapoo.medico.Medico;
import clinicamedicapoo.paciente.Paciente;
import clinicamedicapoo.utilitarios.Sexo;
import clinicamedicapoo.view.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author miche
 */
public class UsuarioController {
    private ActionListener actionlistener;
    private Usuario usuarioLogado;
    private Login tela_login;

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public UsuarioController(Usuario usuario, Login tela_login) {
        usuarioLogado = usuario;
        this.tela_login = tela_login;
        usuario.povoarUsuarios();
        Paciente paciente = new Paciente();
        paciente.povoarPaciente();
        Medico medico = new Medico();
        medico.inserirMedico("Maria Aparecida", "Malvestio", "123.456.789-10", "132465789", Sexo.Feminino, "11/03/1995", "Rua dos moscados", "4989", "Zona 07", "78949-254", "(44) 3228-9999", "(44) 88978-3108", "maria.aparecoda@gmail.com","Maringá", "PR");
    }
    
    public void login(){
        actionlistener = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                usuarioLogado = usuarioLogado.logar(new String(tela_login.senha().getPassword()), tela_login.login().getText());
                if(usuarioLogado != null){
                    tela_login.getTela_principal().setVisible(true);
                    tela_login.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Usuário ou Senha inválido");
                }
            }
        };
        tela_login.entrar().addActionListener(actionlistener);
    }
    
    public void sair(){
        actionlistener = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        };
        tela_login.sair().addActionListener(actionlistener);
    }
}
