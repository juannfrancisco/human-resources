/**
 * Copyright (c) MgnLabs 2010-2015
 * Factoría de Desarrollo de Software
 * Santiago de Chile, Region Metropolitana
 */
package cl.mgn.labs.rrhh.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * ---------------------------------------------------------------------------
 * MGNlabs 2014 - 2015 
 * Gestion de Recursos Humanos -
 * @author Juan Francisco Maldonado León - ( juan.maldonado.leon@gmail.com )
 * @date 22-05-2015
 * Description : 
 * ---------------------------------------------------------------------------
 */
public class ConnectionTest {
	
	private static Connection _instance = null;
	
	
	/**
	 * 
	 */
	private ConnectionTest()
	{
		
	}
	
	
	/**
	 * 
	 */
	public static Connection getInstance()
	{
		try 
		{ 
			if( null == _instance )
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				_instance = DriverManager.getConnection("jdbc:oracle:thin:@titan.kvz.local:1521:ORA11G", "CA_PERFILACION", "CA_PERFILACION");
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return _instance;
	}
	

}
