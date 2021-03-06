/**
 * 
 */
package cl.mgn.labs.rrhh.persistence.dao;

import static org.springframework.data.mongodb.core.query.Criteria.where;

import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.core.query.Query;

import cl.mgn.labs.rrhh.core.employee.Employee;
import cl.mgn.labs.rrhh.core.exception.ObjectNotFoundException;

/**
 * ---------------------------------------------------------------------------
 * MGNlabs 2014 - 2017
 * Gestion de Recursos Humanos -
 * @author Juan Francisco Maldonado León - ( juan.maldonado.leon@gmail.com )
 * @date 19-12-2017
 * Description : 
 * ---------------------------------------------------------------------------
 */
public class EmployeeDAO extends DAO<Employee>
{
	
	
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
	public Employee find( Employee object )
	{
		return this.getConnection().findById( object.getId(), Employee.class );
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
	
	@Override
	public void delete(Employee object) {
		
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


	
}
