package ventanas.docente;

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

import controllers.MensualidadController;

import java.awt.Font;
import javax.swing.JTextField;

public class VentanaMensualidad extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*Declaracion de variables*/
	private JButton btnUsuario;
	private JTextField cantidadPago;
	private JTextField estudiantePago;
	private JTextField fechaPago;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					VentanaMensualidad window = new VentanaMensualidad();
					window.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaMensualidad() 
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
				MensualidadController.botonUsuario();
			}
		});
		btnUsuario.setBounds(10, 11, 60, 60);
		btnUsuario.setIcon(new ImageIcon(new ImageIcon("Imgs/avatar.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnUsuario.setFocusPainted(false);
		btnUsuario.setBorderPainted(false);
		panel.add(btnUsuario);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(80, 0, 1104, 761);
		panel_2.setBackground(new Color(54, 57, 63));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registrar Mensualidad");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(276, 23, 527, 51);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad a Pagar:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(149, 149, 258, 35);
		panel_2.add(lblNewLabel_1);
		
		cantidadPago = new JTextField();
		cantidadPago.setBounds(522, 149, 314, 35);
		cantidadPago.setForeground(Color.WHITE);
		cantidadPago.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		cantidadPago.setBackground(new Color(87, 87, 87));
		panel_2.add(cantidadPago);
		cantidadPago.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre del Estudiante:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(149, 258, 314, 35);
		panel_2.add(lblNewLabel_1_1);
		
		estudiantePago = new JTextField();
		estudiantePago.setColumns(10);
		estudiantePago.setBounds(522, 258, 314, 35);
		estudiantePago.setForeground(Color.WHITE);
		estudiantePago.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		estudiantePago.setBackground(new Color(87, 87, 87));
		panel_2.add(estudiantePago);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Fecha de Pago:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblNewLabel_1_1_1.setBounds(149, 383, 314, 35);
		panel_2.add(lblNewLabel_1_1_1);
		
		fechaPago = new JTextField();
		fechaPago.setColumns(10);
		fechaPago.setBounds(522, 383, 314, 35);
		fechaPago.setForeground(Color.WHITE);
		fechaPago.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		fechaPago.setBackground(new Color(87, 87, 87));
		panel_2.add(fechaPago);
		
		JButton btnPagar = new JButton("PAGAR");
		btnPagar.setFont(new Font("Century Gothic", Font.BOLD, 30));
		btnPagar.setBounds(434, 566, 258, 41);
		btnPagar.setForeground(Color.WHITE);
		btnPagar.setBackground(new Color(87, 87, 87));
		btnPagar.setFocusPainted(false);
		panel_2.add(btnPagar);
		
		JButton btnMensualidad = new JButton("");
		btnMensualidad.setBounds(10, 90, 60, 60);
		btnMensualidad.setIcon(new ImageIcon(new ImageIcon("Imgs/pago_mensualidad.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnMensualidad.setFocusPainted(false);
		btnMensualidad.setBorderPainted(false);
		btnMensualidad.setRolloverIcon(new ImageIcon(new ImageIcon("Imgs/pago_mensualidad_hover.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		panel.add(btnMensualidad);
		
		JButton btnRegistrar = new JButton("");
		btnRegistrar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				MensualidadController.botonInforme();
			}
		});
		btnRegistrar.setBounds(10, 161, 60, 60);
		btnRegistrar.setIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnRegistrar.setFocusPainted(false);
		btnRegistrar.setBorderPainted(false);
		btnRegistrar.setRolloverIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas_hover.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		panel.add(btnRegistrar);
	}
}
