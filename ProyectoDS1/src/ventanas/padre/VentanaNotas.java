package ventanas.padre;

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
import java.awt.Font;
import javax.swing.SwingConstants;

import controllers.PNotasController;
import javax.swing.JComboBox;

public class VentanaNotas extends JFrame
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
					VentanaNotas window = new VentanaNotas();
					window.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaNotas() 
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
				PNotasController.botonUsuario();
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
		
		JLabel lblNewLabel = new JLabel("Consulta de Notas");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		lblNewLabel.setBounds(230, 28, 682, 49);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre del Estudiante:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(35, 131, 259, 29);
		panel_2.add(lblNewLabel_1);
		
		JLabel nombreEstudiante = new JLabel("New label");
		nombreEstudiante.setForeground(Color.WHITE);
		nombreEstudiante.setHorizontalAlignment(SwingConstants.LEFT);
		nombreEstudiante.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		nombreEstudiante.setBounds(304, 131, 665, 29);
		panel_2.add(nombreEstudiante);
		
		JLabel lblNewLabel_2_1 = new JLabel("Descripci\u00F3n:");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(487, 427, 135, 29);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel notaDibujo = new JLabel("New label");
		notaDibujo.setHorizontalAlignment(SwingConstants.LEFT);
		notaDibujo.setForeground(Color.WHITE);
		notaDibujo.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		notaDibujo.setBounds(620, 427, 461, 30);
		panel_2.add(notaDibujo);
		
		JLabel lblNewLabel_2_2 = new JLabel("Nota:");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(35, 426, 70, 30);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel notaEspa = new JLabel("New label");
		notaEspa.setHorizontalAlignment(SwingConstants.LEFT);
		notaEspa.setForeground(Color.WHITE);
		notaEspa.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		notaEspa.setBounds(115, 427, 130, 30);
		panel_2.add(notaEspa);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Fecha:");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_1_1.setBounds(255, 427, 82, 30);
		panel_2.add(lblNewLabel_2_1_1);
		
		JLabel notaGeometria = new JLabel("New label");
		notaGeometria.setHorizontalAlignment(SwingConstants.LEFT);
		notaGeometria.setForeground(Color.WHITE);
		notaGeometria.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		notaGeometria.setBounds(347, 426, 130, 30);
		panel_2.add(notaGeometria);
		
		JLabel lblNewLabel_2_3 = new JLabel("Comentarios:");
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_3.setBounds(35, 608, 186, 29);
		panel_2.add(lblNewLabel_2_3);
		
		JLabel labelComentarios = new JLabel("New label");
		labelComentarios.setForeground(Color.WHITE);
		labelComentarios.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		labelComentarios.setBounds(230, 594, 739, 64);
		labelComentarios.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(10, 10, 10)));
		panel_2.add(labelComentarios);
		
		JLabel lblNewLabel_1_1 = new JLabel("Seleccione Materia:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(35, 218, 204, 29);
		panel_2.add(lblNewLabel_1_1);
		
		String materias[] = {"Matemáticas", "Dibujo", "Español", "Geometría"};
		JComboBox<Object> comboBox = new JComboBox<Object>(materias);
		comboBox.setBounds(35, 258, 1000, 30);
		panel_2.add(comboBox);
		
		JButton btnConsultar = new JButton("");
		btnConsultar.setBounds(10, 90, 60, 60);
		btnConsultar.setIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnConsultar.setFocusPainted(false);
		btnConsultar.setBorderPainted(false);
		btnConsultar.setRolloverIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas_hover.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		panel.add(btnConsultar);
	}
}
