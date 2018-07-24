/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo;

import clinicamedicapoo.medico.Medico;
import clinicamedicapoo.paciente.PacienteConsultaView;
import clinicamedicapoo.paciente.PacienteController;
import clinicamedicapoo.paciente.PacienteRegistroView;
import clinicamedicapoo.paciente.PacienteTableModel;
import clinicamedicapoo.secretaria.Secretaria;
import clinicamedicapoo.secretaria.SecretariaController;
import clinicamedicapoo.usuario.Usuario;
import clinicamedicapoo.usuario.UsuarioController;
import clinicamedicapoo.view.Login;
import clinicamedicapoo.view.TelaPrincipal;

/**
 *
 * @author miche
 */
public class ClinicaMedicaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Models
        Secretaria secretaria = new Secretaria();
        Medico medico = new Medico();
        Usuario usuario = new Usuario();
        //Table Model
        PacienteTableModel paciente_table_model = new PacienteTableModel();
        //views
        PacienteRegistroView paciente_register_view = new PacienteRegistroView();
        PacienteConsultaView paciente_consulta_view = new PacienteConsultaView(paciente_register_view, paciente_table_model);
        TelaPrincipal tela_principal = new TelaPrincipal(paciente_consulta_view);
        Login login = new Login(tela_principal, paciente_consulta_view);
        //Controllers
        UsuarioController usuario_controller = new UsuarioController(usuario, login);
        SecretariaController secretaria_controller = new SecretariaController(secretaria, tela_principal, usuario_controller);
        //Função para inicializar componentes
        //login
        usuario_controller.login();        
        //tela principal
        secretaria_controller.telaPacientes();
        //tela Consulta Paciente
        secretaria_controller.adicionarPaciente();
        secretaria_controller.editarPaciente();
        secretaria_controller.filtrarPacientes();
        //tela registro paciente
        secretaria_controller.salvarPaciente();
        secretaria_controller.cancelarRegistroPaciente();
        
    }
    
}
