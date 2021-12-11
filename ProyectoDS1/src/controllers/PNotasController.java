package controllers;
import ventanas.padre.*;

public class PNotasController 
{
public static VentanaNotas ventana = new VentanaNotas();
	
	public static void mostrar()
	{
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}
	
	public static void ocultar()
	{
		ventana.setVisible(false);
	}
	
	public static void botonUsuario()
	{
		ocultar();
		PPadreController.mostrar();
	}
}
