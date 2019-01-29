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
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Administrador extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDNI;
	private JTextField txtNacionalidad;
	private JTextField txtEdad;
	private JTextField txtAltura;
	private JTextField txtPeso;
	private JTextField txtAno;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField txtNombreEquipo;
	private JTextField txtCodigo;
	private JTextField txtMunicipio;
	private JTextField txtTerrenoDeJuego;
	private JTextField txtTelefono;
	private JTextField txtEmail;
	private JTextField txtCodPartido;
	private JTextField txtCategoria;
	private JTextField txtGrupo;
	private JTextField txtResulLocal;
	private JTextField txtResulVisitante;
	private JTextField txtAnoPartido;
	private JTextField txtMesParido;
	private JTextField txtHoraPartido;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_12;
	private JTextField textField_9;
	private JTable tableMostrarJugadores;
	private JTable table;

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
		setTitle("BizkaiaBasket.com");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 408);
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
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Administrador.class.getResource("/Imagenes/1928414-app.android.ikurrina.png")));
		btnNewButton_1.setFont(new Font("Agency FB", Font.PLAIN, 11));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(523, 0, 45, 23);
		PanelBotonesSuperiores.add(btnNewButton_1);
		
		JButton btnEs = new JButton("");
		btnEs.setIcon(new ImageIcon(Administrador.class.getResource("/Imagenes/bandera-espana-con-escudo-para-exterior_xs.jpg")));
		btnEs.setFont(new Font("Agency FB", Font.PLAIN, 11));
		btnEs.setBackground(new Color(255, 255, 255));
		btnEs.setBounds(486, 0, 37, 23);
		PanelBotonesSuperiores.add(btnEs);
		
		JLabel lblAdmin = new JLabel("Admin");
		lblAdmin.setFont(new Font("Agency FB", Font.PLAIN, 12));
		lblAdmin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdmin.setBounds(425, 4, 44, 14);
		PanelBotonesSuperiores.add(lblAdmin);
		
		JPanel PanelBotonesAñadir = new JPanel();
		PanelBotonesAñadir.setVisible(false);
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
		btnAadirJugador.setBounds(0, 111, 112, 39);
		PanelBotonesAñadir.add(btnAadirJugador);
		
		JButton btnAadirEquipo = new JButton("A\u00F1adir Equipo");
		btnAadirEquipo.setForeground(Color.WHITE);
		btnAadirEquipo.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnAadirEquipo.setBackground(new Color(65, 105, 225));
		btnAadirEquipo.setBounds(0, 61, 112, 39);
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
		btnConfiguracin.setBounds(0, 236, 112, 39);
		PanelBotonesAñadir.add(btnConfiguracin);
		
		JButton btnCrearLigas = new JButton("Crear Ligas");
		btnCrearLigas.setBounds(0, 11, 112, 39);
		PanelBotonesAñadir.add(btnCrearLigas);
		btnCrearLigas.setForeground(Color.WHITE);
		btnCrearLigas.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnCrearLigas.setBackground(new Color(65, 105, 225));
		
		JPanel PanelInformaciónInicio = new JPanel();
		PanelInformaciónInicio.setVisible(false);
		PanelInformaciónInicio.setBackground(new Color(255, 255, 255));
		PanelInformaciónInicio.setBounds(127, 79, 456, 286);
		contentPane.add(PanelInformaciónInicio);
		GridBagLayout gbl_PanelInformaciónInicio = new GridBagLayout();
		gbl_PanelInformaciónInicio.columnWidths = new int[]{425, 0, 0};
		gbl_PanelInformaciónInicio.rowHeights = new int[]{265, 0};
		gbl_PanelInformaciónInicio.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_PanelInformaciónInicio.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		PanelInformaciónInicio.setLayout(gbl_PanelInformaciónInicio);
		
		JLabel lblInicio = new JLabel("ELIGA UNA OPCI\u00D3N PARA COMENZAR ");
		lblInicio.setEnabled(false);
		lblInicio.setFont(new Font("Agency FB", Font.PLAIN, 40));
		lblInicio.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblInicio = new GridBagConstraints();
		gbc_lblInicio.insets = new Insets(0, 0, 0, 5);
		gbc_lblInicio.fill = GridBagConstraints.BOTH;
		gbc_lblInicio.gridx = 0;
		gbc_lblInicio.gridy = 0;
		PanelInformaciónInicio.add(lblInicio, gbc_lblInicio);
		
		JPanel PanelDatosPartidos = new JPanel();
		PanelDatosPartidos.setVisible(false);
		
		JPanel PanelDatosJugador = new JPanel();
		PanelDatosJugador.setVisible(false);
		
		JPanel PanelDatosLigas = new JPanel();
		PanelDatosLigas.setVisible(false);
		PanelDatosLigas.setLayout(null);
		PanelDatosLigas.setBackground(Color.WHITE);
		PanelDatosLigas.setBounds(127, 79, 456, 286);
		contentPane.add(PanelDatosLigas);
		
		JLabel lblNombreLiga = new JLabel("  Liga:");
		lblNombreLiga.setOpaque(true);
		lblNombreLiga.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNombreLiga.setBackground(new Color(135, 206, 235));
		lblNombreLiga.setBounds(10, 46, 152, 22);
		PanelDatosLigas.add(lblNombreLiga);
		
		JLabel lblCodigoLiga = new JLabel("  Codigo:");
		lblCodigoLiga.setOpaque(true);
		lblCodigoLiga.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblCodigoLiga.setBackground(new Color(135, 206, 235));
		lblCodigoLiga.setBounds(10, 11, 152, 22);
		PanelDatosLigas.add(lblCodigoLiga);
		
		JLabel lblGrupoLiga = new JLabel("  Grupo:");
		lblGrupoLiga.setOpaque(true);
		lblGrupoLiga.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblGrupoLiga.setBackground(new Color(135, 206, 235));
		lblGrupoLiga.setBounds(10, 112, 152, 22);
		PanelDatosLigas.add(lblGrupoLiga);
		
		JLabel lblNMaxDe = new JLabel("  N\u00BA Max de Equipos:");
		lblNMaxDe.setOpaque(true);
		lblNMaxDe.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNMaxDe.setBackground(new Color(135, 206, 235));
		lblNMaxDe.setBounds(10, 145, 152, 22);
		PanelDatosLigas.add(lblNMaxDe);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(175, 238, 238));
		textField_5.setBounds(162, 11, 284, 22);
		PanelDatosLigas.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(175, 238, 238));
		textField_6.setBounds(162, 46, 284, 22);
		PanelDatosLigas.add(textField_6);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBackground(new Color(175, 238, 238));
		textField_8.setBounds(162, 112, 284, 22);
		PanelDatosLigas.add(textField_8);
		
		JButton button_2 = new JButton("GUARDAR");
		button_2.setFont(new Font("Agency FB", Font.PLAIN, 15));
		button_2.setBackground(Color.GREEN);
		button_2.setBounds(357, 252, 89, 23);
		PanelDatosLigas.add(button_2);
		
		JButton button_3 = new JButton("ELIMINAR");
		button_3.setFont(new Font("Agency FB", Font.PLAIN, 15));
		button_3.setBackground(Color.RED);
		button_3.setBounds(262, 252, 89, 23);
		PanelDatosLigas.add(button_3);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBackground(new Color(175, 238, 238));
		textField_12.setBounds(162, 145, 284, 22);
		PanelDatosLigas.add(textField_12);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBackground(new Color(175, 238, 238));
		textField_9.setBounds(162, 79, 284, 22);
		PanelDatosLigas.add(textField_9);
		
		JLabel label_7 = new JLabel("  Categoria:");
		label_7.setOpaque(true);
		label_7.setFont(new Font("Arial Black", Font.PLAIN, 11));
		label_7.setBackground(new Color(135, 206, 235));
		label_7.setBounds(10, 79, 152, 22);
		PanelDatosLigas.add(label_7);
		
		JPanel PanelDatosEquipo = new JPanel();
		PanelDatosEquipo.setVisible(false);
		PanelDatosEquipo.setLayout(null);
		PanelDatosEquipo.setBackground(Color.WHITE);
		PanelDatosEquipo.setBounds(127, 79, 456, 286);
		contentPane.add(PanelDatosEquipo);
		
		JLabel NombreEquipo = new JLabel("  Nombre: ");
		NombreEquipo.setOpaque(true);
		NombreEquipo.setFont(new Font("Arial Black", Font.PLAIN, 11));
		NombreEquipo.setBackground(new Color(135, 206, 235));
		NombreEquipo.setBounds(10, 11, 152, 22);
		PanelDatosEquipo.add(NombreEquipo);
		
		JLabel lblCodigo = new JLabel("  Codigo:");
		lblCodigo.setOpaque(true);
		lblCodigo.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblCodigo.setBackground(new Color(135, 206, 235));
		lblCodigo.setBounds(10, 44, 152, 22);
		PanelDatosEquipo.add(lblCodigo);
		
		JLabel lblMunicipio = new JLabel("  Municipio:");
		lblMunicipio.setOpaque(true);
		lblMunicipio.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblMunicipio.setBackground(new Color(135, 206, 235));
		lblMunicipio.setBounds(10, 77, 152, 22);
		PanelDatosEquipo.add(lblMunicipio);
		
		JLabel lblTerrenoDeJuego = new JLabel("  Terreno de Juego:");
		lblTerrenoDeJuego.setOpaque(true);
		lblTerrenoDeJuego.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblTerrenoDeJuego.setBackground(new Color(135, 206, 235));
		lblTerrenoDeJuego.setBounds(10, 110, 152, 22);
		PanelDatosEquipo.add(lblTerrenoDeJuego);
		
		JLabel lblTelefono = new JLabel("  Telefono:");
		lblTelefono.setOpaque(true);
		lblTelefono.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblTelefono.setBackground(new Color(135, 206, 235));
		lblTelefono.setBounds(10, 143, 152, 22);
		PanelDatosEquipo.add(lblTelefono);
		
		JLabel lblEmail = new JLabel("  Email:");
		lblEmail.setOpaque(true);
		lblEmail.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblEmail.setBackground(new Color(135, 206, 235));
		lblEmail.setBounds(10, 176, 152, 22);
		PanelDatosEquipo.add(lblEmail);
		
		txtNombreEquipo = new JTextField();
		txtNombreEquipo.setColumns(10);
		txtNombreEquipo.setBackground(new Color(175, 238, 238));
		txtNombreEquipo.setBounds(162, 11, 284, 22);
		PanelDatosEquipo.add(txtNombreEquipo);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBackground(new Color(175, 238, 238));
		txtCodigo.setBounds(162, 44, 284, 22);
		PanelDatosEquipo.add(txtCodigo);
		
		txtMunicipio = new JTextField();
		txtMunicipio.setColumns(10);
		txtMunicipio.setBackground(new Color(175, 238, 238));
		txtMunicipio.setBounds(162, 77, 284, 22);
		PanelDatosEquipo.add(txtMunicipio);
		
		txtTerrenoDeJuego = new JTextField();
		txtTerrenoDeJuego.setColumns(10);
		txtTerrenoDeJuego.setBackground(new Color(175, 238, 238));
		txtTerrenoDeJuego.setBounds(162, 110, 284, 22);
		PanelDatosEquipo.add(txtTerrenoDeJuego);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBackground(new Color(175, 238, 238));
		txtEmail.setBounds(162, 143, 284, 22);
		PanelDatosEquipo.add(txtEmail);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBackground(new Color(175, 238, 238));
		txtTelefono.setBounds(162, 176, 284, 22);
		PanelDatosEquipo.add(txtTelefono);
		
		JButton btnGuardarDatos = new JButton("GUARDAR");
		btnGuardarDatos.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnGuardarDatos.setBackground(Color.GREEN);
		btnGuardarDatos.setBounds(357, 252, 89, 23);
		PanelDatosEquipo.add(btnGuardarDatos);
		
		JButton btnEliminarEquipo = new JButton("ELIMINAR");
		btnEliminarEquipo.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnEliminarEquipo.setBackground(Color.RED);
		btnEliminarEquipo.setBounds(262, 252, 89, 23);
		PanelDatosEquipo.add(btnEliminarEquipo);
		PanelDatosJugador.setBounds(127, 79, 456, 286);
		contentPane.add(PanelDatosJugador);
		PanelDatosJugador.setBackground(new Color(255, 255, 255));
		PanelDatosJugador.setLayout(null);
		
		JLabel lblNombre = new JLabel("  Nombre: ");
		lblNombre.setOpaque(true);
		lblNombre.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNombre.setBackground(new Color(135, 206, 235));
		lblNombre.setBounds(10, 11, 152, 22);
		PanelDatosJugador.add(lblNombre);
		
		JLabel lblApellido = new JLabel("  Apellido: ");
		lblApellido.setOpaque(true);
		lblApellido.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblApellido.setBackground(new Color(135, 206, 235));
		lblApellido.setBounds(10, 44, 152, 22);
		PanelDatosJugador.add(lblApellido);
		
		JLabel lblDni = new JLabel("  DNI:");
		lblDni.setOpaque(true);
		lblDni.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblDni.setBackground(new Color(135, 206, 235));
		lblDni.setBounds(10, 77, 152, 22);
		PanelDatosJugador.add(lblDni);
		
		JLabel lblNacionalidad = new JLabel("  Nacionalidad:");
		lblNacionalidad.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNacionalidad.setOpaque(true);
		lblNacionalidad.setBackground(new Color(135, 206, 235));
		lblNacionalidad.setBounds(10, 110, 152, 22);
		PanelDatosJugador.add(lblNacionalidad);
		
		JLabel lblFechaDeNacimiento = new JLabel("  Fecha de nacimiento: ");
		lblFechaDeNacimiento.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblFechaDeNacimiento.setOpaque(true);
		lblFechaDeNacimiento.setBackground(new Color(135, 206, 235));
		lblFechaDeNacimiento.setBounds(10, 143, 152, 22);
		PanelDatosJugador.add(lblFechaDeNacimiento);
		
		JLabel lblPeso = new JLabel("  Peso:");
		lblPeso.setOpaque(true);
		lblPeso.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblPeso.setBackground(new Color(135, 206, 235));
		lblPeso.setBounds(294, 176, 65, 22);
		PanelDatosJugador.add(lblPeso);
		
		JLabel lblEdad = new JLabel("  Edad:");
		lblEdad.setOpaque(true);
		lblEdad.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblEdad.setBackground(new Color(135, 206, 235));
		lblEdad.setBounds(294, 143, 65, 22);
		PanelDatosJugador.add(lblEdad);
		
		JLabel lblAltura = new JLabel("  Altura: ");
		lblAltura.setOpaque(true);
		lblAltura.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblAltura.setBackground(new Color(135, 206, 235));
		lblAltura.setBounds(10, 176, 152, 22);
		PanelDatosJugador.add(lblAltura);
		
		JLabel lblEquipo = new JLabel("  Equipo:");
		lblEquipo.setOpaque(true);
		lblEquipo.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblEquipo.setBackground(new Color(135, 206, 235));
		lblEquipo.setBounds(10, 209, 152, 22);
		PanelDatosJugador.add(lblEquipo);
		
		txtNombre = new JTextField();
		txtNombre.setBackground(new Color(175, 238, 238));
		txtNombre.setBounds(162, 11, 284, 22);
		PanelDatosJugador.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBackground(new Color(175, 238, 238));
		txtApellido.setBounds(162, 44, 284, 22);
		PanelDatosJugador.add(txtApellido);
		
		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBackground(new Color(175, 238, 238));
		txtDNI.setBounds(162, 77, 284, 22);
		PanelDatosJugador.add(txtDNI);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setColumns(10);
		txtNacionalidad.setBackground(new Color(175, 238, 238));
		txtNacionalidad.setBounds(162, 110, 284, 22);
		PanelDatosJugador.add(txtNacionalidad);
		
		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBackground(new Color(175, 238, 238));
		txtEdad.setBounds(354, 143, 92, 22);
		PanelDatosJugador.add(txtEdad);
		
		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBackground(new Color(175, 238, 238));
		txtAltura.setBounds(162, 176, 134, 22);
		PanelDatosJugador.add(txtAltura);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(354, 176, 92, 22);
		PanelDatosJugador.add(txtPeso);
		txtPeso.setColumns(10);
		txtPeso.setBackground(new Color(175, 238, 238));
		
		JPanel PanelFechaNacimiento = new JPanel();
		PanelFechaNacimiento.setBackground(new Color(175, 238, 238));
		PanelFechaNacimiento.setBounds(162, 143, 134, 22);
		PanelDatosJugador.add(PanelFechaNacimiento);
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
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnGuardar.setBackground(Color.GREEN);
		btnGuardar.setBounds(357, 252, 89, 23);
		PanelDatosJugador.add(btnGuardar);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnEliminar.setBackground(Color.RED);
		btnEliminar.setBounds(262, 252, 89, 23);
		PanelDatosJugador.add(btnEliminar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3"}));
		comboBox.setEditable(true);
		comboBox.setBackground(new Color(175, 238, 238));
		comboBox.setBounds(162, 209, 284, 22);
		PanelDatosJugador.add(comboBox);
		PanelDatosPartidos.setLayout(null);
		PanelDatosPartidos.setBackground(Color.WHITE);
		PanelDatosPartidos.setBounds(127, 79, 456, 286);
		contentPane.add(PanelDatosPartidos);
		
		JLabel lblCategoria = new JLabel("  Categoria:");
		lblCategoria.setOpaque(true);
		lblCategoria.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblCategoria.setBackground(new Color(135, 206, 235));
		lblCategoria.setBounds(10, 44, 152, 22);
		PanelDatosPartidos.add(lblCategoria);
		
		JLabel lblCodPartido = new JLabel("  Codigo:");
		lblCodPartido.setOpaque(true);
		lblCodPartido.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblCodPartido.setBackground(new Color(135, 206, 235));
		lblCodPartido.setBounds(10, 11, 152, 22);
		PanelDatosPartidos.add(lblCodPartido);
		
		JLabel lblGrupo = new JLabel("  Grupo:");
		lblGrupo.setOpaque(true);
		lblGrupo.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblGrupo.setBackground(new Color(135, 206, 235));
		lblGrupo.setBounds(10, 77, 152, 22);
		PanelDatosPartidos.add(lblGrupo);
		
		JLabel lblFecha = new JLabel("  Fecha:");
		lblFecha.setOpaque(true);
		lblFecha.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblFecha.setBackground(new Color(135, 206, 235));
		lblFecha.setBounds(10, 110, 152, 22);
		PanelDatosPartidos.add(lblFecha);
		
		JLabel lblResultado = new JLabel("  Resultado:");
		lblResultado.setOpaque(true);
		lblResultado.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblResultado.setBackground(new Color(135, 206, 235));
		lblResultado.setBounds(10, 143, 152, 22);
		PanelDatosPartidos.add(lblResultado);
		
		JLabel lblEquipolocal = new JLabel("  Equipo Local:");
		lblEquipolocal.setOpaque(true);
		lblEquipolocal.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblEquipolocal.setBackground(new Color(135, 206, 235));
		lblEquipolocal.setBounds(10, 176, 152, 22);
		PanelDatosPartidos.add(lblEquipolocal);
		
		txtCodPartido = new JTextField();
		txtCodPartido.setColumns(10);
		txtCodPartido.setBackground(new Color(175, 238, 238));
		txtCodPartido.setBounds(162, 11, 284, 22);
		PanelDatosPartidos.add(txtCodPartido);
		
		txtCategoria = new JTextField();
		txtCategoria.setColumns(10);
		txtCategoria.setBackground(new Color(175, 238, 238));
		txtCategoria.setBounds(162, 44, 284, 22);
		PanelDatosPartidos.add(txtCategoria);
		
		txtGrupo = new JTextField();
		txtGrupo.setColumns(10);
		txtGrupo.setBackground(new Color(175, 238, 238));
		txtGrupo.setBounds(162, 77, 284, 22);
		PanelDatosPartidos.add(txtGrupo);
		
		txtResulVisitante = new JTextField();
		txtResulVisitante.setColumns(10);
		txtResulVisitante.setBackground(new Color(175, 238, 238));
		txtResulVisitante.setBounds(312, 143, 134, 22);
		PanelDatosPartidos.add(txtResulVisitante);
		
		txtResulLocal = new JTextField();
		txtResulLocal.setColumns(10);
		txtResulLocal.setBackground(new Color(175, 238, 238));
		txtResulLocal.setBounds(162, 144, 134, 22);
		PanelDatosPartidos.add(txtResulLocal);
		
		JButton button = new JButton("GUARDAR");
		button.setFont(new Font("Agency FB", Font.PLAIN, 15));
		button.setBackground(Color.GREEN);
		button.setBounds(357, 252, 89, 23);
		PanelDatosPartidos.add(button);
		
		JButton button_1 = new JButton("ELIMINAR");
		button_1.setFont(new Font("Agency FB", Font.PLAIN, 15));
		button_1.setBackground(Color.RED);
		button_1.setBounds(262, 252, 89, 23);
		PanelDatosPartidos.add(button_1);
		
		JPanel FechaPartido = new JPanel();
		FechaPartido.setLayout(null);
		FechaPartido.setBackground(new Color(175, 238, 238));
		FechaPartido.setBounds(162, 110, 134, 22);
		PanelDatosPartidos.add(FechaPartido);
		
		txtAnoPartido = new JTextField();
		txtAnoPartido.setColumns(10);
		txtAnoPartido.setBackground(new Color(175, 238, 238));
		txtAnoPartido.setBounds(99, 0, 35, 22);
		FechaPartido.add(txtAnoPartido);
		
		txtMesParido = new JTextField();
		txtMesParido.setColumns(10);
		txtMesParido.setBackground(new Color(175, 238, 238));
		txtMesParido.setBounds(50, 1, 35, 21);
		FechaPartido.add(txtMesParido);
		
		txtHoraPartido = new JTextField();
		txtHoraPartido.setColumns(10);
		txtHoraPartido.setBackground(new Color(175, 238, 238));
		txtHoraPartido.setBounds(0, 1, 35, 21);
		FechaPartido.add(txtHoraPartido);
		
		JLabel label_4 = new JLabel("/");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(35, 4, 14, 14);
		FechaPartido.add(label_4);
		
		JLabel label_5 = new JLabel("/");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(84, 4, 14, 14);
		FechaPartido.add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(175, 238, 238));
		textField_3.setBounds(312, 111, 58, 21);
		PanelDatosPartidos.add(textField_3);
		
		JLabel label_6 = new JLabel("/");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(373, 114, 14, 14);
		PanelDatosPartidos.add(label_6);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(175, 238, 238));
		textField_4.setBounds(388, 111, 58, 21);
		PanelDatosPartidos.add(textField_4);
		
		JLabel lblFechaPartido = new JLabel("-");
		lblFechaPartido.setOpaque(true);
		lblFechaPartido.setBackground(new Color(175, 238, 238));
		lblFechaPartido.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaPartido.setBounds(162, 110, 284, 22);
		PanelDatosPartidos.add(lblFechaPartido);
		
		JLabel label_3 = new JLabel("-");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(293, 143, 21, 22);
		PanelDatosPartidos.add(label_3);
		
		JLabel label = new JLabel("");
		label.setOpaque(true);
		label.setBackground(new Color(175, 238, 238));
		label.setBounds(162, 143, 284, 22);
		PanelDatosPartidos.add(label);
		
		JLabel lblEquipovisitante = new JLabel("  Equipo Visitante:");
		lblEquipovisitante.setOpaque(true);
		lblEquipovisitante.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblEquipovisitante.setBackground(new Color(135, 206, 235));
		lblEquipovisitante.setBounds(10, 209, 152, 22);
		PanelDatosPartidos.add(lblEquipovisitante);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setBackground(new Color(175, 238, 238));
		comboBox_1.setBounds(162, 176, 284, 22);
		PanelDatosPartidos.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setEditable(true);
		comboBox_2.setBackground(new Color(175, 238, 238));
		comboBox_2.setBounds(162, 209, 284, 22);
		PanelDatosPartidos.add(comboBox_2);
		
		JPanel SPanelJugadores = new JPanel();
		SPanelJugadores.setVisible(false);
		
		JPanel SPanelEquipos = new JPanel();
		SPanelEquipos.setLayout(null);
		SPanelEquipos.setBackground(Color.WHITE);
		SPanelEquipos.setBounds(5, 79, 578, 286);
		contentPane.add(SPanelEquipos);
		
		JPanel PanelMuestraEquipos = new JPanel();
		PanelMuestraEquipos.setBounds(121, 0, 455, 284);
		SPanelEquipos.add(PanelMuestraEquipos);
		PanelMuestraEquipos.setBackground(Color.WHITE);
		PanelMuestraEquipos.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"                       EQUIPO", "                   TERENO DE JUEGO", "          HORA DE JUEGO"},
			},
			new String[] {
				"                      EQUIPO", "                  TERENO DE JUEGO", "         HORA DE JUEGO"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(178);
		table.getColumnModel().getColumn(1).setPreferredWidth(211);
		table.getColumnModel().getColumn(2).setPreferredWidth(144);
		table.setFont(new Font("Agency FB", Font.PLAIN, 15));
		table.setBounds(10, 11, 437, 264);
		PanelMuestraEquipos.add(table);
		
		JPanel POpcionesEquipo = new JPanel();
		POpcionesEquipo.setLayout(null);
		POpcionesEquipo.setBackground(Color.WHITE);
		POpcionesEquipo.setBounds(0, 0, 111, 286);
		SPanelEquipos.add(POpcionesEquipo);
		
		JComboBox CBCategorias = new JComboBox();
		CBCategorias.setBackground(new Color(65, 105, 225));
		CBCategorias.setModel(new DefaultComboBoxModel(new String[] {"     CATEGORIA"}));
		CBCategorias.setFont(new Font("Agency FB", Font.PLAIN, 11));
		CBCategorias.setEditable(true);
		CBCategorias.setBounds(10, 11, 91, 41);
		POpcionesEquipo.add(CBCategorias);
		
		JComboBox CBGrupos = new JComboBox();
		CBGrupos.setBackground(new Color(65, 105, 225));
		CBGrupos.setModel(new DefaultComboBoxModel(new String[] {"     GRUPO"}));
		CBGrupos.setFont(new Font("Agency FB", Font.PLAIN, 11));
		CBGrupos.setEditable(true);
		CBGrupos.setBounds(10, 74, 91, 41);
		POpcionesEquipo.add(CBGrupos);
		
		JComboBox CBEquipos = new JComboBox();
		CBEquipos.setBackground(new Color(65, 105, 225));
		CBEquipos.setModel(new DefaultComboBoxModel(new String[] {"     EQUIPO"}));
		CBEquipos.setFont(new Font("Agency FB", Font.PLAIN, 11));
		CBEquipos.setEditable(true);
		CBEquipos.setBounds(10, 138, 91, 41);
		POpcionesEquipo.add(CBEquipos);
		
		JButton VPañadir = new JButton("NUEVO");
		VPañadir.setFont(new Font("Agency FB", Font.PLAIN, 15));
		VPañadir.setBackground(new Color(65, 105, 225));
		VPañadir.setBounds(10, 234, 91, 41);
		POpcionesEquipo.add(VPañadir);
		SPanelJugadores.setBackground(Color.WHITE);
		SPanelJugadores.setBounds(5, 79, 578, 286);
		contentPane.add(SPanelJugadores);
		SPanelJugadores.setLayout(null);
		
		JPanel PanelDeEleccion = new JPanel();
		PanelDeEleccion.setBackground(new Color(175, 238, 238));
		PanelDeEleccion.setBounds(0, 0, 111, 286);
		SPanelJugadores.add(PanelDeEleccion);
		PanelDeEleccion.setLayout(null);
		
		JComboBox CBCategoria = new JComboBox();
		CBCategoria.setFont(new Font("Agency FB", Font.PLAIN, 11));
		CBCategoria.setModel(new DefaultComboBoxModel(new String[] {"     Categoria"}));
		CBCategoria.setEditable(true);
		CBCategoria.setBounds(10, 11, 91, 41);
		PanelDeEleccion.add(CBCategoria);
		
		JComboBox CBGrupo = new JComboBox();
		CBGrupo.setModel(new DefaultComboBoxModel(new String[] {"     Grupo"}));
		CBGrupo.setFont(new Font("Agency FB", Font.PLAIN, 11));
		CBGrupo.setEditable(true);
		CBGrupo.setBounds(10, 74, 91, 41);
		PanelDeEleccion.add(CBGrupo);
		
		JComboBox CBEquipo = new JComboBox();
		CBEquipo.setModel(new DefaultComboBoxModel(new String[] {"     Equipo"}));
		CBEquipo.setFont(new Font("Agency FB", Font.PLAIN, 11));
		CBEquipo.setEditable(true);
		CBEquipo.setBounds(10, 138, 91, 41);
		PanelDeEleccion.add(CBEquipo);
		
		JButton btnNewButton_2 = new JButton("NUEVO");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnNewButton_2.setBounds(10, 234, 91, 41);
		PanelDeEleccion.add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVisible(false);
		scrollPane.setBounds(121, 0, 457, 286);
		SPanelJugadores.add(scrollPane);
		
		JPanel PanelMuestraJugadores = new JPanel();
		scrollPane.setViewportView(PanelMuestraJugadores);
		PanelMuestraJugadores.setBackground(Color.WHITE);
		PanelMuestraJugadores.setLayout(null);
		
		tableMostrarJugadores = new JTable();
		tableMostrarJugadores.setBackground(Color.WHITE);
		tableMostrarJugadores.setFont(new Font("Agency FB", Font.PLAIN, 15));
		tableMostrarJugadores.setColumnSelectionAllowed(true);
		tableMostrarJugadores.setModel(new DefaultTableModel(
			new Object[][] {
				{"                         NOMBRE Y APELLIDOS", " NACIONALIDAD", "        EDAD", "  N\u00BA"},
			},
			new String[] {
				"                       NOMBRE Y APELLIDOS", "NACIONALIDAD", "       EDAD", "  N\u00BA"
			}
		));
		tableMostrarJugadores.getColumnModel().getColumn(0).setPreferredWidth(278);
		tableMostrarJugadores.getColumnModel().getColumn(1).setPreferredWidth(91);
		tableMostrarJugadores.getColumnModel().getColumn(3).setPreferredWidth(35);
		tableMostrarJugadores.setBounds(10, 11, 435, 262);
		PanelMuestraJugadores.add(tableMostrarJugadores);
	}
}
