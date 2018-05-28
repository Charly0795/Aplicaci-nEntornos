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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controlador.Controlador;
import Modelo.Modelo;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class VistaEmpresa extends JFrame {
	private Controlador controlador;
	private Modelo modelo;
	
	private JPanel contentPane;
	private JTable table;
	private JButton btnMen;
	private JButton btnNewButton;
	private JButton btnModificar;
	private JButton btnEliminarEmpresa;
	private JScrollPane scrollPane;
	private JButton btnBusquedaPor;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public VistaEmpresa() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				table.setModel(modelo.getTablaEmpresas());
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblEmpresas = new JLabel("Empresas");
		lblEmpresas.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblEmpresas.setBounds(12, 67, 110, 32);
		contentPane.add(lblEmpresas);

		btnMen = new JButton("Men\u00FA");
		btnMen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.EmpresaToMenu();
			}
		});
		btnMen.setBounds(12, 27, 97, 25);
		contentPane.add(btnMen);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 191, 758, 406);
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

		btnNewButton = new JButton("A\u00F1adir Empresa");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.toAddEmpresa();
			}
		});
		btnNewButton.setBounds(49, 610, 144, 37);
		contentPane.add(btnNewButton);

		btnModificar = new JButton("Modificar Empresa");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.ToModEmpresa();
			}
		});
		btnModificar.setBounds(264, 610, 144, 37);
		contentPane.add(btnModificar);

		btnEliminarEmpresa = new JButton("Eliminar Empresa");
		btnEliminarEmpresa.setBounds(490, 610, 144, 37);
		contentPane.add(btnEliminarEmpresa);
		
		btnBusquedaPor = new JButton("Busqueda por");
		btnBusquedaPor.setBounds(12, 149, 110, 29);
		contentPane.add(btnBusquedaPor);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Empresa", "Num. Convenio"}));
		comboBox.setBounds(134, 149, 97, 29);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(243, 152, 123, 25);
		contentPane.add(textField);
		textField.setColumns(10);
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
