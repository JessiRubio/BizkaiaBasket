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

public class Aplicacion extends JFrame {

	private JPanel contentPane;
	
/*Panel superior de botones (Opciones iniciales)*/
	private JPanel PanelBotonesSuperiores;
	private JButton btnCerrarSesion;
	private JButton btnJugadores;
	private JButton btnEquipos;
	private JButton btnPartidos;
	private JButton btnLiga;
	private JButton btnEu;
	private JButton btnEs;
	private JLabel lblAdmin;
	
/*Panel lateral botones añadir*/
	private JPanel PanelBotonesAñadir;
	private JButton btnCrearLigas;
	private JButton btnAadirEquipo;
	private JButton btnAadirJugador;
	private JButton btnAadirPartido;
	private JButton btnConfiguracion;
	
/*Panel inicial de la aplicación vacia o iniciada*/
	private JPanel PanelInformaciónInicio ;
	private JLabel lblInicio;
	
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
	private JLabel NombreEquipo;
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
	private JButton btnGuardarDatos;
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
	private JComboBox CBEquipoJugador;
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
	private JComboBox CBEquipoLocal;
	private JLabel lblEquipovisitante;
	private JComboBox CBEquipoVisitante;
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
	private JPanel SPanelJugadores;
	private JPanel PanelMuestraJugadores;
	/*Opciones de visualización*/
	private JPanel PanelDeEleccion;
	private JComboBox CBCategoria;
	private JComboBox CBGrupo;
	private JComboBox CBEquipo;
	private JButton btnNuevo;
	/*Muestra de información*/
	private JTable tableMostrarJugadores;
	
/*Objetos panel Equipos(Muestra la lista de todos los Equipos creados tras seleccionar unas opciones)*/
	private JPanel SPanelEquipos;
	private JPanel PanelMuestraEquipos;
	/*Opciones de menu*/
	private JPanel POpcionesEquipo;
	private JComboBox CBCategorias;
	private JComboBox CBGrupos ;
	private JComboBox CBEquipos;
	private JButton VPañadir;
	/*Lo que se muestra tras elegir las opciones*/
	private JTable tableMuestraEquipos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplicacion frame = new Aplicacion();
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
	public Aplicacion() {
		setTitle("BizkaiaBasket.com");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 410);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PanelBotonesSuperiores = new JPanel();
		PanelBotonesSuperiores.setBackground(Color.WHITE);
		PanelBotonesSuperiores.setBounds(5, 5, 578, 63);
		contentPane.add(PanelBotonesSuperiores);
		PanelBotonesSuperiores.setLayout(null);
		
		btnCerrarSesion = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesion.setFont(new Font("Agency FB", Font.PLAIN, 20));
		btnCerrarSesion.setForeground(Color.WHITE);
		btnCerrarSesion.setBackground(new Color(0, 0, 128));
		btnCerrarSesion.setBounds(0, 0, 131, 62);
		PanelBotonesSuperiores.add(btnCerrarSesion);
		
		btnJugadores = new JButton("Jugadores");
		btnJugadores.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnJugadores.setBackground(new Color(65, 105, 225));
		btnJugadores.setForeground(Color.WHITE);
		btnJugadores.setBounds(131, 23, 110, 39);
		PanelBotonesSuperiores.add(btnJugadores);
		
		btnEquipos = new JButton("Equipos");
		btnEquipos.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnEquipos.setBackground(new Color(65, 105, 225));
		btnEquipos.setForeground(Color.WHITE);
		btnEquipos.setBounds(241, 23, 110, 39);
		PanelBotonesSuperiores.add(btnEquipos);
		
		btnPartidos = new JButton("Partidos");
		btnPartidos.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnPartidos.setForeground(Color.WHITE);
		btnPartidos.setBackground(new Color(65, 105, 225));
		btnPartidos.setBounds(351, 23, 110, 39);
		PanelBotonesSuperiores.add(btnPartidos);
		
		btnEu = new JButton("");
		btnEu.setIcon(new ImageIcon(Aplicacion.class.getResource("/Imagenes/1928414-app.android.ikurrina.png")));
		btnEu.setFont(new Font("Agency FB", Font.PLAIN, 11));
		btnEu.setBackground(new Color(255, 255, 255));
		btnEu.setBounds(523, 0, 45, 23);
		PanelBotonesSuperiores.add(btnEu);
		
		btnEs = new JButton("");
		btnEs.setIcon(new ImageIcon(Aplicacion.class.getResource("/Imagenes/bandera-espana-con-escudo-para-exterior_xs.jpg")));
		btnEs.setFont(new Font("Agency FB", Font.PLAIN, 11));
		btnEs.setBackground(new Color(255, 255, 255));
		btnEs.setBounds(486, 0, 37, 23);
		PanelBotonesSuperiores.add(btnEs);
		
