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
import javax.swing.JOptionPane;
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
import javax.swing.border.LineBorder;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	private JButton btnVerJugadores;
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
	private JButton btnAtras;
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
	private DefaultTableModel tableUsuariosModel;
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
	private JLabel lblLiga;
	private JComboBox<String> CBLigas;
	private DefaultComboBoxModel<String> ModelLigas;
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
	private DefaultComboBoxModel<String> ModelEquipoJugador ;
	/*Botones del panel*/
	private JButton btnGuardar;
	private JButton btnEliminar;
	private JButton btnDatosEstadisticos;
	
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
	private JPanel PanelLigas;
	private JTable tableLigas;
	private DefaultTableModel tableLigasModel;
	private JPanel PanelMuestraEquipos;
	private JTable tableMuestraEquipos;
	private DefaultTableModel tableEquiposModel;
	private JTable tableMostrarJugadores;
	private DefaultTableModel tableJugadoresModel;
	private JPanel PanelEstadistica;
	private JTable tableEstadistica;
	private JPanel PanelClasificacion;
	private JTable tableClasificacion;
	private JPanel PanelMuestraPartidos;
	private JTable tablePartidos;
	private DefaultTableModel tablePartidosModel;
	private JPanel POpciones;
	/*Opciones de menu*/
	private JComboBox<String> CBCategorias;
	private JComboBox<String> CBGrupos ;
	private JComboBox<String> CBEquipos;
	private JButton btnAtrasPO;
	/*Aplicación vacia*/
	private JLabel lblAplicacinVacia;
	
	
