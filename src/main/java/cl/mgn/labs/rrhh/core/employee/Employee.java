/**
 * Copyright (c) MgnLabs 2010-2015
 * Factoría de Desarrollo de Software
 * Santiago de Chile, Region Metropolitana
 */
package cl.mgn.labs.rrhh.core.employee;

import java.util.List;

import cl.mgn.labs.rrhh.core.person.IdPerson;
import cl.mgn.labs.rrhh.core.person.Person;

/**
 * ---------------------------------------------------------------------------
 * MGNlabs 20114 - 2015 
 * Gestion de Recursos Humanos -
 * @author Juan Francisco Maldonado León - ( juan.maldonado.leon@gmail.com )
 * @date 22-05-2015
 * Description : 
 * ---------------------------------------------------------------------------
 */
public class Employee extends Person {

	private String id;
	
	private List<Skill> skills;
	
	/**
	 * 
	 */
	public Employee()
	{
		
	}
	
	/**
	 * 
	 * @param id
	 */
	public Employee( String id )
	{
		this.setId(id);
	}
	
	/**
	 * 
	 * @param idPerson
	 */
	public Employee( IdPerson idPerson )
	{
		this.setIdPerson(idPerson);
	}
	

	/**
	 * @return the uuid
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param uuid the uuid to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the skills
	 */
	public List<Skill> getSkills() {
		return skills;
	}

	/**
	 * @param skills the skills to set
	 */
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	
}
