/**
 * Copyright (c) MgnLabs 2010-2015
 * Factoría de Desarrollo de Software
 * Santiago de Chile, Region Metropolitana
 */
package cl.mgn.labs.rrhh.core.person;

/**
 * ---------------------------------------------------------------------------
 * MGNlabs 20114 - 2015 
 * Gestion de Recursos Humanos -
 * @author Juan Francisco Maldonado León - ( juan.maldonado.leon@gmail.com )
 * @date 22-05-2015
 * Description : 
 * ---------------------------------------------------------------------------
 */
public class Rut extends IdPerson {

	private String number;
	private String checkDigit;
	
	
	public Rut()
	{
		
	}
	
	public Rut( String number, String checkDigit )
	{
		this.setNumber(number);
		this.setCheckDigit(checkDigit);
	}
	
	
	/**
	 * @return the checkDigit
	 */
	public String getCheckDigit() {
		return checkDigit;
	}
	/**
	 * @param checkDigit the checkDigit to set
	 */
	public void setCheckDigit(String checkDigit) {
		this.checkDigit = checkDigit;
	}


	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}


	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	
	
	
	
}
