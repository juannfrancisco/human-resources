/**
 * Copyright (c) MgnLabs 2010-2015
 * Factoría de Desarrollo de Software
 * Santiago de Chile, Region Metropolitana
 */
package cl.magno.labs.hr.core.employee;

/**
 * ---------------------------------------------------------------------------
 * MGNlabs 2014 - 2015 
 * Gestion de Recursos Humanos -
 * @author Juan Francisco Maldonado León - ( juan.maldonado.leon@gmail.com )
 * @date 22-05-2015
 * Description : 
 * ---------------------------------------------------------------------------
 */
public class Skill 
{
	private String id;
	private String name;
	private String description;
	private SkillType type;
	private SkillLevel level;
	
	
	public Skill() {
		
	}
	
	
	/**
	 * 
	 * @param id
	 */
	public Skill( String id) {
		this.id = id;
	}
	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the type
	 */
	public SkillType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(SkillType type) {
		this.type = type;
	}


	public SkillLevel getLevel() {
		return level;
	}

	public void setLevel(SkillLevel level) {
		this.level = level;
	}
}
