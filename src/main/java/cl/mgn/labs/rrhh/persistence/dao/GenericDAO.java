/**
 * 
 */
package cl.mgn.labs.rrhh.persistence.dao;




/**
 * @author jmaldonado
 *
 */
public abstract class GenericDAO<T> extends DAO<T> {
	
	
	/**
	 * 
	 * @param employee
	 */
	public void save( T object )
	{
		this.getConnection().save( object );
	}
	
	/**
	 * 
	 */
	public void delete( T object )
	{
		this.getConnection().remove( object );
	}
	
	
}
