package com.jilegeji.springbootlearning.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jilegeji.springbootlearning.bean.Account;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String index(Model model,@RequestParam("username") String username,String password,HttpSession session){
		session.setAttribute("account", new Account(username,password));
		//model.addAttribute("account", new Account(username,password));
		return "redirect:/index.html";
	}
}
