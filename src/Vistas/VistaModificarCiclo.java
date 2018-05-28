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

public class VistaModificarCiclo extends JFrame {
	private Controlador controlador;
	// Modificar
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_2;

	/**
	 * Create the frame.
	 */
	public VistaModificarCiclo() {
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

		JLabel lblCiclo = new JLabel("Ciclo");
		lblCiclo.setBounds(12, 53, 46, 14);
		panel.add(lblCiclo);

		JLabel lblFam_Prof = new JLabel("Familia Prof");
		lblFam_Prof.setBounds(12, 80, 102, 14);
		panel.add(lblFam_Prof);

		JLabel lblTutor = new JLabel("Tutor");
		lblTutor.setBounds(211, 53, 46, 14);
		panel.add(lblTutor);

		JLabel lblCod_Grupo = new JLabel("Codigo Grupo");
		lblCod_Grupo.setBounds(211, 78, 86, 14);
		panel.add(lblCod_Grupo);

		textField = new JTextField();
		textField.setBounds(115, 50, 86, 20);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(115, 75, 86, 20);
		panel.add(textField_1);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(296, 75, 86, 20);
		panel.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(296, 50, 86, 20);
		panel.add(textField_7);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(276, 178, 89, 23);
		panel.add(btnAceptar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.CancelModifCicl();
			}
		});
		btnCancelar.setBounds(172, 178, 89, 23);
		panel.add(btnCancelar);

		JLabel lblCodigoFamiliaProfesional = new JLabel("Cod. Familia Prof");
		lblCodigoFamiliaProfesional.setBounds(12, 102, 124, 14);
		panel.add(lblCodigoFamiliaProfesional);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(115, 99, 86, 20);
		panel.add(textField_2);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(121, 0, 188, 27);
		contentPane.add(panel_1);

		JLabel lblModificarCiclo = new JLabel("MODIFICAR CICLO");
		lblModificarCiclo.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(lblModificarCiclo);
	}

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

}