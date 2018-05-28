package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import Controlador.Controlador;
import Vistas.VistaLogin;

public class Modelo {
	private Controlador controlador;
	private VistaLogin vistaLogin;
	private JPanel contentPane;

	private String login;
	private String pwd;
	private String url;
	private Connection conexion;

	private int intentosLogin;

	private DefaultTableModel TablaTutores;
	private DefaultTableModel TablaCentros;
	private DefaultTableModel TablaGrupos;
	private DefaultTableModel TablaAlumnos;
	private DefaultTableModel TablaAlumnosDir;
	private DefaultTableModel TablaEmpresas;

	private String sqlTablaTutores;
	private String sqlTablaCentros;
	private String sqlTablaGrupos;
	private String sqlTablaAlumnos;
	private String sqlTablaAlumnosDir;
	private String sqlTablaEmpresas;

	public Modelo() {
		Scanner in = new Scanner(System.in);
		intentosLogin = 3;
		try {
			login = "PROYECTO";
			pwd = "1234";
			url = "jdbc:oracle:thin:@localhost:1521:XE";

			sqlTablaTutores = "Select NIF_TUTOR \"NIF\", NOM \"NOMBRE\", APELL1 \"APELLIDO 1\", APELL2 \"APELLIDO 2\" FROM PROYECTO.TUTOR";
			sqlTablaCentros = "Select DEN_CENTRO \"CENTRO\",COD_CENTRO \"CÓDIGO\",DIRECTOR_CENTRO \"DIRECTOR\",MUN_CENTRO \"MUNICIPIO\" FROM PROYECTO.Centro";
			sqlTablaGrupos = "Select NOM_CICLO \"CICLO\",COD_GRUPO \"COD. GRUPO\",NOM \"TUTOR\",NOM_FAM \"FAMILIA PROFESIONAL\",CLAVE_FAM \"CLAVE FAMILIA\" FROM PROYECTO.CICLO,PROYECTO.GRUPO,PROYECTO.TUTOR WHERE CICLO.CLAVE_CICLO=GRUPO.CLAVE_CICLO AND GRUPO.NIF_TUTOR=TUTOR.NIF_TUTOR";
			sqlTablaEmpresas = "Select NUM_CONV \"NUM.CONVENIO\", NOM_EMPR \"EMPRESA\", F_FIRMA \"FECHA FIRMA\", LOCALIDAD, DIRECCION, REPR_EMPR \"REPRESENTANTE\" FROM PROYECTO.EMPRESA";
			sqlTablaAlumnosDir = "Select ESTUDIANTE.NUM_MAT \"NUM.MATRICULA\", ESTUDIANTE.APELL1 \"APELLIDO 1\",ESTUDIANTE.APELL2 \"APELLIDO 2\",ESTUDIANTE.NOM \"NOMBRE\",DNI,TUTOR.NOM \"TUTOR\",TO_CHAR(FECHA_INICIO, 'DD/MM/YYYY') \"FECHA INICIO\",TO_CHAR(FECHA_FIN, 'DD/MM/YYYY') \"FECHA FIN\",NOM_EMPR \"EMPRESA\",LOCALIZACIÓN,EMPRESA.NUM_CONV \"NUM.CONVENIO\",NOM_CICLO \"CICLO\",HORARIO FROM PROYECTO.ESTUDIANTE,PROYECTO.ESTUDIANTE_TUTOR,PROYECTO.TUTOR,PROYECTO.REALIZA_PRACTICAS,PROYECTO.EMPRESA,PROYECTO.GRUPO_ESTUDIANTE,PROYECTO.GRUPO,PROYECTO.CICLO WHERE ESTUDIANTE.NUM_MAT=ESTUDIANTE_TUTOR.NUM_MAT AND ESTUDIANTE_TUTOR.NIF_TUTOR=TUTOR.NIF_TUTOR AND ESTUDIANTE.NUM_MAT=REALIZA_PRACTICAS.NUM_MAT AND REALIZA_PRACTICAS.NUM_CONV=EMPRESA.NUM_CONV AND ESTUDIANTE.NUM_MAT=GRUPO_ESTUDIANTE.NUM_MAT AND GRUPO_ESTUDIANTE.COD_GRUPO=GRUPO.COD_GRUPO AND GRUPO.CLAVE_CICLO=CICLO.CLAVE_CICLO";
			sqlTablaAlumnos="Select ESTUDIANTE.NUM_MAT \"NUM.MATRÍCULA\", APELL1 \"APELLIDO 1\" ,APELL2 \"APELLIDO 2\",NOM \"NOMBRE\",DNI,ESTADO FROM PROYECTO.ESTUDIANTE, PROYECTO.REALIZA_PRACTICAS WHERE ESTUDIANTE.NUM_MAT=REALIZA_PRACTICAS.NUM_MAT";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conexion = DriverManager.getConnection(url, login, pwd);
			if (conexion != null) {
				System.out.println(" - Conexión con ORACLE establecida -");

			}

		} catch (Exception e) {
			System.out.println(" – Error de Conexión con ORACLE -");
			e.printStackTrace();
		}
		cargarTabla(TablaTutores = new DefaultTableModel(), sqlTablaTutores);
		cargarTabla(TablaCentros = new DefaultTableModel(), sqlTablaCentros);
		cargarTabla(TablaGrupos = new DefaultTableModel(), sqlTablaGrupos);
		cargarTabla(TablaEmpresas = new DefaultTableModel(), sqlTablaEmpresas);
		cargarTabla(TablaAlumnosDir = new DefaultTableModel(), sqlTablaAlumnosDir);
		cargarTabla(TablaAlumnos = new DefaultTableModel(), sqlTablaAlumnos);
	}

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public VistaLogin getVistaLogin() {
		return vistaLogin;
	}

