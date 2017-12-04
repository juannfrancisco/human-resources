/**
 * 
 */
package cl.mgn.labs.rrhh.persistence.api;

import java.util.List;

import cl.mgn.labs.rrhh.core.exception.ObjectNotFoundException;
import cl.mgn.labs.rrhh.core.user.User;
import cl.mgn.labs.rrhh.persistence.ConnectionResource;
import cl.mgn.labs.rrhh.persistence.dao.UserDAO;

/**
 * @author Juan Francisco Maldonado León
 *
 */
public final class UserPersistenceAPI 
{
	
	private static final UserDAO dao =  (UserDAO) ConnectionResource.getInstance().getBean("userDAO");
	
	/**
	 * 
	 * @param user
	 */
	public static void save( User user )
	{
		dao.save(user);
	}
	
	
	/**
	 * 
	 * @param user
	 * @throws ObjectNotFoundException 
	 */
	public static User find( User user ) throws ObjectNotFoundException
	{
		return dao.find(user);
	}
	
	/**
	 * 
	 * @param user
	 * @throws ObjectNotFoundException 
	 */
	public static User findx( User user ) throws ObjectNotFoundException
	{
		return dao.findx(user);
	}
	
	
	
	/**
	 * 
	 * @param user
	 * @throws ObjectNotFoundException 
	 */
	public static User findAuth( User user ) throws ObjectNotFoundException
	{
		//return dao.findAuth(user);
		return dao.findx(user); //HACK
	}
	
	/**
	 * 
	 * @param user
	 */
	public static List<User> findAll(  )
	{
		return dao.findAll();
	}
	
	/**
	 * 
	 * @param user
	 */
	public static void remove( User user )
	{
		dao.remove(user);
	}

}