/*Necesidades previas para la aplicación*/
	private ArrayList<Liga> ListaLigas;
	private ArrayList<Equipo> ListaEquipos;
	private ArrayList<Jugador> ListaJugador;
	private ArrayList<Partido> ListaPartidos;
	private ArrayList<Cliente> ListaUsuarios;
	private String usuarioLogado;


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
		setResizable(false);
	/*Necesidades previas*/
		ListaLigas = new ArrayList<Liga>();
		ListaEquipos = new ArrayList<Equipo>();
		ListaJugador = new ArrayList<Jugador>();
		ListaPartidos = new ArrayList<Partido>();
		ListaUsuarios =new ArrayList<Cliente>();
	/*Administrador por defecto*/
		Cliente CAdmin = new Cliente();
		CAdmin.setNombre("Admin");
		CAdmin.setDNI("12345678A");
		CAdmin.setTelefonoCliente("631245798");
		CAdmin.setEmailCliente("ADMIN@gmail.com");
		CAdmin.setNick("Admin");
		CAdmin.setPassword("admin");
		CAdmin.setTipoCliente("Admin");
		ListaUsuarios.add(CAdmin);
	/*Usuario por defecto*/
		Cliente CUser = new Cliente();
		CUser.setNombre("User");
		CUser.setDNI("13579024B");
		CUser.setTelefonoCliente("625397842");
		CUser.setEmailCliente("Usuario@gmail.com");
		CUser.setNick("User");
		CUser.setPassword("user");
		CUser.setTipoCliente("Usuario");
		ListaUsuarios.add(CUser);
	/*Liga por defecto*/
		Liga lebOro = new Liga();
		lebOro.setCodigo("1");
		lebOro.setNombreLiga("Leb Oro");
		lebOro.setCategoriaLiga("Nacional 2");
		lebOro.setGrupo("A");
		ListaLigas.add(lebOro);
		
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
		ModelLigas = new DefaultComboBoxModel<>();
		tablePartidosModel = new DefaultTableModel();
		
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
		PanelSuperiorUO.setLayout(null);
		PanelSuperiorUO.setBounds(0, 0, 569, 66);
		contentPane.add(PanelSuperiorUO);
		
		btnCerrarSesionUO = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesionUO.addActionListener(this);
		btnCerrarSesionUO.setToolTipText("");
		btnCerrarSesionUO.setFont(new Font("Agency FB", Font.PLAIN, 18));
		btnCerrarSesionUO.setBounds(0, 0, 131, 62);
		PanelSuperiorUO.add(btnCerrarSesionUO);
		
		btnVerJugadores = new JButton("Jugadores");
		btnVerJugadores.addActionListener(this);
		btnVerJugadores.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnVerJugadores.setBounds(131, 23, 110, 39);
		PanelSuperiorUO.add(btnVerJugadores);
		
		lblTipo = new JLabel("Observador");
		lblTipo.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblTipo.setBounds(425, 4, 64, 14);
		PanelSuperiorUO.add(lblTipo);
		
		btnVerPartidos = new JButton("Partidos");
		btnVerPartidos.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnVerPartidos.setBounds(241, 23, 110, 39);
		PanelSuperiorUO.add(btnVerPartidos);
		
		btnVerClasificación = new JButton("Clasificaci\u00F3n");
		btnVerClasificación.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnVerClasificación.setBounds(351, 23, 110, 39);
		PanelSuperiorUO.add(btnVerClasificación);
		
		btnVerEstadistica = new JButton("Estad\u00EDsticas");
		btnVerEstadistica.setFont(new Font("Agency FB", Font.PLAIN, 15));
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
		PanelBSuperAdmin = new JPanel();
		PanelBSuperAdmin.setVisible(false);
		PanelBSuperAdmin.setBackground(Color.WHITE);
		PanelBSuperAdmin.setBounds(5, 0, 583, 68);
		contentPane.add(PanelBSuperAdmin);
		PanelBSuperAdmin.setLayout(null);
		
		btnCerrarSesion = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesion.addActionListener(this);
		btnCerrarSesion.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnCerrarSesion.setForeground(Color.WHITE);
		btnCerrarSesion.setBounds(0, 0, 131, 62);
		PanelBSuperAdmin.add(btnCerrarSesion);
		
		btnJugadores = new JButton("Jugadores");
		btnJugadores.addActionListener(this);
		btnJugadores.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnJugadores.setForeground(Color.WHITE);
		btnJugadores.setBounds(131, 23, 110, 39);
		PanelBSuperAdmin.add(btnJugadores);
		
		btnEquipos = new JButton("Equipos");
		btnEquipos.addActionListener(this);
		btnEquipos.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnEquipos.setForeground(Color.WHITE);
		btnEquipos.setBounds(241, 23, 110, 39);
		PanelBSuperAdmin.add(btnEquipos);
		
		btnPartidos = new JButton("Partidos");
		btnPartidos.addActionListener(this);
		btnPartidos.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnPartidos.setForeground(Color.WHITE);
		btnPartidos.setBounds(351, 23, 110, 39);
		PanelBSuperAdmin.add(btnPartidos);
		
		btnEu = new JButton("");
		btnEu.addActionListener(this);
		btnEu.setIcon(new ImageIcon(BizkaiaBasket.class.getResource("/Imagenes/1928414-app.android.ikurrina.png")));
		btnEu.setFont(new Font("Agency FB", Font.PLAIN, 11));
		btnEu.setBounds(523, 0, 45, 23);
		PanelBSuperAdmin.add(btnEu);
		
		btnEs = new JButton("");
		btnEs.addActionListener(this);
		btnEs.setIcon(new ImageIcon(BizkaiaBasket.class.getResource("/Imagenes/bandera-espana-con-escudo-para-exterior_xs.jpg")));
		btnEs.setFont(new Font("Agency FB", Font.PLAIN, 11));
		btnEs.setBounds(486, 0, 37, 23);
		PanelBSuperAdmin.add(btnEs);
		
		lblAdmin = new JLabel("Admin");
		lblAdmin.setFont(new Font("Agency FB", Font.PLAIN, 12));
		lblAdmin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdmin.setBounds(425, 4, 44, 14);
		PanelBSuperAdmin.add(lblAdmin);
		
		btnLiga = new JButton("Ligas");
		btnLiga.addActionListener(this);
		btnLiga.setForeground(Color.WHITE);
		btnLiga.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnLiga.setBounds(461, 23, 110, 39);
		PanelBSuperAdmin.add(btnLiga);
		PanelBAñadirAdmin.setBackground(new Color(255, 255, 255));
		PanelBAñadirAdmin.setBounds(5, 79, 112, 286);
		contentPane.add(PanelBAñadirAdmin);
		PanelBAñadirAdmin.setLayout(null);
		
		btnAadirJugador = new JButton("A\u00F1adir Jugador");
		btnAadirJugador.addActionListener(this);
		btnAadirJugador.setForeground(Color.WHITE);
		btnAadirJugador.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnAadirJugador.setBounds(0, 111, 112, 39);
		PanelBAñadirAdmin.add(btnAadirJugador);
		
		btnAadirEquipo = new JButton("A\u00F1adir Equipo");
		btnAadirEquipo.addActionListener(this);
		btnAadirEquipo.setForeground(Color.WHITE);
		btnAadirEquipo.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnAadirEquipo.setBounds(0, 61, 112, 39);
		PanelBAñadirAdmin.add(btnAadirEquipo);
		
		btnAadirPartido = new JButton("A\u00F1adir Partido");
		btnAadirPartido.setForeground(Color.WHITE);
		btnAadirPartido.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnAadirPartido.setBounds(0, 161, 112, 39);
		PanelBAñadirAdmin.add(btnAadirPartido);
		
		btnCrearLigas = new JButton("Crear Ligas");
		btnCrearLigas.addActionListener(this);
		btnCrearLigas.setBounds(0, 11, 112, 39);
		PanelBAñadirAdmin.add(btnCrearLigas);
		btnCrearLigas.setForeground(Color.WHITE);
		btnCrearLigas.setFont(new Font("Agency FB", Font.PLAIN, 15));
		
		btnConfiguracion = new JButton("Configuraci\u00F3n");
		btnConfiguracion.addActionListener(this);
		btnConfiguracion.setForeground(Color.WHITE);
		btnConfiguracion.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnConfiguracion.setBounds(0, 236, 112, 39);
		PanelBAñadirAdmin.add(btnConfiguracion);


		
		PanelDatosLigas = new JPanel();
		PanelDatosLigas.setVisible(false);
		
		PanelDatosUsuarios = new JPanel();
		PanelDatosUsuarios.setVisible(false);
		tableJugadoresModel = new DefaultTableModel();
		tableLigasModel = new DefaultTableModel();
		tableEquiposModel = new DefaultTableModel();
		
		PanelInformación = new JPanel();
		PanelInformación.setVisible(false);
		PanelInformación.setBounds(0, 79, 583, 292);
		contentPane.add(PanelInformación);
		PanelInformación.setLayout(null);
		PanelInformación.setBackground(Color.WHITE);
		
		PanelMuestraJugadores = new JPanel();
		PanelMuestraJugadores.setVisible(false);
		
		PanelLigas = new JPanel();
		PanelLigas.setVisible(false);
		PanelLigas.setBackground(Color.WHITE);
		PanelLigas.setBounds(116, 0, 467, 295);
		PanelInformación.add(PanelLigas);
		PanelLigas.setLayout(null);
		
		tableLigas = new JTable();
		tableLigas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
		    /*   int row = tableLigas.columnAtPoint(tableLigas.getMousePosition().getY());
		        if (arg0.getClickCount() == 2) {
		        	Liga l = ListaLigas.get(row);
		        }*/
			}
		});
		tableLigas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableLigas.setBorder(new LineBorder(new Color(0, 0, 0)));
		tableLigas.setFont(new Font("Agency FB", Font.PLAIN, 15));
		tableLigas.setModel(tableLigasModel);
		tableLigas.setBounds(10, 11, 447, 273);
		PanelLigas.add(tableLigas);
		
		PanelInicioAplicación = new JPanel();
		PanelInicioAplicación.setBackground(Color.WHITE);
		PanelInicioAplicación.setBounds(126, 0, 457, 294);
		PanelInformación.add(PanelInicioAplicación);
		PanelInicioAplicación.setLayout(null);
		
		lblElijaUnaOpcion = new JLabel("Elija una opcion");
		lblElijaUnaOpcion.setHorizontalAlignment(SwingConstants.CENTER);
		lblElijaUnaOpcion.setFont(new Font("Agency FB", Font.PLAIN, 50));
		lblElijaUnaOpcion.setBounds(-12, 11, 459, 272);
		PanelInicioAplicación.add(lblElijaUnaOpcion);
		
		PanelAplicaciónVacia = new JPanel();
		PanelAplicaciónVacia.setBackground(Color.WHITE);
		PanelAplicaciónVacia.setBounds(136, 0, 447, 281);
		PanelInformación.add(PanelAplicaciónVacia);
		PanelAplicaciónVacia.setLayout(null);
		
		lblAplicacinVacia = new JLabel("APLICACI\u00D3N VACIA");
		lblAplicacinVacia.setHorizontalAlignment(SwingConstants.CENTER);
		lblAplicacinVacia.setFont(new Font("Agency FB", Font.PLAIN, 42));
		lblAplicacinVacia.setBounds(5, 11, 427, 270);
		PanelAplicaciónVacia.add(lblAplicacinVacia);
		
		PanelMuestraEquipos = new JPanel();
		PanelMuestraEquipos.setVisible(false);
		
		PanelMuestraEquipos.setBounds(121, 0, 455, 284);
		PanelInformación.add(PanelMuestraEquipos);
		PanelMuestraEquipos.setBackground(Color.WHITE);
		PanelMuestraEquipos.setLayout(null);
		
		tableMuestraEquipos = new JTable();
		tableMuestraEquipos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableMuestraEquipos.setBorder(new LineBorder(new Color(0, 0, 0)));
		tableMuestraEquipos.setFont(new Font("Agency FB", Font.PLAIN, 15));
		tableMuestraEquipos.setModel(tableEquiposModel);
		tableMuestraEquipos.setBounds(10, 11, 437, 264);
		PanelMuestraEquipos.add(tableMuestraEquipos);
		
		PanelMuestraJugadores.setBounds(121, 0, 462, 284);
		PanelInformación.add(PanelMuestraJugadores);
		PanelMuestraJugadores.setBackground(Color.WHITE);
		PanelMuestraJugadores.setLayout(null);
		
		tableMostrarJugadores = new JTable();
		tableMostrarJugadores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableMostrarJugadores.setBorder(new LineBorder(new Color(0, 0, 0)));
		tableMostrarJugadores.setBackground(Color.WHITE);
		tableMostrarJugadores.setFont(new Font("Agency FB", Font.PLAIN, 15));
		tableMostrarJugadores.setModel(tableJugadoresModel);
		tableMostrarJugadores.setBounds(10, 11, 435, 262);
		PanelMuestraJugadores.add(tableMostrarJugadores);
		
		PanelMuestraPartidos = new JPanel();
		PanelMuestraPartidos.setBackground(Color.WHITE);
		PanelMuestraPartidos.setBounds(116, 0, 467, 294);
		PanelInformación.add(PanelMuestraPartidos);
		PanelMuestraPartidos.setLayout(null);
		
		tablePartidos = new JTable();
		tablePartidos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tablePartidos.setBorder(new LineBorder(new Color(0, 0, 0)));
		tablePartidos.setBackground(Color.WHITE);
		tablePartidos.setFont(new Font("Agency FB", Font.PLAIN, 15));
		tablePartidos.setBounds(10, 11, 447, 272);
		PanelMuestraPartidos.add(tablePartidos);
		
		PanelEstadistica = new JPanel();
		PanelEstadistica.setVisible(false);
		
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
		
		tableClasificacion.setGridColor(Color.BLACK);
		tableClasificacion.setBackground(Color.WHITE);
		tableClasificacion.setBounds(0, 0, 467, 284);
		PanelClasificacion.add(tableClasificacion);
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
		CBCategorias.setEnabled(false);
		CBCategorias.setModel(new DefaultComboBoxModel<String>(new String[] {"     CATEGORIA"}));
		CBCategorias.setFont(new Font("Agency FB", Font.PLAIN, 11));
		CBCategorias.setEditable(true);
		CBCategorias.setBounds(10, 11, 91, 41);
		POpciones.add(CBCategorias);
		
		CBGrupos = new JComboBox<String>();
		CBGrupos.setEnabled(false);
		CBGrupos.setModel(new DefaultComboBoxModel<String>(new String[] {"     GRUPO"}));
		CBGrupos.setFont(new Font("Agency FB", Font.PLAIN, 11));
		CBGrupos.setEditable(true);
		CBGrupos.setBounds(10, 74, 91, 41);
		POpciones.add(CBGrupos);
		
		CBEquipos = new JComboBox<String>();
		CBEquipos.setEnabled(false);
		CBEquipos.setModel(new DefaultComboBoxModel<String>(new String[] {"     EQUIPO"}));
		CBEquipos.setFont(new Font("Agency FB", Font.PLAIN, 11));
		CBEquipos.setEditable(true);
		CBEquipos.setBounds(10, 138, 91, 41);
		POpciones.add(CBEquipos);
		
		btnAtrasPO = new JButton("Atras");
		btnAtrasPO.addActionListener(this);
		btnAtrasPO.setForeground(Color.WHITE);
		btnAtrasPO.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnAtrasPO.setBounds(10, 198, 89, 41);
		POpciones.add(btnAtrasPO);
		PanelDatosUsuarios.setBackground(Color.WHITE);
		PanelDatosUsuarios.setBounds(0, 65, 582, 306);
		contentPane.add(PanelDatosUsuarios);
		PanelDatosUsuarios.setLayout(null);
		
		btnNuevoUsuario = new JButton("Nuevo");
		btnNuevoUsuario.addActionListener(this);
		btnNuevoUsuario.setForeground(Color.WHITE);
		btnNuevoUsuario.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnNuevoUsuario.setBounds(5, 55, 107, 39);
		PanelDatosUsuarios.add(btnNuevoUsuario);
		
		btnListaUsuarios = new JButton("Lista Usuarios");
		btnListaUsuarios.addActionListener(this);
		btnListaUsuarios.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnListaUsuarios.setForeground(Color.WHITE);
		btnListaUsuarios.setBounds(5, 143, 107, 39);
		PanelDatosUsuarios.add(btnListaUsuarios);
		

		tableUsuarios = new JTable();
		tableUsuariosModel = new DefaultTableModel();
		tableUsuarios.setFont(new Font("Agency FB", Font.PLAIN, 15));
		tableUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableUsuarios.setBorder(new LineBorder(new Color(0, 0, 0)));
		tableUsuarios.setModel(tableUsuariosModel);
		tableUsuarios.setBounds(124, 11, 448, 284);
		PanelDatosUsuarios.add(tableUsuarios);
		
		panelDatosUsuario = new JPanel();
		panelDatosUsuario.setBackground(Color.WHITE);
		panelDatosUsuario.setBounds(117, 0, 455, 295);
		PanelDatosUsuarios.add(panelDatosUsuario);
		panelDatosUsuario.setLayout(null);
		
		lblNombreUsuario = new JLabel("  Nombre:");
		lblNombreUsuario.setOpaque(true);
		lblNombreUsuario.setBounds(10, 30, 152, 22);
		panelDatosUsuario.add(lblNombreUsuario);
		
		lblApellidoUsuario = new JLabel("  Apellido:");
		lblApellidoUsuario.setOpaque(true);
		lblApellidoUsuario.setBounds(10, 63, 152, 22);
		panelDatosUsuario.add(lblApellidoUsuario);
		
		lblDniUsuario = new JLabel("  DNI:");
		lblDniUsuario.setOpaque(true);
		lblDniUsuario.setBounds(10, 96, 152, 22);
		panelDatosUsuario.add(lblDniUsuario);
		
		lblTelefonoUsuario = new JLabel("  Telefono:");
		lblTelefonoUsuario.setOpaque(true);
		lblTelefonoUsuario.setBounds(10, 129, 152, 22);
		panelDatosUsuario.add(lblTelefonoUsuario);
		
		lblEmailUsuario = new JLabel("  Email:");
		lblEmailUsuario.setOpaque(true);
		lblEmailUsuario.setBounds(10, 162, 152, 22);
		panelDatosUsuario.add(lblEmailUsuario);
		
		lblNickUsuario = new JLabel("  Nick:");
		lblNickUsuario.setOpaque(true);
		lblNickUsuario.setBounds(10, 195, 152, 22);
		panelDatosUsuario.add(lblNickUsuario);
		
		lblContrasea = new JLabel("  Contrase\u00F1a:");
		lblContrasea.setOpaque(true);
		lblContrasea.setBounds(276, 195, 78, 22);
		panelDatosUsuario.add(lblContrasea);
		
		btnGuardarUsuario = new JButton("GUARDAR");
		btnGuardarUsuario.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnGuardarUsuario.setBounds(356, 261, 89, 23);
		panelDatosUsuario.add(btnGuardarUsuario);
		
		btnEliminarUsuario = new JButton("ELIMINAR");
		btnEliminarUsuario.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnEliminarUsuario.setBounds(250, 261, 89, 23);
		panelDatosUsuario.add(btnEliminarUsuario);
		
		txtNombreUsuario = new JTextField();
		txtNombreUsuario.setBounds(162, 30, 283, 22);
		panelDatosUsuario.add(txtNombreUsuario);
		txtNombreUsuario.setColumns(10);
		
		txtApellidoUsuario = new JTextField();
		txtApellidoUsuario.setColumns(10);
		txtApellidoUsuario.setBounds(162, 63, 283, 22);
		panelDatosUsuario.add(txtApellidoUsuario);
		
		txtDniUsuario = new JTextField();
		txtDniUsuario.setColumns(10);
		txtDniUsuario.setBounds(162, 96, 283, 22);
		panelDatosUsuario.add(txtDniUsuario);
		
		txtTelefonoUsuario = new JTextField();
		txtTelefonoUsuario.setColumns(10);
		txtTelefonoUsuario.setBounds(162, 129, 283, 22);
		panelDatosUsuario.add(txtTelefonoUsuario);
		
		txtEmailUsuario = new JTextField();
		txtEmailUsuario.setColumns(10);
		txtEmailUsuario.setBounds(162, 162, 283, 22);
		panelDatosUsuario.add(txtEmailUsuario);
		
		txtNickUsuario = new JTextField();
		txtNickUsuario.setColumns(10);
		txtNickUsuario.setBounds(162, 195, 114, 22);
		panelDatosUsuario.add(txtNickUsuario);
		
		txtPasswordUsuario = new JTextField();
		txtPasswordUsuario.setColumns(10);
		txtPasswordUsuario.setBounds(354, 195, 91, 22);
		panelDatosUsuario.add(txtPasswordUsuario);
		
		lblTipoUsuario = new JLabel("  Tipo:");
		lblTipoUsuario.setOpaque(true);
		lblTipoUsuario.setBounds(10, 224, 152, 22);
		panelDatosUsuario.add(lblTipoUsuario);
		
		PanelTipoUsuario = new JPanel();
		PanelTipoUsuario.setBounds(161, 223, 283, 22);
		panelDatosUsuario.add(PanelTipoUsuario);
		PanelTipoUsuario.setLayout(null);
		
		rdbtnAdmin = new JRadioButton("Admin");
		rdbtnAdmin.setBounds(0, 0, 63, 22);
		PanelTipoUsuario.add(rdbtnAdmin);
		
		rdbtnUsuario = new JRadioButton("Usuario");
		rdbtnUsuario.setBounds(86, 0, 63, 22);
		PanelTipoUsuario.add(rdbtnUsuario);
		
		rdbtnObservador = new JRadioButton("Observador");
		rdbtnObservador.setBounds(186, 0, 91, 22);
		PanelTipoUsuario.add(rdbtnObservador);
		
		btnAtras = new JButton("Atras");
		btnAtras.setForeground(Color.WHITE);
		btnAtras.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnAtras.addActionListener(this);
		btnAtras.setBounds(5, 239, 107, 39);
		PanelDatosUsuarios.add(btnAtras);
		PanelDatosLigas.setLayout(null);
		PanelDatosLigas.setBackground(Color.WHITE);
		PanelDatosLigas.setBounds(127, 79, 456, 286);
		contentPane.add(PanelDatosLigas);
		
		lblNombreLiga = new JLabel("  Liga:");
		lblNombreLiga.setOpaque(true);
		lblNombreLiga.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblNombreLiga.setBounds(10, 46, 152, 22);
		PanelDatosLigas.add(lblNombreLiga);
		
		lblCodigoLiga = new JLabel("  Codigo:");
		lblCodigoLiga.setOpaque(true);
		lblCodigoLiga.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblCodigoLiga.setBounds(10, 11, 152, 22);
		PanelDatosLigas.add(lblCodigoLiga);
		
		lblGrupoLiga = new JLabel("  Grupo:");
		lblGrupoLiga.setOpaque(true);
		lblGrupoLiga.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblGrupoLiga.setBounds(10, 112, 152, 22);
		PanelDatosLigas.add(lblGrupoLiga);
		
		lblNMaxEquipos = new JLabel("  N\u00BA Max de Equipos:");
		lblNMaxEquipos.setOpaque(true);
		lblNMaxEquipos.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblNMaxEquipos.setBounds(10, 145, 152, 22);
		PanelDatosLigas.add(lblNMaxEquipos);
		
		txtCodLiga = new JTextField();
		txtCodLiga.setColumns(10);
		txtCodLiga.setBounds(162, 11, 284, 22);
		PanelDatosLigas.add(txtCodLiga);
		
		txtLiga = new JTextField();
		txtLiga.setColumns(10);
		txtLiga.setBounds(162, 46, 284, 22);
		PanelDatosLigas.add(txtLiga);
		
		txtGrupoLiga = new JTextField();
		txtGrupoLiga.setColumns(10);
		txtGrupoLiga.setBounds(162, 112, 284, 22);
		PanelDatosLigas.add(txtGrupoLiga);
		
		btnGuardarLiga = new JButton("GUARDAR");
		btnGuardarLiga.addActionListener(this);
		btnGuardarLiga.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnGuardarLiga.setBounds(357, 252, 89, 23);
		PanelDatosLigas.add(btnGuardarLiga);
		
		btnEliminarLiga = new JButton("ELIMINAR");
		btnEliminarLiga.addActionListener(this);
		btnEliminarLiga.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnEliminarLiga.setBounds(262, 252, 89, 23);
		PanelDatosLigas.add(btnEliminarLiga);
		
		txtNMaxEquipos = new JTextField();
		txtNMaxEquipos.setColumns(10);
		txtNMaxEquipos.setBounds(162, 145, 284, 22);
		PanelDatosLigas.add(txtNMaxEquipos);
		
		txtCatLiga = new JTextField();
		txtCatLiga.setColumns(10);
		txtCatLiga.setBounds(162, 79, 284, 22);
		PanelDatosLigas.add(txtCatLiga);
		
		lblCategoriaLiga = new JLabel("  Categoria:");
		lblCategoriaLiga.setOpaque(true);
		lblCategoriaLiga.setFont(new Font("Agency FB", Font.PLAIN, 15));
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
		lblNombreEquipo.setBounds(10, 11, 152, 22);
		PanelDatosEquipo.add(lblNombreEquipo);
		
		lblCodigo = new JLabel("  Codigo:");
		lblCodigo.setOpaque(true);
		lblCodigo.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblCodigo.setBounds(10, 44, 152, 22);
		PanelDatosEquipo.add(lblCodigo);
		
		lblMunicipio = new JLabel("  Municipio:");
		lblMunicipio.setOpaque(true);
		lblMunicipio.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblMunicipio.setBounds(10, 77, 152, 22);
		PanelDatosEquipo.add(lblMunicipio);
		
		lblTerrenoDeJuego = new JLabel("  Terreno de Juego:");
		lblTerrenoDeJuego.setOpaque(true);
		lblTerrenoDeJuego.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblTerrenoDeJuego.setBounds(10, 110, 152, 22);
		PanelDatosEquipo.add(lblTerrenoDeJuego);
		
		lblTelefono = new JLabel("  Telefono:");
		lblTelefono.setOpaque(true);
		lblTelefono.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblTelefono.setBounds(10, 143, 152, 22);
		PanelDatosEquipo.add(lblTelefono);
		
		lblEmail = new JLabel("  Email:");
		lblEmail.setOpaque(true);
		lblEmail.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblEmail.setBounds(10, 176, 152, 22);
		PanelDatosEquipo.add(lblEmail);
		
		txtNombreEquipo = new JTextField();
		txtNombreEquipo.setColumns(10);
		txtNombreEquipo.setBounds(162, 11, 284, 22);
		PanelDatosEquipo.add(txtNombreEquipo);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(162, 44, 284, 22);
		PanelDatosEquipo.add(txtCodigo);
		
		txtMunicipio = new JTextField();
		txtMunicipio.setColumns(10);
		txtMunicipio.setBounds(162, 77, 284, 22);
		PanelDatosEquipo.add(txtMunicipio);
		
		txtTerrenoDeJuego = new JTextField();
		txtTerrenoDeJuego.setColumns(10);
		txtTerrenoDeJuego.setBounds(162, 110, 284, 22);
		PanelDatosEquipo.add(txtTerrenoDeJuego);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(162, 143, 284, 22);
		PanelDatosEquipo.add(txtEmail);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(162, 176, 284, 22);
		PanelDatosEquipo.add(txtTelefono);
		
		btnGuardarEquipo = new JButton("GUARDAR");
		btnGuardarEquipo.addActionListener(this);
		btnGuardarEquipo.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnGuardarEquipo.setBounds(357, 252, 89, 23);
		PanelDatosEquipo.add(btnGuardarEquipo);
		
		btnEliminarEquipo = new JButton("ELIMINAR");
		btnEliminarEquipo.addActionListener(this);
		btnEliminarEquipo.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnEliminarEquipo.setBounds(262, 252, 89, 23);
		PanelDatosEquipo.add(btnEliminarEquipo);
		
		lblLiga = new JLabel("  Liga:");
		lblLiga.setOpaque(true);
		lblLiga.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblLiga.setBounds(10, 209, 152, 22);
		PanelDatosEquipo.add(lblLiga);
		
		CBLigas = new JComboBox<String>();
		CBLigas.setOpaque(false);
		CBLigas.setBounds(162, 209, 284, 22);
		PanelDatosEquipo.add(CBLigas);
		CBLigas.setModel(ModelLigas);
		ModelEquipoJugador = new DefaultComboBoxModel<>();
		
		PanelDatosPartidos = new JPanel();
		PanelDatosPartidos.setVisible(false);
		
		PanelDatosJugador = new JPanel();
		PanelDatosJugador.setVisible(false);
		
		PanelDatosJugador.setBounds(127, 79, 456, 286);
		contentPane.add(PanelDatosJugador);
		PanelDatosJugador.setBackground(new Color(255, 255, 255));
		PanelDatosJugador.setLayout(null);
		
		lblNombre = new JLabel("  Nombre: ");
		lblNombre.setOpaque(true);
		lblNombre.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblNombre.setBounds(10, 11, 152, 22);
		PanelDatosJugador.add(lblNombre);
		
		lblApellido = new JLabel("  Apellido: ");
		lblApellido.setOpaque(true);
		lblApellido.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblApellido.setBounds(10, 44, 152, 22);
		PanelDatosJugador.add(lblApellido);
		
		lblDni = new JLabel("  DNI:");
		lblDni.setOpaque(true);
		lblDni.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblDni.setBounds(10, 77, 152, 22);
		PanelDatosJugador.add(lblDni);
		
		lblNacionalidad = new JLabel("  Nacionalidad:");
		lblNacionalidad.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblNacionalidad.setOpaque(true);
		lblNacionalidad.setBounds(10, 110, 152, 22);
		PanelDatosJugador.add(lblNacionalidad);
		
		lblFechaDeNacimiento = new JLabel("  Fecha de nacimiento: ");
		lblFechaDeNacimiento.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblFechaDeNacimiento.setOpaque(true);
		lblFechaDeNacimiento.setBounds(10, 143, 152, 22);
		PanelDatosJugador.add(lblFechaDeNacimiento);
		
		lblPeso = new JLabel("  Peso:");
		lblPeso.setOpaque(true);
		lblPeso.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblPeso.setBounds(294, 176, 65, 22);
		PanelDatosJugador.add(lblPeso);
		
		lblEdad = new JLabel("  Edad:");
		lblEdad.setOpaque(true);
		lblEdad.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblEdad.setBounds(294, 143, 65, 22);
		PanelDatosJugador.add(lblEdad);
		
		lblAltura = new JLabel("  Altura: ");
		lblAltura.setOpaque(true);
		lblAltura.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblAltura.setBounds(10, 176, 152, 22);
		PanelDatosJugador.add(lblAltura);
		
		lblEquipo = new JLabel("  Equipo:");
		lblEquipo.setOpaque(true);
		lblEquipo.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblEquipo.setBounds(10, 209, 152, 22);
		PanelDatosJugador.add(lblEquipo);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(162, 11, 284, 22);
		PanelDatosJugador.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(162, 44, 284, 22);
		PanelDatosJugador.add(txtApellido);
		
		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(162, 77, 284, 22);
		PanelDatosJugador.add(txtDNI);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setColumns(10);
		txtNacionalidad.setBounds(162, 110, 284, 22);
		PanelDatosJugador.add(txtNacionalidad);
		
		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBounds(354, 143, 92, 22);
		PanelDatosJugador.add(txtEdad);
		
		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(162, 176, 134, 22);
		PanelDatosJugador.add(txtAltura);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(354, 176, 92, 22);
		PanelDatosJugador.add(txtPeso);
		txtPeso.setColumns(10);
		
		PanelFechaNacimiento = new JPanel();
		PanelFechaNacimiento.setBounds(162, 143, 134, 22);
		PanelDatosJugador.add(PanelFechaNacimiento);
		PanelFechaNacimiento.setLayout(null);
		
		txtAno = new JTextField();
		txtAno.setColumns(10);
		txtAno.setBounds(99, 0, 35, 22);
		PanelFechaNacimiento.add(txtAno);
		
		txtMes = new JTextField();
		txtMes.setColumns(10);
		txtMes.setBounds(50, 1, 35, 21);
		PanelFechaNacimiento.add(txtMes);
		
		txtDia = new JTextField();
		txtDia.setColumns(10);
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
		btnGuardar.setBounds(357, 252, 89, 23);
		PanelDatosJugador.add(btnGuardar);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnEliminar.setBounds(262, 252, 89, 23);
		PanelDatosJugador.add(btnEliminar);
		
		CBEquipoJugador = new JComboBox<String>();
		CBEquipoJugador.setModel(ModelEquipoJugador);
		CBEquipoJugador.setEditable(true);
		CBEquipoJugador.setBounds(162, 209, 284, 22);
		PanelDatosJugador.add(CBEquipoJugador);
		
		btnDatosEstadisticos = new JButton("DATOS ESTADISTICOS");
		btnDatosEstadisticos.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnDatosEstadisticos.setBounds(117, 252, 134, 23);
		PanelDatosJugador.add(btnDatosEstadisticos);
		PanelDatosPartidos.setLayout(null);
		PanelDatosPartidos.setBackground(Color.WHITE);
		PanelDatosPartidos.setBounds(127, 79, 456, 286);
		contentPane.add(PanelDatosPartidos);
		
		lblCategoria = new JLabel("  Categoria:");
		lblCategoria.setOpaque(true);
		lblCategoria.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblCategoria.setBounds(10, 44, 152, 22);
		PanelDatosPartidos.add(lblCategoria);
		
		lblCodPartido = new JLabel("  Codigo:");
		lblCodPartido.setOpaque(true);
		lblCodPartido.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblCodPartido.setBounds(10, 11, 152, 22);
		PanelDatosPartidos.add(lblCodPartido);
		
		lblGrupo = new JLabel("  Grupo:");
		lblGrupo.setOpaque(true);
		lblGrupo.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblGrupo.setBounds(10, 77, 152, 22);
		PanelDatosPartidos.add(lblGrupo);
		
		lblFecha = new JLabel("  Fecha:");
		lblFecha.setOpaque(true);
		lblFecha.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblFecha.setBounds(10, 110, 152, 22);
		PanelDatosPartidos.add(lblFecha);
		
		lblResultado = new JLabel("  Resultado:");
		lblResultado.setOpaque(true);
		lblResultado.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblResultado.setBounds(10, 143, 152, 22);
		PanelDatosPartidos.add(lblResultado);
		
		lblEquipolocal = new JLabel("  Equipo Local:");
		lblEquipolocal.setOpaque(true);
		lblEquipolocal.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblEquipolocal.setBounds(10, 176, 152, 22);
		PanelDatosPartidos.add(lblEquipolocal);
		
		txtCodPartido = new JTextField();
		txtCodPartido.setColumns(10);
		txtCodPartido.setBounds(162, 11, 284, 22);
		PanelDatosPartidos.add(txtCodPartido);
		
		txtCategoria = new JTextField();
		txtCategoria.setColumns(10);
		txtCategoria.setBounds(162, 44, 284, 22);
		PanelDatosPartidos.add(txtCategoria);
		
		txtGrupo = new JTextField();
		txtGrupo.setColumns(10);
		txtGrupo.setBounds(162, 77, 284, 22);
		PanelDatosPartidos.add(txtGrupo);
		
		txtResulVisitante = new JTextField();
		txtResulVisitante.setColumns(10);
		txtResulVisitante.setBounds(312, 143, 134, 22);
		PanelDatosPartidos.add(txtResulVisitante);
		
		txtResulLocal = new JTextField();
		txtResulLocal.setColumns(10);
		txtResulLocal.setBounds(162, 144, 134, 22);
		PanelDatosPartidos.add(txtResulLocal);
		
		btnGuardarPartido = new JButton("GUARDAR");
		btnGuardarPartido.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnGuardarPartido.setBounds(357, 252, 89, 23);
		PanelDatosPartidos.add(btnGuardarPartido);
		
		btnEliminarPartido = new JButton("ELIMINAR");
		btnEliminarPartido.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnEliminarPartido.setBounds(262, 252, 89, 23);
		PanelDatosPartidos.add(btnEliminarPartido);
		
		FechaPartido = new JPanel();
		FechaPartido.setLayout(null);
		FechaPartido.setBounds(162, 110, 134, 22);
		PanelDatosPartidos.add(FechaPartido);
		
		txtAnoPartido = new JTextField();
		txtAnoPartido.setColumns(10);
		txtAnoPartido.setBounds(99, 0, 35, 22);
		FechaPartido.add(txtAnoPartido);
		
		txtMesParido = new JTextField();
		txtMesParido.setColumns(10);
		txtMesParido.setBounds(50, 1, 35, 21);
		FechaPartido.add(txtMesParido);
		
		txtDiaPartido = new JTextField();
		txtDiaPartido.setColumns(10);
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
		txtHora.setBounds(312, 111, 58, 21);
		PanelDatosPartidos.add(txtHora);
		
		lbl3 = new JLabel(":");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setBounds(373, 114, 14, 14);
		PanelDatosPartidos.add(lbl3);
		
		txtMinutos = new JTextField();
		txtMinutos.setColumns(10);
		txtMinutos.setBounds(388, 111, 58, 21);
		PanelDatosPartidos.add(txtMinutos);
		
		lblFechaPartido = new JLabel("-");
		lblFechaPartido.setOpaque(true);
		lblFechaPartido.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaPartido.setBounds(162, 110, 284, 22);
		PanelDatosPartidos.add(lblFechaPartido);
		
		lbl4 = new JLabel("-");
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setBounds(293, 143, 21, 22);
		PanelDatosPartidos.add(lbl4);
		
		lblResultadoPartido = new JLabel("");
		lblResultadoPartido.setOpaque(true);
		lblResultadoPartido.setBounds(162, 143, 284, 22);
		PanelDatosPartidos.add(lblResultadoPartido);
		
		lblEquipovisitante = new JLabel("  Equipo Visitante:");
		lblEquipovisitante.setOpaque(true);
		lblEquipovisitante.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblEquipovisitante.setBounds(10, 209, 152, 22);
		PanelDatosPartidos.add(lblEquipovisitante);
		
		CBEquipoLocal = new JComboBox<String>();
		CBEquipoLocal.setEditable(true);
		CBEquipoLocal.setBounds(162, 176, 284, 22);
		PanelDatosPartidos.add(CBEquipoLocal);
		
		CBEquipoVisitante = new JComboBox<String>();
		CBEquipoVisitante.setEditable(true);
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
		/*Configuración Administrador
		 * OPCION CREAR LIGA*/
		else if((JButton)o == btnCrearLigas) {
			PanelBSuperAdmin.setVisible(true);
			PanelBAñadirAdmin.setVisible(true);
			PanelInformación.setVisible(false);
			PanelDatosUsuarios.setVisible(false);
			PanelDatosLigas.setVisible(true);
			PanelDatosEquipo.setVisible(false);
			PanelDatosJugador.setVisible(false);
			PanelDatosPartidos.setVisible(false);
		}
		else if ((JButton)o == btnGuardarLiga) {
			añadirLiga();
		}
		else if ((JButton)o == btnEliminarLiga) {
			eliminarLiga();
		}
		/*OPCION CREAR EQUIPOS*/
		else if((JButton)o == btnAadirEquipo) {
			PanelBSuperAdmin.setVisible(true);
			PanelBAñadirAdmin.setVisible(true);
			PanelInformación.setVisible(false);
			PanelDatosUsuarios.setVisible(false);
			PanelDatosLigas.setVisible(false);
			PanelDatosEquipo.setVisible(true);
			PanelDatosJugador.setVisible(false);
			PanelDatosPartidos.setVisible(false);
			cargarCBLigas();
		}
		else if((JButton)o == btnGuardarEquipo) {
			añadirEquipo();
			if(ListaEquipos.size()>0) {
				btnAadirPartido.setEnabled(true);
			}
		}
		else if((JButton)o == btnEliminarEquipo) {
			EliminarEquipo();
			if(ListaEquipos.size()>0) {
				btnAadirPartido.setEnabled(true);
			}
			else {
				btnAadirPartido.setEnabled(false);
			}
		}
		/*OPCION CREAR JUGADORES*/
		else if((JButton)o == btnAadirJugador) {
			PanelBSuperAdmin.setVisible(true);
			PanelBAñadirAdmin.setVisible(true);
			PanelInformación.setVisible(false);
			PanelDatosUsuarios.setVisible(false);
			PanelDatosLigas.setVisible(false);
			PanelDatosEquipo.setVisible(false);
			PanelDatosJugador.setVisible(true);
			PanelDatosPartidos.setVisible(false);
			cargarCBEquiposJugador();
		}
		else if((JButton)o == btnGuardar) {
			añadirJugador();
			
		}
		else if((JButton)o == btnEliminar) {
			eliminarJugador();
		}
		/*OPCIONES CREAR USUARIOS*/
		else if(((JButton)o == btnConfiguracion) || ((JButton)o == btnListaUsuarios)) {
			PanelBSuperAdmin.setVisible(true);
			PanelBAñadirAdmin.setVisible(false);
			PanelInformación.setVisible(false);
			PanelDatosUsuarios.setVisible(true);
			tableUsuarios.setVisible(true);
			panelDatosUsuario.setVisible(false);
			PanelDatosLigas.setVisible(false);
			PanelDatosEquipo.setVisible(false);
			PanelDatosJugador.setVisible(false);
			PanelDatosPartidos.setVisible(false);
			cargarTablaUsuarios();
		}
		else if((JButton)o == btnNuevoUsuario) {
			PanelBSuperAdmin.setVisible(true);
			PanelBAñadirAdmin.setVisible(false);
			PanelInformación.setVisible(false);
			PanelDatosUsuarios.setVisible(true);
			tableUsuarios.setVisible(false);
			panelDatosUsuario.setVisible(true);
			PanelDatosLigas.setVisible(false);
			PanelDatosEquipo.setVisible(false);
			PanelDatosJugador.setVisible(false);
			PanelDatosPartidos.setVisible(false);
		}
		else if(((JButton)o == btnAtrasPO) || ((JButton)o == btnAtras)) {
			PanelBSuperAdmin.setVisible(true);
			PanelBAñadirAdmin.setVisible(true);
			PanelInformación.setVisible(false);
			PanelDatosUsuarios.setVisible(false);
			PanelDatosLigas.setVisible(false);
			PanelDatosEquipo.setVisible(false);
			PanelDatosJugador.setVisible(false);
			PanelDatosPartidos.setVisible(false);
		}
		
		/*Configuración de tablas para visualización*/
		else if((JButton)o == btnJugadores) {
			PanelBSuperAdmin.setVisible(true);
			PanelBAñadirAdmin.setVisible(false);
			PanelSuperiorUO.setVisible(false);
			PanelInformación.setVisible(true);
				PanelAplicaciónVacia.setVisible(false);
				PanelInicioAplicación.setVisible(false);
				POpciones.setVisible(true);
				PanelClasificacion.setVisible(false);
				PanelMuestraEquipos.setVisible(false);
				PanelLigas.setVisible(false);
				if(ListaJugador.size()==0) {
					PanelAplicaciónVacia.setVisible(true);
				}
				else {
					PanelMuestraJugadores.setVisible(true);
					cargarTablaJugadores();
				}
			PanelDatosUsuarios.setVisible(false);
			PanelDatosLigas.setVisible(false);
			PanelDatosEquipo.setVisible(false);
			PanelDatosJugador.setVisible(false);
			PanelDatosPartidos.setVisible(false);
		}
		/*VER LISTA EQUIPOS*/
		else if(((JButton)o == btnEquipos)) {
			PanelBSuperAdmin.setVisible(true);
			PanelBAñadirAdmin.setVisible(false);
			PanelSuperiorUO.setVisible(false);
			PanelInformación.setVisible(true);
				PanelAplicaciónVacia.setVisible(false);
				PanelInicioAplicación.setVisible(false);
				POpciones.setVisible(true);
				PanelMuestraJugadores.setVisible(false);
				PanelClasificacion.setVisible(false);
				PanelLigas.setVisible(false);
				if(ListaEquipos.size()==0) {
					PanelAplicaciónVacia.setVisible(true);
					PanelMuestraEquipos.setVisible(false);
				}
				else {
					PanelMuestraEquipos.setVisible(true);
					cargarTablaEquipos();
				}
			PanelDatosUsuarios.setVisible(false);
			PanelDatosLigas.setVisible(false);
			PanelDatosEquipo.setVisible(false);
			PanelDatosJugador.setVisible(false);
			PanelDatosPartidos.setVisible(false);
		}
		else if((JButton)o == btnPartidos) {
			PanelBSuperAdmin.setVisible(true);
			PanelBAñadirAdmin.setVisible(false);
			PanelSuperiorUO.setVisible(false);
			PanelInformación.setVisible(true);
				PanelAplicaciónVacia.setVisible(false);
				PanelInicioAplicación.setVisible(false);
				POpciones.setVisible(true);
				PanelMuestraJugadores.setVisible(false);
				PanelClasificacion.setVisible(false);
				PanelMuestraEquipos.setVisible(false);
				PanelLigas.setVisible(false);
				if(ListaPartidos.size()==0) {
					PanelAplicaciónVacia.setVisible(true);
					PanelMuestraPartidos.setVisible(false);
				}
				else {
					PanelMuestraPartidos.setVisible(true);
					cargarTablaPartidos();
				}
			PanelDatosUsuarios.setVisible(false);
			PanelDatosLigas.setVisible(false);
			PanelDatosEquipo.setVisible(false);
			PanelDatosJugador.setVisible(false);
			PanelDatosPartidos.setVisible(false);
		}
		else if((JButton)o == btnLiga) {
			PanelBSuperAdmin.setVisible(true);
			PanelBAñadirAdmin.setVisible(false);
			PanelSuperiorUO.setVisible(false);
			PanelInformación.setVisible(true);
				PanelAplicaciónVacia.setVisible(false);
				PanelInicioAplicación.setVisible(false);
				POpciones.setVisible(true);
				PanelMuestraJugadores.setVisible(false);
				PanelClasificacion.setVisible(false);
				PanelMuestraEquipos.setVisible(false);
				PanelLigas.setVisible(true);
			PanelDatosUsuarios.setVisible(false);
			PanelDatosLigas.setVisible(false);
			PanelDatosEquipo.setVisible(false);
			PanelDatosJugador.setVisible(false);
			PanelDatosPartidos.setVisible(false);
			cargarTablaLigas();
		}
		/*Visualización desde user u observador*/
		/*VISUALIZAR EQUIPOS*/
		else if((JButton)o == btnVerJugadores) {
			PanelBSuperAdmin.setVisible(false);
			PanelBAñadirAdmin.setVisible(false);
			PanelSuperiorUO.setVisible(true);
			PanelInformación.setVisible(true);
				PanelAplicaciónVacia.setVisible(false);
				PanelInicioAplicación.setVisible(false);
				POpciones.setVisible(true);
				PanelMuestraJugadores.setVisible(false);
				PanelClasificacion.setVisible(false);
				PanelLigas.setVisible(false);
				if(ListaEquipos.size()==0) {
					PanelAplicaciónVacia.setVisible(true);
					PanelMuestraEquipos.setVisible(false);
				}
				else {
					PanelMuestraEquipos.setVisible(true);
					cargarTablaEquipos();
				}
			PanelDatosUsuarios.setVisible(false);
			PanelDatosLigas.setVisible(false);
			PanelDatosEquipo.setVisible(false);
			PanelDatosJugador.setVisible(false);
			PanelDatosPartidos.setVisible(false);
		}
		/*VISUALIZAR PARTIDOS*/
		else if((JButton)o == btnVerPartidos) {
			PanelBSuperAdmin.setVisible(false);
			PanelBAñadirAdmin.setVisible(false);
			PanelSuperiorUO.setVisible(true);
			PanelInformación.setVisible(true);
				PanelAplicaciónVacia.setVisible(false);
				PanelInicioAplicación.setVisible(false);
				POpciones.setVisible(true);
				PanelMuestraJugadores.setVisible(false);
				PanelClasificacion.setVisible(false);
				PanelMuestraEquipos.setVisible(false);
				PanelLigas.setVisible(false);
				if(ListaPartidos.size()==0) {
					PanelAplicaciónVacia.setVisible(true);
					PanelMuestraPartidos.setVisible(false);
				}
				else {
					PanelMuestraPartidos.setVisible(true);
					cargarTablaPartidos();
				}
			PanelDatosUsuarios.setVisible(false);
			PanelDatosLigas.setVisible(false);
			PanelDatosEquipo.setVisible(false);
			PanelDatosJugador.setVisible(false);
			PanelDatosPartidos.setVisible(false);
		}
		/*VISUALIZAR CLASIFICACIÓN*/
		
	
	}




