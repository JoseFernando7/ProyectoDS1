package controllers;
import ventanas.docente.*;

public class MensualidadController 
{
	public static VentanaMensualidad ventana = new VentanaMensualidad();
	
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
	
	public static void botonInforme()
	{
		ocultar();
		InformeController.mostrar();
	}
}
