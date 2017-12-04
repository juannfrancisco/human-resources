package cl.mgn.labs.rrhh.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class SessionFilter
 */
public class SessionFilter implements Filter {

    /**
     * Default constructor. 
     */
    public SessionFilter() {
    }

	

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		HttpServletRequest requestHttp = (HttpServletRequest)request;		
		
		if( null == requestHttp.getSession(false).getAttribute( "user" ) )
		{
			((HttpServletResponse)response).setStatus( HttpServletResponse.SC_UNAUTHORIZED  );
			//((HttpServletResponse)response).sendRedirect( ((HttpServletRequest)request).getContextPath() + "/login.jsp");;
		}
		else
		{	
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException 
	{
		System.out.println( "Init Filter Session" );
	}
	
	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		
		System.out.println( "Destroy filter" );
	}

}
