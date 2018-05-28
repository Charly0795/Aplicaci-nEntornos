package Controlador;

import Modelo.Modelo;
import Vistas.*;
public class Controlador {
	private VistaLogin vistaLogin;
	private VistaMenuAdmin vistaMenu;
	private VistaCentros vistaCentros;
	private VistaCiclo vistaCiclos;
	private VistaEmpresa vistaEmpresa;
	private VistaTutores vistaTutores;
	private VistaMenuTutor menuTutor;
	private VistaAlumnosTut vistaAlumnosTut;
	private VistaEmpresasTut vistaEmpresaTut;
	
	private VistaAnadirAlumnoTut anadirAlumnoTut;
	private VistaModificarAlumnoTut modifAlumnTut;
	private VistaGestionarPracticasTut GestionarPractTut;
	private VistaAnadirCiclo AnadirCiclo;
	private VistaModificarCiclo ModifCiclo;
	private VistaAnadirTutor AnadirTutor;
	private VistaModificarTutor ModifTutor;
	private VistaModificarCentro ModCentro;
	private VistaAnadirCentro AnadirCentro;
	private VistaAnadirEmpresa AnadirEmpresa;
	private VistaModificarEmpresa ModEmpresa;
	private VistaDirectora vistaDirectora;

	private Modelo modeloLogin;


	public Controlador() {
		super();
	}

	public VistaDirectora getVistaDirectora() {
		return vistaDirectora;
	}

	public void setVistaDirectora(VistaDirectora vistaDirectora) {
		this.vistaDirectora = vistaDirectora;
	}

	public Modelo getModelo() {
		return modeloLogin;
	}

	public void setModelo(Modelo modelo) {
		this.modeloLogin = modelo;
	}

	public VistaModificarEmpresa getModEmpresa() {
		return ModEmpresa;
	}

	public void setModEmpresa(VistaModificarEmpresa modEmpresa) {
		ModEmpresa = modEmpresa;
	}

	public VistaAnadirEmpresa getAnadirEmpresa() {
		return AnadirEmpresa;
	}

	public void setAnadirEmpresa(VistaAnadirEmpresa anadirEmpresa) {
		AnadirEmpresa = anadirEmpresa;
	}

	public VistaAnadirCentro getAnadirCentro() {
		return AnadirCentro;
	}

	public void setAnadirCentro(VistaAnadirCentro anadirCentro) {
		AnadirCentro = anadirCentro;
	}

	public VistaModificarCentro getModCentro() {
		return ModCentro;
	}

	public void setModCentro(VistaModificarCentro modCentro) {
		ModCentro = modCentro;
	}

	public VistaModificarTutor getModifTutor() {
		return ModifTutor;
	}

	public void setModifTutor(VistaModificarTutor modifTutor) {
		ModifTutor = modifTutor;
	}

	public VistaAnadirTutor getAnadirTutor() {
		return AnadirTutor;
	}

	public void setAnadirTutor(VistaAnadirTutor anadirTutor) {
		AnadirTutor = anadirTutor;
	}

	public VistaModificarCiclo getModifCiclo() {
		return ModifCiclo;
	}

	public void setModifCiclo(VistaModificarCiclo modifCiclo) {
		ModifCiclo = modifCiclo;
	}

	public VistaAnadirCiclo getAnadirCiclo() {
		return AnadirCiclo;
	}

	public void setAnadirCiclo(VistaAnadirCiclo anadirCiclo) {
		AnadirCiclo = anadirCiclo;
	}

	public VistaGestionarPracticasTut getGestionarPractTut() {
		return GestionarPractTut;
	}

	public void setGestionarPractTut(VistaGestionarPracticasTut gestionarPractTut) {
		GestionarPractTut = gestionarPractTut;
	}

	public VistaModificarAlumnoTut getModifAlumnTut() {
		return modifAlumnTut;
	}

	public void setModifAlumnTut(VistaModificarAlumnoTut modifAlumnTut) {
		this.modifAlumnTut = modifAlumnTut;
	}

	public VistaAnadirAlumnoTut getAnadirAlumnoTut() {
		return anadirAlumnoTut;
	}

	public void setAnadirAlumnoTut(VistaAnadirAlumnoTut anadirAlumnoTut) {
		this.anadirAlumnoTut = anadirAlumnoTut;
	}

	

	public VistaLogin getVistaLogin() {
		return vistaLogin;
	}

