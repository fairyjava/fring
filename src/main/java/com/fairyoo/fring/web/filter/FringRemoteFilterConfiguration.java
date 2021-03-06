package com.fairyoo.fring.web.filter;

import lombok.var;
import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author MengYi at 2018-12-26 20:28
 * 添加@Configuration 注解，将自定义Filter加入过滤链
 */
@Configuration
public class FringRemoteFilterConfiguration {

    /**
     * RemoteIpFilter
     *
     * @author by MengYi at 2018-12-26 20:50
    */
    @Bean
    public RemoteIpFilter remoteIpFilter() {
        return new RemoteIpFilter();
    }

    /**
     * FilterRegistrationBean
     *
     * @author by MengYi at 2018-12-26 20:49
    */
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {

        var filterRB = new FilterRegistrationBean();
        filterRB.setFilter(new FringRemoteFilter());
        filterRB.addUrlPatterns("/*");
        filterRB.addInitParameter("paramName", "paramValue");
        filterRB.setName(FringRemoteFilter.class.getSimpleName());
        filterRB.setOrder(2);

        return filterRB;
    }







}
