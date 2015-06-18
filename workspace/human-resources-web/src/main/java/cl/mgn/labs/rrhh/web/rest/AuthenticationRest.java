/**
 * 
 */
package cl.mgn.labs.rrhh.web.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import cl.mgn.labs.rrhh.core.user.User;

/**
 * @author Juan francisco Maldonado León
 *
 */
@Path("/authentication")
public class AuthenticationRest {
	
	public static final String USER_SESSION = "USER";
	
	@Context
    private HttpServletRequest request;
	
	
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@POST
	public Response login( 	@FormParam("username") String userName, 
							@FormParam("password") String password )
	{
		if( "admin".equals( userName ) && "admin".equals(password) )
		{			
			HttpSession session = request.getSession( true );
			User user = new User();
			user.setUserName("Admin");
			user.setEmail("admin@kvz.cl");
			session.setAttribute( USER_SESSION , user );
			
			return Response.status(Status.OK).build();
		}
		else
		{
			return Response.status(Status.UNAUTHORIZED).build();
		}
	}
	
	
	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public Response login( User user )
	{
		if( "admin".equals( user.getUserName() ) && "admin".equals( user.getPassword() ) )
		{			
			HttpSession session = request.getSession( true );
			session.setAttribute( USER_SESSION , user );
			return Response.status(Status.OK).build();
		}
		else
		{
			return Response.status(Status.UNAUTHORIZED).entity("").build();
		}
	}
	
	
	
	@DELETE
	public Response logout()
	{
		HttpSession session = request.getSession(false);
		if( null != session )
			session.invalidate();
		return Response.status(Status.OK).build();
	}
}
