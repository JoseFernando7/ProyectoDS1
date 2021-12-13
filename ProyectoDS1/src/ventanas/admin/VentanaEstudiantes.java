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
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import controllers.AdEstudianteController;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class VentanaEstudiantes extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*Declaracion de variables*/
	private JButton btnUsuario;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					VentanaEstudiantes window = new VentanaEstudiantes();
					window.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaEstudiantes() 
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
				AdEstudianteController.botonUsuario();
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
		
		JLabel lblNewLabel = new JLabel("Estudiante\r\n");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setBounds(31, 48, 160, 56);
		panel_1.add(lblNewLabel);
		
		JLabel lblAoLectivo = new JLabel("Grado\r\n");
		lblAoLectivo.setForeground(Color.WHITE);
		lblAoLectivo.setFont(new Font("Century Gothic", Font.PLAIN, 22));
		lblAoLectivo.setBounds(31, 241, 160, 56);
		panel_1.add(lblAoLectivo);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBackground(SystemColor.windowBorder);
		btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		btnNewButton.setBounds(62, 606, 129, 49);
		panel_1.add(btnNewButton);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Iniciaci\u00F3n", "P\u00E1rvulos", "", "Prejard\u00EDn", "Jard\u00EDn ", "Transici\u00F3n"}));
		comboBox_1.setToolTipText("");
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		comboBox_1.setBackground(SystemColor.windowBorder);
		comboBox_1.setBounds(31, 336, 118, 39);
		panel_1.add(comboBox_1);
		
		JPanel panel_2 = new JPanel();
		
		panel_2.setBounds(468, 0, 706, 761);
		panel_2.setBackground(new Color(54, 57, 63));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JList list = new JList();
		list.setForeground(SystemColor.text);
		list.setBackground(SystemColor.windowBorder);
		list.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Carlos", "Andres", "Eduardo"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(130, 84, 449, 114);
		panel_2.add(list);
		
		JLabel lblEstudianteS = new JLabel("Estudiante\r\ns");
		lblEstudianteS.setForeground(Color.WHITE);
		lblEstudianteS.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblEstudianteS.setBounds(290, 27, 160, 56);
		panel_2.add(lblEstudianteS);
		
		JLabel lblInformacionEstudiante = new JLabel("Informacion Estudiante");
		lblInformacionEstudiante.setForeground(Color.WHITE);
		lblInformacionEstudiante.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblInformacionEstudiante.setBounds(254, 231, 229, 56);
		panel_2.add(lblInformacionEstudiante);
		
		JLabel lblCambiarGrado = new JLabel("Cambiar Grado");
		lblCambiarGrado.setForeground(Color.WHITE);
		lblCambiarGrado.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblCambiarGrado.setBounds(290, 515, 146, 56);
		panel_2.add(lblCambiarGrado);
		
		JLabel lblId = new JLabel("No Matricula: ");
		lblId.setForeground(Color.WHITE);
		lblId.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblId.setBounds(32, 332, 122, 56);
		panel_2.add(lblId);
		
		JLabel lblRh = new JLabel("RH:");
		lblRh.setForeground(Color.WHITE);
		lblRh.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblRh.setBounds(32, 370, 38, 56);
		panel_2.add(lblRh);
		
		JLabel lblNewLabel_1 = new JLabel("New Label");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(164, 332, 122, 56);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblId_2 = new JLabel("Nombre:");
		lblId_2.setForeground(Color.WHITE);
		lblId_2.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblId_2.setBounds(411, 332, 122, 56);
		panel_2.add(lblId_2);
		
		JLabel lblNoRegistroCivil = new JLabel("No Registro Civil:");
		lblNoRegistroCivil.setForeground(Color.WHITE);
		lblNoRegistroCivil.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblNoRegistroCivil.setBounds(32, 410, 159, 56);
		panel_2.add(lblNoRegistroCivil);
		
		JLabel lblNewLabel_3 = new JLabel("New Label");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(69, 370, 101, 56);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New Label");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(498, 332, 166, 56);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("New Label");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(180, 410, 122, 56);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblGrupoSanguineo = new JLabel("Grupo Sanguineo:");
		lblGrupoSanguineo.setForeground(Color.WHITE);
		lblGrupoSanguineo.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblGrupoSanguineo.setBounds(374, 410, 159, 56);
		panel_2.add(lblGrupoSanguineo);
		
		JLabel lblNewLabel_2_1 = new JLabel("New Label");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(542, 370, 122, 56);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("New Label");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblNewLabel_2_1_1.setBounds(542, 410, 122, 56);
		panel_2.add(lblNewLabel_2_1_1);
		
		JLabel lblFechaIngresoGuarderia = new JLabel("Fecha Ingreso Guarderia:");
		lblFechaIngresoGuarderia.setForeground(Color.WHITE);
		lblFechaIngresoGuarderia.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblFechaIngresoGuarderia.setBounds(32, 448, 229, 56);
		panel_2.add(lblFechaIngresoGuarderia);
		
		JLabel lblNewLabel_2_2 = new JLabel("New Label");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblNewLabel_2_2.setBounds(264, 448, 122, 56);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblGrado = new JLabel("Grado: ");
		lblGrado.setForeground(Color.WHITE);
		lblGrado.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblGrado.setBounds(468, 370, 73, 56);
		panel_2.add(lblGrado);
		
		JLabel lblSexo_1 = new JLabel("Sexo:");
		lblSexo_1.setForeground(Color.WHITE);
		lblSexo_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblSexo_1.setBounds(246, 370, 56, 56);
		panel_2.add(lblSexo_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("New Label");
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblNewLabel_2_1_2.setBounds(306, 370, 122, 56);
		panel_2.add(lblNewLabel_2_1_2);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento:");
		lblFechaNacimiento.setForeground(Color.WHITE);
		lblFechaNacimiento.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblFechaNacimiento.setBounds(367, 448, 229, 56);
		panel_2.add(lblFechaNacimiento);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("New Label");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblNewLabel_2_1_1_1.setBounds(542, 448, 122, 56);
		panel_2.add(lblNewLabel_2_1_1_1);
		
		JLabel lblCambiarGrado_1 = new JLabel("Cambiar Grado");
		lblCambiarGrado_1.setForeground(Color.WHITE);
		lblCambiarGrado_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblCambiarGrado_1.setBounds(32, 582, 229, 56);
		panel_2.add(lblCambiarGrado_1);
		
		JButton btnNewButton_1 = new JButton("Asignar");
		btnNewButton_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		btnNewButton_1.setBackground(SystemColor.windowBorder);
		btnNewButton_1.setBounds(307, 658, 129, 49);
		panel_2.add(btnNewButton_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Iniciaci\u00F3n", "P\u00E1rvulos", "Prejard\u00EDn", "Jard\u00EDn", "Transici\u00F3n"}));
		comboBox_2.setBounds(468, 594, 160, 41);
		panel_2.add(comboBox_2);
		
		JButton btnMatricula = new JButton("");
		btnMatricula.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				AdEstudianteController.botonMatricula();
			}
		});
		btnMatricula.setBounds(10, 90, 60, 60);
		btnMatricula.setIcon(new ImageIcon(new ImageIcon("Imgs/matricula.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnMatricula.setFocusPainted(false);
		btnMatricula.setBorderPainted(false);
		btnMatricula.setRolloverIcon(new ImageIcon(new ImageIcon("Imgs/matricula_hover.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		panel.add(btnMatricula);
		
		JButton btnProfesor = new JButton("");
		btnProfesor.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				AdEstudianteController.botonDocente();
			}
		});
		btnProfesor.setBounds(10, 161, 60, 60);
		btnProfesor.setIcon(new ImageIcon(new ImageIcon("Imgs/Profesor.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnProfesor.setFocusPainted(false);
		btnProfesor.setBorderPainted(false);
		btnProfesor.setRolloverIcon(new ImageIcon(new ImageIcon("Imgs/Profesor_hover.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		panel.add(btnProfesor);
		
		JButton btnEstudiantes = new JButton("");
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
				AdEstudianteController.botonReporte();
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
				AdEstudianteController.botonAnotaciones();
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