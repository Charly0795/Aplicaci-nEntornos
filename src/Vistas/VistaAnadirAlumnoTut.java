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
import java.awt.event.ActionEvent;

public class VistaAnadirAlumnoTut extends JFrame {
	private Controlador controlador;
	
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
	public VistaAnadirAlumnoTut() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setBounds(121, 11, 188, 27);
		contentPane.add(panel);
		
		JLabel label = new JLabel("A\u00D1ADIR ALUMNO");
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(12, 41, 414, 212);
		contentPane.add(panel_1);
		
		JLabel label_1 = new JLabel("Nombre");
		label_1.setBounds(26, 53, 46, 14);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("N\u00BA Matricula");
		label_2.setBounds(209, 53, 88, 14);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Apellido 1");
		label_3.setBounds(26, 81, 59, 14);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("DNI");
		label_4.setBounds(209, 81, 46, 14);
		panel_1.add(label_4);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(93, 50, 86, 20);
		panel_1.add(txtNombre);
		
		txtMatricula = new JTextField();
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(296, 50, 86, 20);
		panel_1.add(txtMatricula);
		
		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(296, 80, 86, 20);
		panel_1.add(txtDNI);
		
		txtApellido1 = new JTextField();
		txtApellido1.setColumns(10);
		txtApellido1.setBounds(93, 78, 86, 20);
		panel_1.add(txtApellido1);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(276, 178, 89, 23);
		panel_1.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.CancAnadirAlumnTut();
			}
		});
		btnCancelar.setBounds(172, 178, 89, 23);
		panel_1.add(btnCancelar);
		
		txtApellido2 = new JTextField();
		txtApellido2.setColumns(10);
		txtApellido2.setBounds(93, 108, 86, 20);
		panel_1.add(txtApellido2);
		
		JLabel label_5 = new JLabel("Apellido 2");
		label_5.setBounds(26, 111, 59, 14);
		panel_1.add(label_5);
		
		txtEstado = new JTextField();
		txtEstado.setColumns(10);
		txtEstado.setBounds(296, 108, 86, 20);
		panel_1.add(txtEstado);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(209, 111, 46, 14);
		panel_1.add(lblEstado);
	}



	public Controlador getControlador() {
		return controlador;
	}



	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

}
