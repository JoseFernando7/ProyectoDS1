package controllers;
import ventanas.padre.*;

public class PPadreController 
{
	public static PrincipalPadre ventana = new PrincipalPadre();
	
	public static void mostrar()
	{
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}
	
	public static void ocultar()
	{
		ventana.setVisible(false);
	}
	
	public static void botonNotas()
	{
		ocultar();
		PNotasController.mostrar();
	}
}
