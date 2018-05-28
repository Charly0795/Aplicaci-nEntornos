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

public class VistaAnadirTutor extends JFrame {
	private Controlador controlador;
	// Anadir
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido2;
	private JTextField txtNIF;
	private JTextField txtApellido1;
	private JTextField txtPASS;

	/**
	 * Create the frame.
	 */
	public VistaAnadirTutor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 38, 414, 212);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(26, 53, 46, 14);
		panel.add(lblNombre);

		JLabel lblApellido2 = new JLabel("Apellido 2");
		lblApellido2.setBounds(12, 105, 88, 14);
		panel.add(lblApellido2);

		JLabel lblApellidos = new JLabel("Apellido 1");
		lblApellidos.setBounds(12, 78, 56, 14);
		panel.add(lblApellidos);

		JLabel lblNIF = new JLabel("NIF");
		lblNIF.setBounds(214, 53, 46, 14);
		panel.add(lblNIF);

		txtNombre = new JTextField();
		txtNombre.setBounds(93, 50, 86, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);

		txtApellido2 = new JTextField();
		txtApellido2.setColumns(10);
		txtApellido2.setBounds(93, 102, 86, 20);
		panel.add(txtApellido2);

		txtNIF = new JTextField();
		txtNIF.setColumns(10);
		txtNIF.setBounds(286, 50, 86, 20);
		panel.add(txtNIF);

		txtApellido1 = new JTextField();
		txtApellido1.setColumns(10);
		txtApellido1.setBounds(93, 75, 86, 20);
		panel.add(txtApellido1);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(283, 178, 89, 23);
		panel.add(btnAceptar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.CancelAnadirTut();
			}
		});
		btnCancelar.setBounds(172, 178, 89, 23);
		panel.add(btnCancelar);

		JLabel lblPass = new JLabel("Password");
		lblPass.setBounds(214, 78, 56, 14);
		panel.add(lblPass);

		txtPASS = new JTextField();
		txtPASS.setColumns(10);
		txtPASS.setBounds(286, 75, 86, 20);
		panel.add(txtPASS);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(121, 0, 188, 27);
		contentPane.add(panel_1);

		JLabel lblAnadirTutor = new JLabel("A\u00D1ADIR TUTOR");
		lblAnadirTutor.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(lblAnadirTutor);
	}

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

}