	public void setVistaLogin(VistaLogin vistaLogin) {
		this.vistaLogin = vistaLogin;
	}

	public VistaMenuAdmin getVistaMenu() {
		return vistaMenu;
	}

	public void setVistaMenu(VistaMenuAdmin vistaMenu) {
		this.vistaMenu = vistaMenu;
	}

	public VistaCentros getVistaCentros() {
		return vistaCentros;
	}

	public void setVistaCentros(VistaCentros vistaCentros) {
		this.vistaCentros = vistaCentros;
	}

	public VistaCiclo getVistaCiclos() {
		return vistaCiclos;
	}

	public void setVistaCiclos(VistaCiclo vistaCiclos) {
		this.vistaCiclos = vistaCiclos;
	}



	public VistaEmpresa getVistaEmpresa() {
		return vistaEmpresa;
	}

	public void setVistaEmpresa(VistaEmpresa vistaEmpresa) {
		this.vistaEmpresa = vistaEmpresa;
	}

	public VistaTutores getVistaTutores() {
		return vistaTutores;
	}

	public void setVistaTutores(VistaTutores vistaTutores) {
		this.vistaTutores = vistaTutores;
	}

	public VistaMenuTutor getMenuTutor() {
		return menuTutor;
	}

	public void setMenuTutor(VistaMenuTutor menuTutor) {
		this.menuTutor = menuTutor;
	}

	public VistaAlumnosTut getVistaAlumnosTut() {
		return vistaAlumnosTut;
	}

	public void setVistaAlumnosTut(VistaAlumnosTut vistaAlumnosTut) {
		this.vistaAlumnosTut = vistaAlumnosTut;
	}

	public VistaEmpresasTut getVistaEmpresaTut() {
		return vistaEmpresaTut;
	}

	public void setVistaEmpresaTut(VistaEmpresasTut vistaEmpresaTut) {
		this.vistaEmpresaTut = vistaEmpresaTut;
	}

	public void Log() {
		vistaLogin.setVisible(false);
		vistaMenu.setVisible(true);
	}

	public void CentroToMenu() {
		// TODO Auto-generated method stub
		vistaCentros.setVisible(false);
		vistaMenu.setVisible(true);
	}

	public void MenuToCentros() {
		// TODO Auto-generated method stub
		vistaMenu.setVisible(false);
		vistaCentros.setVisible(true);
	}

	public void CicloToMenu() {
		// TODO Auto-generated method stub
		vistaCiclos.setVisible(false);
		vistaMenu.setVisible(true);
	}

	public void MenuToCiclos() {
		// TODO Auto-generated method stub
		vistaMenu.setVisible(false);
		vistaCiclos.setVisible(true);
	}



	public void EmpresaToMenu() {
		// TODO Auto-generated method stub
		vistaEmpresa.setVisible(false);
		vistaMenu.setVisible(true);
	}

	public void MenuToEmpresa() {
		// TODO Auto-generated method stub
		vistaMenu.setVisible(false);
		vistaEmpresa.setVisible(true);
	}

	public void TutorToMenu() {
		// TODO Auto-generated method stub
		vistaTutores.setVisible(false);
		vistaMenu.setVisible(true);
	}

	public void MenuToTutor() {
		// TODO Auto-generated method stub
		vistaMenu.setVisible(false);
		vistaTutores.setVisible(true);
	}

	public void LoginToMenTut() {
		// TODO Auto-generated method stub
		vistaLogin.setVisible(false);
		menuTutor.setVisible(true);
	}

	public void AlumnosToMenu() {
		// TODO Auto-generated method stub
		vistaAlumnosTut.setVisible(false);
		menuTutor.setVisible(true);

	}

	public void MenuToAlumnos() {
		// TODO Auto-generated method stub
		menuTutor.setVisible(false);
		vistaAlumnosTut.setVisible(true);
	}

	public void EmpToMenu() {
		// TODO Auto-generated method stub
		vistaEmpresaTut.setVisible(false);
		menuTutor.setVisible(true);
	}

	public void MenuToEmp() {
		// TODO Auto-generated method stub
		menuTutor.setVisible(false);
		vistaEmpresaTut.setVisible(true);

	}

	

	public void CancAnadirAlumnTut() {
		// TODO Auto-generated method stub
		anadirAlumnoTut.setVisible(false);
		vistaAlumnosTut.setVisible(true);
	}

