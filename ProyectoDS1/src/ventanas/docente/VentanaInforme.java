package ventanas.docente;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import controllers.InformeController;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class VentanaInforme extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*Declaracion de variables*/
	private JButton btnUsuario;
	private JTextField notaMateria;
	private JTextField descNota;
	private JTextArea areaComentario;
	private JTextField fechaNota;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					VentanaInforme window = new VentanaInforme();
					window.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaInforme() 
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
				InformeController.botonUsuario();
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
		
		JLabel lblNewLabel = new JLabel("Generar Informe");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(180, 30, 730, 60);
		panel_2.add(lblNewLabel);
		
		String estudiantes[] = {"Carlos", "Jose", "Monika"};
		JComboBox<Object> comboEstudiantes = new JComboBox<Object>(estudiantes);
		comboEstudiantes.setBounds(50, 200, 1000, 40);
		panel_2.add(comboEstudiantes);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccione Estudiante:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(50, 150, 235, 30);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Nota:");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(50, 450, 100, 30);
		panel_2.add(lblNewLabel_2_1);
		
		notaMateria = new JTextField();
		notaMateria.setColumns(10);
		notaMateria.setBounds(160, 450, 100, 30);
		notaMateria.setForeground(Color.WHITE);
		notaMateria.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		notaMateria.setBackground(new Color(87, 87, 87));
		panel_2.add(notaMateria);
		
		descNota = new JTextField();
		descNota.setColumns(10);
		descNota.setBounds(580, 450, 470, 30);
		descNota.setForeground(Color.WHITE);
		descNota.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		descNota.setBackground(new Color(87, 87, 87));
		panel_2.add(descNota);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Descripci\u00F3n Actividad:");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_1_1.setBounds(330, 450, 226, 30);
		panel_2.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Seleccione Materia:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(50, 274, 235, 30);
		panel_2.add(lblNewLabel_1_1);
		
		String materias[] = {"Matemáticas", "Dibujo", "Español", "Geometría"};
		JComboBox<Object> comboMaterias = new JComboBox<Object>(materias);
		comboMaterias.setBounds(50, 324, 1000, 40);
		panel_2.add(comboMaterias);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Comentarios sobre Estudiante:");
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_1_2.setBounds(50, 540, 305, 30);
		panel_2.add(lblNewLabel_2_1_2);
		
		areaComentario = new JTextArea();
		areaComentario.setBounds(50, 580, 1000, 85);
		areaComentario.setLineWrap(true);
		areaComentario.setForeground(Color.WHITE);
		areaComentario.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		areaComentario.setBackground(new Color(87, 87, 87));
		panel_2.add(areaComentario);
		
		JButton btnSubirInforme = new JButton("Subir Informe");
		btnSubirInforme.setBounds(400, 690, 310, 40);
		btnSubirInforme.setFont(new Font("Century Gothic", Font.BOLD, 30));
		btnSubirInforme.setForeground(Color.WHITE);
		btnSubirInforme.setBackground(new Color(87, 87, 87));
		btnSubirInforme.setFocusPainted(false);
		panel_2.add(btnSubirInforme);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Fecha:");
		lblNewLabel_2_1_3.setForeground(Color.WHITE);
		lblNewLabel_2_1_3.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_1_3.setBounds(50, 398, 100, 30);
		panel_2.add(lblNewLabel_2_1_3);
		
		fechaNota = new JTextField();
		fechaNota.setForeground(Color.WHITE);
		fechaNota.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		fechaNota.setColumns(10);
		fechaNota.setBackground(new Color(87, 87, 87));
		fechaNota.setBounds(160, 398, 100, 30);
		panel_2.add(fechaNota);
		
		JButton btnMensualidad = new JButton("");
		btnMensualidad.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				InformeController.botonMensualidad();
			}
		});
		btnMensualidad.setBounds(10, 90, 60, 60);
		btnMensualidad.setIcon(new ImageIcon(new ImageIcon("Imgs/pago_mensualidad.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnMensualidad.setFocusPainted(false);
		btnMensualidad.setBorderPainted(false);
		btnMensualidad.setRolloverIcon(new ImageIcon(new ImageIcon("Imgs/pago_mensualidad_hover.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		panel.add(btnMensualidad);
		
		JButton btnRegistrar = new JButton("");
		btnRegistrar.setBounds(10, 161, 60, 60);
		btnRegistrar.setIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnRegistrar.setFocusPainted(false);
		btnRegistrar.setBorderPainted(false);
		btnRegistrar.setRolloverIcon(new ImageIcon(new ImageIcon("Imgs/registrar_notas_hover.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		panel.add(btnRegistrar);
	}
}
