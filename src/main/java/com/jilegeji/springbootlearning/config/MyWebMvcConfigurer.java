package com.jilegeji.springbootlearning.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.jilegeji.springbootlearning.component.LoginHandlerInterceptor;

@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer{
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("login");
		registry.addViewController("/index.html").setViewName("index");
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginHandlerInterceptor())
			.addPathPatterns("/**")
			.excludePathPatterns("/","/login","/image/**","/js/**","favicon.ico");
	}
	
}
