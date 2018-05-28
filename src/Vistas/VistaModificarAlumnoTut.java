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

public class VistaModificarAlumnoTut extends JFrame {
	private Controlador controlador;
	// Modificar
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtMatricula;
	private JTextField txtDNI;
	private JTextField txtApellido1;
	private JTextField txtApellido2;
	private JTextField txtEstado;

	/**
	 * Create the frame.
	 */
	public VistaModificarAlumnoTut() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(121, 0, 188, 27);
		contentPane.add(panel_1);

		JLabel lblModificarAlumno = new JLabel("MODIFICAR ALUMNO");
		lblModificarAlumno.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(lblModificarAlumno);

		JPanel Jpannel = new JPanel();
		Jpannel.setLayout(null);
		Jpannel.setBounds(12, 40, 414, 212);
		contentPane.add(Jpannel);

		JLabel label = new JLabel("Nombre");
		label.setBounds(26, 53, 46, 14);
		Jpannel.add(label);

		JLabel lblMatricula = new JLabel("N\u00BA Matricula");
		lblMatricula.setBounds(223, 53, 88, 14);
		Jpannel.add(lblMatricula);

		JLabel label_2 = new JLabel("Apellido 1");
		label_2.setBounds(26, 80, 66, 14);
		Jpannel.add(label_2);

		JLabel label_3 = new JLabel("DNI");
		label_3.setBounds(223, 80, 46, 14);
		Jpannel.add(label_3);

		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(93, 50, 86, 20);
		Jpannel.add(txtNombre);

		txtMatricula = new JTextField();
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(296, 50, 86, 20);
		Jpannel.add(txtMatricula);

		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(296, 78, 86, 20);
		Jpannel.add(txtDNI);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(276, 178, 89, 23);
		Jpannel.add(btnAceptar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.CancelModifAlumnTut();
			}
		});
		btnCancelar.setBounds(172, 178, 89, 23);
		Jpannel.add(btnCancelar);

		txtApellido1 = new JTextField();
		txtApellido1.setColumns(10);
		txtApellido1.setBounds(93, 76, 86, 20);
		Jpannel.add(txtApellido1);

		txtApellido2 = new JTextField();
		txtApellido2.setColumns(10);
		txtApellido2.setBounds(93, 105, 86, 20);
		Jpannel.add(txtApellido2);

		JLabel label_4 = new JLabel("Apellido 2");
		label_4.setBounds(26, 108, 66, 14);
		Jpannel.add(label_4);
		
		txtEstado = new JTextField();
		txtEstado.setColumns(10);
		txtEstado.setBounds(296, 105, 86, 20);
		Jpannel.add(txtEstado);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(223, 108, 46, 14);
		Jpannel.add(lblEstado);
	}

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
}