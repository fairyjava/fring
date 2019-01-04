package com.fairyoo.fring.web.filter;

import lombok.var;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * FringWebFilter要能生效，需要在"FringApplication"上加'@ServletComponentScan'注解
 *
 * @author MengYi at 2018-12-26 20:54
 */
@Order(1)
@WebFilter(filterName = "FringWebFilter", urlPatterns = "/*")
public class FringWebFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        filterChain.doFilter(servletRequest, servletResponse);

        var uri = ((HttpServletRequest) servletRequest).getRequestURI();
        if (uri.isEmpty()) {
            return;
        }
        if(uri.equals("/v2/api-docs")) {
            return;
        }

        System.out.println(FringWebFilter.class.getSimpleName() + ",当前URL地址 :" + uri);

    }

    @Override
    public void destroy() {

    }


}
