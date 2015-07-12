/**
 * Copyright (c) MgnLabs 2010-2015
 * Factoría de Desarrollo de Software
 * Santiago de Chile, Region Metropolitana
 */
package cl.mgn.labs.rrhh.core.exception;

/**
 * ---------------------------------------------------------------------------
 * MGNlabs 2014 - 2015 
 * Gestion de Recursos Humanos -
 * @author Juan Francisco Maldonado León - ( juan.maldonado.leon@gmail.com )
 * @date 22-05-2015
 * Description : 
 * ---------------------------------------------------------------------------
 */
public class AuthenticationException extends Exception 
{
	private static final long serialVersionUID = 7142187225928543451L;
	
	/**
	 * 
	 */
	public AuthenticationException()
	{
		super();
	}
	
	/**
	 * 
	 * @param message
	 */
	public AuthenticationException( String message )
	{
		super(message);
	}

}
