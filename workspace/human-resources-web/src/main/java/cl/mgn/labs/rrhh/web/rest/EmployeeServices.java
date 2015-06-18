package cl.mgn.labs.rrhh.web.rest;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import cl.mgn.labs.rrhh.core.employee.Employee;
import cl.mgn.labs.rrhh.persistence.api.EmployeePersistenceAPI;

/**
 * 
 * @author Juan Francisco Maldonado León
 *
 */
@Path("/services/employee")
public class EmployeeServices 
{	
	@Context
    private HttpServletRequest request;
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{idEmployee}")
	public Response getEmployeeJSON(@PathParam("idEmployee") String idEmployee ) 
	{
		Employee employee = EmployeePersistenceAPI.find( new Employee(idEmployee));
		return Response.status(200).entity(employee).build();
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll( ) 
	{
		List<Employee> employees = new ArrayList<Employee>();		
		employees = EmployeePersistenceAPI.findAll();		
		return Response.status(200).entity(employees).build();
	}
	
	
	@POST
	public Response createEmployee( Employee employee ) 
	{
		String output = "create";
		return Response.status(200).entity(output).build();
	}
	
	
	@PUT
	public Response modifyEmployee( ) 
	{
		String output = "modify ";
		return Response.status(200).entity(output).build();
	}
	
	@DELETE
	public Response removeEmployee( ) 
	{
		String output = "remove";
		return Response.status(200).entity(output).build();
	}
	
 
}