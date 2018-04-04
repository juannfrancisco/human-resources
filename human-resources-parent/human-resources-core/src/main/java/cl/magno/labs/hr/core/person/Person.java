/**
 * Copyright (c) MgnLabs 2010-2015
 * Factoría de Desarrollo de Software
 * Santiago de Chile, Region Metropolitana
 */
package cl.magno.labs.hr.core.person;

import java.util.Date;

/**
 * ---------------------------------------------------------------------------
 * MGNlabs 20114 - 2015 
 * Gestion de Recursos Humanos -
 * @author Juan Francisco Maldonado León - ( juan.maldonado.leon@gmail.com )
 * @date 20-04-2015
 * Description : 
 * ---------------------------------------------------------------------------
 */
public class Person {
	
	private IdPerson idPerson;
	private String name;
	private String middleName;
	private String lastName;
	private Date birthday;
	private Gender gender;
	
	
	/**
	 * 
	 */
	public Person()
	{
		
	}
	
	
	/**
	 * @return the idPerson
	 */
	public IdPerson getIdPerson() {
		return idPerson;
	}
	/**
	 * @param idPerson the idPerson to set
	 */
	public void setIdPerson(IdPerson idPerson) {
		this.idPerson = idPerson;
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
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	

}
