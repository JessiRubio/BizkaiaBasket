package Reto2;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;

public class BizkaiaBasket extends JFrame implements ActionListener {


	/**
	 * 
	 */
	private static final long serialVersionUID = 7592641826926799539L;

	private JPanel contentPane;
	
/*Objetos panel Login*/
	private JPanel PanelLogin;
	private JLabel lblUsuario;
	private JLabel lblContraseña;
	private JTextField txtUsuario;
	private JPasswordField passwordField;
	private JButton btnIniciarSesion;
	private JLabel lblImagenFondo;
	private JLabel lblError;

	
/*Panel superior de botones (Opciones iniciales Administrador)*/
	private JPanel PanelBSuperAdmin;
	private JButton btnCerrarSesion;
	private JButton btnJugadores;
	private JButton btnEquipos;
	private JButton btnPartidos;
	private JButton btnLiga;
	private JButton btnEu;
	private JButton btnEs;
	private JLabel lblAdmin;
	
/*Panel superior de botones (Opciones del Usuario u Observador)*/
	private JPanel PanelSuperiorUO;
	private JButton btnCerrarSesionUO;
	private JButton btnVerEquipos;
	private JLabel lblTipo;
	private JButton btnVerPartidos;
	private JButton btnVerClasificación;
	private JButton btnVerEstadistica;
	private JButton btnEsp;
	private JButton btnEus;

/*Panel lateral botones añadir*/
	private JPanel PanelBAñadirAdmin;
	private JButton btnCrearLigas;
	private JButton btnAadirEquipo;
	private JButton btnAadirJugador;
	private JButton btnAadirPartido;
	private JButton btnConfiguracion;
	
/*Panel de Usuarios*/
	private JPanel PanelDatosUsuarios;
	/*Botones principales del panel*/
	private JButton btnNuevoUsuario;
	private JButton btnListaUsuarios;
	/*Objetos panel datos de Usuario*/
	private JPanel panelDatosUsuario;
	private JTable tableUsuarios;
	private JLabel lblNombreUsuario;
	private JTextField txtNombreUsuario;
	private JLabel lblApellidoUsuario;
	private JTextField txtApellidoUsuario;
	private JLabel lblDniUsuario;
	private JTextField txtDniUsuario;
	private JLabel lblTelefonoUsuario;
	private JTextField txtTelefonoUsuario;
	private JLabel lblEmailUsuario;
	private JTextField txtEmailUsuario;
	private JLabel lblNickUsuario;
	private JTextField txtNickUsuario;
	private JLabel lblContrasea;
	private JTextField txtPasswordUsuario;
	private JLabel lblTipoUsuario;
	/*Objetos tipo de usuario*/
	private JPanel PanelTipoUsuario;
	private JLabel lblElijaUnaOpcion;
	private JRadioButton rdbtnAdmin;
	private JRadioButton rdbtnUsuario;
	private JRadioButton rdbtnObservador;
	/*Botones panel datos de usuarios*/
	private JButton btnGuardarUsuario;
	private JButton btnEliminarUsuario;
	
/*Objetos panel Liga (Permite crear una nueva liga)*/
	private JPanel PanelDatosLigas;
	private JLabel lblCodigoLiga;
	private JTextField txtCodLiga;
	private JLabel lblNombreLiga;
	private JTextField txtLiga;
	private JLabel lblGrupoLiga;
	private JTextField txtGrupoLiga;
	private JLabel lblNMaxEquipos;
	private JTextField txtNMaxEquipos;
	private JLabel lblCategoriaLiga;
	private JTextField txtCatLiga;
	/*Botones del panel*/
	private JButton btnGuardarLiga;
	private JButton btnEliminarLiga;
	
/*Objetos panel equipo (Panel de información de un equipo para crear o modificar)*/
	private JPanel PanelDatosEquipo;
	private JLabel lblNombreEquipo;
	private JTextField txtNombreEquipo;
	private JLabel lblCodigo;
	private JTextField txtCodigo;
	private JLabel lblMunicipio;
	private JTextField txtMunicipio;
	private JLabel lblTerrenoDeJuego;
	private JTextField txtTerrenoDeJuego;
	private JLabel lblTelefono;
	private JTextField txtTelefono;
	private JLabel lblEmail;
	private JTextField txtEmail;
	/*Botones del panel*/
	private JButton btnGuardarEquipo;
	private JButton btnEliminarEquipo;
	
/*Objetos panel de jugador(Panel de información de un jugador, para crear o modificar)*/
	private JPanel PanelDatosJugador;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JLabel lblApellido;
	private JTextField txtApellido;
	private JLabel lblDni;
	private JTextField txtDNI;
	private JLabel lblNacionalidad;
	private JTextField txtNacionalidad;
	private JLabel lblEdad;
	private JTextField txtEdad;
	private JLabel lblAltura;
	private JTextField txtAltura;
	private JLabel lblPeso;
	private JTextField txtPeso;
	/*Apartado de la fecha de nacimiento*/
	private JPanel PanelFechaNacimiento;
	private JLabel lblFechaDeNacimiento;
	private JTextField txtAno;
	private JLabel label_2;
	private JTextField txtMes;
	private JLabel label_1;
	private JTextField txtDia;
	/**/
	private JLabel lblEquipo;
	private JComboBox<String> CBEquipoJugador;
	/*Botones del panel*/
	private JButton btnGuardar;
	private JButton btnEliminar;
	
/*Objetos panel partido (Permite crear un nuevo partido o modificar la inofrmación de uno ya creado)*/
	private JPanel PanelDatosPartidos;
	private JLabel lblCodPartido;
	private JTextField txtCodPartido;
	private JLabel lblCategoria;
	private JTextField txtCategoria;
	private JLabel lblGrupo;
	private JTextField txtGrupo;
	private JLabel lblEquipolocal;
	private JComboBox<String> CBEquipoLocal;
	private JLabel lblEquipovisitante;
	private JComboBox<String> CBEquipoVisitante;
	/*Zona del resultado*/
	private JLabel lblResultado;
	private JLabel lblResultadoPartido;
	private JTextField txtResulLocal;
	private JLabel lbl4;
	private JTextField txtResulVisitante;
	/*Apartado de la fecha del partido*/
	private JLabel lblFecha;
	private JLabel lblFechaPartido;
	private JPanel FechaPartido;
	private JTextField txtAnoPartido;
	private JLabel lbl1;
	private JTextField txtMesParido;
	private JLabel lbl2;
	private JTextField txtDiaPartido;
	private JTextField txtHora;
	private JLabel lbl3;
	private JTextField txtMinutos;
	/*Botones del panel*/
	private JButton btnGuardarPartido;
	private JButton btnEliminarPartido;
	private JPanel PanelMuestraJugadores;
	/*Objetos panel Información*/
	private JPanel PanelInformación;
	private JPanel PanelInicioAplicación;
	private JPanel PanelAplicaciónVacia;
	private JPanel PanelMuestraEquipos;
	private JTable tableMostrarJugadores;
	private JPanel PanelEstadistica;
	private JTable tableEstadistica;
	private JPanel PanelClasificacion;
	private JTable tableClasificacion;
	private JPanel POpciones;
	/*Opciones de menu*/
	private JComboBox<String> CBCategorias;
	private JComboBox<String> CBGrupos ;
	private JComboBox<String> CBEquipos;
	/*Aplicación vacia*/
	private JLabel lblAplicacinVacia;
	/*Lo que se muestra tras elegir las opciones*/
	private JTable tableMuestraEquipos;
	
/*Necesidades previas para la aplicación*/
	private ArrayList<Liga> ListaLigas;
	private ArrayList<Equipo> ListaEquipos;
	private ArrayList<Jugador> ListaJugador;
	private ArrayList<Partido> ListaPartidos;
	private ArrayList<Cliente> ListaUsuarios;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BizkaiaBasket frame = new BizkaiaBasket();
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
	public BizkaiaBasket() {
	/*Necesidades previas*/
		ListaLigas = new ArrayList<Liga>();
		ListaEquipos = new ArrayList<Equipo>();
		ListaJugador = new ArrayList<Jugador>();
		ListaPartidos = new ArrayList<Partido>();
		ListaUsuarios =new ArrayList<Cliente>();
	/*Administrador por defecto*/
		Cliente CAdmin = new Cliente();
		CAdmin.setNombreCliente("Admin");
		CAdmin.setDNICliente("12345678A");
		CAdmin.setTelefonoCliente(631245798);
		CAdmin.setEmailCliente("ADMIN@gmail.com");
		CAdmin.setNick("Admin");
		CAdmin.setPassword("admin");
		CAdmin.setTipoCliente("Admin");
		ListaUsuarios.add(CAdmin);
		
		setTitle("BizkaiaBasket.com");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 410);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PanelSuperiorUO = new JPanel();
		PanelSuperiorUO.setVisible(false);
		PanelBSuperAdmin = new JPanel();
		PanelBSuperAdmin.setVisible(false);
		
