package com.jilegeji.springbootlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jilegeji.springbootlearning.bean.Account;

@Controller
public class LoginController {

	@PostMapping("/login")
	public String index(Model model,@RequestParam("username") String username,String password){
		model.addAttribute("account", new Account(username,password));
		return "index";
	}
}
