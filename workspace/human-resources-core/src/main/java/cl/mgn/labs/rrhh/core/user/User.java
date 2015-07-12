/**
 * Copyright (c) MgnLabs 2010-2015
 * Factoría de Desarrollo de Software
 * Santiago de Chile, Region Metropolitana
 */
package cl.mgn.labs.rrhh.core.user;

/**
 * ---------------------------------------------------------------------------
 * MGNlabs 2014 - 2015 
 * Gestion de Recursos Humanos -
 * @author Juan Francisco Maldonado León - ( juan.maldonado.leon@gmail.com )
 * @date 22-05-2015
 * Description : 
 * ---------------------------------------------------------------------------
 */
public class User {
	
	private String id;
	private String userName;
	private String password;
	private String email;
	
	/**
	 * 
	 */
	public User()
	{
		
	}
	
	/**
	 * 
	 * @param userName
	 * @param password
	 */
	public User(String userName, String password) {
		this.setUserName(userName);
		this.setPassword(password);
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		this.id = this.getUserName();
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	

}
