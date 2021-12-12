package ventanas;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import controllers.LoginController;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class Login extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtUsuario;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.setVisible(true);
					window.setResizable(false);
					//window.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//frame = new JFrame();
		setBounds(100, 100, 471, 374);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 455, 335);
		panel.setBackground(new Color(47, 49, 54));
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(155, 30, 150, 50);
		panel.add(lblNewLabel);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(110, 120, 250, 30);
		txtUsuario.setForeground(Color.WHITE);
		txtUsuario.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		txtUsuario.setBackground(new Color(87, 87, 87));
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(110, 180, 250, 30);
		txtPassword.setForeground(Color.WHITE);
		txtPassword.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		txtPassword.setBackground(new Color(87, 87, 87));
		panel.add(txtPassword);
		
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				LoginController.eventoBoton();
			}
		});
		btnIngresar.setBounds(155, 270, 150, 30);
		btnIngresar.setForeground(Color.WHITE);
		btnIngresar.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnIngresar.setBackground(new Color(87, 87, 87));
		btnIngresar.setFocusPainted(false);
		//btnRegistrarDocente.setBorderPainted(false);
		panel.add(btnIngresar);
	}
	
	public JTextField getTextUser()
	{
		return txtUsuario;
	}
	
	public JTextField getTextPass()
	{
		return txtPassword;
	}
}