/*------------------------------- CONFIGURACIÓN INICIO APLICACIÓN -----------------------------------------------*/	

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


	/*Comprueba de que tipo es el usuario que esta iniciando
	 * sesion y prepara la aplicacion para el*/
	private void IniciarSesionSegunTipo() {
		
		if(txtUsuario.getText().equals("")) {
			
			iniciarParaObservador();
			usuarioLogado = "Observador";
		}
		else {
			Cliente cli = new Cliente();
			cli.setNick(txtUsuario.getText());
			cli.setPassword(passwordField.getText());
			usuarioLogado = comprobarTipo(cli);
			if(usuarioLogado.equals("Admin")) {
				iniciarParaAdmin();
			}
			else if(usuarioLogado.equals("Usuario")) {
				iniciarParaUsuario();
			}
			else if (usuarioLogado.equals("Observador")){
				iniciarParaObservador();
			}
		else {
			lblError.setVisible(true);
			}
		}
		
		
	}

	
	/*Metodo que realiza la configuración necesaria al inicio 
	 * de la aplicación para que se vea 
	 * la personalizacion para el administrador*/
	private void iniciarParaAdmin() {
		PanelLogin.setVisible(false);
		configurarColoresAdmin();
		PanelBSuperAdmin.setVisible(true);
		PanelBAñadirAdmin.setVisible(true);
		if(ListaEquipos.size()<2) {
			btnAadirPartido.setEnabled(false);
		}
		PanelSuperiorUO.setVisible(false);
		PanelInformación.setVisible(true);
			PanelInicioAplicación.setVisible(true);
			POpciones.setVisible(false);
			PanelAplicaciónVacia.setVisible(false);
			PanelClasificacion.setVisible(false);
			PanelMuestraEquipos.setVisible(false);
			PanelMuestraJugadores.setVisible(false);
			PanelMuestraPartidos.setVisible(false);
			PanelLigas.setVisible(false);
		PanelDatosUsuarios.setVisible(false);
		PanelDatosLigas.setVisible(false);
		PanelDatosEquipo.setVisible(false);
		PanelDatosJugador.setVisible(false);
		PanelDatosPartidos.setVisible(false);
		
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
			btnAtrasPO.setVisible(false);
			PanelAplicaciónVacia.setVisible(false);
			PanelClasificacion.setVisible(false);
			PanelMuestraEquipos.setVisible(false);
			PanelMuestraJugadores.setVisible(false);
			PanelMuestraPartidos.setVisible(false);
			PanelEstadistica.setVisible(false);
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
		PanelLogin.setVisible(false);
		configurarColoresUsuario();
		lblTipo.setText("Usuario");
		PanelSuperiorUO.setVisible(true);
		PanelInformación.setVisible(true);
			PanelInicioAplicación.setVisible(true);
			POpciones.setVisible(true);
			btnAtrasPO.setVisible(false);
			PanelAplicaciónVacia.setVisible(false);
			PanelClasificacion.setVisible(false);
			PanelMuestraEquipos.setVisible(false);
			PanelMuestraJugadores.setVisible(false);
			PanelMuestraPartidos.setVisible(false);
			PanelEstadistica.setVisible(false);
		PanelBAñadirAdmin.setVisible(false);
		PanelBSuperAdmin.setVisible(false);
		PanelDatosUsuarios.setVisible(false);
		PanelDatosLigas.setVisible(false);
		PanelDatosEquipo.setVisible(false);
		PanelDatosJugador.setVisible(false);
		PanelDatosPartidos.setVisible(false);
	}
	
	
	/*Metodo encargado de configurar los colores de los objetos
	 * (botones,paneles,labels, etc...) para el cliente de tipo 
	 * ADMINISTRADOR*/
	private void configurarColoresAdmin() {
		/*Panel superior*/
		btnCerrarSesion.setBackground(new Color(0,0,128));
		btnJugadores.setBackground(new Color(65, 105, 225));
		btnEquipos.setBackground(new Color(65, 105, 225));
		btnPartidos.setBackground(new Color(65, 105, 225));
		btnLiga.setBackground(new Color(65, 105, 225));
		/*PanelBAñadir*/
		btnAadirJugador.setBackground(new Color(65, 105, 225));
		btnAadirEquipo.setBackground(new Color(65, 105, 225));
		btnAadirPartido.setBackground(new Color(65, 105, 225));
		btnCrearLigas.setBackground(new Color(65, 105, 225));
		btnConfiguracion.setBackground(new Color(65, 105, 225));
		/*PanelDatosUsuario*/
		btnNuevoUsuario.setBackground(new Color(65, 105, 225));
		btnListaUsuarios.setBackground(new Color(65, 105, 225));
		btnAtras.setBackground(new Color(65, 105, 225));
		btnGuardarUsuario.setBackground(Color.GREEN);
		btnEliminarUsuario.setBackground(Color.RED);
		lblNombreUsuario.setBackground(new Color(135,206,235));
		lblApellidoUsuario.setBackground(new Color(135,206,235));
		lblDniUsuario.setBackground(new Color(135,206,235));
		lblTelefonoUsuario.setBackground(new Color(135,206,235));
		lblEmailUsuario.setBackground(new Color(135,206,235));
		lblNickUsuario.setBackground(new Color(135,206,235));
		lblContrasea.setBackground(new Color(135,206,235));
		lblTipoUsuario.setBackground(new Color(135,206,235));
		txtNombreUsuario.setBackground(new Color(175,238,238));
		txtApellidoUsuario.setBackground(new Color(175,238,238));
		txtDniUsuario.setBackground(new Color(175,238,238));
		txtTelefonoUsuario.setBackground(new Color(175,238,238));
		txtEmailUsuario.setBackground(new Color(175,238,238));
		txtNickUsuario.setBackground(new Color(175,238,238));
		txtPasswordUsuario.setBackground(new Color(175,238,238));
		PanelTipoUsuario.setBackground(new Color(175,238,238));
		rdbtnAdmin.setBackground(new Color(175,238,238));
		rdbtnObservador.setBackground(new Color(175,238,238));
		rdbtnUsuario.setBackground(new Color(175,238,238));
		/*PanelDatosLiga*/
		btnGuardarLiga.setBackground(Color.GREEN);
		btnEliminarLiga.setBackground(Color.RED);
		lblNombreLiga.setBackground(new Color(135,206,235));
		lblCodigoLiga.setBackground(new Color(135,206,235));
		lblGrupoLiga.setBackground(new Color(135,206,235));
		lblNMaxEquipos.setBackground(new Color(135,206,235));
		lblCategoriaLiga.setBackground(new Color(135,206,235));
		txtCodLiga.setBackground(new Color(175,238,238));
		txtLiga.setBackground(new Color(175,238,238));
		txtGrupoLiga.setBackground(new Color(175,238,238));
		txtCatLiga.setBackground(new Color(175,238,238));
		txtNMaxEquipos.setBackground(new Color(175,238,238));
		txtCatLiga.setBackground(new Color(175,238,238));
		/*PanelDatosEquipo*/
		lblNombreEquipo.setBackground(new Color(135,206,235));
		lblCodigo.setBackground(new Color(135,206,235));
		lblMunicipio.setBackground(new Color(135,206,235));
		lblTerrenoDeJuego.setBackground(new Color(135,206,235));
		lblTelefono.setBackground(new Color(135,206,235));
		lblEmail.setBackground(new Color(135,206,235));
		lblLiga.setBackground(new Color(135,206,235));
		txtNombreEquipo.setBackground(new Color(175,238,238));
		txtCodigo.setBackground(new Color(175,238,238));
		txtMunicipio.setBackground(new Color(175,238,238));
		txtTerrenoDeJuego.setBackground(new Color(175,238,238));
		txtEmail.setBackground(new Color(175,238,238));
		txtTelefono.setBackground(new Color(175,238,238));
		CBLigas.setBackground(new Color(175,238,238));
		btnGuardarEquipo.setBackground(Color.GREEN);
		btnEliminarEquipo.setBackground(Color.RED);
		/*PanelDatosJugador*/
		btnGuardar.setBackground(Color.GREEN);
		btnEliminar.setBackground(Color.RED);
		btnDatosEstadisticos.setBackground(new Color(65, 105, 225));
		lblNombre.setBackground(new Color(135,206,235));
		lblApellido.setBackground(new Color(135,206,235));
		lblDni.setBackground(new Color(135,206,235));
		lblNacionalidad.setBackground(new Color(135,206,235));
		lblFechaDeNacimiento.setBackground(new Color(135,206,235));
		lblPeso.setBackground(new Color(135,206,235));
		lblAltura.setBackground(new Color(135,206,235));
		lblEdad.setBackground(new Color(135,206,235));
		lblEquipo.setBackground(new Color(135,206,235));
		txtNombre.setBackground(new Color(175,238,238));
		txtApellido.setBackground(new Color(175,238,238));
		txtDNI.setBackground(new Color(175,238,238));
		txtNacionalidad.setBackground(new Color(175,238,238));
		txtEdad.setBackground(new Color(175,238,238));
		txtAltura.setBackground(new Color(175,238,238));
		txtPeso.setBackground(new Color(175,238,238));
		CBEquipoJugador.setBackground(new Color(175,238,238));
		PanelFechaNacimiento.setBackground(new Color(175,238,238));
		txtAno.setBackground(new Color(175,238,238));
		txtMes.setBackground(new Color(175,238,238));
		txtDia.setBackground(new Color(175,238,238));
		label_1.setBackground(new Color(175,238,238));
		label_2.setBackground(new Color(175,238,238));
		/*PanelDatosPartidos*/
		lblCategoria.setBackground(new Color(135,206,235));
		lblGrupo.setBackground(new Color(135,206,235));
		lblCodPartido.setBackground(new Color(135,206,235));
		lblFecha.setBackground(new Color(135,206,235));
		lblResultado.setBackground(new Color(135,206,235));;
		lblEquipolocal.setBackground(new Color(135,206,235));
		lblEquipovisitante.setBackground(new Color(135,206,235));
		lblResultadoPartido.setBackground(new Color(175,238,238));
		txtCategoria.setBackground(new Color(175,238,238));
		txtGrupo.setBackground(new Color(175,238,238));
		txtCodPartido.setBackground(new Color(175,238,238));
		txtResulVisitante.setBackground(new Color(175,238,238));
		txtResulLocal.setBackground(new Color(175,238,238));
		lblFechaPartido.setBackground(new Color(175,238,238));
		lbl3.setBackground(new Color(175,238,238));
		lbl4.setBackground(new Color(175,238,238));
		txtHora.setBackground(new Color(175,238,238));
		txtMinutos.setBackground(new Color(175,238,238));
		CBEquipoVisitante.setBackground(new Color(175,238,238));
		CBEquipoLocal.setBackground(new Color(175,238,238));
		FechaPartido.setBackground(new Color(175,238,238));
		txtAnoPartido.setBackground(new Color(175,238,238));
		txtMesParido.setBackground(new Color(175,238,238));
		txtDiaPartido.setBackground(new Color(175,238,238));
		lbl1.setBackground(new Color(175,238,238));
		lbl2.setBackground(new Color(175,238,238));
		btnGuardarPartido.setBackground(Color.GREEN);
		btnEliminarEquipo.setBackground(Color.RED);
		/*Panel Información CBOpciones*/
		CBCategorias.setBackground(new Color(65, 105, 225));
		CBGrupos.setBackground(new Color(65, 105, 225));
		CBEquipos.setBackground(new Color(65, 105, 225));
		btnAtrasPO.setBackground(new Color(65, 105, 225));
		
	}


	/*Metodo encargado de configurar los colores de los objetos
	 * (botones,paneles,labels, etc...) para el cliente de tipo 
	 * USUARIO*/
	private void configurarColoresUsuario() {
		//Panel Superior
		btnCerrarSesionUO.setBackground(new Color(103,131,46));
		btnVerJugadores.setBackground(new Color(130,178,44));
		btnVerPartidos.setBackground(new Color(130,178,44));
		btnVerClasificación.setBackground(new Color(130,178,44));
		btnVerEstadistica.setBackground(new Color(130,178,44));
		//Panel Información
		CBCategorias.setBackground(new Color(165, 42, 42));
		CBGrupos.setBackground(new Color(165, 42, 42));
		CBEquipos.setBackground(new Color(165, 42, 42));
		btnAtrasPO.setBackground(new Color(165, 42, 42));
		//PanelDatosEquipos
		lblNombreEquipo.setBackground(new Color(197,232,179));
		lblCodigo.setBackground(new Color(197,232,179));
		lblMunicipio.setBackground(new Color(197,232,179));
		lblTerrenoDeJuego.setBackground(new Color(197,232,179));
		lblTelefono.setBackground(new Color(197,232,179));
		lblEmail.setBackground(new Color(197,232,179));
		lblLiga.setBackground(new Color(197,232,179));
		txtNombreEquipo.setBackground(new Color(241,249,236));
		txtCodigo.setBackground(new Color(241,249,236));
		txtMunicipio.setBackground(new Color(241,249,236));
		txtTerrenoDeJuego.setBackground(new Color(241,249,236));
		txtEmail.setBackground(new Color(241,249,236));
		txtTelefono.setBackground(new Color(241,249,236));
		CBLigas.setBackground(new Color(241,249,236));
		/*PanelDatosJugador*/
		lblNombre.setBackground(new Color(197,232,179));
		lblApellido.setBackground(new Color(197,232,179));
		lblDni.setBackground(new Color(197,232,179));
		lblNacionalidad.setBackground(new Color(197,232,179));
		lblFechaDeNacimiento.setBackground(new Color(197,232,179));
		lblPeso.setBackground(new Color(197,232,179));
		lblAltura.setBackground(new Color(197,232,179));
		lblEdad.setBackground(new Color(197,232,179));
		lblEquipo.setBackground(new Color(197,232,179));
		txtNombre.setBackground(new Color(241,249,236));
		txtApellido.setBackground(new Color(241,249,236));
		txtDNI.setBackground(new Color(241,249,236));
		txtNacionalidad.setBackground(new Color(241,249,236));
		txtEdad.setBackground(new Color(241,249,236));
		txtAltura.setBackground(new Color(241,249,236));
		txtPeso.setBackground(new Color(241,249,236));
		CBEquipoJugador.setBackground(new Color(241,249,236));
		PanelFechaNacimiento.setBackground(new Color(241,249,236));
		txtAno.setBackground(new Color(241,249,236));
		txtMes.setBackground(new Color(241,249,236));
		txtDia.setBackground(new Color(241,249,236));
		label_1.setBackground(new Color(241,249,236));
		label_2.setBackground(new Color(241,249,236));
		/*PanelDatosPartidos*/
		lblCategoria.setBackground(new Color(197,232,179));
		lblGrupo.setBackground(new Color(197,232,179));
		lblCodPartido.setBackground(new Color(197,232,179));
		lblFecha.setBackground(new Color(197,232,179));
		lblResultado.setBackground(new Color(197,232,179));;
		lblEquipolocal.setBackground(new Color(197,232,179));
		lblEquipovisitante.setBackground(new Color(197,232,179));
		lblResultadoPartido.setBackground(new Color(197,232,179));
		txtCategoria.setBackground(new Color(241,249,236));
		txtGrupo.setBackground(new Color(241,249,236));
		txtCodPartido.setBackground(new Color(241,249,236));
		txtResulVisitante.setBackground(new Color(241,249,236));
		txtResulLocal.setBackground(new Color(241,249,236));
		lblFechaPartido.setBackground(new Color(241,249,236));
		lbl3.setBackground(new Color(241,249,236));
		lbl4.setBackground(new Color(241,249,236));
		txtHora.setBackground(new Color(241,249,236));
		txtMinutos.setBackground(new Color(241,249,236));
		CBEquipoVisitante.setBackground(new Color(241,249,236));
		CBEquipoLocal.setBackground(new Color(241,249,236));
		FechaPartido.setBackground(new Color(241,249,236));
		txtAnoPartido.setBackground(new Color(241,249,236));
		txtMesParido.setBackground(new Color(241,249,236));
		txtDiaPartido.setBackground(new Color(241,249,236));
		lbl1.setBackground(new Color(241,249,236));
		lbl2.setBackground(new Color(241,249,236));
		btnGuardarPartido.setBackground(Color.GREEN);
		btnEliminarEquipo.setBackground(Color.RED);	
		
	}

	
	/*Metodo encargado de configurar los colores de los objetos
	 * (botones,paneles,labels, etc...) para el cliente de tipo 
	 * OBSERVADOR*/
	private void configurarColoresObservador() {
		//Panel Superior
				btnCerrarSesionUO.setBackground(new Color(165,42,42));
				btnVerJugadores.setBackground(new Color(185,81,73));
				btnVerPartidos.setBackground(new Color(185,81,73));
				btnVerClasificación.setBackground(new Color(185,81,73));
				btnVerEstadistica.setBackground(new Color(185,81,73));
				//Panel Información
				CBCategorias.setBackground(new Color(47,169,103));
				CBGrupos.setBackground(new Color(47,169,103));
				CBEquipos.setBackground(new Color(47,169,103));
				btnAtrasPO.setBackground(new Color(47,169,103));
				//PanelDatosEquipos // Falta cambiar colores
				lblNombreEquipo.setBackground(new Color(197,232,179));
				lblCodigo.setBackground(new Color(197,232,179));
				lblMunicipio.setBackground(new Color(197,232,179));
				lblTerrenoDeJuego.setBackground(new Color(197,232,179));
				lblTelefono.setBackground(new Color(197,232,179));
				lblEmail.setBackground(new Color(197,232,179));
				lblLiga.setBackground(new Color(197,232,179));
				txtNombreEquipo.setBackground(new Color(241,249,236));
				txtCodigo.setBackground(new Color(241,249,236));
				txtMunicipio.setBackground(new Color(241,249,236));
				txtTerrenoDeJuego.setBackground(new Color(241,249,236));
				txtEmail.setBackground(new Color(241,249,236));
				txtTelefono.setBackground(new Color(241,249,236));
				CBLigas.setBackground(new Color(241,249,236));
				/*PanelDatosJugador*/
				lblNombre.setBackground(new Color(197,232,179));
				lblApellido.setBackground(new Color(197,232,179));
				lblDni.setBackground(new Color(197,232,179));
				lblNacionalidad.setBackground(new Color(197,232,179));
				lblFechaDeNacimiento.setBackground(new Color(197,232,179));
				lblPeso.setBackground(new Color(197,232,179));
				lblAltura.setBackground(new Color(197,232,179));
				lblEdad.setBackground(new Color(197,232,179));
				lblEquipo.setBackground(new Color(197,232,179));
				txtNombre.setBackground(new Color(241,249,236));
				txtApellido.setBackground(new Color(241,249,236));
				txtDNI.setBackground(new Color(241,249,236));
				txtNacionalidad.setBackground(new Color(241,249,236));
				txtEdad.setBackground(new Color(241,249,236));
				txtAltura.setBackground(new Color(241,249,236));
				txtPeso.setBackground(new Color(241,249,236));
				CBEquipoJugador.setBackground(new Color(241,249,236));
				PanelFechaNacimiento.setBackground(new Color(241,249,236));
				txtAno.setBackground(new Color(241,249,236));
				txtMes.setBackground(new Color(241,249,236));
				txtDia.setBackground(new Color(241,249,236));
				label_1.setBackground(new Color(241,249,236));
				label_2.setBackground(new Color(241,249,236));
				/*PanelDatosPartidos*/
				lblCategoria.setBackground(new Color(197,232,179));
				lblGrupo.setBackground(new Color(197,232,179));
				lblCodPartido.setBackground(new Color(197,232,179));
				lblFecha.setBackground(new Color(197,232,179));
				lblResultado.setBackground(new Color(197,232,179));;
				lblEquipolocal.setBackground(new Color(197,232,179));
				lblEquipovisitante.setBackground(new Color(197,232,179));
				lblResultadoPartido.setBackground(new Color(197,232,179));
				txtCategoria.setBackground(new Color(241,249,236));
				txtGrupo.setBackground(new Color(241,249,236));
				txtCodPartido.setBackground(new Color(241,249,236));
				txtResulVisitante.setBackground(new Color(241,249,236));
				txtResulLocal.setBackground(new Color(241,249,236));
				lblFechaPartido.setBackground(new Color(241,249,236));
				lbl3.setBackground(new Color(241,249,236));
				lbl4.setBackground(new Color(241,249,236));
				txtHora.setBackground(new Color(241,249,236));
				txtMinutos.setBackground(new Color(241,249,236));
				CBEquipoVisitante.setBackground(new Color(241,249,236));
				CBEquipoLocal.setBackground(new Color(241,249,236));
				FechaPartido.setBackground(new Color(241,249,236));
				txtAnoPartido.setBackground(new Color(241,249,236));
				txtMesParido.setBackground(new Color(241,249,236));
				txtDiaPartido.setBackground(new Color(241,249,236));
				lbl1.setBackground(new Color(241,249,236));
				lbl2.setBackground(new Color(241,249,236));
				btnGuardarPartido.setBackground(Color.GREEN);
				btnEliminarEquipo.setBackground(Color.RED);	
				
	}

	
	/*Una vez iniciada la sesion deja vacios el hueco del textfield y passwordField
	 * del panel Login, para que al cerrar sesion pueda usarse como si la aplicación
	 * acabase de iniciar*/
	private void limpiarLogin() {
		txtUsuario.setText("");
		passwordField.setText("");
	}
	
