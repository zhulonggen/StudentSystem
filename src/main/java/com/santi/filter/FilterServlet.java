package com.santi.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.druid.filter.Filter;
import com.santi.entriy.User;

@WebFilter({"/StudentServlet","/TeacherServlet","/Student/*","/Teacher/*"})
public class FilterServlet implements javax.servlet.Filter{
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		javax.servlet.Filter.super.init(filterConfig);
	}
	
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		User user = (User)req.getSession().getAttribute("user");
		if(user!=null) {
			chain.doFilter(request, response);
		}else {
			HttpServletResponse resp=(HttpServletResponse)response;
			resp.sendRedirect(req.getContextPath()+"/login.jsp");
		}
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		javax.servlet.Filter.super.destroy();
	}
}