	public void setVistaLogin(VistaLogin vistaLogin) {
		this.vistaLogin = vistaLogin;
	}

	public void comprobarUser(String user, String pass) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM PROYECTO.USERS WHERE USR=? AND PWD=?";

		try {
			PreparedStatement pstmt = conexion.prepareStatement(sql);
			pstmt.setString(1, user);
			pstmt.setString(2, pass);
			ResultSet rset = pstmt.executeQuery();

			if (!rset.next()) {
				intentosLogin--;
				if (intentosLogin > 1) {
					JOptionPane.showMessageDialog(contentPane,
							"Los datos introducidos son incorrectos. Te quedan " + intentosLogin + " intentos.",
							"Error", JOptionPane.ERROR_MESSAGE);
				} else if (intentosLogin == 1) {
					JOptionPane.showMessageDialog(contentPane,
							"Datos incorrectos. Te quedan " + intentosLogin
									+ " intentos. Si vuelves a fallar, el programa se cerrará.",
							"Error", JOptionPane.ERROR_MESSAGE);
				} else {
					controlador.Salir();
				}

			} else {

				if (rset.getString(3).equals("TUTOR")) {
					intentosLogin = 3;
					controlador.LoginToMenTut();
				} else if (rset.getString(3).equals("ADMIN")) {
					intentosLogin = 3;
					controlador.Log();
				} else if (rset.getString(3).equals("DIRECTOR")) {
					intentosLogin = 3;
					controlador.LoginAsDir();
				}

				rset.close();
				pstmt.close();
			}
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	private void cargarTabla(DefaultTableModel tabla, String sql) {

		int numColumnas = getNumColumnas(sql);
		Object[] contenido = new Object[numColumnas];
		PreparedStatement pstmt;
		try {
			pstmt = conexion.prepareStatement(sql);
			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			for (int i = 0; i < numColumnas; i++) {
				tabla.addColumn(rsmd.getColumnName(i + 1));
			}
			while (rset.next()) {
				for (int col = 1; col <= numColumnas; col++) {
					contenido[col - 1] = rset.getString(col);
				}
				tabla.addRow(contenido);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private int getNumColumnas(String sql) {
		int num = 0;
		try {
			PreparedStatement pstmt = conexion.prepareStatement(sql);
			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			num = rsmd.getColumnCount();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}

	public DefaultTableModel getTablaTutores() {
		return TablaTutores;
	}

	public DefaultTableModel getTablaCentros() {
		return TablaCentros;
	}

	public DefaultTableModel getTablaGrupos() {
		return TablaGrupos;
	}

	public DefaultTableModel getTablaAlumnos() {
		return TablaAlumnos;
	}

	public DefaultTableModel getTablaAlumnosDir() {
		return TablaAlumnosDir;
	}

	public DefaultTableModel getTablaEmpresas() {
		return TablaEmpresas;
	}

}