	public void ToAnadirAlumnoTut() {
		// TODO Auto-generated method stub
		vistaAlumnosTut.setVisible(false);
		anadirAlumnoTut.setVisible(true);

	}

	public void ToModifAlumnTut() {
		// TODO Auto-generated method stub
		vistaAlumnosTut.setVisible(false);
		modifAlumnTut.setVisible(true);
	}

	public void CancelModifAlumnTut() {
		// TODO Auto-generated method stub
		modifAlumnTut.setVisible(false);
		vistaAlumnosTut.setVisible(true);
	}

	public void CancelGestionPractTut() {
		// TODO Auto-generated method stub
		GestionarPractTut.setVisible(false);
		vistaAlumnosTut.setVisible(true);
	}

	public void ToGestionPractTut() {
		// TODO Auto-generated method stub
		vistaAlumnosTut.setVisible(false);
		GestionarPractTut.setVisible(true);
	}

	public void CancelAddCiclo() {
		// TODO Auto-generated method stub
		AnadirCiclo.setVisible(false);
		vistaCiclos.setVisible(true);
	}

	public void toAddCiclo() {
		// TODO Auto-generated method stub
		vistaCiclos.setVisible(false);
		AnadirCiclo.setVisible(true);
	}

	public void ToModifCiclo() {
		// TODO Auto-generated method stub
		vistaCiclos.setVisible(false);
		ModifCiclo.setVisible(true);
	}

	public void CancelModifCicl() {
		// TODO Auto-generated method stub
		ModifCiclo.setVisible(false);
		vistaCiclos.setVisible(true);
	}

	public void CancelAnadirTut() {
		// TODO Auto-generated method stub
		AnadirTutor.setVisible(false);
		vistaTutores.setVisible(true);
	}

	public void toAddTutor() {
		// TODO Auto-generated method stub
		vistaTutores.setVisible(false);
		AnadirTutor.setVisible(true);
	}

	public void CancelModTut() {
		// TODO Auto-generated method stub
		ModifTutor.setVisible(false);
		vistaTutores.setVisible(true);
	}

	public void ToModTutor() {
		// TODO Auto-generated method stub
		vistaTutores.setVisible(false);
		ModifTutor.setVisible(true);
	}

	public void CancelModCentro() {
		// TODO Auto-generated method stub
		ModCentro.setVisible(false);
		vistaCentros.setVisible(true);
	}

	public void ToModCentro() {
		// TODO Auto-generated method stub
		vistaCentros.setVisible(false);
		ModCentro.setVisible(true);
	}

	public void ToAnadirCentro() {
		// TODO Auto-generated method stub
		vistaCentros.setVisible(false);
		AnadirCentro.setVisible(true);
	}

	public void CancelAddCentro() {
		// TODO Auto-generated method stub
		AnadirCentro.setVisible(false);
		vistaCentros.setVisible(true);
	}

	public void CancelAddEmpresa() {
		// TODO Auto-generated method stub
		AnadirEmpresa.setVisible(false);
		vistaEmpresa.setVisible(true);
	}

	public void toAddEmpresa() {
		// TODO Auto-generated method stub
		vistaEmpresa.setVisible(false);
		AnadirEmpresa.setVisible(true);
	}

	public void CancelModEmpresa() {
		// TODO Auto-generated method stub
		ModEmpresa.setVisible(false);
		vistaEmpresa.setVisible(true);
	}

	public void ToModEmpresa() {
		// TODO Auto-generated method stub
		vistaEmpresa.setVisible(false);
		ModEmpresa.setVisible(true);
	}

	public void LogOff() {
		// TODO Auto-generated method stub
		vistaMenu.setVisible(false);
		vistaLogin.setVisible(true);
	}

	public void LogOf() {
		// TODO Auto-generated method stub
		menuTutor.setVisible(false);
		vistaLogin.setVisible(true);
	}

	public void LoginAsDir() {
		vistaLogin.setVisible(false);
		vistaDirectora.setVisible(true);
	}

	public void getDatosIngreso() {
		// TODO Auto-generated method stub
		String User = vistaLogin.getUser();
		String Pass = vistaLogin.getPass();

		modeloLogin.comprobarUser(User, Pass);

	}

	public void Salir() {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	public void ToLogin() {
		// TODO Auto-generated method stub
		vistaDirectora.setVisible(false);
		vistaLogin.setVisible(true);
	}

}
