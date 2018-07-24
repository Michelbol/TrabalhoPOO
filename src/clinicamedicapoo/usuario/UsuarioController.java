/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.usuario;

import clinicamedicapoo.paciente.Paciente;
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

    public UsuarioController(Usuario usuario, Login tela_login) {
        usuarioLogado = usuario;
        this.tela_login = tela_login;
        usuario.povoarUsuarios();
        Paciente paciente = new Paciente();
        paciente.povoarPaciente();
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
}