		lblAdmin = new JLabel("Admin");
		lblAdmin.setFont(new Font("Agency FB", Font.PLAIN, 12));
		lblAdmin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdmin.setBounds(425, 4, 44, 14);
		PanelBotonesSuperiores.add(lblAdmin);
		
		btnLiga = new JButton("Ligas");
		btnLiga.setForeground(Color.WHITE);
		btnLiga.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnLiga.setBackground(new Color(65, 105, 225));
		btnLiga.setBounds(461, 23, 110, 39);
		PanelBotonesSuperiores.add(btnLiga);
		
		PanelBotonesAñadir = new JPanel();
		PanelBotonesAñadir.setVisible(false);
		PanelBotonesAñadir.setBackground(new Color(255, 255, 255));
		PanelBotonesAñadir.setBounds(5, 79, 112, 286);
		contentPane.add(PanelBotonesAñadir);
		PanelBotonesAñadir.setLayout(null);
		
		btnAadirJugador = new JButton("A\u00F1adir Jugador");
		btnAadirJugador.setForeground(Color.WHITE);
		btnAadirJugador.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnAadirJugador.setBackground(new Color(65, 105, 225));
		btnAadirJugador.setBounds(0, 111, 112, 39);
		PanelBotonesAñadir.add(btnAadirJugador);
		
		btnAadirEquipo = new JButton("A\u00F1adir Equipo");
		btnAadirEquipo.setForeground(Color.WHITE);
		btnAadirEquipo.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnAadirEquipo.setBackground(new Color(65, 105, 225));
		btnAadirEquipo.setBounds(0, 61, 112, 39);
		PanelBotonesAñadir.add(btnAadirEquipo);
		
		btnAadirPartido = new JButton("A\u00F1adir Partido");
		btnAadirPartido.setForeground(Color.WHITE);
		btnAadirPartido.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnAadirPartido.setBackground(new Color(65, 105, 225));
		btnAadirPartido.setBounds(0, 161, 112, 39);
		PanelBotonesAñadir.add(btnAadirPartido);
		
		btnConfiguracion = new JButton("Configuraci\u00F3n");
		btnConfiguracion.setForeground(Color.WHITE);
		btnConfiguracion.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnConfiguracion.setBackground(new Color(65, 105, 225));
		btnConfiguracion.setBounds(0, 236, 112, 39);
		PanelBotonesAñadir.add(btnConfiguracion);
		
		btnCrearLigas = new JButton("Crear Ligas");
		btnCrearLigas.setBounds(0, 11, 112, 39);
		PanelBotonesAñadir.add(btnCrearLigas);
		btnCrearLigas.setForeground(Color.WHITE);
		btnCrearLigas.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnCrearLigas.setBackground(new Color(65, 105, 225));
		
		PanelDatosPartidos = new JPanel();
		PanelDatosPartidos.setVisible(false);
		
		PanelInformaciónInicio = new JPanel();
		PanelInformaciónInicio.setVisible(false);
		PanelInformaciónInicio.setBackground(new Color(255, 255, 255));
		PanelInformaciónInicio.setBounds(127, 79, 456, 286);
		contentPane.add(PanelInformaciónInicio);
		PanelInformaciónInicio.setLayout(null);
		
		lblInicio = new JLabel("ELIJA UNA OPCI\u00D3N PARA COMENZAR ");
		lblInicio.setBounds(0, 0, 446, 286);
		lblInicio.setEnabled(false);
		lblInicio.setFont(new Font("Agency FB", Font.PLAIN, 40));
		lblInicio.setHorizontalAlignment(SwingConstants.CENTER);
		PanelInformaciónInicio.add(lblInicio);
		
		PanelDatosJugador = new JPanel();
		PanelDatosJugador.setVisible(false);
		
		PanelDatosEquipo = new JPanel();
		PanelDatosEquipo.setVisible(false);
		
		PanelDatosLigas = new JPanel();
		PanelDatosLigas.setVisible(false);
		PanelDatosLigas.setLayout(null);
		PanelDatosLigas.setBackground(Color.WHITE);
		PanelDatosLigas.setBounds(127, 79, 456, 286);
		contentPane.add(PanelDatosLigas);
		
		lblNombreLiga = new JLabel("  Liga:");
		lblNombreLiga.setOpaque(true);
		lblNombreLiga.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNombreLiga.setBackground(new Color(135, 206, 235));
		lblNombreLiga.setBounds(10, 46, 152, 22);
		PanelDatosLigas.add(lblNombreLiga);
		
