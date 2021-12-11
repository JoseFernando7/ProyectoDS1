package controllers;
import ventanas.docente.*;

public class PDocenteController 
{
	public static PrincipalDocente ventana = new PrincipalDocente();
	
	public static void mostrar()
	{
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}
	
	public static void ocultar()
	{
		ventana.setVisible(false);
	}
	
	public static void botonMensualidad()
	{
		ocultar();
		MensualidadController.mostrar();
	}
	
	public static void botonInforme()
	{
		ocultar();
		InformeController.mostrar();
	}
}
