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
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaModificarTutor extends JFrame {
	private Controlador controlador;
//Anadir
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido2;
	private JTextField txtNIF;
	private JTextField txtApellido1;
	private JTextField txtPass;

	

	/**
	 * Create the frame.
	 */
	public VistaModificarTutor() {
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
		lblNombre.setBounds(12, 53, 46, 14);
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
		
		JButton btnModif = new JButton("Modificar");
		btnModif.setBounds(283, 178, 89, 23);
		panel.add(btnModif);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.CancelModTut();
			}
		});
		btnCancelar.setBounds(172, 178, 89, 23);
		panel.add(btnCancelar);
		
		JLabel lblPass = new JLabel("Password");
		lblPass.setBounds(214, 78, 56, 14);
		panel.add(lblPass);
		
		txtPass = new JTextField();
		txtPass.setColumns(10);
		txtPass.setBounds(286, 75, 86, 20);
		panel.add(txtPass);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(121, 0, 188, 27);
		contentPane.add(panel_1);
		
		JLabel lblModifTutor = new JLabel("MODIFICAR TUTOR");
		lblModifTutor.setHorizontalAlignment(SwingConstants.TRAILING);
		lblModifTutor.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(lblModifTutor);
	}



	public Controlador getControlador() {
		return controlador;
	}



	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

}
