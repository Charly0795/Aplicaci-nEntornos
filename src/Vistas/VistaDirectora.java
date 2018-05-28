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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controlador.Controlador;
import Modelo.Modelo;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class VistaDirectora extends JFrame {

	private JPanel contentPane;

	private Controlador controlador;
	private Modelo modelo;
	
	private JTable table;
	private JTextField txtBusqueda;
	private JButton btnBuscar;
	private JComboBox comboBox;
	private JButton btnSalir;
	
	/**
	 * Create the frame.
	 */
	public VistaDirectora() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				table.setModel(modelo.getTablaAlumnosDir());
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,1200, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVistaDirectoraenContstruccion = new JLabel("Vista Directora(EN CONSTRUCCION)");
		lblVistaDirectoraenContstruccion.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblVistaDirectoraenContstruccion.setBounds(121, 13, 522, 113);
		contentPane.add(lblVistaDirectoraenContstruccion);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 234, 1144, 672);
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
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tutor", "Ciclo", "Grupo", "Empresa", "Apellido"}));
		comboBox.setBounds(12, 177, 117, 22);
		contentPane.add(comboBox);
		
		txtBusqueda = new JTextField();
		txtBusqueda.setBounds(141, 177, 168, 22);
		contentPane.add(txtBusqueda);
		txtBusqueda.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(331, 176, 97, 25);
		contentPane.add(btnBuscar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.ToLogin();
			}
		});
		btnSalir.setBounds(828, 13, 97, 25);
		contentPane.add(btnSalir);
		
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
