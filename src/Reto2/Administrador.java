package Reto2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;

public class Administrador extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDNI;
	private JTextField txtNacionalidad;
	private JTextField txtEdad;
	private JTextField textField_5;
	private JTextField txtEquipo;
	private JTextField txtPeso;
	private JTextField txtDia;
	private JTextField txtAno;
	private JTextField textField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Administrador frame = new Administrador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Administrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 407);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel PanelBotonesSuperiores = new JPanel();
		PanelBotonesSuperiores.setBackground(Color.WHITE);
		PanelBotonesSuperiores.setBounds(5, 5, 578, 63);
		contentPane.add(PanelBotonesSuperiores);
		PanelBotonesSuperiores.setLayout(null);
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesion.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnCerrarSesion.setForeground(Color.WHITE);
		btnCerrarSesion.setBackground(new Color(0, 0, 128));
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCerrarSesion.setBounds(0, 0, 131, 62);
		PanelBotonesSuperiores.add(btnCerrarSesion);
		
		JButton btnJugadores = new JButton("Jugadores");
		btnJugadores.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnJugadores.setBackground(new Color(65, 105, 225));
		btnJugadores.setForeground(Color.WHITE);
		btnJugadores.setBounds(130, 23, 146, 39);
		PanelBotonesSuperiores.add(btnJugadores);
		
		JButton btnEquipos = new JButton("Equipos");
		btnEquipos.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnEquipos.setBackground(new Color(65, 105, 225));
		btnEquipos.setForeground(Color.WHITE);
		btnEquipos.setBounds(276, 23, 146, 39);
		PanelBotonesSuperiores.add(btnEquipos);
		
		JButton btnNewButton = new JButton("Partidos");
		btnNewButton.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(65, 105, 225));
		btnNewButton.setBounds(422, 23, 146, 39);
		PanelBotonesSuperiores.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("eu");
		btnNewButton_1.setFont(new Font("Agency FB", Font.PLAIN, 11));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(523, 0, 45, 23);
		PanelBotonesSuperiores.add(btnNewButton_1);
		
		JButton btnEs = new JButton("es");
		btnEs.setFont(new Font("Agency FB", Font.PLAIN, 11));
		btnEs.setBackground(new Color(255, 255, 255));
		btnEs.setBounds(479, 0, 45, 23);
		PanelBotonesSuperiores.add(btnEs);
		
		JLabel lblAdmin = new JLabel("Admin");
		lblAdmin.setFont(new Font("Agency FB", Font.PLAIN, 12));
		lblAdmin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdmin.setBounds(425, 4, 44, 14);
		PanelBotonesSuperiores.add(lblAdmin);
		
		JPanel PanelInformaciónInicio = new JPanel();
		PanelInformaciónInicio.setVisible(false);
		
		JPanel DatosJugador = new JPanel();
		DatosJugador.setBounds(127, 79, 456, 286);
		contentPane.add(DatosJugador);
		DatosJugador.setBackground(new Color(255, 255, 255));
		DatosJugador.setLayout(null);
		
		JLabel lblNombre = new JLabel("  Nombre: ");
		lblNombre.setOpaque(true);
		lblNombre.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNombre.setBackground(new Color(135, 206, 235));
		lblNombre.setBounds(10, 11, 152, 22);
		DatosJugador.add(lblNombre);
		
		JLabel lblApellido = new JLabel("  Apellido: ");
		lblApellido.setOpaque(true);
		lblApellido.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblApellido.setBackground(new Color(135, 206, 235));
		lblApellido.setBounds(10, 44, 152, 22);
		DatosJugador.add(lblApellido);
		
		JLabel lblDni = new JLabel("  DNI:");
		lblDni.setOpaque(true);
		lblDni.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblDni.setBackground(new Color(135, 206, 235));
		lblDni.setBounds(10, 77, 152, 22);
		DatosJugador.add(lblDni);
		
		JLabel lblNacionalidad = new JLabel("  Nacionalidad:");
		lblNacionalidad.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNacionalidad.setOpaque(true);
		lblNacionalidad.setBackground(new Color(135, 206, 235));
		lblNacionalidad.setBounds(10, 110, 152, 22);
		DatosJugador.add(lblNacionalidad);
		
		JLabel lblFechaDeNacimiento = new JLabel("  Fecha de nacimiento: ");
		lblFechaDeNacimiento.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblFechaDeNacimiento.setOpaque(true);
		lblFechaDeNacimiento.setBackground(new Color(135, 206, 235));
		lblFechaDeNacimiento.setBounds(10, 143, 152, 22);
		DatosJugador.add(lblFechaDeNacimiento);
		
		JLabel lblPeso = new JLabel("  Peso:");
		lblPeso.setOpaque(true);
		lblPeso.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblPeso.setBackground(new Color(135, 206, 235));
		lblPeso.setBounds(294, 176, 65, 22);
		DatosJugador.add(lblPeso);
		
		JLabel lblEdad = new JLabel("  Edad:");
		lblEdad.setOpaque(true);
		lblEdad.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblEdad.setBackground(new Color(135, 206, 235));
		lblEdad.setBounds(294, 143, 65, 22);
		DatosJugador.add(lblEdad);
		
		JLabel lblAltura = new JLabel("  Altura: ");
		lblAltura.setOpaque(true);
		lblAltura.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblAltura.setBackground(new Color(135, 206, 235));
		lblAltura.setBounds(10, 176, 152, 22);
		DatosJugador.add(lblAltura);
		
		JLabel lblEquipo = new JLabel("  Equipo:");
		lblEquipo.setOpaque(true);
		lblEquipo.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblEquipo.setBackground(new Color(135, 206, 235));
		lblEquipo.setBounds(10, 209, 152, 22);
		DatosJugador.add(lblEquipo);
		
		txtNombre = new JTextField();
		txtNombre.setBackground(new Color(175, 238, 238));
		txtNombre.setBounds(162, 11, 284, 22);
		DatosJugador.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBackground(new Color(175, 238, 238));
		txtApellido.setBounds(162, 44, 284, 22);
		DatosJugador.add(txtApellido);
		
		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBackground(new Color(175, 238, 238));
		txtDNI.setBounds(162, 77, 284, 22);
		DatosJugador.add(txtDNI);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setColumns(10);
		txtNacionalidad.setBackground(new Color(175, 238, 238));
		txtNacionalidad.setBounds(162, 110, 284, 22);
		DatosJugador.add(txtNacionalidad);
		
		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBackground(new Color(175, 238, 238));
		txtEdad.setBounds(354, 143, 92, 22);
		DatosJugador.add(txtEdad);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(175, 238, 238));
		textField_5.setBounds(162, 176, 134, 22);
		DatosJugador.add(textField_5);
		
		txtEquipo = new JTextField();
		txtEquipo.setColumns(10);
		txtEquipo.setBackground(new Color(175, 238, 238));
		txtEquipo.setBounds(162, 209, 284, 22);
		DatosJugador.add(txtEquipo);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(354, 176, 92, 22);
		DatosJugador.add(txtPeso);
		txtPeso.setColumns(10);
		txtPeso.setBackground(new Color(175, 238, 238));
		
		JPanel PanelFechaNacimiento = new JPanel();
		PanelFechaNacimiento.setBackground(new Color(175, 238, 238));
		PanelFechaNacimiento.setBounds(162, 143, 134, 22);
		DatosJugador.add(PanelFechaNacimiento);
		PanelFechaNacimiento.setLayout(null);
		
		txtAno = new JTextField();
		txtAno.setColumns(10);
		txtAno.setBackground(new Color(175, 238, 238));
		txtAno.setBounds(99, 0, 35, 22);
		PanelFechaNacimiento.add(txtAno);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(175, 238, 238));
		textField_1.setBounds(50, 1, 35, 21);
		PanelFechaNacimiento.add(textField_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(new Color(175, 238, 238));
		textField.setBounds(0, 1, 35, 21);
		PanelFechaNacimiento.add(textField);
		
		JLabel label_1 = new JLabel("/");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(35, 4, 14, 14);
		PanelFechaNacimiento.add(label_1);
		
		JLabel label_2 = new JLabel("/");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(84, 4, 14, 14);
		PanelFechaNacimiento.add(label_2);
		
		txtDia = new JTextField();
		txtDia.setBounds(162, 145, 35, 20);
		DatosJugador.add(txtDia);
		txtDia.setColumns(10);
		
		JLabel label = new JLabel("/");
		label.setBounds(198, 143, 16, 22);
		DatosJugador.add(label);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnGuardar.setBackground(Color.GREEN);
		btnGuardar.setBounds(357, 252, 89, 23);
		DatosJugador.add(btnGuardar);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnEliminar.setBackground(Color.RED);
		btnEliminar.setBounds(262, 252, 89, 23);
		DatosJugador.add(btnEliminar);
		PanelInformaciónInicio.setBackground(new Color(255, 255, 255));
		PanelInformaciónInicio.setBounds(127, 79, 456, 286);
		contentPane.add(PanelInformaciónInicio);
		GridBagLayout gbl_PanelInformaciónInicio = new GridBagLayout();
		gbl_PanelInformaciónInicio.columnWidths = new int[]{425, 0};
		gbl_PanelInformaciónInicio.rowHeights = new int[]{265, 0};
		gbl_PanelInformaciónInicio.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_PanelInformaciónInicio.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		PanelInformaciónInicio.setLayout(gbl_PanelInformaciónInicio);
		
		JLabel lblInicio = new JLabel("ELIGA UNA OPCI\u00D3N PARA COMENZAR ");
		lblInicio.setEnabled(false);
		lblInicio.setFont(new Font("Agency FB", Font.PLAIN, 40));
		lblInicio.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblInicio = new GridBagConstraints();
		gbc_lblInicio.fill = GridBagConstraints.BOTH;
		gbc_lblInicio.gridx = 0;
		gbc_lblInicio.gridy = 0;
		PanelInformaciónInicio.add(lblInicio, gbc_lblInicio);
		
		JPanel PanelBotonesAñadir = new JPanel();
		PanelBotonesAñadir.setBackground(new Color(255, 255, 255));
		PanelBotonesAñadir.setBounds(5, 79, 112, 286);
		contentPane.add(PanelBotonesAñadir);
		PanelBotonesAñadir.setLayout(null);
		
		JButton btnAadirJugador = new JButton("A\u00F1adir Jugador");
		btnAadirJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAadirJugador.setForeground(Color.WHITE);
		btnAadirJugador.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnAadirJugador.setBackground(new Color(65, 105, 225));
		btnAadirJugador.setBounds(0, 27, 112, 39);
		PanelBotonesAñadir.add(btnAadirJugador);
		
		JButton btnAadirEquipo = new JButton("A\u00F1adir Equipo");
		btnAadirEquipo.setForeground(Color.WHITE);
		btnAadirEquipo.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnAadirEquipo.setBackground(new Color(65, 105, 225));
		btnAadirEquipo.setBounds(0, 93, 112, 39);
		PanelBotonesAñadir.add(btnAadirEquipo);
		
		JButton btnAadirPartido = new JButton("A\u00F1adir Partido");
		btnAadirPartido.setForeground(Color.WHITE);
		btnAadirPartido.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnAadirPartido.setBackground(new Color(65, 105, 225));
		btnAadirPartido.setBounds(0, 161, 112, 39);
		PanelBotonesAñadir.add(btnAadirPartido);
		
		JButton btnConfiguracin = new JButton("Configuraci\u00F3n");
		btnConfiguracin.setForeground(Color.WHITE);
		btnConfiguracin.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnConfiguracin.setBackground(new Color(65, 105, 225));
		btnConfiguracin.setBounds(0, 227, 112, 39);
		PanelBotonesAñadir.add(btnConfiguracin);
	}
}
