package gr.aueb.sev.controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/*Servlet Filter implementation

class GRFilter*/
@WebFilter("/GRFilter")
public class GRFilter implements Filter {
        // private static final long serialVersionUID = 1L;

        public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
                throws IOException, ServletException {
            
            ((HttpServletRequest)request).setCharacterEncoding("UTF-8");
            chain.doFilter(request, response);
        }
}
