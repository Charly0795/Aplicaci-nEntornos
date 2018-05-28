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

public class VistaAnadirCentro extends JFrame {
	private Controlador controlador;
	// Anadir
	private JPanel contentPane;
	private JTextField txtCentro;
	private JTextField txtDirector;
	private JTextField txtRepresentante;
	private JTextField txtCodCentro;
	private JTextField txtNIFDir;
	private JTextField txtDNIRepresentante;
	private JTextField txtDireccion;
	private JTextField txtCP;
	private JTextField txtDAT;
	private JTextField txtLocalidad;
	private JTextField txtMunicipio;
	private JTextField txtProvincia;

	/**
	 * Create the frame.
	 */
	public VistaAnadirCentro() {
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

		JLabel lblCentro = new JLabel("Centro");
		lblCentro.setBounds(12, 11, 97, 14);
		panel.add(lblCentro);

		JLabel lblDir = new JLabel("Director");
		lblDir.setBounds(12, 38, 97, 14);
		panel.add(lblDir);

		JLabel lblRepresentante = new JLabel("Representante");
		lblRepresentante.setBounds(12, 63, 97, 14);
		panel.add(lblRepresentante);

		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(217, 11, 60, 14);
		panel.add(lblDireccion);

		JLabel lblMunicipio = new JLabel("Municipio");
		lblMunicipio.setBounds(217, 113, 60, 14);
		panel.add(lblMunicipio);

		JLabel lblCp = new JLabel("CP");
		lblCp.setBounds(217, 38, 46, 14);
		panel.add(lblCp);

		JLabel lblDat = new JLabel("DAT");
		lblDat.setBounds(217, 63, 46, 14);
		panel.add(lblDat);

		JLabel lblCodCentro = new JLabel("Cod Centro");
		lblCodCentro.setBounds(12, 88, 97, 14);
		panel.add(lblCodCentro);

		JLabel lblNifDirector = new JLabel("NIF Director");
		lblNifDirector.setBounds(12, 113, 97, 14);
		panel.add(lblNifDirector);

		JLabel lblDniRepresentante = new JLabel("DNI Representante");
		lblDniRepresentante.setBounds(12, 138, 107, 14);
		panel.add(lblDniRepresentante);

		JLabel lblLocalidad = new JLabel("Localidad");
		lblLocalidad.setBounds(217, 88, 60, 14);
		panel.add(lblLocalidad);

		JLabel lblProvincia = new JLabel("Provincia");
		lblProvincia.setBounds(217, 138, 60, 14);
		panel.add(lblProvincia);

		txtCentro = new JTextField();
		txtCentro.setBounds(121, 8, 86, 20);
		panel.add(txtCentro);
		txtCentro.setColumns(10);

		txtDirector = new JTextField();
		txtDirector.setColumns(10);
		txtDirector.setBounds(121, 35, 86, 20);
		panel.add(txtDirector);

		txtRepresentante = new JTextField();
		txtRepresentante.setColumns(10);
		txtRepresentante.setBounds(121, 60, 86, 20);
		panel.add(txtRepresentante);

		txtCodCentro = new JTextField();
		txtCodCentro.setColumns(10);
		txtCodCentro.setBounds(121, 85, 86, 20);
		panel.add(txtCodCentro);

		txtNIFDir = new JTextField();
		txtNIFDir.setColumns(10);
		txtNIFDir.setBounds(121, 110, 86, 20);
		panel.add(txtNIFDir);

		txtDNIRepresentante = new JTextField();
		txtDNIRepresentante.setColumns(10);
		txtDNIRepresentante.setBounds(121, 135, 86, 20);
		panel.add(txtDNIRepresentante);

		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(279, 8, 86, 20);
		panel.add(txtDireccion);

		txtCP = new JTextField();
		txtCP.setColumns(10);
		txtCP.setBounds(279, 35, 86, 20);
		panel.add(txtCP);

		txtDAT = new JTextField();
		txtDAT.setColumns(10);
		txtDAT.setBounds(279, 60, 86, 20);
		panel.add(txtDAT);

		txtLocalidad = new JTextField();
		txtLocalidad.setColumns(10);
		txtLocalidad.setBounds(279, 85, 86, 20);
		panel.add(txtLocalidad);

		txtMunicipio = new JTextField();
		txtMunicipio.setColumns(10);
		txtMunicipio.setBounds(279, 110, 86, 20);
		panel.add(txtMunicipio);

		txtProvincia = new JTextField();
		txtProvincia.setColumns(10);
		txtProvincia.setBounds(279, 135, 86, 20);
		panel.add(txtProvincia);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(276, 178, 89, 23);
		panel.add(btnAceptar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.CancelAddCentro();
			}
		});
		btnCancelar.setBounds(172, 178, 89, 23);
		panel.add(btnCancelar);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(121, 0, 188, 27);
		contentPane.add(panel_1);

		JLabel lblAnadirCentro = new JLabel("A\u00D1ADIR CENTRO");
		lblAnadirCentro.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(lblAnadirCentro);
	}

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

}
