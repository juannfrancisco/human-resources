/**
 * 
 */
package cl.mgn.labs.rrhh.persistence.dao;

import static org.springframework.data.mongodb.core.query.Criteria.where;

import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import cl.mgn.labs.rrhh.core.employee.Employee;

/**
 * @author Juan Francisco Maldonado León
 *
 */
public class EmployeeDAO 
{
	private MongoTemplate connection;
	
	
	/**
	 * 
	 */
	public void save( Employee employee )
	{
		employee.setId( UUID.randomUUID().toString() );
		this.getConnection().save( employee );
	}
	
	/**
	 * 
	 */
	public Employee find( Employee employee )
	{
		return this.getConnection().findById( employee.getId(), Employee.class );
	}
	
	/**
	 * 
	 */
	public List<Employee> findAll( )
	{
		return this.getConnection().findAll(Employee.class);
	}
	
	
	/**
	 * 
	 */
	public void remove( Employee employee )
	{
		this.getConnection().remove( employee );
	}
	
	
	/**
	 * 
	 */
	public void update( Employee employee )
	{
		//this.getConnection().updateFirst(Query.query(Criteria.where("")), employee, Employee.class);
	}
	
	
	/**
	 * 
	 * @param requestInvitation
	 * @return
	 * @throws ObjectNotFoundException 
	 */
	public boolean contains( Employee employee ) 
	{
		Query query = new Query( where("idPerson").is( employee.getIdPerson() ) );
		Employee employeeResult = this.getConnection().findOne( query, Employee.class );
		return null != employeeResult;		
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