/*---------------------------------------------------- BOTONES TRADUCCION -----------------------------------------------------------*/	
	
	/*Metodo encargado de traducir la información del programa a Español*/
	private void traducirESP() {
		btnCerrarSesion.setText("Cerrar Sesi\u00F3n");
		btnJugadores.setText("Jugadores");
		btnEquipos.setText("Equipos");
		btnPartidos.setText("Partidos");
		btnLiga.setText("Ligas");
		btnCerrarSesionUO.setText("Cerrar Sesi\u00F3n");
		btnVerJugadores.setText("Equipos");
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
		btnAtras.setText("Atras");
		btnAtrasPO.setText("Atras");
		btnDatosEstadisticos.setText("DATOS ESTADISTICOS");
	}

	
	/*Metodo encargado de traducir la información del programa a Español*/
	private void traducirEUS() {
		btnCerrarSesion.setText("Sasoia itxi");
		btnJugadores.setText("Jokalariak");
		btnEquipos.setText("Taldeak");
		btnPartidos.setText("Partiduak");
		btnLiga.setText("Ligak");
		btnCerrarSesionUO.setText("Sasoia itxi");
		btnVerJugadores.setText("Taldeak");
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
		btnAtras.setText("Atzera");
		btnAtrasPO.setText("Atzera");
		btnDatosEstadisticos.setText("DATU ESTADISTIKOAK");
	}
	