		lblCodigoLiga = new JLabel("  Codigo:");
		lblCodigoLiga.setOpaque(true);
		lblCodigoLiga.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblCodigoLiga.setBackground(new Color(135, 206, 235));
		lblCodigoLiga.setBounds(10, 11, 152, 22);
		PanelDatosLigas.add(lblCodigoLiga);
		
		lblGrupoLiga = new JLabel("  Grupo:");
		lblGrupoLiga.setOpaque(true);
		lblGrupoLiga.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblGrupoLiga.setBackground(new Color(135, 206, 235));
		lblGrupoLiga.setBounds(10, 112, 152, 22);
		PanelDatosLigas.add(lblGrupoLiga);
		
		lblNMaxEquipos = new JLabel("  N\u00BA Max de Equipos:");
		lblNMaxEquipos.setOpaque(true);
		lblNMaxEquipos.setFont(new Font("Arial Black", Font.PLAIN, 11));
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
		lblCategoriaLiga.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblCategoriaLiga.setBackground(new Color(135, 206, 235));
		lblCategoriaLiga.setBounds(10, 79, 152, 22);
		PanelDatosLigas.add(lblCategoriaLiga);
		PanelDatosEquipo.setLayout(null);
		PanelDatosEquipo.setBackground(Color.WHITE);
		PanelDatosEquipo.setBounds(127, 79, 456, 286);
		contentPane.add(PanelDatosEquipo);
		
		NombreEquipo = new JLabel("  Nombre: ");
		NombreEquipo.setOpaque(true);
		NombreEquipo.setFont(new Font("Arial Black", Font.PLAIN, 11));
		NombreEquipo.setBackground(new Color(135, 206, 235));
		NombreEquipo.setBounds(10, 11, 152, 22);
		PanelDatosEquipo.add(NombreEquipo);
		
		lblCodigo = new JLabel("  Codigo:");
		lblCodigo.setOpaque(true);
		lblCodigo.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblCodigo.setBackground(new Color(135, 206, 235));
		lblCodigo.setBounds(10, 44, 152, 22);
		PanelDatosEquipo.add(lblCodigo);
		
		lblMunicipio = new JLabel("  Municipio:");
		lblMunicipio.setOpaque(true);
		lblMunicipio.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblMunicipio.setBackground(new Color(135, 206, 235));
		lblMunicipio.setBounds(10, 77, 152, 22);
		PanelDatosEquipo.add(lblMunicipio);
		
		lblTerrenoDeJuego = new JLabel("  Terreno de Juego:");
		lblTerrenoDeJuego.setOpaque(true);
		lblTerrenoDeJuego.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblTerrenoDeJuego.setBackground(new Color(135, 206, 235));
		lblTerrenoDeJuego.setBounds(10, 110, 152, 22);
		PanelDatosEquipo.add(lblTerrenoDeJuego);
		
		lblTelefono = new JLabel("  Telefono:");
		lblTelefono.setOpaque(true);
		lblTelefono.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblTelefono.setBackground(new Color(135, 206, 235));
		lblTelefono.setBounds(10, 143, 152, 22);
		PanelDatosEquipo.add(lblTelefono);
		
		lblEmail = new JLabel("  Email:");
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
		
		btnGuardarDatos = new JButton("GUARDAR");
		btnGuardarDatos.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnGuardarDatos.setBackground(Color.GREEN);
		btnGuardarDatos.setBounds(357, 252, 89, 23);
		PanelDatosEquipo.add(btnGuardarDatos);
		
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
		lblNombre.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNombre.setBackground(new Color(135, 206, 235));
		lblNombre.setBounds(10, 11, 152, 22);
		PanelDatosJugador.add(lblNombre);
		
		lblApellido = new JLabel("  Apellido: ");
		lblApellido.setOpaque(true);
		lblApellido.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblApellido.setBackground(new Color(135, 206, 235));
		lblApellido.setBounds(10, 44, 152, 22);
		PanelDatosJugador.add(lblApellido);
		
		lblDni = new JLabel("  DNI:");
		lblDni.setOpaque(true);
		lblDni.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblDni.setBackground(new Color(135, 206, 235));
		lblDni.setBounds(10, 77, 152, 22);
		PanelDatosJugador.add(lblDni);
		
		lblNacionalidad = new JLabel("  Nacionalidad:");
		lblNacionalidad.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNacionalidad.setOpaque(true);
		lblNacionalidad.setBackground(new Color(135, 206, 235));
		lblNacionalidad.setBounds(10, 110, 152, 22);
		PanelDatosJugador.add(lblNacionalidad);
		
