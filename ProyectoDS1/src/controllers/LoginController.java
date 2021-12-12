package controllers;
import ventanas.*;
import bbdd.*;

public class LoginController 
{
	public static Login ventana = new Login();
	public static BDLogin bd = new BDLogin();
	
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
		String nombre = bd.loginUserAdmin();
		String contrasena = bd.loginPassAdmin();
		
		if(bd.verificarAdmin() == "admin")
		{
			if(usuario.equals(nombre) && password.equals(contrasena))
			{
				ocultar();
				PrincipalController.mostrar();
			}
			else
			{
				System.out.println("Contraseña o nombre de usuario incorrectos");
			}
		}
		/*else if(bd.verificarDocente() == "docente")
		{
			if(usuario.equals(nombre) && password.equals(contrasena))
			{
				ocultar();
				PDocenteController.mostrar();
			}
			else
			{
				System.out.println("Contraseña o nombre de usuario incorrectos");
			}
		}
		else if(bd.verificarPadre() == "acudiente")
		{
			if(usuario.equals(nombre) && password.equals(contrasena))
			{
				ocultar();
				PPadreController.mostrar();
			}
			else
			{
				System.out.println("Contraseña o nombre de usuario incorrectos");
			}
		}*/
		
		
	}
}
