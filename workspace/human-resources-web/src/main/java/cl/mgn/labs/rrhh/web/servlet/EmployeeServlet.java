/**
 * 
 */
package cl.mgn.labs.rrhh.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Juan Francisco Maldonado León
 *
 */
public class EmployeeServlet extends HttpServlet {
	
	private static final long serialVersionUID = -409472811169530585L;
	

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		session.setAttribute("usuario", "usuario 1");
		
		response.getOutputStream().print("Respuesta GET");
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String accept = request.getHeader( "accept" );
		HttpSession session = request.getSession(true);
		String attrs = (String)session.getAttribute("usuario");
		response.getOutputStream().print("Respuesta POST " + attrs);
	}
	
	
	@Override
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.getOutputStream().print("Respuesta PUT");
	}
	
	
	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.getOutputStream().print("Respuesta DELETE");
		
	}

}
