/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo.prontuario;

import clinicamedicapoo.usuario.Usuario;
import clinicamedicapoo.usuario.UsuarioController;
import java.awt.event.ActionListener;

/**
 *
 * @author joaov
 */
public class ProntuarioController {
    private ActionListener actionlistener;
    private UsuarioController usuarioLogado;
    private ProntuarioView tela_prontuario;
    
    public Usuario getUsuarioLogado() {
        return usuarioLogado.getUsuarioLogado();
    }

    public ProntuarioController(UsuarioController usuarioLogado, ProntuarioView tela_prontuario) {
        this.usuarioLogado = usuarioLogado;
        this.tela_prontuario = tela_prontuario;
        Prontuario prontuario = new Prontuario();
        prontuario.povoarProntuario(this.getUsuarioLogado());
    }
}
