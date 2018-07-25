/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicamedicapoo;

import clinicamedicapoo.consulta.ConsultaConsultaView;
import clinicamedicapoo.consulta.ConsultaController;
import clinicamedicapoo.consulta.ConsultaTableModel;
import clinicamedicapoo.medico.Medico;
import clinicamedicapoo.paciente.PacienteConsultaView;
import clinicamedicapoo.paciente.PacienteController;
import clinicamedicapoo.paciente.PacienteRegistroView;
import clinicamedicapoo.paciente.PacienteTableModel;
import clinicamedicapoo.prontuario.Prontuario;
import clinicamedicapoo.prontuario.ProntuarioConsultaView;
import clinicamedicapoo.prontuario.ProntuarioController;
import clinicamedicapoo.prontuario.ProntuarioTableModel;
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
        Prontuario prontuario = new Prontuario();
        //Table Model
        PacienteTableModel paciente_table_model = new PacienteTableModel();
        ConsultaTableModel consulta_table_model = new ConsultaTableModel();
        ProntuarioTableModel prontuario_table_model = new ProntuarioTableModel();
        //views
        ConsultaConsultaView consulta_view = new ConsultaConsultaView(consulta_table_model);
        PacienteRegistroView paciente_register_view = new PacienteRegistroView();
        PacienteConsultaView paciente_consulta_view = new PacienteConsultaView(paciente_register_view, paciente_table_model);
        ProntuarioConsultaView prontuario_consulta_view = new ProntuarioConsultaView(prontuario_table_model);
        TelaPrincipal tela_principal = new TelaPrincipal(paciente_consulta_view, consulta_view,prontuario_consulta_view);
        Login login = new Login(tela_principal, paciente_consulta_view);
        //Controllers
        UsuarioController usuario_controller = new UsuarioController(usuario, login);
        PacienteController paciente_controler = new PacienteController(secretaria, tela_principal, usuario_controller, medico);
        ConsultaController consulta_controller = new ConsultaController(usuario_controller, secretaria, medico, consulta_table_model, tela_principal);
        ProntuarioController prontuario_controller = new ProntuarioController(usuario_controller, secretaria, medico, prontuario_table_model, tela_principal);
        //Função para inicializar componentes
        //login
        usuario_controller.login(); 
        usuario_controller.sair(); 
        //tela principal
        paciente_controler.telaPacientes();
        consulta_controller.telaConsultas();
        prontuario_controller.telaProntuario();
        //tela Consulta Paciente
        paciente_controler.adicionarPaciente();
        paciente_controler.editarPaciente();
        paciente_controler.filtrarPacientes();
        paciente_controler.excluirPaciente();
        //tela registro paciente
        paciente_controler.salvarPaciente();
        paciente_controler.cancelarRegistroPaciente();
        
      
    }
    
}
