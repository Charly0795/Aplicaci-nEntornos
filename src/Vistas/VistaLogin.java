package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.UIManager;

public class VistaLogin extends JFrame {
	private Controlador controlador;

	private JTextField txtUsuario;
	private JButton btnLogin;
	private JPasswordField txtPass;
	private JButton btnSalir;

	/**
	 * Create the frame.
	 */
	public VistaLogin() {
		getContentPane().setBackground(new Color(192, 192, 192));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		getContentPane().setLayout(null);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsuario.setBounds(111, 183, 99, 21);
		getContentPane().add(lblUsuario);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContrasea.setBounds(111, 217, 99, 21);
		getContentPane().add(lblContrasea);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(211, 183, 116, 22);
		getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		txtUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				comprobarbtn();

			}
		});
		btnLogin = new JButton("Login");
		btnLogin.setEnabled(false);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.getDatosIngreso();
				txtUsuario.setText("");
				txtPass.setText("");
				btnLogin.setEnabled(false);
			}

		});
		btnLogin.setBounds(212, 251, 137, 25);
		getContentPane().add(btnLogin);

		txtPass = new JPasswordField();
		txtPass.setBounds(211, 217, 116, 21);
		getContentPane().add(txtPass);
		txtPass.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				comprobarbtn();

			}
		});
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.Salir();
			}
		});
		btnSalir.setBounds(63, 251, 137, 25);
		getContentPane().add(btnSalir);
		setLocationRelativeTo(null);
	}

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public String getUser() {
		return txtUsuario.getText();

	}

	public String getPass() {
		return String.valueOf(txtPass.getPassword());
	}

	public void comprobarbtn() {
		if (!String.valueOf(txtPass.getPassword()).equals("") && !txtUsuario.getText().equals("")) {
			btnLogin.setEnabled(true);
		} else {
			btnLogin.setEnabled(false);
		}
	}

}
