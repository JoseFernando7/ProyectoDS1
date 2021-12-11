package ventanas;
import controllers.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//private JFrame frame;
	private JTextField txtUsuario;
	private JTextField txtContrasea;

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
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(88, 32, 274, 47);
		getContentPane().add(lblNewLabel);
		
		txtUsuario = new JTextField();
		txtUsuario.setText("Usuario");
		txtUsuario.setBounds(88, 116, 274, 31);
		getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContrasea = new JTextField();
		txtContrasea.setText("Contrase\u00F1a");
		txtContrasea.setBounds(88, 181, 274, 31);
		getContentPane().add(txtContrasea);
		txtContrasea.setColumns(10);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				LoginController.eventoBoton();
			}
		});
		btnNewButton.setBounds(183, 259, 89, 23);
		getContentPane().add(btnNewButton);
	}
	
	public JTextField getTextUser()
	{
		return txtUsuario;
	}
	
	public JTextField getTextPass()
	{
		return txtContrasea;
	}
}
