package Controlador;


import Modelo.Modelo;
import Vistas.*;
;public class Principal {
	public Principal() {
		// TODO Auto-generated constructor stub
		super();
	}

	public void ejecuta() {
		VistaLogin Login = new VistaLogin();
		Controlador controlador = new Controlador();
		Login.setControlador(controlador);
		controlador.setVistaLogin(Login);

		VistaMenuAdmin Menu = new VistaMenuAdmin();
		Menu.setControlador(controlador);
		controlador.setVistaMenu(Menu);

		VistaCentros Centros = new VistaCentros();
		Centros.setControlador(controlador);
		controlador.setVistaCentros(Centros);

		VistaCiclo ciclos = new VistaCiclo();
		ciclos.setControlador(controlador);
		controlador.setVistaCiclos(ciclos);

		

		VistaEmpresa empresa = new VistaEmpresa();
		empresa.setControlador(controlador);
		controlador.setVistaEmpresa(empresa);

		VistaTutores tutores = new VistaTutores();
		tutores.setControlador(controlador);
		controlador.setVistaTutores(tutores);
		

		VistaMenuTutor menuTutor = new VistaMenuTutor();
		menuTutor.setControlador(controlador);
		controlador.setMenuTutor(menuTutor);

		VistaAlumnosTut AlumnosTut = new VistaAlumnosTut();
		AlumnosTut.setControlador(controlador);
		controlador.setVistaAlumnosTut(AlumnosTut);

		VistaEmpresasTut EmpresTut = new VistaEmpresasTut();
		EmpresTut.setControlador(controlador);
		controlador.setVistaEmpresaTut(EmpresTut);

		

		VistaAnadirAlumnoTut AnadirAlumnoTutor = new VistaAnadirAlumnoTut();
		AnadirAlumnoTutor.setControlador(controlador);
		controlador.setAnadirAlumnoTut(AnadirAlumnoTutor);

		VistaModificarAlumnoTut ModifAlumnosTut = new VistaModificarAlumnoTut();
		ModifAlumnosTut.setControlador(controlador);
		controlador.setModifAlumnTut(ModifAlumnosTut);

		VistaGestionarPracticasTut GestionPractTut = new VistaGestionarPracticasTut();
		GestionPractTut.setControlador(controlador);
		controlador.setGestionarPractTut(GestionPractTut);

		VistaAnadirCiclo AnadirCiclo = new VistaAnadirCiclo();
		AnadirCiclo.setControlador(controlador);
		controlador.setAnadirCiclo(AnadirCiclo);

		VistaModificarCiclo ModifCiclo = new VistaModificarCiclo();
		ModifCiclo.setControlador(controlador);
		controlador.setModifCiclo(ModifCiclo);

		VistaAnadirTutor AnadirTutor = new VistaAnadirTutor();
		AnadirTutor.setControlador(controlador);
		controlador.setAnadirTutor(AnadirTutor);

		VistaModificarTutor ModTutor = new VistaModificarTutor();
		ModTutor.setControlador(controlador);
		controlador.setModifTutor(ModTutor);

		VistaModificarCentro ModCentro = new VistaModificarCentro();
		ModCentro.setControlador(controlador);
		controlador.setModCentro(ModCentro);

		VistaAnadirCentro AnadirCentro = new VistaAnadirCentro();
		AnadirCentro.setControlador(controlador);
		controlador.setAnadirCentro(AnadirCentro);

		VistaAnadirEmpresa AnadirEmpresa = new VistaAnadirEmpresa();
		AnadirEmpresa.setControlador(controlador);
		controlador.setAnadirEmpresa(AnadirEmpresa);

		VistaModificarEmpresa ModificarEmpresa = new VistaModificarEmpresa();
		ModificarEmpresa.setControlador(controlador);
		controlador.setModEmpresa(ModificarEmpresa);

		Modelo modelo = new Modelo();
		modelo.setControlador(controlador);
		controlador.setModelo(modelo);
		modelo.setVistaLogin(Login);
		
		VistaDirectora vistaDirectora = new VistaDirectora();
		controlador.setVistaDirectora(vistaDirectora);
		vistaDirectora.setControlador(controlador);

		tutores.setModelo(modelo);
		Centros.setModelo(modelo);
		ciclos.setModelo(modelo);
		empresa.setModelo(modelo);
		vistaDirectora.setModelo(modelo);
		AlumnosTut.setModelo(modelo);
		EmpresTut.setModelo(modelo);
		Login.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Principal().ejecuta();
	}
}
