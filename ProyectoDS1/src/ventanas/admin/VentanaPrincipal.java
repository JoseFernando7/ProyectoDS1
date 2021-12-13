package ventanas.admin;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controllers.PrincipalController;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class VentanaPrincipal extends JFrame
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
					VentanaPrincipal window = new VentanaPrincipal();
					window.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaPrincipal() 
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
		
		JLabel labelLogo = new JLabel("");
		labelLogo.setBounds(70, 72, 256, 256);
		labelLogo.setIcon(new ImageIcon("Imgs/guarderia_simbol.png"));
		panel_1.add(labelLogo);
		
		JLabel labelNombre = new JLabel("");
		labelNombre.setBounds(70, 365, 256, 30);
		labelNombre.setIcon(new ImageIcon(new ImageIcon("Imgs/top_logo.png").getImage().getScaledInstance(256, 30, Image.SCALE_DEFAULT)));
		panel_1.add(labelNombre);
		
		JLabel lblNewLabel = new JLabel("Tel\u00E9fono: 555-018000");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblNewLabel.setBounds(30, 440, 330, 30);
		panel_1.add(lblNewLabel);
		
		JLabel lblDireccinCra = new JLabel("Direcci\u00F3n: cra 57 #120 C 48");
		lblDireccinCra.setForeground(Color.WHITE);
		lblDireccinCra.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblDireccinCra.setBounds(30, 490, 330, 30);
		panel_1.add(lblDireccinCra);
		
		JLabel lblBarrancabermeja = new JLabel("Barrancabermeja");
		lblBarrancabermeja.setForeground(Color.WHITE);
		lblBarrancabermeja.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblBarrancabermeja.setBounds(30, 540, 330, 30);
		panel_1.add(lblBarrancabermeja);
		
		JLabel lblChiquilinesaventureroscomco = new JLabel("chiquilinesaventureros.com.co");
		lblChiquilinesaventureroscomco.setForeground(Color.WHITE);
		lblChiquilinesaventureroscomco.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblChiquilinesaventureroscomco.setBounds(30, 590, 330, 30);
		panel_1.add(lblChiquilinesaventureroscomco);
		
		JLabel lblChiquilinesAventureros = new JLabel("\u00A9 Chiquilines Aventureros");
		lblChiquilinesAventureros.setForeground(Color.WHITE);
		lblChiquilinesAventureros.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblChiquilinesAventureros.setBounds(10, 720, 199, 30);
		panel_1.add(lblChiquilinesAventureros);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(478, 0, 706, 761);
		panel_2.setBackground(new Color(54, 57, 63));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Informaci\u00F3n");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(160, 35, 400, 50);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Documento:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(60, 150, 130, 30);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Nombres:");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(60, 230, 130, 30);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Apellidos:");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_1_1.setBounds(60, 310, 130, 30);
		panel_2.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Tel\u00E9fono:");
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_1_2.setBounds(60, 390, 130, 30);
		panel_2.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Nombre:");
		lblNewLabel_2_1_3.setForeground(Color.WHITE);
		lblNewLabel_2_1_3.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_1_3.setBounds(60, 470, 130, 30);
		panel_2.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(230, 150, 200, 30);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(230, 230, 200, 30);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("New label");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_3_2.setBounds(230, 310, 200, 30);
		panel_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("New label");
		lblNewLabel_3_3.setForeground(Color.WHITE);
		lblNewLabel_3_3.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_3_3.setBounds(230, 390, 200, 30);
		panel_2.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("New label");
		lblNewLabel_3_4.setForeground(Color.WHITE);
		lblNewLabel_3_4.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_3_4.setBounds(230, 470, 200, 30);
		panel_2.add(lblNewLabel_3_4);
		
		JButton btnCambiarContrasena = new JButton("Cambiar Contrase\u00F1a");
		btnCambiarContrasena.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		btnCambiarContrasena.setBounds(60, 693, 200, 30);
		btnCambiarContrasena.setFocusPainted(false);
		panel_2.add(btnCambiarContrasena);
		
		JButton btnMatricula = new JButton("");
		btnMatricula.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				PrincipalController.botonMatricula();
			}
		});
		btnMatricula.setBounds(10, 90, 60, 60);
		btnMatricula.setCursor(new Cursor(HAND_CURSOR));
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
				PrincipalController.botonDocente();
			}
		});
		btnProfesor.setBounds(10, 161, 60, 60);
		btnProfesor.setCursor(new Cursor(HAND_CURSOR));
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
				PrincipalController.botonEstudiante();
			}
		});
		btnEstudiantes.setBounds(10, 232, 60, 60);
		btnEstudiantes.setCursor(new Cursor(HAND_CURSOR));
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
				PrincipalController.botonReporte();
			}
		});
		btnReportes.setBounds(10, 303, 60, 60);
		btnReportes.setCursor(new Cursor(HAND_CURSOR));
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
		btnAnotaciones.setCursor(new Cursor(HAND_CURSOR));
		btnAnotaciones.setIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnAnotaciones.setFocusPainted(false);
		btnAnotaciones.setBorderPainted(false);
		btnAnotaciones.setRolloverIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas_hover.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		panel.add(btnAnotaciones);
	}
}
