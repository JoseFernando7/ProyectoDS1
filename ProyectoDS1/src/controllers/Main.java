package controllers;
import bbdd.*;

public class Main 
{
	public static void main(String[] args) 
	{
		BDLogin bd = new BDLogin();
		LoginController.mostrar();
	}
}
