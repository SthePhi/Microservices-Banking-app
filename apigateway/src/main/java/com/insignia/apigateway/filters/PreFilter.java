package com.insignia.apigateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

public class PreFilter extends ZuulFilter {

    public String filterType()
    {
        return "pre";
    }

    public int filterOrder()
    {
        return 1;
    }
    public boolean shouldFilter()
    {
        return true;
    }

    public Object run()
    {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();

        System.out.println("Request method: " + request.getMethod() + ",Request url: " + request.getRequestURL().toString());
        return null;
    }
}
