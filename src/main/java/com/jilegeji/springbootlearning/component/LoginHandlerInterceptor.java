package com.jilegeji.springbootlearning.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import com.jilegeji.springbootlearning.bean.Account;

public class LoginHandlerInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Account account = (Account)request.getSession().getAttribute("account");
		if(account == null){
			response.sendRedirect("/jilegeji/");
			return false;
		}
		return true;
	}
	
}
