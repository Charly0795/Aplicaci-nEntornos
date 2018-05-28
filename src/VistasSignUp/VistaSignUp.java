package VistasSignUp;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class VistaSignUp extends JFrame {
	private Controlador controlador;
	// Modificar
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtMatricula;
	private JTextField txtDNI;
	private JTextField txtApellido1;
	private JTextField txtApelido2;

	/**
	 * Create the frame.
	 */
	public VistaSignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBounds(10, 38, 414, 212);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNombre = new JLabel("Usuario");
		lblNombre.setBounds(26, 53, 46, 14);
		panel.add(lblNombre);

		JLabel lblNum_Mat = new JLabel("Nombre");
		lblNum_Mat.setBounds(223, 53, 88, 14);
		panel.add(lblNum_Mat);

		JLabel lblApellidos = new JLabel("Contrase\u00F1a");
		lblApellidos.setBounds(26, 80, 66, 14);
		panel.add(lblApellidos);

		JLabel lblDNI = new JLabel("Apellido 1");
		lblDNI.setBounds(223, 80, 61, 14);
		panel.add(lblDNI);

		txtNombre = new JTextField();
		txtNombre.setBounds(93, 50, 86, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);

		txtMatricula = new JTextField();
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(296, 50, 86, 20);
		panel.add(txtMatricula);

		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(296, 77, 86, 20);
		panel.add(txtDNI);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setForeground(new Color(0, 0, 0));
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAceptar.setBackground(new Color(50, 205, 50));
		btnAceptar.setBounds(293, 178, 89, 23);
		panel.add(btnAceptar);

		txtApellido1 = new JTextField();
		txtApellido1.setColumns(10);
		txtApellido1.setBounds(93, 76, 86, 20);
		panel.add(txtApellido1);

		txtApelido2 = new JTextField();
		txtApelido2.setColumns(10);
		txtApelido2.setBounds(296, 108, 86, 20);
		panel.add(txtApelido2);

		JLabel lblApellido = new JLabel("Apellido 2");
		lblApellido.setBounds(223, 105, 66, 14);
		panel.add(lblApellido);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(121, 0, 188, 27);
		contentPane.add(panel_1);

		JLabel lblTitulo = new JLabel("Sign Up");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(lblTitulo);
	}

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
}