/*---------------------------------------------------- VENTANA LIGAS -----------------------------------------------------------*/		
	/*Carga en la tableLigas la información que hay en el arrayList listaLigas*/
	private void cargarTablaLigas() {
		tableLigasModel.setRowCount(0);
		tableLigasModel.setColumnCount(0);
		tableLigasModel.addColumn("CODIGO");
		tableLigasModel.addColumn("NOMBRE");
		tableLigasModel.addColumn("CATEGORIA");
		tableLigasModel.addColumn("GRUPO");
		tableLigasModel.addRow(new Object[]{"CODIGO", "NOMBRE", "CATEGORIA", "GRUPO"});
		for(int pos = 0; pos <ListaLigas.size();pos++) {
			String cod = ListaLigas.get(pos).getCodigo();
			String nom = ListaLigas.get(pos).getNombreLiga();
			String cat = ListaLigas.get(pos).getCategoriaLiga();
			String grup = ListaLigas.get(pos).getGrupo();
			String[] liga = new String[]{cod, nom, cat, grup};
			tableLigasModel.addRow(liga);
			
		}
		tableLigas.setModel(tableLigasModel);
		
	}
	
	/*Metodo encargado de crear una liga y guardarla en el lugar adecuado*/		
	private void añadirLiga() {
		Liga ligaAnadir = new Liga();
		ligaAnadir.setNombreLiga(txtLiga.getText());
		ligaAnadir.setCodigo(txtCodLiga.getText());
		ligaAnadir.setCategoriaLiga(txtCatLiga.getText());
		ligaAnadir.setGrupo(txtGrupoLiga.getText());
		
		añadirAListaLigas(ligaAnadir);
		limpiarDatosLiga();
	}

	
	/*Metodo que comprueba si existe ya esa liga, si es así saca un mensaje,
	 * si no la añade*/
	private void añadirAListaLigas(Liga lige) {
		if (ListaLigas.contains(lige)) {
			JOptionPane.showMessageDialog(null, "Esa liga ya existe");
		}
		else {
			ListaLigas.add(lige);
			JOptionPane.showMessageDialog(null, "Liga Añadida");
		}
	}

	/*Crea la liga y la elimina del arrayList
	 * Metodo que elimina una Liga que exista, si es que existe*/
	private void eliminarLiga() {
		Liga ligaEliminar = new Liga();
		ligaEliminar.setNombreLiga(txtLiga.getText());
		ligaEliminar.setCodigo(txtCodLiga.getText());
		ligaEliminar.setCategoriaLiga(txtCatLiga.getText());
		ligaEliminar.setGrupo(txtGrupoLiga.getText());
		
		eliminarDListaLigas(ligaEliminar);
		limpiarDatosLiga();
	}

	/*Elimina la liga del arrayList*/
	private void eliminarDListaLigas(Liga ligaEliminar) {
		if (ListaLigas.contains(ligaEliminar)) {
			ListaLigas.remove(ligaEliminar);
			JOptionPane.showMessageDialog(null, "Liga eliminada");
		}
		else {
			JOptionPane.showMessageDialog(null, "Esa liga no existe, pruebe de nuevo");
		}
		
	}
	
	/*Deja vacios los txt de la ventana datos Liga
	 * para poder crear la siguiente con más facilidad,
	 * evitando la necesidad de tener que andar borrando*/
	private void limpiarDatosLiga() {
		txtCodLiga.setText("");
		txtLiga.setText("");
		txtGrupoLiga.setText("");
		txtCatLiga.setText("");
	}

