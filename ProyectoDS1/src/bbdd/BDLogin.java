package bbdd;
import java.sql.*;
import ventanas.*;

public class BDLogin 
{
	//public static Login ventana = new Login();
	Connection conexion;
	String cadenaConexion = "jdbc:mysql://localhost/proyectods1?serverTimezone=UTC";
	String usuario = "root";
	String clave = "";
	
	public BDLogin()
	{
		try 
		{
			conexion = DriverManager.getConnection(cadenaConexion, usuario, clave);
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	//Login para administrador
	public String loginUserAdmin()
	{
		String resultado = "";
		//String usuario = ventana.getTextUser().getText();
		
		try 
		{
			Statement s = conexion.createStatement();
			ResultSet res = s.executeQuery("select * from administrador where documento = 1010158614");
			
			while(res.next())
			{
				resultado = res.getString("nombre");
			}
		} 
		catch (SQLException e) 
		{
			System.out.println(e);
		}
		return resultado;
	}
	
	public String loginPassAdmin()
	{
		String resultado = "";
		//String password = ventana.getTextPass().getText();
		
		try 
		{
			Statement s = conexion.createStatement();
			ResultSet res = s.executeQuery("select * from administrador where documento = 1010158614");
			
			while(res.next())
			{
				resultado = res.getString("contraseña");
			}
		} 
		catch (SQLException e) 
		{
			System.out.println(e);
		}
		return resultado;
	}
	
	public String verificarAdmin()
	{
		String resultado = "";
		//String password = ventana.getTextPass().getText();
		
		try 
		{
			Statement s = conexion.createStatement();
			ResultSet res = s.executeQuery("select * from administrador where documento = 1010158614");
			
			while(res.next())
			{
				resultado = res.getString("rol");
			}
		} 
		catch (SQLException e) 
		{
			System.out.println(e);
		}
		return resultado;
	}
	/*
	//Login para docente
	public String loginUserDocente()
	{
		String resultado = "";
		String usuario = ventana.getTextUser().getText();
		
		try 
		{
			Statement s = conexion.createStatement();
			ResultSet res = s.executeQuery("select * from docente where nombre = '" + usuario + "'");
			
			while(res.next())
			{
				resultado = res.getString("nombre");
			}
		} 
		catch (SQLException e) 
		{
			System.out.println(e);
		}
		return resultado;
	}
		
	public String loginPassDocente()
	{
		String resultado = "";
		String password = ventana.getTextPass().getText();
			
		try 
		{
			Statement s = conexion.createStatement();
			ResultSet res = s.executeQuery("select * from docente where contraseña = " + password);
				
			while(res.next())
			{
				resultado = res.getString("contraseña");
			}
		} 
		catch (SQLException e) 
		{
			System.out.println(e);
		}
		return resultado;
	}
		
	public String verificarDocente()
	{
		String resultado = "";
		String password = ventana.getTextPass().getText();
		
		try 
		{
			Statement s = conexion.createStatement();
			ResultSet res = s.executeQuery("select * from docente where contraseña = " + password);
				
			while(res.next())
			{
				resultado = res.getString("rol");
			}
		} 
		catch (SQLException e) 
		{
			System.out.println(e);
		}
		return resultado;
	}
	
	//Login para padre
	public String loginUserPadre()
	{
		String resultado = "";
		String usuario = ventana.getTextUser().getText();
				
		try 
		{
			Statement s = conexion.createStatement();
			ResultSet res = s.executeQuery("select * from acudiente where nombre = '" + usuario + "'");
					
			while(res.next())
			{
				resultado = res.getString("nombre");
			}
		} 
		catch (SQLException e) 
		{
			System.out.println(e);
		}
		return resultado;
	}
				
	public String loginPassPadre()
	{
		String resultado = "";
		String password = ventana.getTextPass().getText();
					
		try 
		{
			Statement s = conexion.createStatement();
			ResultSet res = s.executeQuery("select * from acudiente where contraseña = " + password);
					
			while(res.next())
			{
				resultado = res.getString("contraseña");
			}
		} 
		catch (SQLException e) 
		{
			System.out.println(e);
		}
		return resultado;
	}
				
	public String verificarPadre()
	{
		String resultado = "";
		String password = ventana.getTextPass().getText();
					
		try 
		{
			Statement s = conexion.createStatement();
			ResultSet res = s.executeQuery("select * from acudiente where contraseña = " + password);
					
			while(res.next())
			{
				resultado = res.getString("rol");
			}
		} 
		catch (SQLException e) 
		{
			System.out.println(e);
		}
		return resultado;
	}*/
}
