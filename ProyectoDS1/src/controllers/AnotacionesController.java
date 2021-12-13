package controllers;

import ventanas.admin.*;

public class AnotacionesController 
{
	public static Anotaciones ventana = new Anotaciones();
	
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
		PrincipalController.mostrar();
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
}
