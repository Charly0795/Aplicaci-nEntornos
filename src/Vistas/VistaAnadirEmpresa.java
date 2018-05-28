package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;

public class VistaAnadirEmpresa extends JFrame {
	private Controlador controlador;
	// Anadir
	private JPanel contentPane;
	private JTextField txtEmpresa;
	private JTextField txtConvenio;
	private JTextField txtLocalidad;
	private JTextField txtTutor;
	private JTextField txtDireccion;
	private JTextField txtRepresentante;
	private JTextField txtFechaFirma;

	/**
	 * Create the frame.
	 */
	public VistaAnadirEmpresa() {
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

		JLabel lblEmpresa = new JLabel("Empresa");
		lblEmpresa.setBounds(23, 53, 73, 14);
		panel.add(lblEmpresa);

		JLabel lblNum_Convenio = new JLabel("N\u00BA de Convenio");
		lblNum_Convenio.setBounds(23, 78, 88, 14);
		panel.add(lblNum_Convenio);

		JLabel lblTutor = new JLabel("Tutor");
		lblTutor.setBounds(211, 53, 46, 14);
		panel.add(lblTutor);

		JLabel lblLocalidad = new JLabel("Localidad");
		lblLocalidad.setBounds(211, 78, 73, 14);
		panel.add(lblLocalidad);

		txtEmpresa = new JTextField();
		txtEmpresa.setBounds(115, 50, 86, 20);
		panel.add(txtEmpresa);
		txtEmpresa.setColumns(10);

		txtConvenio = new JTextField();
		txtConvenio.setBounds(115, 75, 86, 20);
		txtConvenio.setColumns(10);
		panel.add(txtConvenio);

		txtLocalidad = new JTextField();
		txtLocalidad.setBounds(296, 75, 86, 20);
		txtLocalidad.setColumns(10);
		panel.add(txtLocalidad);

		txtTutor = new JTextField();
		txtTutor.setBounds(296, 50, 86, 20);
		txtTutor.setColumns(10);
		panel.add(txtTutor);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(276, 178, 89, 23);
		panel.add(btnAceptar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.CancelAddEmpresa();
			}
		});
		btnCancelar.setBounds(172, 178, 89, 23);
		panel.add(btnCancelar);

		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(23, 103, 73, 14);
		panel.add(lblDireccion);

		txtDireccion = new JTextField();
		txtDireccion.setBounds(115, 100, 86, 20);
		txtDireccion.setColumns(10);
		panel.add(txtDireccion);

		JLabel lblRepresentante = new JLabel("Representante");
		lblRepresentante.setBounds(211, 103, 88, 14);
		panel.add(lblRepresentante);

		txtRepresentante = new JTextField();
		txtRepresentante.setColumns(10);
		txtRepresentante.setBounds(296, 100, 86, 20);
		panel.add(txtRepresentante);

		JLabel lblFechaFirma = new JLabel("Fecha Firma");
		lblFechaFirma.setBounds(23, 128, 73, 14);
		panel.add(lblFechaFirma);

		txtFechaFirma = new JTextField();
		txtFechaFirma.setColumns(10);
		txtFechaFirma.setBounds(115, 125, 86, 20);
		panel.add(txtFechaFirma);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(121, 0, 188, 27);
		contentPane.add(panel_1);

		JLabel lblAnadirEmpresa = new JLabel("A\u00D1ADIR EMPRESA");
		lblAnadirEmpresa.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(lblAnadirEmpresa);
	}

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

}