		lblFechaDeNacimiento = new JLabel("  Fecha de nacimiento: ");
		lblFechaDeNacimiento.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblFechaDeNacimiento.setOpaque(true);
		lblFechaDeNacimiento.setBackground(new Color(135, 206, 235));
		lblFechaDeNacimiento.setBounds(10, 143, 152, 22);
		PanelDatosJugador.add(lblFechaDeNacimiento);
		
		lblPeso = new JLabel("  Peso:");
		lblPeso.setOpaque(true);
		lblPeso.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblPeso.setBackground(new Color(135, 206, 235));
		lblPeso.setBounds(294, 176, 65, 22);
		PanelDatosJugador.add(lblPeso);
		
		lblEdad = new JLabel("  Edad:");
		lblEdad.setOpaque(true);
		lblEdad.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblEdad.setBackground(new Color(135, 206, 235));
		lblEdad.setBounds(294, 143, 65, 22);
		PanelDatosJugador.add(lblEdad);
		
		lblAltura = new JLabel("  Altura: ");
		lblAltura.setOpaque(true);
		lblAltura.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblAltura.setBackground(new Color(135, 206, 235));
		lblAltura.setBounds(10, 176, 152, 22);
		PanelDatosJugador.add(lblAltura);
		
		lblEquipo = new JLabel("  Equipo:");
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
		
		CBEquipoJugador = new JComboBox();
		CBEquipoJugador.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3"}));
		CBEquipoJugador.setEditable(true);
		CBEquipoJugador.setBackground(new Color(175, 238, 238));
		CBEquipoJugador.setBounds(162, 209, 284, 22);
		PanelDatosJugador.add(CBEquipoJugador);
		PanelDatosPartidos.setLayout(null);
		PanelDatosPartidos.setBackground(Color.WHITE);
		PanelDatosPartidos.setBounds(127, 79, 456, 286);
		contentPane.add(PanelDatosPartidos);
		
		lblCategoria = new JLabel("  Categoria:");
		lblCategoria.setOpaque(true);
		lblCategoria.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblCategoria.setBackground(new Color(135, 206, 235));
		lblCategoria.setBounds(10, 44, 152, 22);
		PanelDatosPartidos.add(lblCategoria);
		
		lblCodPartido = new JLabel("  Codigo:");
		lblCodPartido.setOpaque(true);
		lblCodPartido.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblCodPartido.setBackground(new Color(135, 206, 235));
		lblCodPartido.setBounds(10, 11, 152, 22);
		PanelDatosPartidos.add(lblCodPartido);
		
		lblGrupo = new JLabel("  Grupo:");
		lblGrupo.setOpaque(true);
		lblGrupo.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblGrupo.setBackground(new Color(135, 206, 235));
		lblGrupo.setBounds(10, 77, 152, 22);
		PanelDatosPartidos.add(lblGrupo);
		
		lblFecha = new JLabel("  Fecha:");
		lblFecha.setOpaque(true);
		lblFecha.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblFecha.setBackground(new Color(135, 206, 235));
		lblFecha.setBounds(10, 110, 152, 22);
		PanelDatosPartidos.add(lblFecha);
		
		lblResultado = new JLabel("  Resultado:");
		lblResultado.setOpaque(true);
		lblResultado.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblResultado.setBackground(new Color(135, 206, 235));
		lblResultado.setBounds(10, 143, 152, 22);
		PanelDatosPartidos.add(lblResultado);
		
		lblEquipolocal = new JLabel("  Equipo Local:");
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
		lblEquipovisitante.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblEquipovisitante.setBackground(new Color(135, 206, 235));
		lblEquipovisitante.setBounds(10, 209, 152, 22);
		PanelDatosPartidos.add(lblEquipovisitante);
		
		CBEquipoLocal = new JComboBox();
		CBEquipoLocal.setEditable(true);
		CBEquipoLocal.setBackground(new Color(175, 238, 238));
		CBEquipoLocal.setBounds(162, 176, 284, 22);
		PanelDatosPartidos.add(CBEquipoLocal);
		
		CBEquipoVisitante = new JComboBox();
		CBEquipoVisitante.setEditable(true);
		CBEquipoVisitante.setBackground(new Color(175, 238, 238));
		CBEquipoVisitante.setBounds(162, 209, 284, 22);
		PanelDatosPartidos.add(CBEquipoVisitante);
		
		SPanelJugadores = new JPanel();
		SPanelJugadores.setVisible(false);
		
