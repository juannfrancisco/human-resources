package cl.mgn.labs.rrhh.web.rest;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
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

import org.apache.log4j.Logger;

import cl.mgn.labs.rrhh.core.employee.Skill;
import cl.mgn.labs.rrhh.persistence.api.SkillPersistenceAPI;

/**
 * 
 * @author Juan Francisco Maldonado León
 *
 */
@Path("/skill")
public class SkillServices 
{	
	private static final Logger LOGGER = Logger.getLogger(SkillServices.class.getCanonicalName());
	
	@Context
    private HttpServletRequest request;
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{idSkill}")
	public Response getEmployeeJSON(@PathParam("idSkill") String idSkill ) 
	{
		Skill skill = SkillPersistenceAPI.find( new Skill(idSkill));
		return Response.status(200).entity(skill).build();
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll( ) 
	{
		List<Skill> list = new ArrayList<Skill>();		
		list = SkillPersistenceAPI.findAll();		
		return Response.status(200).entity(list).build();
	}
	
	
	@POST
	@Consumes( MediaType.APPLICATION_JSON )
	public Response create( Skill skill ) 
	{
		SkillPersistenceAPI.save(skill);
		return Response.status(200).entity("").build();
	}
	
	
	@PUT
	@Consumes( MediaType.APPLICATION_JSON )
	public Response modify( Skill skill ) 
	{
		String output = "modify ";
		return Response.status(200).entity(output).build();
	}
	
	@DELETE
	public Response remove( ) 
	{
		String output = "remove";
		return Response.status(200).entity(output).build();
	}
	
 
}