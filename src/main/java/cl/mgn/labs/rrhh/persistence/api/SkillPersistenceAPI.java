/**
 * 
 */
package cl.mgn.labs.rrhh.persistence.api;

import java.util.List;

import org.apache.log4j.Logger;

import cl.mgn.labs.rrhh.core.employee.Skill;
import cl.mgn.labs.rrhh.persistence.ConnectionResource;
import cl.mgn.labs.rrhh.persistence.dao.SkillDAO;

/**
 * @author Juan Francisco Maldonado León
 *
 */
public final class SkillPersistenceAPI 
{
	private static final SkillDAO dao =  (SkillDAO) ConnectionResource.getInstance().getBean("skillDAO");
	
	private static final Logger LOGGER = Logger.getLogger(SkillPersistenceAPI.class.getCanonicalName());
	
	/**
	 * 
	 * @param employee
	 */
	public static void save( Skill skill )
	{
		dao.save(skill);
	}
	
	/**
	 * 
	 * @return
	 */
	public static Skill find( Skill skill )
	{
		return dao.find( skill );
	}
	
	/**
	 * 
	 * @return
	 */
	public static List<Skill> findAll()
	{
		LOGGER.info("Obteniendo todos los empleados");
		return dao.findAll();
	}
	
	/**
	 * 
	 * @param employee
	 * @return
	 */
	public static boolean contains( Skill skill )
	{
		return dao.contains(skill);
	}
	
	
	
}
