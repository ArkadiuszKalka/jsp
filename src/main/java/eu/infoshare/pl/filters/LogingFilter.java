package eu.infoshare.pl.filters;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

public class LogingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String testParam = filterConfig.getInitParameter("test-param");
        System.out.println("Test Param: " + testParam);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String ipAddress = servletRequest.getRemoteAddr();
// Log the IP address and current timestamp.
        System.out.println("IP "+ ipAddress + ", Time "+ new Date().toString());
// Pass request back down the filter chain
        filterChain.doFilter(servletRequest,servletResponse);


    }

    @Override
    public void destroy() {

    }
}
