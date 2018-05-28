package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

import Controlador.Controlador;
import Modelo.Modelo;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VistaAlumnosTut extends JFrame {
	private Controlador controlador;
	private Modelo modelo;
	
	private JPanel contentPane;
	private JLabel lblClavCicl;
	private JLabel lblFam;
	private JLabel lblClavFam;
	private JLabel lblGrup;
	private JLabel lblNomTut;
	private JLabel lblNIF;
	private JTable table;
	private JTextField txtBusq;
	private JButton btnMen;
	private JButton btnAnadir;
	private JButton btnModif;
	private JButton btnDelet;
	private JButton btnPract;
	private JButton btnBuscar;

	/**
	 * Create the frame.
	 */
	public VistaAlumnosTut() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				table.setModel(modelo.getTablaAlumnos());
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 319, 717, 385);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				// int fila = table.rowAtPoint(e.getPoint());
				int fila = table.getSelectedRow();
				if (fila != -1) {
					
				}

			}

		});
		table.setBackground(Color.WHITE);
		scrollPane.setViewportView(table);

		JLabel lblDesarrolloDeAplicaciones = new JLabel("Desarrollo de Aplicaciones Multiplataforma");
		lblDesarrolloDeAplicaciones.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDesarrolloDeAplicaciones.setBounds(12, 63, 450, 25);
		contentPane.add(lblDesarrolloDeAplicaciones);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(12, 187, 426, 88);
		contentPane.add(panel);

		JLabel label_1 = new JLabel("Grupo:");
		label_1.setBounds(12, 13, 56, 16);
		panel.add(label_1);

		JLabel label_2 = new JLabel("Tutor:");
		label_2.setBounds(12, 42, 43, 16);
		panel.add(label_2);

		JLabel label_3 = new JLabel("NIF:");
		label_3.setBounds(224, 42, 56, 16);
		panel.add(label_3);

		lblGrup = new JLabel("1");
		lblGrup.setBounds(60, 13, 142, 16);
		panel.add(lblGrup);

		lblNomTut = new JLabel("Pedro Camacho");
		lblNomTut.setBounds(60, 42, 142, 16);
		panel.add(lblNomTut);

		lblNIF = new JLabel("1234");
		lblNIF.setBounds(257, 42, 142, 16);
		panel.add(lblNIF);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(12, 94, 426, 96);
		contentPane.add(panel_1);

		JLabel label_4 = new JLabel("Clave del ciclo:");
		label_4.setBounds(12, 13, 86, 16);
		panel_1.add(label_4);

		JLabel label_5 = new JLabel("Nombre Familia:");
		label_5.setBounds(12, 42, 95, 16);
		panel_1.add(label_5);

		JLabel label_6 = new JLabel("Clave de Familia:");
		label_6.setBounds(246, 13, 116, 16);
		panel_1.add(label_6);

		lblClavCicl = new JLabel("1234");
		lblClavCicl.setBounds(105, 13, 56, 16);
		panel_1.add(lblClavCicl);

		lblClavFam = new JLabel("1234");
		lblClavFam.setBounds(358, 13, 56, 16);
		panel_1.add(lblClavFam);

		lblFam = new JLabel("Ingenieria");
		lblFam.setBounds(115, 42, 142, 16);
		panel_1.add(lblFam);

		btnMen = new JButton("Men\u00FA");
		btnMen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.AlumnosToMenu();
			}
		});
		btnMen.setBounds(584, 24, 155, 26);
		contentPane.add(btnMen);

		btnAnadir = new JButton("A\u00F1adir Alumno");
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.ToAnadirAlumnoTut();
			}
		});
		btnAnadir.setBounds(510, 113, 145, 25);
		contentPane.add(btnAnadir);

		btnModif = new JButton("Modificar Alumno");
		btnModif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.ToModifAlumnTut();
			}
		});
		btnModif.setBounds(510, 162, 145, 25);
		contentPane.add(btnModif);

		btnDelet = new JButton("Borrar Alumno");
		btnDelet.setBounds(510, 216, 145, 25);
		contentPane.add(btnDelet);

		btnPract = new JButton("Gestionar Pr\u00E1cticas");
		btnPract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.ToGestionPractTut();
			}
		});
		btnPract.setBounds(257, 717, 181, 35);
		contentPane.add(btnPract);

		txtBusq = new JTextField();
		txtBusq.setColumns(10);
		txtBusq.setBounds(148, 288, 116, 25);
		contentPane.add(txtBusq);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Grupo 1", "Grupo 2" }));
		comboBox.setBounds(12, 25, 124, 25);
		contentPane.add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(
				new String[] { "Apellido 1", "Apellido 2", "Num. Matr\u00EDcula", "DNI", "Estado" }));
		comboBox_1.setBounds(12, 288, 124, 25);
		contentPane.add(comboBox_1);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(282, 288, 97, 25);
		contentPane.add(btnBuscar);
		setLocationRelativeTo(null);

	}

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	
}