		SPanelEquipos = new JPanel();
		SPanelEquipos.setLayout(null);
		SPanelEquipos.setBackground(Color.WHITE);
		SPanelEquipos.setBounds(5, 79, 578, 286);
		contentPane.add(SPanelEquipos);
		
		PanelMuestraEquipos = new JPanel();
		PanelMuestraEquipos.setBounds(121, 0, 455, 284);
		SPanelEquipos.add(PanelMuestraEquipos);
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
		
		POpcionesEquipo = new JPanel();
		POpcionesEquipo.setLayout(null);
		POpcionesEquipo.setBackground(Color.WHITE);
		POpcionesEquipo.setBounds(0, 0, 111, 286);
		SPanelEquipos.add(POpcionesEquipo);
		
		CBCategorias = new JComboBox();
		CBCategorias.setBackground(new Color(65, 105, 225));
		CBCategorias.setModel(new DefaultComboBoxModel(new String[] {"     CATEGORIA"}));
		CBCategorias.setFont(new Font("Agency FB", Font.PLAIN, 11));
		CBCategorias.setEditable(true);
		CBCategorias.setBounds(10, 11, 91, 41);
		POpcionesEquipo.add(CBCategorias);
		
		CBGrupos = new JComboBox();
		CBGrupos.setBackground(new Color(65, 105, 225));
		CBGrupos.setModel(new DefaultComboBoxModel(new String[] {"     GRUPO"}));
		CBGrupos.setFont(new Font("Agency FB", Font.PLAIN, 11));
		CBGrupos.setEditable(true);
		CBGrupos.setBounds(10, 74, 91, 41);
		POpcionesEquipo.add(CBGrupos);
		
		CBEquipos = new JComboBox();
		CBEquipos.setBackground(new Color(65, 105, 225));
		CBEquipos.setModel(new DefaultComboBoxModel(new String[] {"     EQUIPO"}));
		CBEquipos.setFont(new Font("Agency FB", Font.PLAIN, 11));
		CBEquipos.setEditable(true);
		CBEquipos.setBounds(10, 138, 91, 41);
		POpcionesEquipo.add(CBEquipos);
		
		VPañadir = new JButton("NUEVO");
		VPañadir.setFont(new Font("Agency FB", Font.PLAIN, 15));
		VPañadir.setBackground(new Color(65, 105, 225));
		VPañadir.setBounds(10, 234, 91, 41);
		POpcionesEquipo.add(VPañadir);
		SPanelJugadores.setBackground(Color.WHITE);
		SPanelJugadores.setBounds(5, 79, 578, 286);
		contentPane.add(SPanelJugadores);
		SPanelJugadores.setLayout(null);
		
		PanelMuestraJugadores = new JPanel();
		PanelMuestraJugadores.setBounds(123, 2, 455, 284);
		SPanelJugadores.add(PanelMuestraJugadores);
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
		
		PanelDeEleccion = new JPanel();
		PanelDeEleccion.setBounds(0, 0, 111, 286);
		SPanelJugadores.add(PanelDeEleccion);
		PanelDeEleccion.setBackground(new Color(175, 238, 238));
		PanelDeEleccion.setLayout(null);
		
		CBCategoria = new JComboBox();
		CBCategoria.setFont(new Font("Agency FB", Font.PLAIN, 11));
		CBCategoria.setModel(new DefaultComboBoxModel(new String[] {"     Categoria"}));
		CBCategoria.setEditable(true);
		CBCategoria.setBounds(10, 11, 91, 41);
		PanelDeEleccion.add(CBCategoria);
		
		CBGrupo = new JComboBox();
		CBGrupo.setModel(new DefaultComboBoxModel(new String[] {"     Grupo"}));
		CBGrupo.setFont(new Font("Agency FB", Font.PLAIN, 11));
		CBGrupo.setEditable(true);
		CBGrupo.setBounds(10, 74, 91, 41);
		PanelDeEleccion.add(CBGrupo);
		
		CBEquipo = new JComboBox();
		CBEquipo.setModel(new DefaultComboBoxModel(new String[] {"     Equipo"}));
		CBEquipo.setFont(new Font("Agency FB", Font.PLAIN, 11));
		CBEquipo.setEditable(true);
		CBEquipo.setBounds(10, 138, 91, 41);
		PanelDeEleccion.add(CBEquipo);
		
		btnNuevo = new JButton("NUEVO");
		btnNuevo.setBackground(Color.WHITE);
		btnNuevo.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnNuevo.setBounds(10, 234, 91, 41);
		PanelDeEleccion.add(btnNuevo);
	}
}
