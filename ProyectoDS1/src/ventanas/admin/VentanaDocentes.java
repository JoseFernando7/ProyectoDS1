package ventanas.admin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controllers.DocenteController;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JList;

public class VentanaDocentes extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*Declaracion de variables*/
	private JButton btnUsuario;
	private JTextField ID_Docente;
	private JTextField nombre_Docente;
	private JTextField apellido_Docente;
	private JTextField telefono_Docente;
	private JTextField Correo_Docente;
	private JTextField estudios_Docente;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					VentanaDocentes window = new VentanaDocentes();
					window.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaDocentes() 
	{
		initialize();
	}

	private void initialize() 
	{
		setResizable(false);
		setBounds(100, 100, 1200, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1184, 761);
		panel.setBackground(new Color(32, 34, 37));
		getContentPane().add(panel);
		panel.setLayout(null);
		
		btnUsuario = new JButton("");
		btnUsuario.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				DocenteController.botonUsuario();
			}
		});
		btnUsuario.setBounds(10, 11, 60, 60);
		btnUsuario.setIcon(new ImageIcon(new ImageIcon("Imgs/avatar.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnUsuario.setFocusPainted(false);
		btnUsuario.setBorderPainted(false);
		panel.add(btnUsuario);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(80, 0, 400, 761);
		panel_1.setBackground(new Color(47, 49, 54));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registrar Docente");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(35, 45, 315, 40);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 143, 37, 33);
		panel_1.add(lblNewLabel_1);
		
		ID_Docente = new JTextField();
		ID_Docente.setForeground(Color.WHITE);
		ID_Docente.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		ID_Docente.setBounds(117, 143, 255, 33);
		ID_Docente.setBackground(new Color(87, 87, 87));
		panel_1.add(ID_Docente);
		ID_Docente.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombres:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(10, 199, 84, 33);
		panel_1.add(lblNewLabel_1_1);
		
		nombre_Docente = new JTextField();
		nombre_Docente.setForeground(Color.WHITE);
		nombre_Docente.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		nombre_Docente.setColumns(10);
		nombre_Docente.setBackground(new Color(87, 87, 87));
		nombre_Docente.setBounds(117, 199, 255, 33);
		panel_1.add(nombre_Docente);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Apellidos:");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblNewLabel_1_1_1.setBounds(10, 256, 93, 33);
		panel_1.add(lblNewLabel_1_1_1);
		
		apellido_Docente = new JTextField();
		apellido_Docente.setForeground(Color.WHITE);
		apellido_Docente.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		apellido_Docente.setColumns(10);
		apellido_Docente.setBackground(new Color(87, 87, 87));
		apellido_Docente.setBounds(117, 256, 255, 33);
		panel_1.add(apellido_Docente);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Tel\u00E9fono:");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblNewLabel_1_1_1_1.setBounds(10, 315, 93, 33);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Correo:");
		lblNewLabel_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblNewLabel_1_1_1_2.setBounds(10, 373, 93, 33);
		panel_1.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Estudios:");
		lblNewLabel_1_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_3.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblNewLabel_1_1_1_3.setBounds(10, 433, 93, 33);
		panel_1.add(lblNewLabel_1_1_1_3);
		
		telefono_Docente = new JTextField();
		telefono_Docente.setForeground(Color.WHITE);
		telefono_Docente.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		telefono_Docente.setColumns(10);
		telefono_Docente.setBackground(new Color(87, 87, 87));
		telefono_Docente.setBounds(117, 315, 255, 33);
		panel_1.add(telefono_Docente);
		
		Correo_Docente = new JTextField();
		Correo_Docente.setForeground(Color.WHITE);
		Correo_Docente.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		Correo_Docente.setColumns(10);
		Correo_Docente.setBackground(new Color(87, 87, 87));
		Correo_Docente.setBounds(117, 373, 255, 33);
		panel_1.add(Correo_Docente);
		
		estudios_Docente = new JTextField();
		estudios_Docente.setForeground(Color.WHITE);
		estudios_Docente.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		estudios_Docente.setColumns(10);
		estudios_Docente.setBackground(new Color(87, 87, 87));
		estudios_Docente.setBounds(117, 433, 255, 33);
		panel_1.add(estudios_Docente);
		
		JButton btnRegistrarDocente = new JButton("REGISTRAR");
		btnRegistrarDocente.setForeground(Color.WHITE);
		btnRegistrarDocente.setFont(new Font("Century Gothic", Font.BOLD, 22));
		btnRegistrarDocente.setBounds(110, 530, 190, 40);
		btnRegistrarDocente.setBackground(new Color(87, 87, 87));
		btnRegistrarDocente.setFocusPainted(false);
		//btnRegistrarDocente.setBorderPainted(false);
		panel_1.add(btnRegistrarDocente);
		
		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.setForeground(Color.WHITE);
		btnModificar.setFont(new Font("Century Gothic", Font.BOLD, 22));
		btnModificar.setFocusPainted(false);
		btnModificar.setBackground(new Color(87, 87, 87));
		btnModificar.setBounds(110, 600, 190, 40);
		panel_1.add(btnModificar);
		
		JButton btnInhabilitar = new JButton("INHABILITAR");
		btnInhabilitar.setForeground(Color.WHITE);
		btnInhabilitar.setFont(new Font("Century Gothic", Font.BOLD, 22));
		btnInhabilitar.setFocusPainted(false);
		btnInhabilitar.setBackground(new Color(87, 87, 87));
		btnInhabilitar.setBounds(110, 670, 190, 40);
		panel_1.add(btnInhabilitar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(478, 0, 706, 761);
		panel_2.setBackground(new Color(54, 57, 63));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Docentes");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(147, 47, 440, 40);
		panel_2.add(lblNewLabel_2);
		
		String nombres[] = {"Carlos", "Jose", "Monika"};
		JList listaDocentes = new JList(nombres);
		listaDocentes.setForeground(Color.WHITE);
		listaDocentes.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		listaDocentes.setBounds(57, 141, 310, 93);
		listaDocentes.setBackground(new Color(87, 87, 87));
		panel_2.add(listaDocentes);
		
		JLabel lblNewLabel_2_1 = new JLabel("Informaci\u00F3n Docente");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(187, 245, 363, 40);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("ID:");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(57, 309, 52, 26);
		panel_2.add(lblNewLabel_3);
		
		JLabel infoIdDocente = new JLabel("New label");
		infoIdDocente.setForeground(Color.WHITE);
		infoIdDocente.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		infoIdDocente.setBounds(139, 309, 210, 26);
		panel_2.add(infoIdDocente);
		
		JLabel lblNewLabel_3_1 = new JLabel("Tel\u00E9fono:");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblNewLabel_3_1.setBounds(364, 309, 94, 26);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel infoTelDocente = new JLabel("New label");
		infoTelDocente.setForeground(Color.WHITE);
		infoTelDocente.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		infoTelDocente.setBounds(468, 309, 194, 26);
		panel_2.add(infoTelDocente);
		
		JLabel lblNewLabel_3_2 = new JLabel("Correo:");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblNewLabel_3_2.setBounds(57, 378, 72, 26);
		panel_2.add(lblNewLabel_3_2);
		
		JLabel infoCorreoDocente = new JLabel("New label");
		infoCorreoDocente.setForeground(Color.WHITE);
		infoCorreoDocente.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		infoCorreoDocente.setBounds(139, 378, 210, 26);
		panel_2.add(infoCorreoDocente);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Estudio:");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblNewLabel_3_1_1.setBounds(364, 378, 80, 26);
		panel_2.add(lblNewLabel_3_1_1);
		
		JLabel infoEstDocente = new JLabel("New label");
		infoEstDocente.setForeground(Color.WHITE);
		infoEstDocente.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		infoEstDocente.setBounds(468, 378, 194, 26);
		panel_2.add(infoEstDocente);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Asignar Docente");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_1_1.setBounds(187, 472, 363, 40);
		panel_2.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Seleccionar grado:");
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_2_1.setForeground(Color.WHITE);
		lblNewLabel_3_2_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblNewLabel_3_2_1.setBounds(57, 532, 179, 26);
		panel_2.add(lblNewLabel_3_2_1);
		
		JComboBox<String> listaGrados = new JComboBox<String>();
		listaGrados.setBounds(364, 532, 298, 34);
		listaGrados.addItem("Iniciación");
		listaGrados.addItem("Párvulos");
		listaGrados.addItem("Prejardín");
		listaGrados.addItem("Jardín");
		listaGrados.addItem("Transición");
		panel_2.add(listaGrados);
		
		JButton btnAsignarDocente = new JButton("ASIGNAR");
		btnAsignarDocente.setForeground(Color.WHITE);
		btnAsignarDocente.setFont(new Font("Century Gothic", Font.BOLD, 22));
		btnAsignarDocente.setFocusPainted(false);
		btnAsignarDocente.setBackground(new Color(87, 87, 87));
		btnAsignarDocente.setBounds(268, 620, 190, 40);
		panel_2.add(btnAsignarDocente);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("Grado:");
		lblNewLabel_3_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_2_2.setForeground(Color.WHITE);
		lblNewLabel_3_2_2.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblNewLabel_3_2_2.setBounds(57, 435, 72, 26);
		panel_2.add(lblNewLabel_3_2_2);
		
		JLabel infoGradoDocente = new JLabel("New label");
		infoGradoDocente.setForeground(Color.WHITE);
		infoGradoDocente.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		infoGradoDocente.setBounds(139, 435, 210, 26);
		panel_2.add(infoGradoDocente);
		
		JButton btnMatricula = new JButton("");
		btnMatricula.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				DocenteController.botonMatricula();
			}
		});
		btnMatricula.setBounds(10, 90, 60, 60);
		btnMatricula.setIcon(new ImageIcon(new ImageIcon("Imgs/matricula.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnMatricula.setFocusPainted(false);
		btnMatricula.setBorderPainted(false);
		btnMatricula.setRolloverIcon(new ImageIcon(new ImageIcon("Imgs/matricula_hover.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		panel.add(btnMatricula);
		
		JButton btnProfesor = new JButton("");
		btnProfesor.setBounds(10, 161, 60, 60);
		btnProfesor.setIcon(new ImageIcon(new ImageIcon("Imgs/Profesor.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnProfesor.setFocusPainted(false);
		btnProfesor.setBorderPainted(false);
		btnProfesor.setRolloverIcon(new ImageIcon(new ImageIcon("Imgs/Profesor_hover.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		panel.add(btnProfesor);
		
		JButton btnEstudiantes = new JButton("");
		btnEstudiantes.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				DocenteController.botonEstudiante();
			}
		});
		btnEstudiantes.setBounds(10, 232, 60, 60);
		btnEstudiantes.setIcon(new ImageIcon(new ImageIcon("Imgs/estudiantes.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnEstudiantes.setFocusPainted(false);
		btnEstudiantes.setBorderPainted(false);
		btnEstudiantes.setRolloverIcon(new ImageIcon(new ImageIcon("Imgs/estudiantes_hover.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		panel.add(btnEstudiantes);
		
		JButton btnReportes = new JButton("");
		btnReportes.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				DocenteController.botonReporte();
			}
		});
		btnReportes.setBounds(10, 303, 60, 60);
		btnReportes.setIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnReportes.setFocusPainted(false);
		btnReportes.setBorderPainted(false);
		btnReportes.setRolloverIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas_hover.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		panel.add(btnReportes);
		
		JButton btnRegistrar = new JButton("");
		btnRegistrar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				DocenteController.botonAnotaciones();
			}
		});
		btnRegistrar.setBounds(10, 374, 60, 60);
		btnRegistrar.setIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnRegistrar.setFocusPainted(false);
		btnRegistrar.setBorderPainted(false);
		btnRegistrar.setRolloverIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas_hover.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		panel.add(btnRegistrar);
	}
}