		PanelLogin = new JPanel();
		PanelLogin.setLayout(null);
		PanelLogin.setBounds(0, 0, 583, 371);
		contentPane.add(PanelLogin);
		
		lblError = new JLabel("Error. Introduzca un Usuario y Contrase\u00F1a validos");
		lblError.setVisible(false);
		lblError.setHorizontalAlignment(SwingConstants.CENTER);
		lblError.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblError.setForeground(new Color(255, 255, 255));
		lblError.setBounds(44, 309, 529, 40);
		PanelLogin.add(lblError);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Agency FB", Font.PLAIN, 28));
		lblUsuario.setBackground(Color.WHITE);
		lblUsuario.setBounds(333, 113, 93, 33);
		PanelLogin.add(lblUsuario);
		
		lblContraseña = new JLabel("Contrase\u00F1a");
		lblContraseña.setForeground(Color.LIGHT_GRAY);
		lblContraseña.setFont(new Font("Agency FB", Font.PLAIN, 28));
		lblContraseña.setBounds(331, 150, 95, 32);
		PanelLogin.add(lblContraseña);
		
		txtUsuario = new JTextField();
		txtUsuario.setForeground(Color.BLACK);
		txtUsuario.setColumns(10);
		txtUsuario.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 165, 0), null, null, null));
		txtUsuario.setBackground(SystemColor.controlHighlight);
		txtUsuario.setBounds(427, 121, 146, 25);
		PanelLogin.add(txtUsuario);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 165, 0), null, null, null));
		passwordField.setBackground(SystemColor.controlHighlight);
		passwordField.setBounds(427, 157, 146, 25);
		PanelLogin.add(passwordField);
		
		btnIniciarSesion = new JButton("Iniciar Sesi\u00F3n");
		btnIniciarSesion.setOpaque(false);
		btnIniciarSesion.setForeground(Color.WHITE);
		btnIniciarSesion.setFont(new Font("Agency FB", Font.PLAIN, 28));
		btnIniciarSesion.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnIniciarSesion.setBackground(Color.WHITE);
		btnIniciarSesion.setBounds(411, 238, 162, 33);
		btnIniciarSesion.addActionListener(this);
		PanelLogin.add(btnIniciarSesion);
		
		lblImagenFondo = new JLabel("");
		lblImagenFondo.setIcon(new ImageIcon(BizkaiaBasket.class.getResource("/Imagenes/FondoInicio.PNG")));
		lblImagenFondo.setBounds(0, 0, 583, 371);
		PanelLogin.add(lblImagenFondo);
		PanelBSuperAdmin.setBackground(Color.WHITE);
		PanelBSuperAdmin.setBounds(0, 0, 583, 68);
		contentPane.add(PanelBSuperAdmin);
		PanelBSuperAdmin.setLayout(null);
		
		btnCerrarSesion = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesion.addActionListener(this);
		btnCerrarSesion.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnCerrarSesion.setForeground(Color.WHITE);
		btnCerrarSesion.setBackground(new Color(0, 0, 128));
		btnCerrarSesion.setBounds(0, 0, 131, 62);
		PanelBSuperAdmin.add(btnCerrarSesion);
		
		btnJugadores = new JButton("Jugadores");
		btnJugadores.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnJugadores.setBackground(new Color(65, 105, 225));
		btnJugadores.setForeground(Color.WHITE);
		btnJugadores.setBounds(131, 23, 110, 39);
		PanelBSuperAdmin.add(btnJugadores);
		
		btnEquipos = new JButton("Equipos");
		btnEquipos.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnEquipos.setBackground(new Color(65, 105, 225));
		btnEquipos.setForeground(Color.WHITE);
		btnEquipos.setBounds(241, 23, 110, 39);
		PanelBSuperAdmin.add(btnEquipos);
		
		btnPartidos = new JButton("Partidos");
		btnPartidos.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnPartidos.setForeground(Color.WHITE);
		btnPartidos.setBackground(new Color(65, 105, 225));
		btnPartidos.setBounds(351, 23, 110, 39);
		PanelBSuperAdmin.add(btnPartidos);
		
		btnEu = new JButton("");
		btnEu.addActionListener(this);
		btnEu.setIcon(new ImageIcon(BizkaiaBasket.class.getResource("/Imagenes/1928414-app.android.ikurrina.png")));
		btnEu.setFont(new Font("Agency FB", Font.PLAIN, 11));
		btnEu.setBackground(new Color(255, 255, 255));
		btnEu.setBounds(523, 0, 45, 23);
		PanelBSuperAdmin.add(btnEu);
		
		btnEs = new JButton("");
		btnEs.addActionListener(this);
		btnEs.setIcon(new ImageIcon(BizkaiaBasket.class.getResource("/Imagenes/bandera-espana-con-escudo-para-exterior_xs.jpg")));
		btnEs.setFont(new Font("Agency FB", Font.PLAIN, 11));
		btnEs.setBackground(new Color(255, 255, 255));
		btnEs.setBounds(486, 0, 37, 23);
		PanelBSuperAdmin.add(btnEs);
		
		lblAdmin = new JLabel("Admin");
		lblAdmin.setFont(new Font("Agency FB", Font.PLAIN, 12));
		lblAdmin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdmin.setBounds(425, 4, 44, 14);
		PanelBSuperAdmin.add(lblAdmin);
		
		btnLiga = new JButton("Ligas");
		btnLiga.setForeground(Color.WHITE);
		btnLiga.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnLiga.setBackground(new Color(65, 105, 225));
		btnLiga.setBounds(461, 23, 110, 39);
		PanelBSuperAdmin.add(btnLiga);
		PanelSuperiorUO.setLayout(null);
		PanelSuperiorUO.setBounds(0, 0, 569, 66);
		contentPane.add(PanelSuperiorUO);
		
		btnCerrarSesionUO = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesionUO.addActionListener(this);
		btnCerrarSesionUO.setToolTipText("");
		btnCerrarSesionUO.setFont(new Font("Agency FB", Font.PLAIN, 18));
		btnCerrarSesionUO.setBackground(new Color(138, 45, 47));
		btnCerrarSesionUO.setBounds(0, 0, 131, 62);
		PanelSuperiorUO.add(btnCerrarSesionUO);
		
		btnVerEquipos = new JButton("Equipos");
		btnVerEquipos.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnVerEquipos.setBackground(new Color(183, 69, 68));
		btnVerEquipos.setBounds(131, 23, 110, 39);
		PanelSuperiorUO.add(btnVerEquipos);
		
		lblTipo = new JLabel("Observador");
		lblTipo.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblTipo.setBounds(425, 4, 64, 14);
		PanelSuperiorUO.add(lblTipo);
		
		btnVerPartidos = new JButton("Partidos");
		btnVerPartidos.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnVerPartidos.setBackground(new Color(183, 69, 68));
		btnVerPartidos.setBounds(241, 23, 110, 39);
		PanelSuperiorUO.add(btnVerPartidos);
		
		btnVerClasificación = new JButton("Clasificaci\u00F3n");
		btnVerClasificación.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnVerClasificación.setBackground(new Color(183, 69, 68));
		btnVerClasificación.setBounds(351, 23, 110, 39);
		PanelSuperiorUO.add(btnVerClasificación);
		
		btnVerEstadistica = new JButton("Estad\u00EDsticas");
		btnVerEstadistica.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnVerEstadistica.setBackground(new Color(183, 69, 68));
		btnVerEstadistica.setBounds(461, 23, 110, 39);
		PanelSuperiorUO.add(btnVerEstadistica);
		
		btnEsp = new JButton("");
		btnEsp.addActionListener(this);
		btnEsp.setIcon(new ImageIcon(BizkaiaBasket.class.getResource("/Imagenes/bandera-espana-con-escudo-para-exterior_xs.jpg")));
		btnEsp.setBounds(486, 0, 37, 23);
		PanelSuperiorUO.add(btnEsp);
		
		btnEus = new JButton("");
		btnEus.addActionListener(this);
		btnEus.setIcon(new ImageIcon(BizkaiaBasket.class.getResource("/Imagenes/1928414-app.android.ikurrina.png")));
		btnEus.setBounds(523, 0, 45, 23);
		PanelSuperiorUO.add(btnEus);
		
		PanelBAñadirAdmin = new JPanel();
		PanelBAñadirAdmin.setVisible(false);
		PanelBAñadirAdmin.setBackground(new Color(255, 255, 255));
		PanelBAñadirAdmin.setBounds(5, 79, 112, 286);
		contentPane.add(PanelBAñadirAdmin);
		PanelBAñadirAdmin.setLayout(null);
		
		btnAadirJugador = new JButton("A\u00F1adir Jugador");
		btnAadirJugador.setForeground(Color.WHITE);
		btnAadirJugador.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnAadirJugador.setBackground(new Color(65, 105, 225));
		btnAadirJugador.setBounds(0, 111, 112, 39);
		PanelBAñadirAdmin.add(btnAadirJugador);
		
		btnAadirEquipo = new JButton("A\u00F1adir Equipo");
		btnAadirEquipo.setForeground(Color.WHITE);
		btnAadirEquipo.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnAadirEquipo.setBackground(new Color(65, 105, 225));
		btnAadirEquipo.setBounds(0, 61, 112, 39);
		PanelBAñadirAdmin.add(btnAadirEquipo);
		
		btnAadirPartido = new JButton("A\u00F1adir Partido");
		btnAadirPartido.setForeground(Color.WHITE);
		btnAadirPartido.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnAadirPartido.setBackground(new Color(65, 105, 225));
		btnAadirPartido.setBounds(0, 161, 112, 39);
		PanelBAñadirAdmin.add(btnAadirPartido);
		
		btnCrearLigas = new JButton("Crear Ligas");
		btnCrearLigas.setBounds(0, 11, 112, 39);
		PanelBAñadirAdmin.add(btnCrearLigas);
		btnCrearLigas.setForeground(Color.WHITE);
		btnCrearLigas.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnCrearLigas.setBackground(new Color(65, 105, 225));
		
		btnConfiguracion = new JButton("Configuraci\u00F3n");
		btnConfiguracion.setForeground(Color.WHITE);
		btnConfiguracion.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnConfiguracion.setBackground(new Color(65, 105, 225));
		btnConfiguracion.setBounds(0, 236, 112, 39);
		PanelBAñadirAdmin.add(btnConfiguracion);
		
		PanelDatosJugador = new JPanel();
		PanelDatosJugador.setVisible(false);
		
		PanelDatosLigas = new JPanel();
		PanelDatosLigas.setVisible(false);
		
		PanelDatosUsuarios = new JPanel();
		PanelDatosUsuarios.setVisible(false);
		
		PanelInformación = new JPanel();
		PanelInformación.setVisible(false);
		PanelInformación.setBounds(0, 79, 583, 292);
		contentPane.add(PanelInformación);
		PanelInformación.setLayout(null);
		PanelInformación.setBackground(Color.WHITE);
		
		PanelMuestraJugadores = new JPanel();
		PanelMuestraJugadores.setVisible(false);
		
		PanelInicioAplicación = new JPanel();
		PanelInicioAplicación.setBackground(Color.WHITE);
		PanelInicioAplicación.setBounds(126, 0, 457, 294);
		PanelInformación.add(PanelInicioAplicación);
		PanelInicioAplicación.setLayout(null);
		
		lblElijaUnaOpcion = new JLabel("Elija una opcion");
		lblElijaUnaOpcion.setHorizontalAlignment(SwingConstants.CENTER);
		lblElijaUnaOpcion.setFont(new Font("Agency FB", Font.PLAIN, 50));
		lblElijaUnaOpcion.setBounds(10, 11, 437, 272);
		PanelInicioAplicación.add(lblElijaUnaOpcion);
		
		PanelAplicaciónVacia = new JPanel();
		PanelAplicaciónVacia.setBackground(Color.WHITE);
		PanelAplicaciónVacia.setBounds(136, 0, 447, 281);
		PanelInformación.add(PanelAplicaciónVacia);
		PanelAplicaciónVacia.setLayout(null);
		
		lblAplicacinVacia = new JLabel("APLICACI\u00D3N VACIA");
		lblAplicacinVacia.setHorizontalAlignment(SwingConstants.CENTER);
		lblAplicacinVacia.setFont(new Font("Agency FB", Font.PLAIN, 42));
		lblAplicacinVacia.setBounds(10, 11, 427, 270);
		PanelAplicaciónVacia.add(lblAplicacinVacia);
		
		PanelClasificacion = new JPanel();
		PanelClasificacion.setVisible(false);
		PanelClasificacion.setBounds(116, 0, 467, 284);
		PanelInformación.add(PanelClasificacion);
		PanelClasificacion.setLayout(null);
		
		tableClasificacion = new JTable();
		tableClasificacion.setModel(new DefaultTableModel(
			new Object[][] {
				{"                    Nombre Equipo ", " Puesto", "  P.G.", "  P.P."},
			},
			new String[] {
				"                   Nombre Equipo", "Puesto", " P.G", " P.P"
			}
		));
		tableClasificacion.getColumnModel().getColumn(0).setPreferredWidth(191);
		tableClasificacion.getColumnModel().getColumn(1).setPreferredWidth(44);
		tableClasificacion.getColumnModel().getColumn(2).setPreferredWidth(31);
		tableClasificacion.getColumnModel().getColumn(3).setPreferredWidth(34);
		tableClasificacion.setGridColor(Color.BLACK);
		tableClasificacion.setBackground(Color.WHITE);
		tableClasificacion.setBounds(0, 0, 467, 284);
		PanelClasificacion.add(tableClasificacion);
		PanelMuestraJugadores.setBounds(121, 0, 462, 284);
		PanelInformación.add(PanelMuestraJugadores);
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
		
		PanelMuestraEquipos = new JPanel();
		PanelMuestraEquipos.setVisible(false);
		PanelMuestraEquipos.setBounds(121, 0, 455, 284);
		PanelInformación.add(PanelMuestraEquipos);
		PanelMuestraEquipos.setBackground(Color.WHITE);
		PanelMuestraEquipos.setLayout(null);
		
		tableMuestraEquipos = new JTable();
		tableMuestraEquipos.setModel(new DefaultTableModel(
			new Object[][] {
				{"                       EQUIPO", "                   TERENO DE JUEGO", "          HORA DE JUEGO"},
			},
			new String[] {
				"                      EQUIPO", "                  TERENO DE JUEGO", "         HORA DE JUEGO"
			}
		));
		tableMuestraEquipos.getColumnModel().getColumn(0).setPreferredWidth(178);
		tableMuestraEquipos.getColumnModel().getColumn(1).setPreferredWidth(211);
		tableMuestraEquipos.getColumnModel().getColumn(2).setPreferredWidth(144);
		tableMuestraEquipos.setFont(new Font("Agency FB", Font.PLAIN, 15));
		tableMuestraEquipos.setBounds(10, 11, 437, 264);
		PanelMuestraEquipos.add(tableMuestraEquipos);
		
		PanelEstadistica = new JPanel();
		PanelEstadistica.setVisible(false);
		PanelEstadistica.setLayout(null);
		PanelEstadistica.setBounds(133, 0, 450, 284);
		PanelInformación.add(PanelEstadistica);
		
		tableEstadistica = new JTable();
		tableEstadistica.setModel(new DefaultTableModel(
			new Object[][] {
				{"      Nombre", "       Equipo", "       P. Tiros", "     P. Triples", "      Rebotes"},
			},
			new String[] {
				"     Nombre", "     Equipo", "      P. Tiros", "    P. Triples", "     Rebotes"
			}
		));
		tableEstadistica.getColumnModel().getColumn(2).setPreferredWidth(77);
		tableEstadistica.setBounds(10, 11, 430, 255);
		PanelEstadistica.add(tableEstadistica);
		
		POpciones = new JPanel();
		POpciones.setLayout(null);
		POpciones.setBackground(Color.WHITE);
		POpciones.setBounds(0, 0, 111, 286);
		PanelInformación.add(POpciones);
		
		CBCategorias = new JComboBox<String>();
		CBCategorias.setBackground(new Color(65, 105, 225));
		CBCategorias.setModel(new DefaultComboBoxModel<String>(new String[] {"     CATEGORIA"}));
		CBCategorias.setFont(new Font("Agency FB", Font.PLAIN, 11));
		CBCategorias.setEditable(true);
		CBCategorias.setBounds(10, 11, 91, 41);
		POpciones.add(CBCategorias);
		
		CBGrupos = new JComboBox<String>();
		CBGrupos.setBackground(new Color(65, 105, 225));
		CBGrupos.setModel(new DefaultComboBoxModel<String>(new String[] {"     GRUPO"}));
		CBGrupos.setFont(new Font("Agency FB", Font.PLAIN, 11));
		CBGrupos.setEditable(true);
		CBGrupos.setBounds(10, 74, 91, 41);
		POpciones.add(CBGrupos);
		
		CBEquipos = new JComboBox<String>();
		CBEquipos.setBackground(new Color(65, 105, 225));
		CBEquipos.setModel(new DefaultComboBoxModel<String>(new String[] {"     EQUIPO"}));
		CBEquipos.setFont(new Font("Agency FB", Font.PLAIN, 11));
		CBEquipos.setEditable(true);
		CBEquipos.setBounds(10, 138, 91, 41);
		POpciones.add(CBEquipos);
		PanelDatosUsuarios.setBackground(Color.WHITE);
		PanelDatosUsuarios.setBounds(0, 65, 582, 306);
		contentPane.add(PanelDatosUsuarios);
		PanelDatosUsuarios.setLayout(null);
		
		btnNuevoUsuario = new JButton("Nuevo");
		btnNuevoUsuario.setBackground(new Color(65, 105, 225));
		btnNuevoUsuario.setBounds(0, 55, 112, 39);
		PanelDatosUsuarios.add(btnNuevoUsuario);
		
		btnListaUsuarios = new JButton("Lista Usuarios");
		btnListaUsuarios.setBackground(new Color(65, 105, 225));
		btnListaUsuarios.setBounds(0, 143, 112, 39);
		PanelDatosUsuarios.add(btnListaUsuarios);
		
		tableUsuarios = new JTable();
		tableUsuarios.setModel(new DefaultTableModel(
			new Object[][] {
				{"                    Nombre", "               Apellido", "                    DNI", "                    Nick"},
			},
			new String[] {
				"                   Nombre", "              Apellido ", "                   DNI", "                   Nick"
			}
		));
		tableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(167);
		tableUsuarios.getColumnModel().getColumn(1).setPreferredWidth(146);
		tableUsuarios.getColumnModel().getColumn(2).setPreferredWidth(134);
		tableUsuarios.getColumnModel().getColumn(3).setPreferredWidth(149);
		
		panelDatosUsuario = new JPanel();
		panelDatosUsuario.setBackground(Color.WHITE);
		panelDatosUsuario.setBounds(117, 0, 455, 295);
		PanelDatosUsuarios.add(panelDatosUsuario);
		panelDatosUsuario.setLayout(null);
		
		lblNombreUsuario = new JLabel("  Nombre:");
		lblNombreUsuario.setBackground(new Color(135, 206, 235));
		lblNombreUsuario.setOpaque(true);
		lblNombreUsuario.setBounds(10, 30, 152, 22);
		panelDatosUsuario.add(lblNombreUsuario);
		
		lblApellidoUsuario = new JLabel("  Apellido:");
		lblApellidoUsuario.setOpaque(true);
		lblApellidoUsuario.setBackground(new Color(135, 206, 235));
		lblApellidoUsuario.setBounds(10, 63, 152, 22);
		panelDatosUsuario.add(lblApellidoUsuario);
		
		lblDniUsuario = new JLabel("  DNI:");
		lblDniUsuario.setOpaque(true);
		lblDniUsuario.setBackground(new Color(135, 206, 235));
		lblDniUsuario.setBounds(10, 96, 152, 22);
		panelDatosUsuario.add(lblDniUsuario);
		
		lblTelefonoUsuario = new JLabel("  Telefono:");
		lblTelefonoUsuario.setOpaque(true);
		lblTelefonoUsuario.setBackground(new Color(135, 206, 235));
		lblTelefonoUsuario.setBounds(10, 129, 152, 22);
		panelDatosUsuario.add(lblTelefonoUsuario);
		
		lblEmailUsuario = new JLabel("  Email:");
		lblEmailUsuario.setOpaque(true);
		lblEmailUsuario.setBackground(new Color(135, 206, 235));
		lblEmailUsuario.setBounds(10, 162, 152, 22);
		panelDatosUsuario.add(lblEmailUsuario);
		
		lblNickUsuario = new JLabel("  Nick:");
		lblNickUsuario.setOpaque(true);
		lblNickUsuario.setBackground(new Color(135, 206, 235));
		lblNickUsuario.setBounds(10, 195, 152, 22);
		panelDatosUsuario.add(lblNickUsuario);
		
		lblContrasea = new JLabel("  Contrase\u00F1a:");
		lblContrasea.setOpaque(true);
		lblContrasea.setBackground(new Color(135, 206, 235));
		lblContrasea.setBounds(276, 195, 78, 22);
		panelDatosUsuario.add(lblContrasea);
		
		btnGuardarUsuario = new JButton("GUARDAR");
		btnGuardarUsuario.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnGuardarUsuario.setBackground(Color.GREEN);
		btnGuardarUsuario.setBounds(356, 261, 89, 23);
		panelDatosUsuario.add(btnGuardarUsuario);
		
		btnEliminarUsuario = new JButton("ELIMINAR");
		btnEliminarUsuario.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnEliminarUsuario.setBackground(Color.RED);
		btnEliminarUsuario.setBounds(250, 261, 89, 23);
		panelDatosUsuario.add(btnEliminarUsuario);
		
		txtNombreUsuario = new JTextField();
		txtNombreUsuario.setBackground(new Color(175, 238, 238));
		txtNombreUsuario.setBounds(162, 30, 283, 22);
		panelDatosUsuario.add(txtNombreUsuario);
		txtNombreUsuario.setColumns(10);
		
		txtApellidoUsuario = new JTextField();
		txtApellidoUsuario.setColumns(10);
		txtApellidoUsuario.setBackground(new Color(175, 238, 238));
		txtApellidoUsuario.setBounds(162, 63, 283, 22);
		panelDatosUsuario.add(txtApellidoUsuario);
		
		txtDniUsuario = new JTextField();
		txtDniUsuario.setColumns(10);
		txtDniUsuario.setBackground(new Color(175, 238, 238));
		txtDniUsuario.setBounds(162, 96, 283, 22);
		panelDatosUsuario.add(txtDniUsuario);
		
		txtTelefonoUsuario = new JTextField();
		txtTelefonoUsuario.setColumns(10);
		txtTelefonoUsuario.setBackground(new Color(175, 238, 238));
		txtTelefonoUsuario.setBounds(162, 129, 283, 22);
		panelDatosUsuario.add(txtTelefonoUsuario);
		
		txtEmailUsuario = new JTextField();
		txtEmailUsuario.setColumns(10);
		txtEmailUsuario.setBackground(new Color(175, 238, 238));
		txtEmailUsuario.setBounds(162, 162, 283, 22);
		panelDatosUsuario.add(txtEmailUsuario);
		
		txtNickUsuario = new JTextField();
		txtNickUsuario.setColumns(10);
		txtNickUsuario.setBackground(new Color(175, 238, 238));
		txtNickUsuario.setBounds(162, 195, 114, 22);
		panelDatosUsuario.add(txtNickUsuario);
		
		txtPasswordUsuario = new JTextField();
		txtPasswordUsuario.setColumns(10);
		txtPasswordUsuario.setBackground(new Color(175, 238, 238));
		txtPasswordUsuario.setBounds(354, 195, 91, 22);
		panelDatosUsuario.add(txtPasswordUsuario);
		
		lblTipoUsuario = new JLabel("  Tipo:");
		lblTipoUsuario.setOpaque(true);
		lblTipoUsuario.setBackground(new Color(135, 206, 235));
		lblTipoUsuario.setBounds(10, 224, 152, 22);
		panelDatosUsuario.add(lblTipoUsuario);
		
		PanelTipoUsuario = new JPanel();
		PanelTipoUsuario.setBackground(new Color(175, 238, 238));
		PanelTipoUsuario.setBounds(161, 223, 283, 22);
		panelDatosUsuario.add(PanelTipoUsuario);
		PanelTipoUsuario.setLayout(null);
		
		rdbtnAdmin = new JRadioButton("Admin");
		rdbtnAdmin.setBackground(new Color(175, 238, 238));
		rdbtnAdmin.setBounds(0, 0, 63, 22);
		PanelTipoUsuario.add(rdbtnAdmin);
		
		rdbtnUsuario = new JRadioButton("Usuario");
		rdbtnUsuario.setBackground(new Color(175, 238, 238));
		rdbtnUsuario.setBounds(86, 0, 63, 22);
		PanelTipoUsuario.add(rdbtnUsuario);
		
		rdbtnObservador = new JRadioButton("Observador");
		rdbtnObservador.setBackground(new Color(175, 238, 238));
		rdbtnObservador.setBounds(186, 0, 91, 22);
		PanelTipoUsuario.add(rdbtnObservador);
		tableUsuarios.setBounds(124, 11, 448, 284);
		PanelDatosUsuarios.add(tableUsuarios);
		PanelDatosLigas.setLayout(null);
		PanelDatosLigas.setBackground(Color.WHITE);
		PanelDatosLigas.setBounds(127, 79, 456, 286);
		contentPane.add(PanelDatosLigas);
		
		lblNombreLiga = new JLabel("  Liga:");
		lblNombreLiga.setOpaque(true);
		lblNombreLiga.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblNombreLiga.setBackground(new Color(135, 206, 235));
		lblNombreLiga.setBounds(10, 46, 152, 22);
		PanelDatosLigas.add(lblNombreLiga);
		
		lblCodigoLiga = new JLabel("  Codigo:");
		lblCodigoLiga.setOpaque(true);
		lblCodigoLiga.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblCodigoLiga.setBackground(new Color(135, 206, 235));
		lblCodigoLiga.setBounds(10, 11, 152, 22);
		PanelDatosLigas.add(lblCodigoLiga);
		
		lblGrupoLiga = new JLabel("  Grupo:");
		lblGrupoLiga.setOpaque(true);
		lblGrupoLiga.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblGrupoLiga.setBackground(new Color(135, 206, 235));
		lblGrupoLiga.setBounds(10, 112, 152, 22);
		PanelDatosLigas.add(lblGrupoLiga);
		
		lblNMaxEquipos = new JLabel("  N\u00BA Max de Equipos:");
		lblNMaxEquipos.setOpaque(true);
		lblNMaxEquipos.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblNMaxEquipos.setBackground(new Color(135, 206, 235));
		lblNMaxEquipos.setBounds(10, 145, 152, 22);
		PanelDatosLigas.add(lblNMaxEquipos);
		
		txtCodLiga = new JTextField();
		txtCodLiga.setColumns(10);
		txtCodLiga.setBackground(new Color(175, 238, 238));
		txtCodLiga.setBounds(162, 11, 284, 22);
		PanelDatosLigas.add(txtCodLiga);
		
		txtLiga = new JTextField();
		txtLiga.setColumns(10);
		txtLiga.setBackground(new Color(175, 238, 238));
		txtLiga.setBounds(162, 46, 284, 22);
		PanelDatosLigas.add(txtLiga);
		
		txtGrupoLiga = new JTextField();
		txtGrupoLiga.setColumns(10);
		txtGrupoLiga.setBackground(new Color(175, 238, 238));
		txtGrupoLiga.setBounds(162, 112, 284, 22);
		PanelDatosLigas.add(txtGrupoLiga);
		
		btnGuardarLiga = new JButton("GUARDAR");
		btnGuardarLiga.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnGuardarLiga.setBackground(Color.GREEN);
		btnGuardarLiga.setBounds(357, 252, 89, 23);
		PanelDatosLigas.add(btnGuardarLiga);
		
		btnEliminarLiga = new JButton("ELIMINAR");
		btnEliminarLiga.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnEliminarLiga.setBackground(Color.RED);
		btnEliminarLiga.setBounds(262, 252, 89, 23);
		PanelDatosLigas.add(btnEliminarLiga);
		
		txtNMaxEquipos = new JTextField();
		txtNMaxEquipos.setColumns(10);
		txtNMaxEquipos.setBackground(new Color(175, 238, 238));
		txtNMaxEquipos.setBounds(162, 145, 284, 22);
		PanelDatosLigas.add(txtNMaxEquipos);
		
		txtCatLiga = new JTextField();
		txtCatLiga.setColumns(10);
		txtCatLiga.setBackground(new Color(175, 238, 238));
		txtCatLiga.setBounds(162, 79, 284, 22);
		PanelDatosLigas.add(txtCatLiga);
		
		lblCategoriaLiga = new JLabel("  Categoria:");
		lblCategoriaLiga.setOpaque(true);
		lblCategoriaLiga.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblCategoriaLiga.setBackground(new Color(135, 206, 235));
		lblCategoriaLiga.setBounds(10, 79, 152, 22);
		PanelDatosLigas.add(lblCategoriaLiga);
		
		PanelDatosEquipo = new JPanel();
		PanelDatosEquipo.setVisible(false);
		PanelDatosEquipo.setLayout(null);
		PanelDatosEquipo.setBackground(Color.WHITE);
		PanelDatosEquipo.setBounds(127, 79, 456, 286);
		contentPane.add(PanelDatosEquipo);
		
		lblNombreEquipo = new JLabel("  Nombre: ");
		lblNombreEquipo.setOpaque(true);
		lblNombreEquipo.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblNombreEquipo.setBackground(new Color(135, 206, 235));
		lblNombreEquipo.setBounds(10, 11, 152, 22);
		PanelDatosEquipo.add(lblNombreEquipo);
		
		lblCodigo = new JLabel("  Codigo:");
		lblCodigo.setOpaque(true);
		lblCodigo.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblCodigo.setBackground(new Color(135, 206, 235));
		lblCodigo.setBounds(10, 44, 152, 22);
		PanelDatosEquipo.add(lblCodigo);
		
		lblMunicipio = new JLabel("  Municipio:");
		lblMunicipio.setOpaque(true);
		lblMunicipio.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblMunicipio.setBackground(new Color(135, 206, 235));
		lblMunicipio.setBounds(10, 77, 152, 22);
		PanelDatosEquipo.add(lblMunicipio);
		
		lblTerrenoDeJuego = new JLabel("  Terreno de Juego:");
		lblTerrenoDeJuego.setOpaque(true);
		lblTerrenoDeJuego.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblTerrenoDeJuego.setBackground(new Color(135, 206, 235));
		lblTerrenoDeJuego.setBounds(10, 110, 152, 22);
		PanelDatosEquipo.add(lblTerrenoDeJuego);
		
		lblTelefono = new JLabel("  Telefono:");
		lblTelefono.setOpaque(true);
		lblTelefono.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblTelefono.setBackground(new Color(135, 206, 235));
		lblTelefono.setBounds(10, 143, 152, 22);
		PanelDatosEquipo.add(lblTelefono);
		
		lblEmail = new JLabel("  Email:");
		lblEmail.setOpaque(true);
		lblEmail.setFont(new Font("Agency FB", Font.PLAIN, 15));
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
		
		btnGuardarEquipo = new JButton("GUARDAR");
		btnGuardarEquipo.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnGuardarEquipo.setBackground(Color.GREEN);
		btnGuardarEquipo.setBounds(357, 252, 89, 23);
		PanelDatosEquipo.add(btnGuardarEquipo);
		
		btnEliminarEquipo = new JButton("ELIMINAR");
		btnEliminarEquipo.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnEliminarEquipo.setBackground(Color.RED);
		btnEliminarEquipo.setBounds(262, 252, 89, 23);
		PanelDatosEquipo.add(btnEliminarEquipo);
		PanelDatosJugador.setBounds(127, 79, 456, 286);
		contentPane.add(PanelDatosJugador);
		PanelDatosJugador.setBackground(new Color(255, 255, 255));
		PanelDatosJugador.setLayout(null);
		
		lblNombre = new JLabel("  Nombre: ");
		lblNombre.setOpaque(true);
		lblNombre.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblNombre.setBackground(new Color(135, 206, 235));
		lblNombre.setBounds(10, 11, 152, 22);
		PanelDatosJugador.add(lblNombre);
		
		lblApellido = new JLabel("  Apellido: ");
		lblApellido.setOpaque(true);
		lblApellido.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblApellido.setBackground(new Color(135, 206, 235));
		lblApellido.setBounds(10, 44, 152, 22);
		PanelDatosJugador.add(lblApellido);
		
		lblDni = new JLabel("  DNI:");
		lblDni.setOpaque(true);
		lblDni.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblDni.setBackground(new Color(135, 206, 235));
		lblDni.setBounds(10, 77, 152, 22);
		PanelDatosJugador.add(lblDni);
		
		lblNacionalidad = new JLabel("  Nacionalidad:");
		lblNacionalidad.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblNacionalidad.setOpaque(true);
		lblNacionalidad.setBackground(new Color(135, 206, 235));
		lblNacionalidad.setBounds(10, 110, 152, 22);
		PanelDatosJugador.add(lblNacionalidad);
		
		lblFechaDeNacimiento = new JLabel("  Fecha de nacimiento: ");
		lblFechaDeNacimiento.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblFechaDeNacimiento.setOpaque(true);
		lblFechaDeNacimiento.setBackground(new Color(135, 206, 235));
		lblFechaDeNacimiento.setBounds(10, 143, 152, 22);
		PanelDatosJugador.add(lblFechaDeNacimiento);
		
		lblPeso = new JLabel("  Peso:");
		lblPeso.setOpaque(true);
		lblPeso.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblPeso.setBackground(new Color(135, 206, 235));
		lblPeso.setBounds(294, 176, 65, 22);
		PanelDatosJugador.add(lblPeso);
		
		lblEdad = new JLabel("  Edad:");
		lblEdad.setOpaque(true);
		lblEdad.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblEdad.setBackground(new Color(135, 206, 235));
		lblEdad.setBounds(294, 143, 65, 22);
		PanelDatosJugador.add(lblEdad);
		
		lblAltura = new JLabel("  Altura: ");
		lblAltura.setOpaque(true);
		lblAltura.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblAltura.setBackground(new Color(135, 206, 235));
		lblAltura.setBounds(10, 176, 152, 22);
		PanelDatosJugador.add(lblAltura);
		
		lblEquipo = new JLabel("  Equipo:");
		lblEquipo.setOpaque(true);
		lblEquipo.setFont(new Font("Agency FB", Font.PLAIN, 15));
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
		
		PanelFechaNacimiento = new JPanel();
		PanelFechaNacimiento.setBackground(new Color(175, 238, 238));
		PanelFechaNacimiento.setBounds(162, 143, 134, 22);
		PanelDatosJugador.add(PanelFechaNacimiento);
		PanelFechaNacimiento.setLayout(null);
		
		txtAno = new JTextField();
		txtAno.setColumns(10);
		txtAno.setBackground(new Color(175, 238, 238));
		txtAno.setBounds(99, 0, 35, 22);
		PanelFechaNacimiento.add(txtAno);
		
		txtMes = new JTextField();
		txtMes.setColumns(10);
		txtMes.setBackground(new Color(175, 238, 238));
		txtMes.setBounds(50, 1, 35, 21);
		PanelFechaNacimiento.add(txtMes);
		
		txtDia = new JTextField();
		txtDia.setColumns(10);
		txtDia.setBackground(new Color(175, 238, 238));
		txtDia.setBounds(0, 1, 35, 21);
		PanelFechaNacimiento.add(txtDia);
		
		label_1 = new JLabel("/");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(35, 4, 14, 14);
		PanelFechaNacimiento.add(label_1);
		
		label_2 = new JLabel("/");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(84, 4, 14, 14);
		PanelFechaNacimiento.add(label_2);
		
		btnGuardar = new JButton("GUARDAR");
		btnGuardar.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnGuardar.setBackground(Color.GREEN);
		btnGuardar.setBounds(357, 252, 89, 23);
		PanelDatosJugador.add(btnGuardar);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnEliminar.setBackground(Color.RED);
		btnEliminar.setBounds(262, 252, 89, 23);
		PanelDatosJugador.add(btnEliminar);
		
		CBEquipoJugador = new JComboBox<String>();
		CBEquipoJugador.setModel(new DefaultComboBoxModel<String>(new String[] {"", "1", "2", "3"}));
		CBEquipoJugador.setEditable(true);
		CBEquipoJugador.setBackground(new Color(175, 238, 238));
		CBEquipoJugador.setBounds(162, 209, 284, 22);
		PanelDatosJugador.add(CBEquipoJugador);
		
		PanelDatosPartidos = new JPanel();
		PanelDatosPartidos.setVisible(false);
		PanelDatosPartidos.setLayout(null);
		PanelDatosPartidos.setBackground(Color.WHITE);
		PanelDatosPartidos.setBounds(127, 79, 456, 286);
		contentPane.add(PanelDatosPartidos);
		
		lblCategoria = new JLabel("  Categoria:");
		lblCategoria.setOpaque(true);
		lblCategoria.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblCategoria.setBackground(new Color(135, 206, 235));
		lblCategoria.setBounds(10, 44, 152, 22);
		PanelDatosPartidos.add(lblCategoria);
		
		lblCodPartido = new JLabel("  Codigo:");
		lblCodPartido.setOpaque(true);
		lblCodPartido.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblCodPartido.setBackground(new Color(135, 206, 235));
		lblCodPartido.setBounds(10, 11, 152, 22);
		PanelDatosPartidos.add(lblCodPartido);
		
		lblGrupo = new JLabel("  Grupo:");
		lblGrupo.setOpaque(true);
		lblGrupo.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblGrupo.setBackground(new Color(135, 206, 235));
		lblGrupo.setBounds(10, 77, 152, 22);
		PanelDatosPartidos.add(lblGrupo);
		
		lblFecha = new JLabel("  Fecha:");
		lblFecha.setOpaque(true);
		lblFecha.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblFecha.setBackground(new Color(135, 206, 235));
		lblFecha.setBounds(10, 110, 152, 22);
		PanelDatosPartidos.add(lblFecha);
		
		lblResultado = new JLabel("  Resultado:");
		lblResultado.setOpaque(true);
		lblResultado.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblResultado.setBackground(new Color(135, 206, 235));
		lblResultado.setBounds(10, 143, 152, 22);
		PanelDatosPartidos.add(lblResultado);
		
		lblEquipolocal = new JLabel("  Equipo Local:");
		lblEquipolocal.setOpaque(true);
		lblEquipolocal.setFont(new Font("Agency FB", Font.PLAIN, 15));
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
		
		btnGuardarPartido = new JButton("GUARDAR");
		btnGuardarPartido.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnGuardarPartido.setBackground(Color.GREEN);
		btnGuardarPartido.setBounds(357, 252, 89, 23);
		PanelDatosPartidos.add(btnGuardarPartido);
		
		btnEliminarPartido = new JButton("ELIMINAR");
		btnEliminarPartido.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnEliminarPartido.setBackground(Color.RED);
		btnEliminarPartido.setBounds(262, 252, 89, 23);
		PanelDatosPartidos.add(btnEliminarPartido);
		
		FechaPartido = new JPanel();
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
		
		txtDiaPartido = new JTextField();
		txtDiaPartido.setColumns(10);
		txtDiaPartido.setBackground(new Color(175, 238, 238));
		txtDiaPartido.setBounds(0, 1, 35, 21);
		FechaPartido.add(txtDiaPartido);
		
		lbl1 = new JLabel("/");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBounds(35, 4, 14, 14);
		FechaPartido.add(lbl1);
		
		lbl2 = new JLabel("/");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setBounds(84, 4, 14, 14);
		FechaPartido.add(lbl2);
		
		txtHora = new JTextField();
		txtHora.setColumns(10);
		txtHora.setBackground(new Color(175, 238, 238));
		txtHora.setBounds(312, 111, 58, 21);
		PanelDatosPartidos.add(txtHora);
		
		lbl3 = new JLabel(":");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setBounds(373, 114, 14, 14);
		PanelDatosPartidos.add(lbl3);
		
		txtMinutos = new JTextField();
		txtMinutos.setColumns(10);
		txtMinutos.setBackground(new Color(175, 238, 238));
		txtMinutos.setBounds(388, 111, 58, 21);
		PanelDatosPartidos.add(txtMinutos);
		
		lblFechaPartido = new JLabel("-");
		lblFechaPartido.setOpaque(true);
		lblFechaPartido.setBackground(new Color(175, 238, 238));
		lblFechaPartido.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaPartido.setBounds(162, 110, 284, 22);
		PanelDatosPartidos.add(lblFechaPartido);
		
		lbl4 = new JLabel("-");
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setBounds(293, 143, 21, 22);
		PanelDatosPartidos.add(lbl4);
		
		lblResultadoPartido = new JLabel("");
		lblResultadoPartido.setOpaque(true);
		lblResultadoPartido.setBackground(new Color(175, 238, 238));
		lblResultadoPartido.setBounds(162, 143, 284, 22);
		PanelDatosPartidos.add(lblResultadoPartido);
		
		lblEquipovisitante = new JLabel("  Equipo Visitante:");
		lblEquipovisitante.setOpaque(true);
		lblEquipovisitante.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblEquipovisitante.setBackground(new Color(135, 206, 235));
		lblEquipovisitante.setBounds(10, 209, 152, 22);
		PanelDatosPartidos.add(lblEquipovisitante);
		
		CBEquipoLocal = new JComboBox<String>();
		CBEquipoLocal.setEditable(true);
		CBEquipoLocal.setBackground(new Color(175, 238, 238));
		CBEquipoLocal.setBounds(162, 176, 284, 22);
		PanelDatosPartidos.add(CBEquipoLocal);
		
		CBEquipoVisitante = new JComboBox<String>();
		CBEquipoVisitante.setEditable(true);
		CBEquipoVisitante.setBackground(new Color(175, 238, 238));
		CBEquipoVisitante.setBounds(162, 209, 284, 22);
		PanelDatosPartidos.add(CBEquipoVisitante);
	}
	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		
		if((JButton)o == btnIniciarSesion) {
			
			IniciarSesionSegunTipo();
			limpiarLogin();
		}
		/*Botones de idioma*/
		else if((((JButton)o == btnEs)||((JButton)o) == btnEsp)) {
			traducirESP();
		}
		else if((((JButton)o == btnEu)||((JButton)o) == btnEus)) {
			traducirEUS();
		}
		else if(((JButton)o == btnCerrarSesion)||((JButton)o == btnCerrarSesionUO)) {
			PanelLogin.setVisible(true);
			PanelBSuperAdmin.setVisible(false);
			PanelBAñadirAdmin.setVisible(false);
			PanelDatosUsuarios.setVisible(false);
			PanelDatosLigas.setVisible(false);
			PanelDatosEquipo.setVisible(false);
			PanelDatosJugador.setVisible(false);
			PanelDatosPartidos.setVisible(false);
			PanelInformación.setVisible(false);
			PanelSuperiorUO.setVisible(false);
		}
		
	}

	
	private void limpiarLogin() {
		txtUsuario.setText("");
		passwordField.setText("");
	}

	private void IniciarSesionSegunTipo() {
		
		if(txtUsuario.getText().equals("")) {
			
			iniciarParaObservador();

		}
		else {
			Cliente cli = new Cliente();
			cli.setNick(txtUsuario.getText());
			cli.setPassword(passwordField.getText());
			String tipo = comprobarTipo(cli);
			if(tipo.equals("Admin")) {
				iniciarParaAdmin();
			}
			else if(tipo.equals("Usuario")) {
				iniciarParaUsuario();
			}
			else if (tipo.equals("Observador")){
				iniciarParaObservador();
			}
		else {
			lblError.setVisible(true);
			}
		}
		
		
	}

	/*Metodo que realiza la configuración necesaria al inicio 
	 * de la aplicación para que se vea 
	 * la personalizacion para el observador*/
	private void iniciarParaObservador() {
		PanelLogin.setVisible(false);
		configurarColoresObservador();
		lblTipo.setText("Observador");
		PanelSuperiorUO.setVisible(true);
		PanelInformación.setVisible(true);
		PanelInicioAplicación.setVisible(true);
		POpciones.setVisible(true);
		PanelAplicaciónVacia.setVisible(false);
		PanelClasificacion.setVisible(false);
		PanelMuestraEquipos.setVisible(false);
		PanelMuestraJugadores.setVisible(false);
		PanelBAñadirAdmin.setVisible(false);
		PanelBSuperAdmin.setVisible(false);
		PanelDatosUsuarios.setVisible(false);
		PanelDatosLigas.setVisible(false);
		PanelDatosEquipo.setVisible(false);
		PanelDatosJugador.setVisible(false);
		PanelDatosPartidos.setVisible(false);
	}
	
	
	/*Metodo que realiza la configuración necesaria al inicio 
	 * de la aplicación para que se vea 
	 * la personalizacion para el usuario*/
	private void iniciarParaUsuario() {
		// TODO Auto-generated method stub
		
	}
	
	
	/*Metodo que realiza la configuración necesaria al inicio 
	 * de la aplicación para que se vea 
	 * la personalizacion para el administrador*/
	private void iniciarParaAdmin() {
		// TODO Auto-generated method stub
		
}

	
	/*Metodo que comprueba y devuelve el tipo de cliente para
	 *  saber que ventanas debe mostrar al iniciar sesion*/
	private String comprobarTipo(Cliente cliente) {
		String mota = "";
			for(int pos=0; pos<ListaUsuarios.size();pos++) {
				if(ListaUsuarios.get(pos).loginEquals(cliente)) {
					cliente.setTipoCliente(ListaUsuarios.get(pos).getTipoCliente());
				}
			}
		mota = cliente.getTipoCliente();
		return mota;
	}

	
	/*Metodo encargado de configurar los colores de los objetos
	 * (botones,paneles,labels, etc...) para el cliente de tipo 
	 * OBSERVADOR*/
	private void configurarColoresObservador() {
		// TODO Auto-generated method stub
	}

	
	/*Metodo encargado de traducir la información del programa a Español*/
	private void traducirESP() {
		btnCerrarSesion.setText("Cerrar Sesi\u00F3n");
		btnJugadores.setText("Jugadores");
		btnEquipos.setText("Equipos");
		btnPartidos.setText("Partidos");
		btnLiga.setText("Ligas");
		btnCerrarSesionUO.setText("Cerrar Sesi\u00F3n");
		btnVerEquipos.setText("Equipos");
		if (lblTipo.getText().equals("Ikusle")) {
			lblTipo.setText("Observador");
		}
		else if (lblTipo.getText().equals("Erabiltzailea")) {
			lblTipo.setText("Usuario");
		}
		btnVerPartidos.setText("Partidos");
		btnVerClasificación.setText("Clasificaci\u00F3n");
		btnVerEstadistica.setText("Estad\u00EDsticas");
		btnAadirJugador.setText("A\u00F1adir Jugador");
		btnAadirEquipo.setText("A\u00F1adir Equipo");
		btnAadirPartido.setText("A\u00F1adir Partido");
		btnConfiguracion.setText("Configuraci\u00F3n");
		btnCrearLigas.setText("Crear Ligas");
		lblElijaUnaOpcion.setText("Elija una opcion");
		lblAplicacinVacia.setText("APLICACI\u00D3N VACIA");
		btnNuevoUsuario.setText("Nuevo");
		btnListaUsuarios.setText("Lista Usuarios");
		lblNombreUsuario.setText("  Nombre:");
		lblApellidoUsuario.setText("  Apellido:");
		lblDniUsuario.setText("  DNI:");
		lblTelefonoUsuario.setText("  Telefono:");
		lblEmailUsuario.setText("  Email:");
		lblNickUsuario.setText("  Nick:");
		lblContrasea.setText("  Contrase\u00F1a:");
		btnGuardarUsuario.setText("GUARDAR");
		btnEliminarUsuario.setText("ELIMINAR");
		lblTipoUsuario.setText("  Tipo:");
		rdbtnUsuario.setText("Usuario");
		rdbtnObservador.setText("Observador");
		lblNombreLiga .setText("  Liga:");
		lblCodigoLiga.setText("  Codigo:");
		lblGrupoLiga.setText("  Grupo:");
		lblNMaxEquipos.setText("  N\u00BA Max de Equipos:");
		btnGuardarLiga.setText("GUARDAR");
		btnEliminarLiga.setText("ELIMINAR");
		lblCategoriaLiga.setText("  Categoria:");
		lblNombreEquipo.setText("  Nombre: ");
		lblCodigo.setText("  Codigo:");
		lblMunicipio.setText("  Municipio:");
		lblTerrenoDeJuego.setText("  Terreno de Juego:");
		lblTelefono.setText("  Telefono:");
		lblEmail.setText("  Email:");
		btnGuardarEquipo.setText("GUARDAR");
		btnEliminarEquipo.setText("ELIMINAR");
		lblNombre.setText("  Nombre: ");
		lblApellido.setText("  Apellido: ");
		lblDni.setText("  DNI:");
		lblNacionalidad.setText("  Nacionalidad:");
		lblFechaDeNacimiento.setText("  Fecha de nacimiento: ");
		lblPeso.setText("  Peso:");
		lblEdad.setText("  Edad:");
		lblAltura.setText("  Altura: ");
		lblEquipo.setText("  Equipo:");
		btnGuardar.setText("GUARDAR");
		btnEliminarEquipo.setText("ELIMINAR");
		lblNombre.setText("  Nombre: ");
		btnEliminar.setText("ELIMINAR");
		lblCategoria.setText("  Categoria:");
		lblCodPartido.setText("  Codigo:");
		lblGrupo.setText("  Grupo:");
		lblFecha.setText("  Fecha:");
		lblResultado.setText("  Resultado:");
		lblEquipolocal.setText("  Equipo Local:");
		btnGuardarPartido.setText("GUARDAR");
		btnEliminarPartido.setText("ELIMINAR");
	}

	
	/*Metodo encargado de traducir la información del programa a Español*/
	private void traducirEUS() {
		btnCerrarSesion.setText("Sasoia itxi");
		btnJugadores.setText("Jokalariak");
		btnEquipos.setText("Taldeak");
		btnPartidos.setText("Partiduak");
		btnLiga.setText("Ligak");
		btnCerrarSesionUO.setText("Sasoia itxi");
		btnVerEquipos.setText("Taldeak");
		if (lblTipo.getText().equals("Observador")) {
			lblTipo.setText("Ikusle");
		}
		else if (lblTipo.getText().equals("Usuario")) {
			lblTipo.setText("Erabiltzailea");
		}
		btnVerClasificación.setText("Klasifikazioa");
		btnVerEstadistica.setText("Estadistikak");
		btnAadirJugador.setText("Jokalaria gehitu");
		btnAadirEquipo.setText("Taldeak gehitu");
		btnAadirPartido.setText("Partiduak gehitu");
		btnConfiguracion.setText("Konfigurazioa");
		btnCrearLigas.setText("Ligak gehitu");
		lblElijaUnaOpcion.setText("Autatu aukera bat");
		lblAplicacinVacia.setText("Aplicazio hutsik");
		btnNuevoUsuario.setText("Berria");
		btnListaUsuarios.setText("Erabiltzaile listak");
		lblNombreUsuario.setText("  Izena:");
		lblApellidoUsuario.setText("  Abizena:");
		lblDniUsuario.setText("  NAN:");
		lblTelefonoUsuario.setText("  Telefonoa:");
		lblEmailUsuario.setText("  Emaila:");
		lblNickUsuario.setText("  Nick:");
		lblContrasea.setText("  Pasahitza:");
		btnGuardarUsuario.setText("GORDE");
		btnEliminarUsuario.setText("EZABATU");
		lblTipoUsuario.setText("  Mota:");
		rdbtnUsuario.setText("Erabiltzaile");
		rdbtnObservador.setText("Ikusle");
		lblNombreLiga.setText("  Liga:");
		lblCodigoLiga.setText("  Kodea:");
		lblGrupoLiga.setText("  Talde:");
		lblNMaxEquipos.setText("  Zbk max Taldeak:");
		btnGuardarLiga.setText("GORDE");
		btnEliminarLiga.setText("EZABATU");
		lblCategoriaLiga.setText("  Maila:");
		lblNombreEquipo.setText("  Izena: ");
		lblCodigo.setText("  Kodea:");
		lblMunicipio.setText("  Udalerria:");
		lblTerrenoDeJuego.setText("  Joko zelaia:");
		lblTelefono.setText("  Telefonoa:");
		lblEmail.setText("  Emaila:");
		btnGuardarEquipo.setText("GORDE");
		btnEliminarEquipo.setText("EZABATU");
		lblNombre.setText("  Izena: ");
		lblApellido.setText("  Abizena: ");
		lblDni.setText("  NAN:");
		lblNacionalidad.setText("  Herritartasun:");
		lblFechaDeNacimiento.setText("  Jaioeguna: ");
		lblPeso.setText("  Pisua:");
		lblEdad.setText("  Adina:");
		lblAltura.setText("  Altuera: ");
		lblEquipo.setText("  Taldea:");
		btnGuardar.setText("GORDE");
		btnEliminar.setText("EZABATU");
		lblCategoria.setText("  Maila:");
		lblCodPartido.setText("  Kode:");
		lblGrupo.setText("  Taldea:");
		lblFecha.setText("  Data:");
		lblResultado.setText("  Emaitza:");
		lblEquipolocal.setText("  Talde lokala:");
		btnGuardarPartido.setText("GORDE");
		btnEliminarPartido.setText("EZABATU");
	}

}
