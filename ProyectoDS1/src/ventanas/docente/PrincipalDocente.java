package ventanas.docente;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controllers.PDocenteController;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class PrincipalDocente extends JFrame
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
					PrincipalDocente window = new PrincipalDocente();
					window.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public PrincipalDocente() 
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
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(180, 40, 350, 40);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Documento:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(70, 125, 215, 30);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Nombres:");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(70, 180, 215, 30);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Apellidos:");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(70, 235, 215, 30);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Tel\u00E9fono:");
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_3.setBounds(70, 290, 215, 30);
		panel_2.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Correo:");
		lblNewLabel_2_4.setForeground(Color.WHITE);
		lblNewLabel_2_4.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_4.setBounds(70, 345, 215, 30);
		panel_2.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Estudio:");
		lblNewLabel_2_5.setForeground(Color.WHITE);
		lblNewLabel_2_5.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_5.setBounds(70, 400, 215, 30);
		panel_2.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("Grado a Cargo:");
		lblNewLabel_2_6.setForeground(Color.WHITE);
		lblNewLabel_2_6.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_6.setBounds(70, 455, 215, 30);
		panel_2.add(lblNewLabel_2_6);
		
		JLabel IDDocente = new JLabel("New label");
		IDDocente.setForeground(Color.WHITE);
		IDDocente.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		IDDocente.setBounds(300, 125, 320, 30);
		panel_2.add(IDDocente);
		
		JLabel nombreDocente = new JLabel("New label");
		nombreDocente.setForeground(Color.WHITE);
		nombreDocente.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		nombreDocente.setBounds(300, 180, 320, 30);
		panel_2.add(nombreDocente);
		
		JLabel apellidoDocente = new JLabel("New label");
		apellidoDocente.setForeground(Color.WHITE);
		apellidoDocente.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		apellidoDocente.setBounds(300, 235, 320, 30);
		panel_2.add(apellidoDocente);
		
		JLabel telDocente = new JLabel("New label");
		telDocente.setForeground(Color.WHITE);
		telDocente.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		telDocente.setBounds(300, 290, 320, 30);
		panel_2.add(telDocente);
		
		JLabel correoDocente = new JLabel("New label");
		correoDocente.setForeground(Color.WHITE);
		correoDocente.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		correoDocente.setBounds(300, 345, 320, 30);
		panel_2.add(correoDocente);
		
		JLabel estudioDocente = new JLabel("New label");
		estudioDocente.setForeground(Color.WHITE);
		estudioDocente.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		estudioDocente.setBounds(300, 400, 320, 30);
		panel_2.add(estudioDocente);
		
		JLabel gradoDocente = new JLabel("New label");
		gradoDocente.setForeground(Color.WHITE);
		gradoDocente.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		gradoDocente.setBounds(300, 455, 320, 30);
		panel_2.add(gradoDocente);
		
		JButton btnCambiarContrasena = new JButton("Cambiar Contrase\u00F1a");
		btnCambiarContrasena.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		btnCambiarContrasena.setBounds(60, 693, 200, 30);
		btnCambiarContrasena.setFocusPainted(false);
		panel_2.add(btnCambiarContrasena);
		
		JButton btnMensualidad = new JButton("");
		btnMensualidad.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				PDocenteController.botonMensualidad();
			}
		});
		btnMensualidad.setBounds(10, 90, 60, 60);
		btnMensualidad.setIcon(new ImageIcon(new ImageIcon("Imgs/pago_mensualidad.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnMensualidad.setFocusPainted(false);
		btnMensualidad.setBorderPainted(false);
		btnMensualidad.setRolloverIcon(new ImageIcon(new ImageIcon("Imgs/pago_mensualidad_hover.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		panel.add(btnMensualidad);
		
		JButton btnInforme = new JButton("");
		btnInforme.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				PDocenteController.botonInforme();
			}
		});
		btnInforme.setBounds(10, 161, 60, 60);
		btnInforme.setIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnInforme.setFocusPainted(false);
		btnInforme.setBorderPainted(false);
		btnInforme.setRolloverIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas_hover.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		panel.add(btnInforme);
	}
}