/*---------------------------------------------------- VENTANA EQUIPO -----------------------------------------------------------*/	
	
	/*Cargamos la información del array List de ligas en el comboBox para poder elegir despues la adecuada*/
	private void cargarCBLigas() {
		for(int pos =0; pos<ListaLigas.size();pos ++) {
			ModelLigas.addElement(ListaLigas.get(pos).toString());
		}
		CBLigas.setModel(ModelLigas);	
	}

	/*Crea el equipo a introducir en el arrayList si es que no existe ya.*/
	private void cargarTablaEquipos() {
		tableEquiposModel.setRowCount(0);
		tableEquiposModel.setColumnCount(0);
		tableEquiposModel.addColumn("CODIGO");
		tableEquiposModel.addColumn("NOMBRE");
		tableEquiposModel.addColumn("MUNICIPIO");
		tableEquiposModel.addColumn("TELEFONO CONTACTO");
		tableEquiposModel.addColumn("EMAIL");
		tableEquiposModel.addColumn("TERRENO DE JUEGO");
		tableEquiposModel.addRow(new Object[]{"CODIGO", "NOMBRE", "MUNICIPIO", "TELEFONO CONTACTO", "EMAIL", "TERRENO DE JUEGO"});
		for(int pos = 0; pos <ListaLigas.size();pos++) {
			String cod = ListaEquipos.get(pos).getCodEquipo();
			String nom = ListaEquipos.get(pos).getNombreEquipo();
			String mun = ListaEquipos.get(pos).getMunicipio();
			String tel = ListaEquipos.get(pos).getTelefono();
			String terre = ListaEquipos.get(pos).getTerrenoDeJuego();
			String ema = ListaEquipos.get(pos).getCorreoElectronico();
			String[] liga = new String[]{cod, nom, mun, tel, ema, terre};
			tableEquiposModel.addRow(liga);
			
		}
		tableMuestraEquipos.setModel(tableEquiposModel);
	}
	
	private void añadirEquipo() {
		/*Creamos el equipo*/
		Equipo eqAnadir = new Equipo();
		eqAnadir.setNombreEquipo(txtNombreEquipo.getText());
		eqAnadir.setCodEquipo(txtCodigo.getText());
		eqAnadir.setMunicipio(txtMunicipio.getText());
		eqAnadir.setTerrenoDeJuego(txtTerrenoDeJuego.getText());
		eqAnadir.setTelefono(txtTelefono.getText());
		eqAnadir.setCorreoElectronico(txtEmail.getText());
		/*Lo añadimos mediante otro metodo que comprobara si existe previamente*/
		añadirAListaEquipos(eqAnadir);
		añadirEnLiga(eqAnadir);
		limpiarDatosEquipos();
	}
	

	/*Añadimos el equipo si existe la posibilidad*/
	private void añadirAListaEquipos(Equipo eqAnadir) {
		if(ListaEquipos.contains(eqAnadir)) {
			JOptionPane.showMessageDialog(null, "Ese equipo ya existe");
		}
		else {
			ListaEquipos.add(eqAnadir);
			JOptionPane.showMessageDialog(null, "Equipo añadido");
		}
	}
		

	/*Elimina un equipo si es que existe previamente*/
	private void EliminarEquipo() {
		Equipo eqAnadir = new Equipo();
		eqAnadir.setNombreEquipo(txtNombreEquipo.getText());
		eqAnadir.setCodEquipo(txtCodigo.getText());
		eqAnadir.setMunicipio(txtMunicipio.getText());
		eqAnadir.setTerrenoDeJuego(txtTerrenoDeJuego.getText());
		eqAnadir.setTelefono(txtTelefono.getText());
		eqAnadir.setCorreoElectronico(txtEmail.getText());
		eqAnadir.setCodLiga(CBLigas.getSelectedItem().toString());
		
		eliminarDListaEquipos(eqAnadir);
		eliminarDLiga(eqAnadir);
	}

	/*Tras comprobar que el equipo existe lo elimina del arrayList*/
	private void eliminarDListaEquipos(Equipo equipo) {
		if(ListaEquipos.contains(equipo)) {
			ListaEquipos.remove(equipo);
			JOptionPane.showMessageDialog(null, "Equipo eliminado");
		}
		else {
			
			JOptionPane.showMessageDialog(null, "El equipo no existe, pruebe de nuevo");
		}
		
	}

	/*Añade el equipo a la liga seleccionada*/
	private void añadirEnLiga(Equipo equipo) {
		int LigaSele = CBLigas.getSelectedIndex();
		ListaLigas.get(LigaSele);
		/*if (ListaLigas.get(LigaSele).getListaEquipos().size()<Liga.getNumMaxEquipos()) {
			ListaLigas.get(LigaSele).getListaEquipos().add(equipo);
		}*/

	}
	
	/*Elimina el equipo de la liga en la que este*/
	private void eliminarDLiga(Equipo equipo) {
		if(ListaEquipos.contains(equipo)) {
			for(int pos = 0; pos <ListaLigas.size(); pos++) {
				if(equipo.getCodEquipo().equals(ListaLigas.get(pos).getCodigo())) {
					ListaLigas.get(pos).getListaEquipos().remove(equipo);
					break;
				}
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "El equipo no existe, pruebe de nuevo");
		}
		
	}
	
	/*Vacia la información de los textFields*/
	private void limpiarDatosEquipos() {
		txtNombreEquipo.setText("");
		txtCodigo.setText("");
		txtMunicipio.setText("");
		txtTerrenoDeJuego.setText("");
		txtEmail.setText("");
		txtTelefono.setText("");
		
	}

