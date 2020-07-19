package com.jilegeji.springbootlearning.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jilegeji.springbootlearning.bean.Dog;
import com.jilegeji.springbootlearning.propertiesBean.ConstantsProperties;
import com.jilegeji.springbootlearning.propertiesBean.PersonProperties;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class DemoController {
	
	private static final Logger logger = LoggerFactory.getLogger("rest_logger"); 
	
	@Autowired
	private ApplicationContext ac;
	
	@Autowired
    private Environment environment;
	
	@Autowired
	private ConstantsProperties constantsPropertyBean;
	
	@Autowired
	private PersonProperties personPropertyBean;

	@Value("${spring.datasource.username}")
	private String username;
	
	@RequestMapping("/testProperties")
	public String Hello(){
		System.out.println(personPropertyBean);
		System.out.println("=======================================================================");
		for (String name : ac.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		System.out.println("=======================================================================");
		System.out.println(environment.getProperty("user.name"));//获取的值为系统环境变量user.name:吉了个吉
		System.out.println(environment.getProperty("spring.datasource.username"));
		System.out.println(environment.getProperty("user.age"));//environment只能获取到application.properties中的值,此处为null
		System.out.println(environment);
		System.out.println(constantsPropertyBean.getName());
		System.out.println(constantsPropertyBean.getAge());
		System.out.println(constantsPropertyBean.getGender());
		return "testProperties";
	}
	
	//@Autowired//这是@Autowired作用于普通方法,该方法用自动运行一次
	@RequestMapping("/testSLF4j")
	public void testSLF4j(Dog dog){
		System.out.println(DemoController.class);
		log.warn("这是我的第一条log日志!");
		if(logger.isInfoEnabled()){
			logger.info("这是我的第一条{}日志!","rest_logger");
		}
		System.out.println(dog);
	}
}
