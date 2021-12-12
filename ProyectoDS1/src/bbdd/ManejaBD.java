package bbdd;


import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ManejaBD{

  Connection conexion;
 
     
 public ManejaBD(){    
	
 }
 

 
 public void crearConexion(){
 
  
  conexion=null;      
  try{          
    conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Guarderia");
  }catch (Exception e){
    System.out.println( "No se pudo crear la conexi�n" );
    return ;
  } 
            
 }
   
  public int[][] consultarBD(String query){
  
  
  crearConexion();
  int[][] fila = new int[5][2];
  try{
       
    Statement s = conexion.createStatement();
    ResultSet rs = s.executeQuery(query);
    System.out.println("Print datos");
    int contador=0;
    while (rs.next())
    {
      System.out.println("entra a leer");

      for (int i=0;i<2;i++){
       //System.out.println(rs.getObject(i+1));
       fila[contador][i] = (Integer)rs.getObject(i+1);       
       System.out.println("la fila es");
       System.out.print(fila[contador][i]);
      }
      System.out.println("");
      contador++;
    }
            
     conexion.close();
  }
  catch (Exception e){
    e.toString();
  }
  return fila;
  
 } 


 public void insertarTuplas(String query){
 
 crearConexion();
 System.out.println(query);
  	
  try{       
    Statement s = conexion.createStatement();
    s.executeUpdate(query);    
  }
  catch (Exception e){
    e.toString();
  }
   cerrarConexion();	
 }
  
 public void cerrarConexion(){ 	
  
   try{       
 	 conexion.close();
   }
   catch (Exception e){
    e.toString();
   }
 }   
   
}
