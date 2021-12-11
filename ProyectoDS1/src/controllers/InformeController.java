package controllers;
import ventanas.docente.*;

public class InformeController 
{
	public static VentanaInforme ventana = new VentanaInforme();
	
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
		PDocenteController.mostrar();
	}
	
	public static void botonMensualidad()
	{
		ocultar();
		MensualidadController.mostrar();
	}
}
