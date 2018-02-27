/**
 * 
 */
package cl.mgn.labs.rrhh.persistence.dao;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * ---------------------------------------------------------------------------
 * MGNlabs 2014 - 2015 
 * Gestion de Recursos Humanos -
 * @author Juan Francisco Maldonado León - ( juan.maldonado.leon@gmail.com )
 * @date 19-12-2017
 * Description : 
 * ---------------------------------------------------------------------------
 */
public abstract class DAO<T> {
	
	private MongoTemplate connection;
	
	public abstract T find( T object );
	
	public abstract List<T> findAll(  );
	
	public abstract void save( T object );
	
	public abstract void delete( T object );
	
	public abstract void update( T object );
	
	

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
