/**
 * 
 */
package cl.mgn.labs.rrhh.persistence.api;

import java.util.List;

import org.apache.log4j.Logger;

import cl.mgn.labs.rrhh.core.employee.Employee;
import cl.mgn.labs.rrhh.persistence.ConnectionResource;
import cl.mgn.labs.rrhh.persistence.dao.EmployeeDAO;

/**
 * @author Juan Francisco Maldonado León
 *
 */
public final class EmployeePersistenceAPI 
{
	private static final EmployeeDAO dao =  (EmployeeDAO) ConnectionResource.getInstance().getBean("employeeDAO");
	
	private static final Logger LOGGER = Logger.getLogger(EmployeePersistenceAPI.class.getCanonicalName());
	
	/**
	 * 
	 * @param employee
	 */
	public static void save( Employee employee )
	{
		dao.save(employee);
	}
	
	/**
	 * 
	 * @return
	 */
	public static Employee find( Employee employee )
	{
		return dao.find( employee );
	}
	
	/**
	 * 
	 * @return
	 */
	public static List<Employee> findAll()
	{
		LOGGER.info("Obteniendo todos los empleados");
		return dao.findAll();
	}
	
	/**
	 * 
	 * @param employee
	 * @return
	 */
	public static boolean contains( Employee employee )
	{
		return dao.contains(employee);
	}
	
	
	
}
