

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class CorsFilter
 */
@WebFilter("/*")
public class CorsFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public CorsFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
        HttpServletResponse Response = (HttpServletResponse) response;
        Response.setHeader("Access-Control-Allow-Origin", "*");
        Response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        Response.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
        Response.setHeader("Access-Control-Expose-Headers", "Location");
        chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

//The following lines should be commented if @WebFilter("/*") is set.
//<filter>
//<filter-name>CorsFilter</filter-name>
//<filter-class>com.example.CorsFilter</filter-class>
//</filter>
//<filter-mapping>
//<filter-name>CorsFilter</filter-name>
//<url-pattern>/*</url-pattern>
//</filter-mapping>

