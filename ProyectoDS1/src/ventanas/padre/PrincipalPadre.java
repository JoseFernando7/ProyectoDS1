package ventanas.padre;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controllers.PPadreController;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PrincipalPadre extends JFrame
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
					PrincipalPadre window = new PrincipalPadre();
					window.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public PrincipalPadre() 
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
		lblNewLabel_1.setBounds(180, 40, 350, 40);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre Titular:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(48, 123, 215, 28);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Documento:");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(48, 177, 215, 28);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Direcci\u00F3n:");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(48, 239, 215, 28);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Tel\u00E9fono:");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_3.setBounds(48, 300, 215, 28);
		panel_2.add(lblNewLabel_2_3);
		
		JLabel nombreTitular = new JLabel("New label");
		nombreTitular.setForeground(Color.WHITE);
		nombreTitular.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		nombreTitular.setBounds(292, 123, 269, 28);
		panel_2.add(nombreTitular);
		
		JLabel IDTitular = new JLabel("New label");
		IDTitular.setForeground(Color.WHITE);
		IDTitular.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		IDTitular.setBounds(292, 177, 269, 28);
		panel_2.add(IDTitular);
		
		JLabel dirTitular = new JLabel("New label");
		dirTitular.setForeground(Color.WHITE);
		dirTitular.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		dirTitular.setBounds(292, 239, 269, 28);
		panel_2.add(dirTitular);
		
		JLabel telTitular = new JLabel("New label");
		telTitular.setForeground(Color.WHITE);
		telTitular.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		telTitular.setBounds(292, 300, 269, 28);
		panel_2.add(telTitular);
		
		JLabel lblNewLabel_2_4 = new JLabel("Nombre Estudiante:");
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_4.setForeground(Color.WHITE);
		lblNewLabel_2_4.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_4.setBounds(48, 390, 215, 28);
		panel_2.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("N\u00FAmero Matr\u00EDcula:");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_5.setForeground(Color.WHITE);
		lblNewLabel_2_5.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_5.setBounds(48, 429, 215, 28);
		panel_2.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("Registro Civil:");
		lblNewLabel_2_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_6.setForeground(Color.WHITE);
		lblNewLabel_2_6.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_6.setBounds(48, 468, 215, 28);
		panel_2.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_7 = new JLabel("Tipo de Sangre:");
		lblNewLabel_2_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_7.setForeground(Color.WHITE);
		lblNewLabel_2_7.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_7.setBounds(48, 507, 215, 28);
		panel_2.add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_2_8 = new JLabel("Fecha Nacimiento:");
		lblNewLabel_2_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_8.setForeground(Color.WHITE);
		lblNewLabel_2_8.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_8.setBounds(48, 546, 215, 28);
		panel_2.add(lblNewLabel_2_8);
		
		JLabel lblNewLabel_2_9 = new JLabel("Fecha Ingreso:");
		lblNewLabel_2_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_9.setForeground(Color.WHITE);
		lblNewLabel_2_9.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_9.setBounds(48, 585, 215, 28);
		panel_2.add(lblNewLabel_2_9);
		
		JLabel lblNewLabel_2_10 = new JLabel("Grado:");
		lblNewLabel_2_10.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_10.setForeground(Color.WHITE);
		lblNewLabel_2_10.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_10.setBounds(48, 624, 215, 28);
		panel_2.add(lblNewLabel_2_10);
		
		JLabel lblNewLabel_2_11 = new JLabel("Sexo:");
		lblNewLabel_2_11.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_11.setForeground(Color.WHITE);
		lblNewLabel_2_11.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_11.setBounds(48, 663, 215, 28);
		panel_2.add(lblNewLabel_2_11);
		
		JLabel telTitular_1 = new JLabel("New label");
		telTitular_1.setForeground(Color.WHITE);
		telTitular_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		telTitular_1.setBounds(292, 390, 269, 28);
		panel_2.add(telTitular_1);
		
		JLabel telTitular_2 = new JLabel("New label");
		telTitular_2.setForeground(Color.WHITE);
		telTitular_2.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		telTitular_2.setBounds(292, 429, 269, 28);
		panel_2.add(telTitular_2);
		
		JLabel telTitular_3 = new JLabel("New label");
		telTitular_3.setForeground(Color.WHITE);
		telTitular_3.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		telTitular_3.setBounds(292, 468, 269, 28);
		panel_2.add(telTitular_3);
		
		JLabel telTitular_4 = new JLabel("New label");
		telTitular_4.setForeground(Color.WHITE);
		telTitular_4.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		telTitular_4.setBounds(292, 507, 269, 28);
		panel_2.add(telTitular_4);
		
		JLabel telTitular_5 = new JLabel("New label");
		telTitular_5.setForeground(Color.WHITE);
		telTitular_5.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		telTitular_5.setBounds(292, 546, 269, 28);
		panel_2.add(telTitular_5);
		
		JLabel telTitular_6 = new JLabel("New label");
		telTitular_6.setForeground(Color.WHITE);
		telTitular_6.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		telTitular_6.setBounds(292, 585, 269, 28);
		panel_2.add(telTitular_6);
		
		JLabel telTitular_7 = new JLabel("New label");
		telTitular_7.setForeground(Color.WHITE);
		telTitular_7.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		telTitular_7.setBounds(292, 624, 269, 28);
		panel_2.add(telTitular_7);
		
		JLabel telTitular_8 = new JLabel("New label");
		telTitular_8.setForeground(Color.WHITE);
		telTitular_8.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		telTitular_8.setBounds(292, 663, 269, 28);
		panel_2.add(telTitular_8);
		
		JButton btnCambiarContrasena = new JButton("Cambiar Contrase\u00F1a");
		btnCambiarContrasena.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		btnCambiarContrasena.setBounds(48, 702, 200, 30);
		btnCambiarContrasena.setFocusPainted(false);
		panel_2.add(btnCambiarContrasena);
		
		JButton btnConsultar = new JButton("");
		btnConsultar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				PPadreController.botonNotas();
			}
		});
		btnConsultar.setBounds(10, 90, 60, 60);
		btnConsultar.setIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnConsultar.setFocusPainted(false);
		btnConsultar.setBorderPainted(false);
		btnConsultar.setRolloverIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas_hover.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		panel.add(btnConsultar);
	}
}
