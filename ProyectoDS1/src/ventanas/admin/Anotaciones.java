package ventanas.admin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

import controllers.AnotacionesController;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;

public class Anotaciones extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*Declaracion de variables*/
	private JButton btnUsuario;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Anotaciones window = new Anotaciones();
					window.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public Anotaciones() 
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
				AnotacionesController.botonUsuario();
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
		
		JButton btnNewButton = new JButton("Registrar Anotaci\u00F3n");
		btnNewButton.setBackground(new Color(238, 179, 121));
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(108, 530, 189, 62);
		panel_1.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(172, 121, 93, 33);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(172, 194, 93, 33);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(172, 270, 93, 33);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel = new JLabel("D\u00EDa");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblNewLabel.setBounds(46, 121, 152, 33);
		panel_1.add(lblNewLabel);
		
		JLabel lblCodigoActividad = new JLabel("Mes");
		lblCodigoActividad.setForeground(Color.WHITE);
		lblCodigoActividad.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblCodigoActividad.setBounds(46, 194, 152, 33);
		panel_1.add(lblCodigoActividad);
		
		JLabel lblNota = new JLabel("A\u00F1o");
		lblNota.setForeground(Color.WHITE);
		lblNota.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblNota.setBounds(46, 270, 152, 33);
		panel_1.add(lblNota);
		
		JLabel lblNewLabel_2 = new JLabel("Anotaciones en agenda");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_2.setBounds(85, 44, 257, 56);
		panel_1.add(lblNewLabel_2);
		
		String grados[] = { "Iniciación", "Parvulos", "Pre-Jardin", "Jardin", "Transición"};
		JList list_2 = new JList(grados);
		list_2.setVisibleRowCount(3);
		list_2.setFont(new Font("Century Gothic", Font.BOLD, 18));
		list_2.setBounds(200, 282, 128, 99);
		panel_1.add(list_2);
		list_2.setForeground(Color.BLACK);
		
		JScrollPane scrollPane = new JScrollPane(list_2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,  JScrollPane.HORIZONTAL_SCROLLBAR_NEVER );
		scrollPane.setBounds(130, 400, 128, 80);
			
			
		panel_1.add(scrollPane);
		
		JLabel lblGrados = new JLabel("Grados");
		lblGrados.setForeground(Color.WHITE);
		lblGrados.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblGrados.setBounds(153, 356, 152, 33);
		panel_1.add(lblGrados);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(478, 0, 706, 761);
		panel_2.setBackground(new Color(54, 57, 63));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textArea.setBounds(53, 190, 611, 137);
		panel_2.add(textArea);
		JScrollPane scroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,  JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(53, 190, 611, 137);
		panel_2.add(scroll);
		
		JLabel lblDescripcinDeLa = new JLabel("Descripci\u00F3n de la anotaci\u00F3n");
		lblDescripcinDeLa.setForeground(Color.WHITE);
		lblDescripcinDeLa.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblDescripcinDeLa.setBounds(225, 148, 303, 33);
		panel_2.add(lblDescripcinDeLa);
		
		JButton btnMatricula = new JButton("");
		btnMatricula.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				AnotacionesController.botonMatricula();
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
				AnotacionesController.botonDocente();
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
				AnotacionesController.botonEstudiante();
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
				AnotacionesController.botonReporte();
			}
		});
		btnReportes.setBounds(10, 303, 60, 60);
		btnReportes.setIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnReportes.setFocusPainted(false);
		btnReportes.setBorderPainted(false);
		btnReportes.setRolloverIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas_hover.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		panel.add(btnReportes);
		
		JButton btnRegistrar = new JButton("");
		btnRegistrar.setBounds(10, 374, 60, 60);
		btnRegistrar.setIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnRegistrar.setFocusPainted(false);
		btnRegistrar.setBorderPainted(false);
		btnRegistrar.setRolloverIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas_hover.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		panel.add(btnRegistrar);
	}
}

