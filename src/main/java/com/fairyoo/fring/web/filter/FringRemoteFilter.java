package com.fairyoo.fring.web.filter;

import lombok.var;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.URLDecoder;
import java.text.MessageFormat;

/**
 * FringRemoteFilter
 *
 * @author MengYi at 2018-12-26 21:01
 */
public class FringRemoteFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // TODO Auto-generated method stub
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        // TODO Auto-generated method stub

        var request = (HttpServletRequest) servletRequest;
        var message = MessageFormat.format("[{0}][doFilter] 当前URL地址 :{1}", FringRemoteFilter.class.getSimpleName(), URLDecoder.decode(request.getRequestURI(), "UTF-8"));
        System.out.println(message);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
    }
}
