/**
 * 
 */
package cl.mgn.labs.rrhh.persistence.dao;

import static org.springframework.data.mongodb.core.query.Criteria.where;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import cl.mgn.labs.rrhh.core.exception.ObjectNotFoundException;
import cl.mgn.labs.rrhh.core.user.User;

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
	 * @throws ObjectNotFoundException 
	 */
	public User find( User user ) throws ObjectNotFoundException
	{
		user = this.getConnection().findById( user.getUserName(), User.class );
		if( null == user )
			throw new ObjectNotFoundException("No se ha encontrado el usuario");
		return user;
	}
	
	
	/**
	 * 
	 * @param user
	 * @throws ObjectNotFoundException 
	 */
	public User findAuth( User user ) throws ObjectNotFoundException
	{
		Query query = new Query( where("userName").is( user.getUserName() ).and( "password" ).is( user.getPassword() ) );
		User userFind = this.getConnection().findOne( query, User.class );
		if( null == userFind )
			throw new ObjectNotFoundException("No se ha encontrado el usuario");
		return userFind;
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
