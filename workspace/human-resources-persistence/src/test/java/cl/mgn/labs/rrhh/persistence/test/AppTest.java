package cl.mgn.labs.rrhh.persistence.test;

import java.util.Date;
import java.util.UUID;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import cl.mgn.labs.rrhh.core.employee.Employee;
import cl.mgn.labs.rrhh.core.person.Gender;
import cl.mgn.labs.rrhh.core.person.Rut;
import cl.mgn.labs.rrhh.persistence.api.EmployeePersistenceAPI;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	Employee employee = new Employee();
    	employee.setId(UUID.randomUUID().toString());
    	employee.setIdPerson( new Rut("16942332", "6") );
    	employee.setName("Juan Francisco");
    	employee.setMiddleName("Maldonado");
    	employee.setLastName("León");
    	employee.setGender(Gender.MALE);
    	employee.setBirthday( new Date() );
    	
    	System.out.println( EmployeePersistenceAPI.contains((employee) ) );
    	
        assertTrue( true );
    }
}
