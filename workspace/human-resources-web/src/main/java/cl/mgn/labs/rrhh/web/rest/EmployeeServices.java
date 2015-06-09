package cl.mgn.labs.rrhh.web.rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * 
 * @author Juan Francisco Maldonado León
 *
 */
@Path("/services/employee")
public class EmployeeServices 
{
	@GET
	@Path("/{idEmployee}")
	public Response getMsg(@PathParam("idEmployee") String idEmployee ) 
	{
		String output = "Find Employee default : " + idEmployee;
		return Response.status(200).entity(output).build();
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{idEmployee}")
	public Response getEmployeeTXT(@PathParam("idEmployee") String idEmployee ) 
	{
		String output = "result Find Employee text : " + idEmployee;
		return Response.status(200).entity(output).build();
	}
	
	
	@GET
	@Produces(MediaType.TEXT_XML)
	@Path("/{idEmployee}")
	public Response getEmployeeXML(@PathParam("idEmployee") String idEmployee ) 
	{
		String output = "<tag>:'Find Employee xml : " + idEmployee + "</tag>";
		return Response.status(200).entity(output).build();
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{idEmployee}")
	public Response getEmployeeJSON(@PathParam("idEmployee") String idEmployee ) 
	{
		String output = "{'result':'Find Employee json : " + idEmployee + "'}";
		return Response.status(200).entity(output).build();
	}
	
	
	
	
	@GET
	public Response getAll( ) 
	{
		String output = "find all ";
		return Response.status(200).entity(output).build();
	}
	
	
	@POST
	public Response createEmployee( ) 
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
	
	
//	@POST
//	@Produces(MediaType.APPLICATION_JSON)
//	public Employee getEmployee()
//	{
//		Employee emp = new Employee();
//		emp.setUuid( UUID.randomUUID().toString() );
//		return emp;
//	}
//	
	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	@Path("/{idEmployee}")
//	public Response getEmployee(@PathParam("idEmployee") String idEmployee ) 
//	{
//		String output = "Find Employee  text: " + idEmployee;
//		return Response.status(200).entity(output).build();
//	}
//	
//	@GET
//	@Produces(MediaType.TEXT_XML)
//	@Path("/{idEmployee}")
//	public Response getEmployeeXML(@PathParam("idEmployee") String idEmployee ) 
//	{
//		String output = "<h>Find Employee xml : " + idEmployee + "</h>";
//		return Response.status(200).entity(output).build();
//	}
//	
//	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("/{idEmployee}")
//	public Response getEmployeeJSON(@PathParam("idEmployee") String idEmployee ) 
//	{
//		String output = "{result:'Find Employee xml : " + idEmployee + "'}";
//		return Response.status(200).entity(output).build();
//	}
	
 
}