package cl.mgn.labs.rrrhh.test;

import java.util.Date;

import org.junit.Test;

import cl.mgn.labs.rrhh.core.employee.Employee;
import cl.mgn.labs.rrhh.core.person.Gender;
import cl.mgn.labs.rrhh.core.person.Rut;
import cl.mgn.labs.rrhh.persistence.api.EmployeePersistenceAPI;


public class EmployeeTest  {

	
	 @Test
	 public void testSave(){
		 
		 Employee employee = new Employee();
		 employee.setBirthday(new Date());
		 employee.setGender( Gender.MALE );
		 employee.setIdPerson( new Rut("16942332", "6") );
		 employee.setLastName("Maldonado");
		 employee.setMiddleName("León");
		 employee.setName("Juan Francisco");
		 
		 EmployeePersistenceAPI.save(employee);
	 }
	 
	 @Test
	 public void testFind(){
		 for( Employee emp : EmployeePersistenceAPI.findAll() ){
			 System.out.println( emp.getName() );
		 }
	 }
	
}
