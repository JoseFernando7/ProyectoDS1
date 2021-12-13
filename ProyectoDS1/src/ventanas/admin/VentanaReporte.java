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
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controllers.PrincipalController;
import controllers.ReporteController;

public class VentanaReporte extends JFrame
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
					VentanaReporte window = new VentanaReporte();
					window.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaReporte() 
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
				ReporteController.botonUsuario();
			}
		});
		btnUsuario.setBounds(10, 11, 60, 60);
		btnUsuario.setIcon(new ImageIcon(new ImageIcon("Imgs/avatar.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnUsuario.setFocusPainted(false);
		btnUsuario.setBorderPainted(false);
		panel.add(btnUsuario);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(81, 0, 403, 761);
		panel_1.setBackground(new Color(47, 49, 54));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		String grados[] = { "Iniciación", "Parvulos", "Pre-Jardin", "Jardin", "Transición"};
		JList list_2 = new JList(grados);
		list_2.setVisibleRowCount(3);
		list_2.setFont(new Font("Century Gothic", Font.BOLD, 18));
		list_2.setBounds(200, 200, 128, 99);
		panel_1.add(list_2);
		list_2.setForeground(Color.BLACK);
		
		JScrollPane scrollPane = new JScrollPane(list_2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,  JScrollPane.HORIZONTAL_SCROLLBAR_NEVER );
		scrollPane.setBounds(127, 200, 128, 80);
			
			
		panel_1.add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("Grados");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel.setBounds(153, 144, 81, 23);
		panel_1.add(lblNewLabel);
		
		JLabel lblReporteDeNotas = new JLabel("Reporte de Notas");
		lblReporteDeNotas.setHorizontalAlignment(SwingConstants.CENTER);
		lblReporteDeNotas.setForeground(Color.WHITE);
		lblReporteDeNotas.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblReporteDeNotas.setBounds(60, 70, 280, 42);
		panel_1.add(lblReporteDeNotas);
		
		JButton btnNewButton = new JButton("Generar Reporte");
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 16));
		btnNewButton.setBounds(111, 658, 165, 42);
		panel_1.add(btnNewButton);
		
		String nombresEst[] = { "Diego Martinez", "Laura Vidal", "Alberto Ruiz" };
		JLabel lblEstudiantes = new JLabel("Estudiantes");
		lblEstudiantes.setBounds(127, 376, 143, 23);
		panel_1.add(lblEstudiantes);
		lblEstudiantes.setForeground(Color.WHITE);
		lblEstudiantes.setFont(new Font("Century Gothic", Font.BOLD, 20));
		JList list = new JList(nombresEst);
		list.setBounds(110, 410, 165, 116);
		panel_1.add(list);
		list.setFont(new Font("Century Gothic", Font.BOLD, 17));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(483, 0, 701, 761);
		panel_2.setBackground(new Color(54, 57, 63));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblActividades = new JLabel("Descripci\u00F3n de Actividad:");
		lblActividades.setForeground(Color.WHITE);
		lblActividades.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblActividades.setBounds(76, 347, 310, 23);
		panel_2.add(lblActividades);
		
		JLabel lblNotas = new JLabel("Nota");
		lblNotas.setForeground(Color.WHITE);
		lblNotas.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNotas.setBounds(76, 270, 143, 23);
		panel_2.add(lblNotas);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(76, 411, 580, 120);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNotas_1 = new JLabel(".");
		lblNotas_1.setForeground(Color.WHITE);
		lblNotas_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNotas_1.setBounds(229, 270, 143, 23);
		panel_2.add(lblNotas_1);
		
		
		
		
		
		JButton btnMatricula = new JButton("");
		btnMatricula.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				ReporteController.botonMatricula();
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
				ReporteController.botonDocente();
			}
		});
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
				ReporteController.botonEstudiante();
			}
		});
		btnEstudiantes.setBounds(10, 232, 60, 60);
		btnEstudiantes.setIcon(new ImageIcon(new ImageIcon("Imgs/estudiantes.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnEstudiantes.setFocusPainted(false);
		btnEstudiantes.setBorderPainted(false);
		btnEstudiantes.setRolloverIcon(new ImageIcon(new ImageIcon("Imgs/estudiantes_hover.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		panel.add(btnEstudiantes);
		
		JButton btnReportes = new JButton("");
		btnReportes.setBounds(10, 303, 60, 60);
		btnReportes.setIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnReportes.setFocusPainted(false);
		btnReportes.setBorderPainted(false);
		btnReportes.setRolloverIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas_hover.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		panel.add(btnReportes);
		
		JButton btnAnotaciones = new JButton("");
		btnAnotaciones.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				PrincipalController.botonAnotaciones();
			}
		});
		btnAnotaciones.setBounds(10, 374, 60, 60);
		btnAnotaciones.setIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnAnotaciones.setFocusPainted(false);
		btnAnotaciones.setBorderPainted(false);
		btnAnotaciones.setRolloverIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas_hover.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		panel.add(btnAnotaciones);
	}
}

