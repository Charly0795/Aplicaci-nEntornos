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

public class VistaAnadirCiclo extends JFrame {
	private Controlador controlador;
	// Anadir
	private JPanel contentPane;
	private JTextField txtCiclo;
	private JTextField txtFamilia;
	private JTextField txtCodGrupo;
	private JTextField txtTutor;
	private JTextField txtCodFamilia;

	/**
	 * Create the frame.
	 */
	public VistaAnadirCiclo() {
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
		lblFam_Prof.setBounds(12, 80, 88, 14);
		panel.add(lblFam_Prof);

		JLabel lblTutor = new JLabel("Tutor");
		lblTutor.setBounds(211, 53, 46, 14);
		panel.add(lblTutor);

		JLabel lblCod_Grupo = new JLabel("Codigo Grupo");
		lblCod_Grupo.setBounds(211, 78, 88, 14);
		panel.add(lblCod_Grupo);

		txtCiclo = new JTextField();
		txtCiclo.setBounds(115, 50, 86, 20);
		panel.add(txtCiclo);
		txtCiclo.setColumns(10);

		txtFamilia = new JTextField();
		txtFamilia.setColumns(10);
		txtFamilia.setBounds(115, 75, 86, 20);
		panel.add(txtFamilia);

		txtCodGrupo = new JTextField();
		txtCodGrupo.setColumns(10);
		txtCodGrupo.setBounds(296, 75, 86, 20);
		panel.add(txtCodGrupo);

		txtTutor = new JTextField();
		txtTutor.setColumns(10);
		txtTutor.setBounds(296, 50, 86, 20);
		panel.add(txtTutor);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(276, 178, 89, 23);
		panel.add(btnAceptar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			controlador.CancelAddCiclo();
			}
		});
		btnCancelar.setBounds(172, 178, 89, 23);
		panel.add(btnCancelar);

		JLabel lblCodigoFamiliaProfesional = new JLabel("Cod. Familia Prof");
		lblCodigoFamiliaProfesional.setBounds(12, 105, 103, 14);
		panel.add(lblCodigoFamiliaProfesional);

		txtCodFamilia = new JTextField();
		txtCodFamilia.setColumns(10);
		txtCodFamilia.setBounds(115, 102, 86, 20);
		panel.add(txtCodFamilia);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(121, 0, 188, 27);
		contentPane.add(panel_1);

		JLabel lblAnadirCiclo = new JLabel("A\u00D1ADIR CICLO");
		lblAnadirCiclo.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(lblAnadirCiclo);
	}

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

}