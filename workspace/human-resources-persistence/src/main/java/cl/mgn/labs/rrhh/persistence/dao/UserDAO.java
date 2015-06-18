/**
 * 
 */
package cl.mgn.labs.rrhh.persistence.dao;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;

import cl.mgn.labs.rrhh.core.user.User;

/**
 * @author Juan Francisco Maldonado León
 *
 */
public class UserDAO 
{
	
	private MongoTemplate connection;

	
	/**
	 * 
	 * @param user
	 */
	public void save( User user )
	{
		this.getConnection().save(user);
	}
	
	
	/**
	 * 
	 * @param user
	 */
	public User find( User user )
	{
		return this.getConnection().findById( user.getUserName(), User.class );
	}
	
	/**
	 * 
	 * @param user
	 */
	public List<User> findAll(  )
	{
		return this.getConnection().findAll(User.class);
	}
	
	
	public void remove( User user )
	{
		this.getConnection().remove(user);
	}
	
	
	/**
	 * @return the connection
	 */
	public MongoTemplate getConnection() {
		return connection;
	}

	/**
	 * @param connection the connection to set
	 */
	public void setConnection(MongoTemplate connection) {
		this.connection = connection;
	}

}