/*----------------------------------------------------- VENTANA JUGADOR -----------------------------------------------------------*/		
	
/*OPCION BOTON JUGADORES PRA VER LA TABLA*/
	
	/*Cargar la información de la tabla jugadores*/
	private void cargarTablaJugadores() {
		tableJugadoresModel.addColumn("NOMBRE");
		tableJugadoresModel.addColumn("APELLIDO");
		tableJugadoresModel.addColumn("DNI");
		tableJugadoresModel.addColumn("NACIONALIDAD");
		tableJugadoresModel.addColumn("F.NACIMIENTO");
		tableJugadoresModel.addColumn("PESO");
		tableJugadoresModel.addColumn("ALTURA");
		tableJugadoresModel.addRow(new Object[]{"NOMBRE", "APELLIDO", "DNI", "NACIONALIDAD", "F.NACIMIENTO", "PESO", "ALTURA"});
		for(int pos = 0; pos <ListaUsuarios.size();pos++) {
			String nom = ListaJugador.get(pos).getNombre();
			String ap = ListaJugador.get(pos).getApellidos();
			String dni = ListaJugador.get(pos).getDNI();
			String nac = ListaJugador.get(pos).getNacionalidad();
			String fNaci = ListaJugador.get(pos).getFechaNacimiento().toString();
			Double peso = ListaJugador.get(pos).getPeso();
			Double altura = ListaJugador.get(pos).getAltura();
			Object[] jugador = new Object[]{nom, ap, dni, nac, fNaci, peso, altura};
			tableJugadoresModel.addRow(jugador);
			tableUsuarios.setModel(tableJugadoresModel);
		}
		
	}
	
	
