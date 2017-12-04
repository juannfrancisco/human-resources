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
public class ObjectNotFoundException extends Exception {

	private static final long serialVersionUID = 3993482372347960079L;
	
	/**
	 * 
	 * @param message
	 */
	public ObjectNotFoundException( String message )
	{
		super( message );
	}

}
