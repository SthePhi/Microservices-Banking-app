package com.insignia.apigateway.filters;

import com.netflix.zuul.ZuulFilter;

public class ErrorFilter extends ZuulFilter {

    @Override
    public String filterType()
    {
        return "error";
    }

    @Override
    public int filterOrder()
    {
        return 3;
    }

    @Override
    public boolean shouldFilter()
    {
        return true;
    }

    @Override
    public Object run()
    {
        System.out.println("Inside Error Filter");
        return null;
    }
}
