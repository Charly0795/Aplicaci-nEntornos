package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controlador.Controlador;
import Modelo.Modelo;

public class VistaTutores extends JFrame {
	private Controlador controlador;
	private Modelo modelo;
	private JPanel contentPane;
	private JButton btnMen;
	private JTextField textField;
	private JTable table;
	private JButton btnAnadir;

	/**
	 * Create the frame.
	 */
	public VistaTutores() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				table.setModel(modelo.getTablaTutores());
			}
		});
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTutores = new JLabel("Tutores");
		lblTutores.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTutores.setBounds(12, 78, 116, 38);
		contentPane.add(lblTutores);

		btnMen = new JButton("Men\u00FA");
		btnMen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.TutorToMenu();
			}
		});
		btnMen.setBounds(12, 27, 97, 25);
		contentPane.add(btnMen);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 181, 758, 338);
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
		scrollPane.setViewportView(table);

		textField = new JTextField();
		textField.setBounds(12, 143, 126, 25);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnBuscar = new JButton("Buscar Apellido");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBuscar.setBounds(150, 143, 126, 25);
		contentPane.add(btnBuscar);

		btnAnadir = new JButton("A\u00F1adir");
		btnAnadir.setBounds(72, 612, 126, 31);
		contentPane.add(btnAnadir);

		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.ToModTutor();
			}
		});
		btnModificar.setBounds(292, 612, 126, 31);
		contentPane.add(btnModificar);

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(516, 612, 126, 31);
		contentPane.add(btnEliminar);
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.toAddTutor();
			}

		});
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
