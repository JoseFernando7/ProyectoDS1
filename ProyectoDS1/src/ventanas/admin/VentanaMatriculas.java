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

import controllers.MatriculaController;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JList;

public class VentanaMatriculas extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*Declaracion de variables*/
	private JButton btnUsuario;
	private JTextField matricula_nino;
	private JTextField nombre_nino;
	private JTextField registro_nino;
	private JTextField sangre_nino;
	private JTextField sexo_nino;
	private JTextField nacimiento_nino;
	private JTextField ingreso_nino;
	private JTextField grado_nino;
	private JTextField documento_titular;
	private JTextField nombre_titular;
	private JTextField direccion_titular;
	private JTextField telefono_titular;
	private JTextField parentesco_titular;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					VentanaMatriculas window = new VentanaMatriculas();
					window.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaMatriculas() 
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
				MatriculaController.botonUsuario();
			}
		});
		btnUsuario.setBounds(10, 11, 60, 60);
		btnUsuario.setIcon(new ImageIcon(new ImageIcon("Imgs/avatar.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
		btnUsuario.setFocusPainted(false);
		btnUsuario.setBorderPainted(false);
		panel.add(btnUsuario);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(80, 0, 499, 761);
		panel_1.setBackground(new Color(47, 49, 54));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Matricular Ni\u00F1o");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(75, 11, 315, 40);
		panel_1.add(lblNewLabel);
		
		JLabel lblMatricula = new JLabel("No. Matricula:");
		lblMatricula.setForeground(Color.WHITE);
		lblMatricula.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblMatricula.setBounds(10, 76, 135, 33);
		panel_1.add(lblMatricula);
		
		matricula_nino = new JTextField();
		matricula_nino.setForeground(Color.WHITE);
		matricula_nino.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		matricula_nino.setBounds(215, 76, 255, 33);
		matricula_nino.setBackground(new Color(87, 87, 87));
		panel_1.add(matricula_nino);
		matricula_nino.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombres:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblNombre.setBounds(10, 120, 84, 33);
		panel_1.add(lblNombre);
		
		nombre_nino = new JTextField();
		nombre_nino.setForeground(Color.WHITE);
		nombre_nino.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		nombre_nino.setColumns(10);
		nombre_nino.setBackground(new Color(87, 87, 87));
		nombre_nino.setBounds(215, 120, 255, 33);
		panel_1.add(nombre_nino);
		
		JLabel lblRegistroCivil = new JLabel("Registro Civil:");
		lblRegistroCivil.setForeground(Color.WHITE);
		lblRegistroCivil.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblRegistroCivil.setBounds(10, 164, 119, 33);
		panel_1.add(lblRegistroCivil);
		
		registro_nino = new JTextField();
		registro_nino.setForeground(Color.WHITE);
		registro_nino.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		registro_nino.setColumns(10);
		registro_nino.setBackground(new Color(87, 87, 87));
		registro_nino.setBounds(215, 164, 255, 33);
		panel_1.add(registro_nino);
		
		JLabel lblTipoSangre = new JLabel("Tipo de sangre:");
		lblTipoSangre.setForeground(Color.WHITE);
		lblTipoSangre.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblTipoSangre.setBounds(10, 208, 135, 33);
		panel_1.add(lblTipoSangre);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setForeground(Color.WHITE);
		lblSexo.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblSexo.setBounds(10, 252, 93, 33);
		panel_1.add(lblSexo);
		
		JLabel lblNacimiento = new JLabel("Fecha de Nacimiento:");
		lblNacimiento.setForeground(Color.WHITE);
		lblNacimiento.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblNacimiento.setBounds(10, 296, 195, 33);
		panel_1.add(lblNacimiento);
		
		sangre_nino = new JTextField();
		sangre_nino.setForeground(Color.WHITE);
		sangre_nino.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		sangre_nino.setColumns(10);
		sangre_nino.setBackground(new Color(87, 87, 87));
		sangre_nino.setBounds(215, 208, 255, 33);
		panel_1.add(sangre_nino);
		
		sexo_nino = new JTextField();
		sexo_nino.setForeground(Color.WHITE);
		sexo_nino.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		sexo_nino.setColumns(10);
		sexo_nino.setBackground(new Color(87, 87, 87));
		sexo_nino.setBounds(215, 252, 255, 33);
		panel_1.add(sexo_nino);
		
		nacimiento_nino = new JTextField();
		nacimiento_nino.setForeground(Color.WHITE);
		nacimiento_nino.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		nacimiento_nino.setColumns(10);
		nacimiento_nino.setBackground(new Color(87, 87, 87));
		nacimiento_nino.setBounds(215, 296, 255, 33);
		panel_1.add(nacimiento_nino);
		
		JButton btnRegistrarAlumno = new JButton("REGISTRAR");
		btnRegistrarAlumno.setForeground(Color.WHITE);
		btnRegistrarAlumno.setFont(new Font("Century Gothic", Font.BOLD, 22));
		btnRegistrarAlumno.setBounds(157, 710, 190, 40);
		btnRegistrarAlumno.setBackground(new Color(87, 87, 87));
		btnRegistrarAlumno.setFocusPainted(false);
		//btnRegistrarDocente.setBorderPainted(false);
		panel_1.add(btnRegistrarAlumno);
		
		JLabel lblFechaDeIngreso = new JLabel("Fecha de Ingreso:");
		lblFechaDeIngreso.setForeground(Color.WHITE);
		lblFechaDeIngreso.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblFechaDeIngreso.setBounds(10, 340, 159, 33);
		panel_1.add(lblFechaDeIngreso);
		
		JLabel lblGrado = new JLabel("Grado:");
		lblGrado.setForeground(Color.WHITE);
		lblGrado.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblGrado.setBounds(10, 384, 93, 33);
		panel_1.add(lblGrado);
		
		ingreso_nino = new JTextField();
		ingreso_nino.setForeground(Color.WHITE);
		ingreso_nino.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		ingreso_nino.setColumns(10);
		ingreso_nino.setBackground(new Color(87, 87, 87));
		ingreso_nino.setBounds(215, 340, 255, 33);
		panel_1.add(ingreso_nino);
		
		grado_nino = new JTextField();
		grado_nino.setForeground(Color.WHITE);
		grado_nino.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		grado_nino.setColumns(10);
		grado_nino.setBackground(new Color(87, 87, 87));
		grado_nino.setBounds(215, 384, 255, 33);
		panel_1.add(grado_nino);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Registro Titular");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_1_1.setBounds(68, 428, 363, 40);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setForeground(Color.WHITE);
		lblDocumento.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblDocumento.setBounds(10, 479, 195, 33);
		panel_1.add(lblDocumento);
		
		JLabel lblNombre_Titular = new JLabel("Nombre:");
		lblNombre_Titular.setForeground(Color.WHITE);
		lblNombre_Titular.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblNombre_Titular.setBounds(10, 523, 195, 33);
		panel_1.add(lblNombre_Titular);
		
		JLabel lblDireccionTitular = new JLabel("Direcci\u00F3n:");
		lblDireccionTitular.setForeground(Color.WHITE);
		lblDireccionTitular.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblDireccionTitular.setBounds(10, 567, 195, 33);
		panel_1.add(lblDireccionTitular);
		
		JLabel lblTelefonoTitular = new JLabel("Tel\u00E9fono:");
		lblTelefonoTitular.setForeground(Color.WHITE);
		lblTelefonoTitular.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblTelefonoTitular.setBounds(10, 611, 195, 33);
		panel_1.add(lblTelefonoTitular);
		
		JLabel lblParentesco = new JLabel("Parentesco:");
		lblParentesco.setForeground(Color.WHITE);
		lblParentesco.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblParentesco.setBounds(10, 655, 195, 33);
		panel_1.add(lblParentesco);
		
		documento_titular = new JTextField();
		documento_titular.setForeground(Color.WHITE);
		documento_titular.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		documento_titular.setColumns(10);
		documento_titular.setBackground(new Color(87, 87, 87));
		documento_titular.setBounds(215, 479, 255, 33);
		panel_1.add(documento_titular);
		
		nombre_titular = new JTextField();
		nombre_titular.setForeground(Color.WHITE);
		nombre_titular.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		nombre_titular.setColumns(10);
		nombre_titular.setBackground(new Color(87, 87, 87));
		nombre_titular.setBounds(215, 523, 255, 33);
		panel_1.add(nombre_titular);
		
		direccion_titular = new JTextField();
		direccion_titular.setForeground(Color.WHITE);
		direccion_titular.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		direccion_titular.setColumns(10);
		direccion_titular.setBackground(new Color(87, 87, 87));
		direccion_titular.setBounds(215, 567, 255, 33);
		panel_1.add(direccion_titular);
		
		telefono_titular = new JTextField();
		telefono_titular.setForeground(Color.WHITE);
		telefono_titular.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		telefono_titular.setColumns(10);
		telefono_titular.setBackground(new Color(87, 87, 87));
		telefono_titular.setBounds(215, 611, 255, 33);
		panel_1.add(telefono_titular);
		
		parentesco_titular = new JTextField();
		parentesco_titular.setForeground(Color.WHITE);
		parentesco_titular.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		parentesco_titular.setColumns(10);
		parentesco_titular.setBackground(new Color(87, 87, 87));
		parentesco_titular.setBounds(215, 655, 255, 33);
		panel_1.add(parentesco_titular);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(579, 0, 605, 761);
		panel_2.setBackground(new Color(54, 57, 63));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Alumnos");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(97, 46, 440, 40);
		panel_2.add(lblNewLabel_2);
		
		String nombres[] = {"Carlos", "Jose", "Monika"};
		JList listaAlumnos = new JList(nombres);
		listaAlumnos.setForeground(Color.WHITE);
		listaAlumnos.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		listaAlumnos.setBounds(30, 139, 545, 93);
		listaAlumnos.setBackground(new Color(87, 87, 87));
		panel_2.add(listaAlumnos);
		
		JLabel lblNewLabel_2_1 = new JLabel("Informaci\u00F3n Alumno");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(118, 264, 363, 40);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel infoMatriculaNino = new JLabel("New label");
		infoMatriculaNino.setForeground(Color.WHITE);
		infoMatriculaNino.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		infoMatriculaNino.setBounds(144, 329, 179, 26);
		panel_2.add(infoMatriculaNino);
		
		JLabel label5 = new JLabel("Registro Civil:");
		label5.setHorizontalAlignment(SwingConstants.LEFT);
		label5.setForeground(Color.WHITE);
		label5.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		label5.setBounds(333, 328, 125, 26);
		panel_2.add(label5);
		
		JLabel infoRegistroCNino = new JLabel("New label");
		infoRegistroCNino.setForeground(Color.WHITE);
		infoRegistroCNino.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		infoRegistroCNino.setBounds(468, 329, 127, 26);
		panel_2.add(infoRegistroCNino);
		
		JLabel label2 = new JLabel("Tipo de Sangre:");
		label2.setHorizontalAlignment(SwingConstants.LEFT);
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		label2.setBounds(10, 371, 135, 26);
		panel_2.add(label2);
		
		JLabel infoSangreNino = new JLabel("New label");
		infoSangreNino.setForeground(Color.WHITE);
		infoSangreNino.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		infoSangreNino.setBounds(154, 371, 179, 26);
		panel_2.add(infoSangreNino);
		
		JLabel label6 = new JLabel("Sexo:");
		label6.setHorizontalAlignment(SwingConstants.LEFT);
		label6.setForeground(Color.WHITE);
		label6.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		label6.setBounds(333, 371, 80, 26);
		panel_2.add(label6);
		
		JLabel infoSexoNino = new JLabel("New label");
		infoSexoNino.setForeground(Color.WHITE);
		infoSexoNino.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		infoSexoNino.setBounds(423, 370, 172, 26);
		panel_2.add(infoSexoNino);
		
		JLabel label1 = new JLabel("No. Matricula:");
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		label1.setBounds(10, 327, 135, 33);
		panel_2.add(label1);
		
		JLabel label3 = new JLabel("Fecha de Nacimiento:");
		label3.setForeground(Color.WHITE);
		label3.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		label3.setBounds(10, 408, 195, 33);
		panel_2.add(label3);
		
		JLabel infoNaciNino = new JLabel("New label");
		infoNaciNino.setForeground(Color.WHITE);
		infoNaciNino.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		infoNaciNino.setBounds(203, 411, 117, 26);
		panel_2.add(infoNaciNino);
		
		JLabel label4 = new JLabel("Fecha de Ingreso:");
		label4.setForeground(Color.WHITE);
		label4.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		label4.setBounds(10, 452, 159, 33);
		panel_2.add(label4);
		
		JLabel infoIngresoNino = new JLabel("New label");
		infoIngresoNino.setForeground(Color.WHITE);
		infoIngresoNino.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		infoIngresoNino.setBounds(203, 455, 107, 26);
		panel_2.add(infoIngresoNino);
		
		JLabel label7 = new JLabel("Grado:");
		label7.setForeground(Color.WHITE);
		label7.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		label7.setBounds(333, 408, 93, 33);
		panel_2.add(label7);
		
		JLabel infoGradoNino = new JLabel("New label");
		infoGradoNino.setForeground(Color.WHITE);
		infoGradoNino.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		infoGradoNino.setBounds(423, 411, 148, 26);
		panel_2.add(infoGradoNino);
		
		JLabel lbl1 = new JLabel("Documento:");
		lbl1.setForeground(Color.WHITE);
		lbl1.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lbl1.setBounds(10, 547, 117, 33);
		panel_2.add(lbl1);
		
		JLabel infoIDTitular = new JLabel("New label");
		infoIDTitular.setForeground(Color.WHITE);
		infoIDTitular.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		infoIDTitular.setBounds(144, 550, 159, 26);
		panel_2.add(infoIDTitular);
		
		JLabel lbl4 = new JLabel("Parentesco:");
		lbl4.setForeground(Color.WHITE);
		lbl4.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lbl4.setBounds(333, 547, 107, 33);
		panel_2.add(lbl4);
		
		JLabel infoParenTitular = new JLabel("New label");
		infoParenTitular.setForeground(Color.WHITE);
		infoParenTitular.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		infoParenTitular.setBounds(450, 550, 127, 26);
		panel_2.add(infoParenTitular);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Informaci\u00F3n del Titular");
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_2_1_2.setBounds(118, 489, 363, 40);
		panel_2.add(lblNewLabel_2_1_2);
		
		JLabel lbl2 = new JLabel("Nombre:");
		lbl2.setForeground(Color.WHITE);
		lbl2.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lbl2.setBounds(10, 591, 117, 33);
		panel_2.add(lbl2);
		
		JLabel infoNombreTitular = new JLabel("New label");
		infoNombreTitular.setForeground(Color.WHITE);
		infoNombreTitular.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		infoNombreTitular.setBounds(144, 594, 159, 26);
		panel_2.add(infoNombreTitular);
		
		JLabel lbl5 = new JLabel("Direcci\u00F3n:");
		lbl5.setForeground(Color.WHITE);
		lbl5.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lbl5.setBounds(333, 591, 107, 33);
		panel_2.add(lbl5);
		
		JLabel infoDirTitular = new JLabel("New label");
		infoDirTitular.setForeground(Color.WHITE);
		infoDirTitular.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		infoDirTitular.setBounds(450, 594, 127, 26);
		panel_2.add(infoDirTitular);
		
		JLabel lbl3 = new JLabel("Tel\u00E9fono:");
		lbl3.setForeground(Color.WHITE);
		lbl3.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lbl3.setBounds(10, 635, 107, 33);
		panel_2.add(lbl3);
		
		JLabel infoTlfTitular = new JLabel("New label");
		infoTlfTitular.setForeground(Color.WHITE);
		infoTlfTitular.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		infoTlfTitular.setBounds(144, 638, 159, 26);
		panel_2.add(infoTlfTitular);
		
		JButton btnMatricula = new JButton("");
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
				MatriculaController.botonDocente();
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
