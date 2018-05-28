package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaMenuAdmin extends JFrame {
	private Controlador controlador;
	
	private JPanel contentPane;
	private JButton btnEmpresas;
	private JButton btnCiclos;
	private JButton btnCentros;
	private JButton btnTutores;

	
	

	/**
	 * Create the frame.
	 */
	public VistaMenuAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnCentros = new JButton("Centros");
		btnCentros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnCentros.isEnabled()) {
					controlador.MenuToCentros();
				}
			}
		});
		btnCentros.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCentros.setBounds(55, 129, 341, 40);
		contentPane.add(btnCentros);
		
		JLabel lblNewLabel = new JLabel("Men\u00FA de Administrador");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(102, 41, 268, 40);
		contentPane.add(lblNewLabel);
		
		btnCiclos = new JButton("Ciclos");
		btnCiclos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.MenuToCiclos();
			}
		});
		btnCiclos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCiclos.setBounds(55, 182, 341, 40);
		contentPane.add(btnCiclos);
		
		btnEmpresas = new JButton("Empresas");
		btnEmpresas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.MenuToEmpresa();
			}
		});
		btnEmpresas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEmpresas.setBounds(55, 288, 341, 40);
		contentPane.add(btnEmpresas);
		
		btnTutores = new JButton("Tutores");
		btnTutores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.MenuToTutor();
			}
		});
		btnTutores.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTutores.setBounds(55, 235, 341, 40);
		contentPane.add(btnTutores);
		
		JButton btnLogOff = new JButton("Cerrar Sesi\u00F3n");
		btnLogOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			controlador.LogOff();
			}
		});
		btnLogOff.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogOff.setBounds(55, 363, 341, 40);
		contentPane.add(btnLogOff);
		setLocationRelativeTo(null);

	}

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
}
