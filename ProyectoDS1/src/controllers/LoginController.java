package controllers;
import ventanas.*;

public class LoginController 
{
	public static Login ventana = new Login();
	
	public static void mostrar()
	{
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}
	
	public static void ocultar()
	{
		ventana.setVisible(false);
	}
	
	public static void eventoBoton()
	{
		String usuario = ventana.getTextUser().getText();
		String password = ventana.getTextPass().getText();
		
		if(usuario.equals("admin") && password.equals("1234"))
		{
			ocultar();
			PrincipalController.mostrar();
		}
		else if(usuario.equals("docente") && password.equals("0000"))
		{
			ocultar();
			PDocenteController.mostrar();
		}
		else if(usuario.equals("padre") && password.equals("7890"))
		{
			ocultar();
			PPadreController.mostrar();
		}
		else
		{
			System.out.println("Contraseña o nombre de usuario incorrectos");
		}
	}
}
