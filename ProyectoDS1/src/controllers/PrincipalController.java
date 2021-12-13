package controllers;
import ventanas.*;
import ventanas.admin.VentanaPrincipal;

public class PrincipalController 
{
	public static VentanaPrincipal ventana = new VentanaPrincipal();
	
	public static void mostrar()
	{
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}
	
	public static void ocultar()
	{
		ventana.setVisible(false);
	}
	
	public static void botonMatricula()
	{
		ocultar();
		MatriculaController.mostrar();
	}
	
	public static void botonDocente()
	{
		ocultar();
		DocenteController.mostrar();
	}
	
	public static void botonEstudiante()
	{
		ocultar();
		AdEstudianteController.mostrar();
	}
	
	public static void botonReporte()
	{
		ocultar();
		ReporteController.mostrar();
	}
	
	public static void botonAnotaciones()
	{
		ocultar();
		AnotacionesController.mostrar();
	}
}
