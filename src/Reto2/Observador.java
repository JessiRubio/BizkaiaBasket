package Reto2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class Observador extends JFrame {

	private JPanel contentPane;
	private JTable tablePartidos;
	private JTextField textClub;
	private JTextField textDirecci�n;
	private JTextField textProvincia;
	private JTextField textTitular;
	private JTextField textEmail;
	private JTextField textHoradeJuego;
	private JTextField textCampo;
	private JTextField textDirwecci�n2;
	private JTextField textProvincia2;
	private JTable tableClasificaci�n;
	private JTable tableEstad�sticas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Observador frame = new Observador();
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
	public Observador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 409);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel MenuObservador = new JPanel();
		MenuObservador.setBounds(5, 5, 569, 66);
		contentPane.add(MenuObservador);
		MenuObservador.setLayout(null);
		
		JButton btnCerrarSesi�n = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesi�n.setBackground(new Color(138, 45, 47));
		btnCerrarSesi�n.setFont(new Font("Agency FB", Font.PLAIN, 18));
		btnCerrarSesi�n.setToolTipText("");
		btnCerrarSesi�n.setBounds(0, 0, 131, 62);
		MenuObservador.add(btnCerrarSesi�n);
		
		JButton btnEquipos = new JButton("Equipos");
		btnEquipos.setBackground(new Color(183, 69, 68));
		btnEquipos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEquipos.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnEquipos.setBounds(131, 23, 120, 39);
		MenuObservador.add(btnEquipos);
		
		JLabel lblObservador = new JLabel("Observador");
		lblObservador.setFont(new Font("Agency FB", Font.PLAIN, 15));
		lblObservador.setBounds(425, 4, 64, 14);
		MenuObservador.add(lblObservador);
		
		JButton btnPartidos = new JButton("Partidos");
		btnPartidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPartidos.setBackground(new Color(183, 69, 68));
		btnPartidos.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnPartidos.setBounds(251, 23, 110, 39);
		MenuObservador.add(btnPartidos);
		
		JButton btnClasificaci�n = new JButton("Clasificaci\u00F3n");
		btnClasificaci�n.setBackground(new Color(183, 69, 68));
		btnClasificaci�n.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnClasificaci�n.setBounds(351, 23, 110, 39);
		MenuObservador.add(btnClasificaci�n);
		
		JButton btnEstad�sticas = new JButton("Estad\u00EDsticas");
		btnEstad�sticas.setBackground(new Color(183, 69, 68));
		btnEstad�sticas.setFont(new Font("Agency FB", Font.PLAIN, 15));
		btnEstad�sticas.setBounds(461, 23, 110, 39);
		MenuObservador.add(btnEstad�sticas);
		
		JButton btnCastellano = new JButton("");
		btnCastellano.setBounds(486, 0, 37, 23);
		MenuObservador.add(btnCastellano);
		btnCastellano.setIcon(new ImageIcon(Observador.class.getResource("/Imagenes/bandera-espana-con-escudo-para-exterior_xs.jpg")));
		
		JButton btnEuskera = new JButton("New button");
		btnEuskera.setBounds(523, 0, 45, 23);
		MenuObservador.add(btnEuskera);
		btnEuskera.setIcon(new ImageIcon(Observador.class.getResource("/Imagenes/1928414-app.android.ikurrina.png")));
		
		JPanel panelOpciones = new JPanel();
		panelOpciones.setBounds(15, 82, 110, 277);
		contentPane.add(panelOpciones);
		panelOpciones.setLayout(null);
		
		JComboBox comboCategoria = new JComboBox();
		comboCategoria.setBounds(10, 5, 90, 36);
		comboCategoria.setFont(new Font("Agency FB", Font.PLAIN, 15));
		comboCategoria.setModel(new DefaultComboBoxModel(new String[] {"Categor\u00EDa"}));
		comboCategoria.setBackground(new Color(113, 137, 58));
		comboCategoria.setToolTipText("");
		panelOpciones.add(comboCategoria);
		
		JComboBox comboGrupo = new JComboBox();
		comboGrupo.setBounds(10, 52, 90, 36);
		comboGrupo.setFont(new Font("Agency FB", Font.PLAIN, 15));
		comboGrupo.setModel(new DefaultComboBoxModel(new String[] {"Grupo"}));
		comboGrupo.setBackground(new Color(113, 137, 58));
		comboGrupo.setToolTipText("");
		panelOpciones.add(comboGrupo);
		
		JComboBox comboEquipo = new JComboBox();
		comboEquipo.setBounds(10, 101, 90, 36);
		comboEquipo.setModel(new DefaultComboBoxModel(new String[] {"Equipo"}));
		comboEquipo.setToolTipText("");
		comboEquipo.setFont(new Font("Agency FB", Font.PLAIN, 15));
		comboEquipo.setBackground(new Color(113, 137, 58));
		panelOpciones.add(comboEquipo);
		
		JPanel panelEstad�sticas = new JPanel();
		panelEstad�sticas.setBounds(124, 82, 450, 277);
		contentPane.add(panelEstad�sticas);
		
		tableEstad�sticas = new JTable();
		tableEstad�sticas.setBounds(10, 11, 430, 255);
		tableEstad�sticas.setModel(new DefaultTableModel(
			new Object[][] {
				{"  Nombre", "  Equipo", "  Promedio Tiros", "  Promedio Triples", "  Rebotes"},
			},
			new String[] {
				"Nombre", "Equipo", "Promedio Tiros", "Promedio Triples", "Rebotes"
			}
		));
		tableEstad�sticas.getColumnModel().getColumn(2).setPreferredWidth(100);
		tableEstad�sticas.getColumnModel().getColumn(3).setPreferredWidth(105);
		panelEstad�sticas.setLayout(null);
		panelEstad�sticas.add(tableEstad�sticas);
		
		JPanel panelClasificaci�n = new JPanel();
		panelClasificaci�n.setBounds(135, 94, 426, 254);
		contentPane.add(panelClasificaci�n);
		
		tableClasificaci�n = new JTable();
		tableClasificaci�n.setBounds(0, 0, 426, 267);
		tableClasificaci�n.setBackground(Color.WHITE);
		tableClasificaci�n.setGridColor(Color.WHITE);
		tableClasificaci�n.setModel(new DefaultTableModel(
			new Object[][] {
				{"  Nombre", "  Puesto", "  Partidos Ganados", "Partidos Perdidos"},
			},
			new String[] {
				"Nombre", "Puesto", "Partidos Ganados", "Partidos Perdidos "
			}
		));
		tableClasificaci�n.getColumnModel().getColumn(2).setPreferredWidth(100);
		tableClasificaci�n.getColumnModel().getColumn(3).setPreferredWidth(100);
		panelClasificaci�n.setLayout(null);
		panelClasificaci�n.add(tableClasificaci�n);
		
		JPanel panelPartidos = new JPanel();
		panelPartidos.setBounds(125, 82, 449, 277);
		contentPane.add(panelPartidos);
		panelPartidos.setLayout(null);
		
		tablePartidos = new JTable();
		tablePartidos.setModel(new DefaultTableModel(
			new Object[][] {
				{"  Equipo Local", " VS", "  Equipo Visitante", "  Resul EL", "  -", "  Resul EV"},
			},
			new String[] {
				"Equipo Local", "VS", "Equipo Visitante", "Resultado Equipo Local", "    -", "Resultado Equipo Visitante"
			}
		));
		tablePartidos.getColumnModel().getColumn(0).setPreferredWidth(100);
		tablePartidos.getColumnModel().getColumn(0).setMinWidth(8);
		tablePartidos.getColumnModel().getColumn(1).setPreferredWidth(20);
		tablePartidos.getColumnModel().getColumn(2).setPreferredWidth(100);
		tablePartidos.getColumnModel().getColumn(3).setPreferredWidth(50);
		tablePartidos.getColumnModel().getColumn(4).setPreferredWidth(20);
		tablePartidos.getColumnModel().getColumn(5).setPreferredWidth(50);
		tablePartidos.setBounds(10, 11, 429, 255);
		panelPartidos.add(tablePartidos);
		
		JPanel panelEquipos = new JPanel();
		panelEquipos.setBounds(125, 82, 449, 277);
		contentPane.add(panelEquipos);
		panelEquipos.setLayout(null);
		
		JLabel NomEquipo = new JLabel("Nombre Equipo");
		NomEquipo.setOpaque(true);
		NomEquipo.setForeground(new Color(0, 0, 0));
		NomEquipo.setBackground(new Color( 147, 180, 92));
		NomEquipo.setBounds(0, 0, 449, 23);
		panelEquipos.add(NomEquipo);
		
		JLabel lblClub = new JLabel("  Club:  ");
		lblClub.setOpaque(true);
		lblClub.setBackground(new Color(255, 254, 255));
		lblClub.setBounds(0, 23, 192, 23);
		panelEquipos.add(lblClub);
		
		JLabel lblDireccin = new JLabel("  Direcci\u00F3n: ");
		lblDireccin.setOpaque(true);
		lblDireccin.setBackground(new Color(239, 212, 217));
		lblDireccin.setBounds(0, 46, 192, 23);
		panelEquipos.add(lblDireccin);
		
		JLabel lblProvincia = new JLabel("  Provincia:");
		lblProvincia.setOpaque(true);
		lblProvincia.setBackground(new Color(255, 254, 255));
		lblProvincia.setBounds(0, 69, 192, 23);
		panelEquipos.add(lblProvincia);
		
		JLabel lblTitular = new JLabel("  Titular:");
		lblTitular.setOpaque(true);
		lblTitular.setBackground(new Color(239, 212, 217));
		lblTitular.setBounds(0, 92, 192, 23);
		panelEquipos.add(lblTitular);
		
		JLabel lblEmail = new JLabel("  Email:");
		lblEmail.setOpaque(true);
		lblEmail.setBackground(new Color(255, 254, 255));
		lblEmail.setBounds(0, 115, 192, 23);
		panelEquipos.add(lblEmail);
		
		JLabel lblCampo = new JLabel("  Campo:");
		lblCampo.setBackground(new Color(255, 254, 255));
		lblCampo.setOpaque(true);
		lblCampo.setBounds(0, 161, 192, 23);
		panelEquipos.add(lblCampo);
		
		JLabel lblHoraDeJuego_1 = new JLabel("  Hora de Juego:");
		lblHoraDeJuego_1.setBackground(new Color(239, 212, 217));
		lblHoraDeJuego_1.setOpaque(true);
		lblHoraDeJuego_1.setBounds(0, 138, 192, 23);
		panelEquipos.add(lblHoraDeJuego_1);
		
		JLabel lblDirecci�n2 = new JLabel("  Direcci\u00F3n: ");
		lblDirecci�n2.setBackground(new Color(239, 212, 217));
		lblDirecci�n2.setOpaque(true);
		lblDirecci�n2.setBounds(0, 184, 192, 23);
		panelEquipos.add(lblDirecci�n2);
		
		JLabel lblProvincia2 = new JLabel("  Provincia:");
		lblProvincia2.setBackground(new Color(255, 254, 255));
		lblProvincia2.setOpaque(true);
		lblProvincia2.setBounds(0, 207, 192, 23);
		panelEquipos.add(lblProvincia2);
		
		textClub = new JTextField();
		textClub.setBackground(new Color(239, 212, 217));
		textClub.setBounds(192, 24, 254, 23);
		panelEquipos.add(textClub);
		textClub.setColumns(10);
		
		textDirecci�n = new JTextField();
		textDirecci�n.setBackground(new Color(255, 254, 255));
		textDirecci�n.setColumns(10);
		textDirecci�n.setBounds(192, 46, 254, 23);
		panelEquipos.add(textDirecci�n);
		
		textProvincia = new JTextField();
		textProvincia.setBackground(new Color(239, 212, 217));
		textProvincia.setColumns(10);
		textProvincia.setBounds(192, 69, 254, 23);
		panelEquipos.add(textProvincia);
		
		textTitular = new JTextField();
		textTitular.setBackground(new Color(255, 254, 255));
		textTitular.setColumns(10);
		textTitular.setBounds(192, 92, 254, 23);
		panelEquipos.add(textTitular);
		
		textEmail = new JTextField();
		textEmail.setBackground(new Color(239, 212, 217));
		textEmail.setColumns(10);
		textEmail.setBounds(192, 115, 254, 23);
		panelEquipos.add(textEmail);
		
		textHoradeJuego = new JTextField();
		textHoradeJuego.setBackground(new Color(255, 254, 255));
		textHoradeJuego.setColumns(10);
		textHoradeJuego.setBounds(192, 138, 254, 23);
		panelEquipos.add(textHoradeJuego);
		
		textCampo = new JTextField();
		textCampo.setBackground(new Color(239, 212, 217));
		textCampo.setColumns(10);
		textCampo.setBounds(192, 161, 254, 23);
		panelEquipos.add(textCampo);
		
		textDirwecci�n2 = new JTextField();
		textDirwecci�n2.setBackground(new Color(255, 254, 255));
		textDirwecci�n2.setColumns(10);
		textDirwecci�n2.setBounds(192, 184, 254, 23);
		panelEquipos.add(textDirwecci�n2);
		
		textProvincia2 = new JTextField();
		textProvincia2.setBackground(new Color(239, 212, 217));
		textProvincia2.setColumns(10);
		textProvincia2.setBounds(192, 207, 254, 23);
		panelEquipos.add(textProvincia2);
	}
}