/*OPCION BOTON JUGADORES PRA VER LA INFORMACIÓN PERSONAL SOBRE EL JUGADOR*/	
	
	/*Cargamos en el combo box de la ventana datos 
	 * jugador la información de la lista de equipos.*/
	private void cargarCBEquiposJugador() {
		for(int pos =0; pos<ListaEquipos.size();pos ++) {
			ModelEquipoJugador.addElement(ListaEquipos.get(pos).getNombreEquipo());
		}
		CBEquipoJugador.setModel(ModelEquipoJugador);	
		
	}
	
	private void limpiarDatosJugador() {
		txtNombre.setText("");
		txtApellido.setText("");
		txtDNI.setText("");
		txtNacionalidad.setText("");
		txtEdad.setText("");
		txtAltura.setText("");
		txtPeso.setText("");
		txtAno.setText("");
		txtMes.setText("");
		txtDia.setText("");
	}


	private void añadirJugador() {
		Jugador jAnadir = new Jugador();
		leerJugador(jAnadir);
		añadirAListaJugadores(jAnadir);
		añadirAEquipo(jAnadir);
		limpiarDatosJugador();
		
	}
	
	/*Lee los datos introducidos para actualizar el jugador y poder más tarde añadirlo o actualizarlo*/
	private void leerJugador(Jugador jAnadir) {
		jAnadir.setNombre(txtNombre.getText());
		jAnadir.setApellidos(txtApellido.getText());
		jAnadir.setDNI(txtDNI.getText());
		jAnadir.setNacionalidad(txtNacionalidad.getText());
		jAnadir.setEdad(Integer.parseInt(txtEdad.getText()));
		jAnadir.setAltura(Double.parseDouble(txtAltura.getText()));
		jAnadir.setPeso(Double.parseDouble(txtPeso.getText()));
		
	}
	
	/*Comprobando que el jugador no exista previamente, se le añade a el arrayList*/

	private void añadirAListaJugadores(Jugador jAnadir) {
		boolean comprobador = comprobarSiJugador(jAnadir);
		if(!comprobador) {
			ListaJugador.add(jAnadir);
			JOptionPane.showMessageDialog(null, "Jugador añadido");
		}
		else {
			for(int pos = 0; pos < ListaJugador.size();pos++) {
				if (ListaJugador.get(pos).equals(jAnadir)){
					ListaJugador.get(pos).setNombre(jAnadir.getNombre());
					break;
				}
			}
		}
		
	}
	
	
	private boolean comprobarSiJugador(Jugador jAnadir) {
		
		return ListaJugador.contains(jAnadir);
	}

	/*Tras añadir el jugador al arrayList de jugadores lo añadimos al arrayListInterno de el equipo*/
	private void añadirAEquipo(Jugador jAnadir) {
		for(int pos=0; pos<ListaEquipos.size();pos++) {
			if(ListaEquipos.get(pos).getNombreEquipo().equals(jAnadir.getEquipo())) {
				ListaEquipos.get(pos).getListaJugadores().add(jAnadir);
				break;
			}
		}
		
	}
	
	private void eliminarJugador() {
		Jugador jAnadir = new Jugador();
		leerJugador(jAnadir);
		eliminarDeListaJugadores();
		eliminarDeEquipo();
		limpiarDatosJugador();
	}

	private void eliminarDeEquipo() {
		// TODO Auto-generated method stub
		
	}

	private void eliminarDeListaJugadores() {
		// TODO Auto-generated method stub
		
	}

/*----------------------------------------------------- VENTANA PARTIDOS -----------------------------------------------------------*/

	private void cargarTablaPartidos() {
		tablePartidosModel.setRowCount(0);
		tablePartidosModel.setColumnCount(0);
		tablePartidosModel.addColumn("CODIGO");
		tablePartidosModel.addColumn("EQUIPO LOCAL");
		tablePartidosModel.addColumn("EQUIPO VISITANTE");
		tablePartidosModel.addColumn("FECHA");
		tablePartidosModel.addColumn("RESULTADO L");
		tablePartidosModel.addColumn("RESULTADO V");
		tablePartidosModel.addRow(new Object[]{"NOMBRE", "APELLIDO", "DNI", "TELEFONO", "EMAIL"});
		for(int pos = 0; pos <ListaPartidos.size();pos++) {
			String cod = ListaPartidos.get(pos).getCodPartido();
			String el = ListaPartidos.get(pos).getEquipoLocal().getNombreEquipo();
			String ev = ListaPartidos.get(pos).getEquipoVisitante().getNombreEquipo();
			String f = ListaPartidos.get(pos).getFechaPartido().toString();
			int rl = ListaPartidos.get(pos).getResultadoEquipoLocal();
			int rv = ListaPartidos.get(pos).getResultadoEquipoVisitante();
			Object[] partido = new Object[]{cod, el, ev, f, rl, rv};
			tablePartidosModel.addRow(partido);
		}
		tablePartidos.setModel(tablePartidosModel);
		
	}
	
/*---------------------------------------------------- VENTANA DE USUARIOS ---------------------------------------------------------*/

	/*Carga la información del array de usuarios a la tabla*/
	private void cargarTablaUsuarios() {
		tableUsuariosModel.setRowCount(0);
		tableUsuariosModel.setColumnCount(0);
		tableUsuariosModel.addColumn("NOMBRE");
		tableUsuariosModel.addColumn("APELLIDO");
		tableUsuariosModel.addColumn("DNI");
		tableUsuariosModel.addColumn("TELEFONO");
		tableUsuariosModel.addColumn("EMAIL");
		tableUsuariosModel.addRow(new Object[]{"NOMBRE", "APELLIDO", "DNI", "TELEFONO", "EMAIL"});
		for(int pos = 0; pos <ListaUsuarios.size();pos++) {
			String nom = ListaUsuarios.get(pos).getNombre();
			String ap = ListaUsuarios.get(pos).getApellidos();
			String dni = ListaUsuarios.get(pos).getDNI();
			String tel = ListaUsuarios.get(pos).getTelefonoCliente();
			String email = ListaUsuarios.get(pos).getEmailCliente();
			String[] usuario = new String[]{nom, ap, dni, tel, email};
			tableUsuariosModel.addRow(usuario);
		}
		tableUsuarios.setModel(tableUsuariosModel);
	}


/*---------------------------------------------------- VENTANA DE ESTADISTICA ------------------------------------------------------*/





/*---------------------------------------------------- VENTANA DE CLASIFICACIÓN ----------------------------------------------------*/



}
