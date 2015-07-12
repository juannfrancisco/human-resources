/**
 * 
 */
package cl.mgn.labs.rrhh.business;

import org.apache.log4j.Logger;

import cl.mgn.labs.rrhh.core.exception.ObjectNotFoundException;
import cl.mgn.labs.rrhh.core.user.User;
import cl.mgn.labs.rrhh.persistence.api.UserPersistenceAPI;

/**
 * 
 * ---------------------------------------------------------------------------
 * MGNlabs 2014 - 2015 
 * Gestion de Recursos Humanos -
 * @author Juan Francisco Maldonado León - ( juan.maldonado.leon@gmail.com )
 * @date 22-05-2015
 * Description : 
 * ---------------------------------------------------------------------------
 */
public final class AuthenticationBusiness 
{
	private static final Logger LOGGER = Logger.getLogger(AuthenticationBusiness.class.getCanonicalName());
	/**
	 * 
	 * @param user
	 * @throws ObjectNotFoundException 
	 */
	public static User authentication( User user ) throws ObjectNotFoundException
	{
		LOGGER.info("Autenticacion desde persistencia");
		return UserPersistenceAPI.findAuth(user);
	}

}
