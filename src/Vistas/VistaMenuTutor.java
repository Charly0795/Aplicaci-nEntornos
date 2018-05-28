package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaMenuTutor extends JFrame {
	private Controlador controlador;

	private JPanel contentPane;
	private JButton btnMisGrupos;
	private JButton btnEmpresa;
	private JButton btnLogoff;

	/**
	 * Create the frame.
	 */
	public VistaMenuTutor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnMisGrupos = new JButton("Mis Grupos");
		btnMisGrupos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.MenuToAlumnos();
			}
		});
		btnMisGrupos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMisGrupos.setBounds(57, 131, 341, 40);
		contentPane.add(btnMisGrupos);

		JLabel lblMenDeTutor = new JLabel("Men\u00FA de Tutor");
		lblMenDeTutor.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblMenDeTutor.setBounds(140, 42, 188, 40);
		contentPane.add(lblMenDeTutor);

		btnEmpresa = new JButton("Empresas");
		btnEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.MenuToEmp();
			}
		});
		btnEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEmpresa.setBounds(57, 209, 341, 40);
		contentPane.add(btnEmpresa);
		
		btnLogoff = new JButton("Cerrar sesion");
		btnLogoff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.LogOf();
			}
		});
		btnLogoff.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogoff.setBounds(57, 319, 341, 40);
		contentPane.add(btnLogoff);
		setLocationRelativeTo(null);

	}

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

}
