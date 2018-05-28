package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import Controlador.Controlador;
import Modelo.Modelo;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class VistaCentros extends JFrame {
	private Controlador controlador;
	private Modelo modelo;

	private JPanel contentPane;
	private JTable table;
	private JButton btnMen;
	private JPanel panel;

	/**
	 * Create the frame.
	 */
	public VistaCentros() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				table.setModel(modelo.getTablaCentros());
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 165, 758, 149);
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

		JLabel lblCentros = new JLabel("CENTROS");
		lblCentros.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCentros.setBounds(12, 75, 129, 36);
		contentPane.add(lblCentros);

		btnMen = new JButton("Men\u00FA");
		btnMen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnMen.isEnabled()) {
					controlador.CentroToMenu();
				}
			}
		});
		btnMen.setBounds(12, 13, 97, 25);
		contentPane.add(btnMen);

		panel = new JPanel();
		panel.setBounds(12, 372, 758, 291);
		contentPane.add(panel);
		panel.setLayout(null);
		JLabel lblInfomacinAdiciona = new JLabel("Infomaci\u00F3n adicional");
		lblInfomacinAdiciona.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblInfomacinAdiciona.setBounds(12, 13, 206, 28);
		panel.add(lblInfomacinAdiciona);

		JLabel lblCentro = new JLabel("Centro:");
		lblCentro.setBounds(12, 54, 43, 16);
		panel.add(lblCentro);

		JLabel lblNewLabel = new JLabel("Centro profesional europeo");
		lblNewLabel.setBounds(67, 54, 179, 16);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo del Centro:");
		lblNewLabel_1.setBounds(355, 54, 108, 16);
		panel.add(lblNewLabel_1);

		JLabel label = new JLabel("1234");
		label.setBounds(475, 54, 56, 16);
		panel.add(label);

		JLabel lblDirector = new JLabel("Director:");
		lblDirector.setBounds(12, 83, 56, 16);
		panel.add(lblDirector);

		JLabel lblNewLabel_2 = new JLabel("Pepito Perez");
		lblNewLabel_2.setBounds(67, 83, 151, 16);
		panel.add(lblNewLabel_2);

		JLabel lblNifDirector = new JLabel("NIF Director:");
		lblNifDirector.setBounds(355, 83, 108, 16);
		panel.add(lblNifDirector);

		JLabel label_2 = new JLabel("1234");
		label_2.setBounds(475, 83, 56, 16);
		panel.add(label_2);

		JLabel label_1 = new JLabel("Pepito Perez");
		label_1.setBounds(106, 112, 151, 16);
		panel.add(label_1);

		JLabel lblRepresentante = new JLabel("Representante:");
		lblRepresentante.setBounds(12, 112, 88, 16);
		panel.add(lblRepresentante);

		JLabel lblDniRepresentante = new JLabel("DNI Representante:");
		lblDniRepresentante.setBounds(355, 112, 119, 16);
		panel.add(lblDniRepresentante);

		JLabel label_4 = new JLabel("1234");
		label_4.setBounds(475, 112, 56, 16);
		panel.add(label_4);

		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setBounds(12, 141, 88, 16);
		panel.add(lblDireccin);

		JLabel lblAvenidaInventada = new JLabel("Avenida Inventada");
		lblAvenidaInventada.setBounds(80, 141, 195, 16);
		panel.add(lblAvenidaInventada);

		JLabel lblLocalidad = new JLabel("Localidad:");
		lblLocalidad.setBounds(355, 141, 119, 16);
		panel.add(lblLocalidad);

		JLabel lblVillaviciosa = new JLabel("Villaviciosa");
		lblVillaviciosa.setBounds(475, 141, 151, 16);
		panel.add(lblVillaviciosa);

		JLabel lblMunicipio = new JLabel("Municipio:");
		lblMunicipio.setBounds(12, 170, 66, 16);
		panel.add(lblMunicipio);

		JLabel lblMadrid = new JLabel("Madrid");
		lblMadrid.setBounds(80, 170, 151, 16);
		panel.add(lblMadrid);

		JLabel lblProvincia = new JLabel("Provincia:");
		lblProvincia.setBounds(355, 170, 119, 16);
		panel.add(lblProvincia);

		JLabel lblMadrid_1 = new JLabel("Madrid");
		lblMadrid_1.setBounds(475, 170, 151, 16);
		panel.add(lblMadrid_1);

		JLabel lblCodPostal = new JLabel("COD Postal:");
		lblCodPostal.setBounds(12, 199, 71, 16);
		panel.add(lblCodPostal);

		JLabel label_5 = new JLabel("28042");
		label_5.setBounds(95, 199, 151, 16);
		panel.add(label_5);

		JLabel lblNewLabel_3 = new JLabel("DIreccion de \u00C1rea Territorial:");
		lblNewLabel_3.setBounds(12, 228, 179, 16);
		panel.add(lblNewLabel_3);

		JLabel lblElQueSea = new JLabel("El que sea");
		lblElQueSea.setBounds(203, 228, 179, 16);
		panel.add(lblElQueSea);

		JButton btnAadirCentro = new JButton("A\u00F1adir Centro");
		btnAadirCentro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.ToAnadirCentro();
			}
		});
		btnAadirCentro.setBounds(68, 685, 134, 25);
		contentPane.add(btnAadirCentro);

		JButton btnModificarCentro = new JButton("Modificar Centro");
		btnModificarCentro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.ToModCentro();
			}
		});
		btnModificarCentro.setBounds(291, 685, 134, 25);
		contentPane.add(btnModificarCentro);

		JButton btnEliminarCentro = new JButton("Eliminar Centro");
		btnEliminarCentro.setBounds(537, 685, 134, 25);
		contentPane.add(btnEliminarCentro);
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
