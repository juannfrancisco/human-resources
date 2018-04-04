/**
 * Copyright (c) MgnLabs 2010-2015
 * Factoría de Desarrollo de Software
 * Santiago de Chile, Region Metropolitana
 */
package cl.magno.labs.hr.core.employee;

import cl.magno.labs.hr.core.person.IdPerson;
import cl.magno.labs.hr.core.person.Person;

import java.util.List;


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
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the uuid to set
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
