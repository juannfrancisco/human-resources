/**
 * 
 */
package cl.mgn.labs.rrhh.web.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;

import cl.mgn.labs.rrhh.business.AuthenticationBusiness;
import cl.mgn.labs.rrhh.core.commons.Constants;
import cl.mgn.labs.rrhh.core.exception.ObjectNotFoundException;
import cl.mgn.labs.rrhh.core.user.User;

/**
 * 
 * ---------------------------------------------------------------------------
 * MGNlabs 2014 - 2015 
 * Gestion de Recursos Humanos -
 * @author Juan Francisco Maldonado León - ( juan.maldonado.leon@gmail.com )
 * @date 22-05-2015
 * Description : Servicio rest para manejar la sesion.
 * [ POST ]   /api/authentication - Iniciar sesion.
 * [ REMOVE ] /api/authentication - Logout.
 * ---------------------------------------------------------------------------
 */
@Path("/authentication")
public class AuthenticationRest {
	
	private static final Logger LOGGER = Logger.getLogger(AuthenticationRest.class.getCanonicalName());
	public static final String USER_SESSION = "USER";
	
	@Context
    private HttpServletRequest request;
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	public Response login( User user)
	{
		try 
		{
			MDC.put( Constants.LOGGER_USERID, user.getUserName() );
			MDC.put( Constants.LOGGER_APPLICATION, "authentication" );
			user = AuthenticationBusiness.authentication( user );
			HttpSession session = request.getSession( true );
			session.setAttribute( USER_SESSION , user );
			
			LOGGER.info( "El usuario " + user.getUserName() + " ha iniciado sesion correctamente" );
			return Response.status(Status.OK).build();
		}
		catch (ObjectNotFoundException e) 
		{
			LOGGER.error( "Usuario y/o clave no validos", e );
			return Response.status(Status.UNAUTHORIZED).build();
		}
		catch( Exception e )
		{
			LOGGER.error( "Ocurrio un error inesperado", e );
			return Response.status(Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@POST
	public Response loginForm( 	@FormParam("username") String userName, 
							@FormParam("password") String password )
	{
		User user = new User( userName, password );
		return login(user);
	}
	
	
	
	@GET
	public Response loginFormHack( 	@QueryParam("username") String userName, 
			@QueryParam("password") String password )
	{
		User user = new User( userName, password );
		return login(user);
	}
	
	
	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public Response loginJSON( User user )
	{
		return login(user);
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
