/**
 * 
 */
package cl.mgn.labs.rrhh.persistence.dao;

import static org.springframework.data.mongodb.core.query.Criteria.where;

import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.core.query.Query;

import cl.mgn.labs.rrhh.core.employee.Skill;
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
public class SkillDAO extends DAO<Skill>
{
	
	
	/**
	 * 
	 */
	public void save( Skill skill )
	{
		skill.setId( UUID.randomUUID().toString() );
		this.getConnection().save( skill );
	}
	
	/**
	 * 
	 */
	public Skill find( Skill object )
	{
		return this.getConnection().findById( object.getId(), Skill.class );
	}
	
	/**
	 * 
	 */
	public List<Skill> findAll( )
	{
		return this.getConnection().findAll(Skill.class);
	}
	
	
	/**
	 * 
	 */
	public void remove( Skill employee )
	{
		this.getConnection().remove( employee );
	}
	
	
	/**
	 * 
	 */
	public void update( Skill employee )
	{
		//this.getConnection().updateFirst(Query.query(Criteria.where("")), employee, Employee.class);
	}
	
	@Override
	public void delete(Skill object) {
		
	}
	
	
	/**
	 * 
	 * @param requestInvitation
	 * @return
	 * @throws ObjectNotFoundException 
	 */
	public boolean contains( Skill object ) 
	{
		Query query = new Query( where("idSkill").is( object.getId() ) );
		Skill result = this.getConnection().findOne( query, Skill.class );
		return null != result;		
	}


	
}
