package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controlador.Controlador;
import Modelo.Modelo;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class VistaCiclo extends JFrame {
	private Controlador controlador;
	private Modelo modelo;
	private JPanel contentPane;
	private JTable tableCiclos;
	private JButton btnMen;
	private JButton btnAddCiclo;
	private JButton btnModificarGrupo;
	private JButton btnBorrarGrupo;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public VistaCiclo() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				tableCiclos.setModel(modelo.getTablaGrupos());
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnMen = new JButton("Men\u00FA");
		btnMen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.CicloToMenu();
			}
		});
		btnMen.setBounds(12, 24, 97, 25);
		contentPane.add(btnMen);

		JLabel lblCiclos = new JLabel("CICLOS");
		lblCiclos.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCiclos.setBounds(12, 62, 131, 36);
		contentPane.add(lblCiclos);

		JComboBox comboBoxCentro = new JComboBox();
		comboBoxCentro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxCentro.setModel(new DefaultComboBoxModel(new String[] { "Centro 1", "Centro 2" }));
		comboBoxCentro.setBounds(12, 126, 192, 36);
		contentPane.add(comboBoxCentro);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 183, 758, 460);
		contentPane.add(scrollPane);

		tableCiclos = new JTable();
		tableCiclos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		tableCiclos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				// int fila = table.rowAtPoint(e.getPoint());
				int fila = tableCiclos.getSelectedRow();
				if (fila != -1) {
					
				}

			}

		});
		scrollPane.setViewportView(tableCiclos);

		btnAddCiclo = new JButton("A\u00F1adir Grupo");
		btnAddCiclo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.toAddCiclo();
			}
		});
		btnAddCiclo.setBounds(92, 672, 112, 36);
		contentPane.add(btnAddCiclo);

		btnModificarGrupo = new JButton("Modificar Grupo");
		btnModificarGrupo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.ToModifCiclo();
			}

		});
		btnModificarGrupo.setBounds(278, 672, 139, 36);
		contentPane.add(btnModificarGrupo);

		btnBorrarGrupo = new JButton("Borrar Grupo");
		btnBorrarGrupo.setBounds(488, 672, 139, 36);
		contentPane.add(btnBorrarGrupo);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Ciclo", "Cod. Grupo", "Familia Profesional" }));
		comboBox.setBounds(326, 143, 112, 19);
		contentPane.add(comboBox);

		textField = new JTextField();
		textField.setBounds(450, 140, 131, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBuscarPor = new JButton("Buscar por");
		btnBuscarPor.setBounds(216, 140, 97, 25);
		contentPane.add(btnBuscarPor);
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
