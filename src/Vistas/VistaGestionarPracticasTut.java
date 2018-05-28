package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaGestionarPracticasTut extends JFrame {
	private Controlador controlador;
	// Anadir
	private JPanel contentPane;
	private JTextField txtEmpresa;
	private JTextField txtFechaInicio;
	private JTextField txtHorario;
	private JTextField txtTutor;
	private JTextField tctFechaFin;
	private JTextField txtErasmus;
	private JTextField txtDireccion;

	/**
	 * Create the frame.
	 */
	public VistaGestionarPracticasTut() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 108, 414, 153);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblEmpresa = new JLabel("Empresa");
		lblEmpresa.setBounds(20, 14, 62, 14);
		panel.add(lblEmpresa);

		JLabel lblFecha_inicio = new JLabel("Fecha Inicio");
		lblFecha_inicio.setBounds(20, 39, 88, 14);
		panel.add(lblFecha_inicio);

		JLabel lblTutor_Empresa = new JLabel("Tutor Empresa");
		lblTutor_Empresa.setBounds(208, 14, 89, 14);
		panel.add(lblTutor_Empresa);

		JLabel lblHorario = new JLabel("Horario");
		lblHorario.setBounds(208, 39, 73, 14);
		panel.add(lblHorario);

		txtEmpresa = new JTextField();
		txtEmpresa.setBounds(112, 11, 86, 20);
		panel.add(txtEmpresa);
		txtEmpresa.setColumns(10);

		txtFechaInicio = new JTextField();
		txtFechaInicio.setBounds(112, 36, 86, 20);
		txtFechaInicio.setColumns(10);
		panel.add(txtFechaInicio);

		txtHorario = new JTextField();
		txtHorario.setBounds(293, 36, 86, 20);
		txtHorario.setColumns(10);
		panel.add(txtHorario);

		txtTutor = new JTextField();
		txtTutor.setBounds(293, 11, 86, 20);
		txtTutor.setColumns(10);
		panel.add(txtTutor);

		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}

		});
		btnActualizar.setBounds(304, 124, 89, 23);
		panel.add(btnActualizar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.CancelGestionPractTut();
			}
		});
		btnCancelar.setBounds(208, 124, 89, 23);
		panel.add(btnCancelar);

		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(20, 89, 73, 14);
		panel.add(lblDireccion);

		tctFechaFin = new JTextField();
		tctFechaFin.setBounds(112, 61, 86, 20);
		tctFechaFin.setColumns(10);
		panel.add(tctFechaFin);

		JLabel lblErasmus = new JLabel("Erasmus");
		lblErasmus.setBounds(208, 64, 73, 14);
		panel.add(lblErasmus);

		txtErasmus = new JTextField();
		txtErasmus.setColumns(10);
		txtErasmus.setBounds(293, 61, 86, 20);
		panel.add(txtErasmus);

		JLabel lblFecha_Fin = new JLabel("Fecha Fin");
		lblFecha_Fin.setBounds(20, 64, 73, 14);
		panel.add(lblFecha_Fin);

		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(112, 86, 86, 20);
		panel.add(txtDireccion);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(103, 0, 229, 27);
		contentPane.add(panel_1);

		JLabel lblGestionPracticas = new JLabel("GESTIONAR PRACTICAS");
		panel_1.add(lblGestionPracticas);
		lblGestionPracticas.setFont(new Font("Tahoma", Font.BOLD, 16));

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 46, 414, 63);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNombre = new JLabel("Carlos Ruiz Villalmanzo");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(10, 11, 212, 19);
		panel_2.add(lblNombre);

		JLabel lblCiclo = new JLabel("Desarrollo de Aplicaciones Multipltaforma");
		lblCiclo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCiclo.setBounds(10, 33, 259, 19);
		panel_2.add(lblCiclo);

		JLabel lblGrupo = new JLabel("Grupo 1");
		lblGrupo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGrupo.setBounds(286, 33, 118, 19);
		panel_2.add(lblGrupo);

	}

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

}
