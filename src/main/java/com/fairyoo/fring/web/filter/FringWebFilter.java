package com.fairyoo.fring.web.filter;

import lombok.var;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.URLDecoder;
import java.text.MessageFormat;

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
        if (uri.equals("/v2/api-docs")) {
            return;
        }

        var message = MessageFormat.format("[{0}][doFilter] 当前URL地址 :{1}", FringWebFilter.class.getSimpleName(), URLDecoder.decode(uri, "UTF-8"));
        System.out.println(message);

    }

    @Override
    public void destroy() {

    }


}
