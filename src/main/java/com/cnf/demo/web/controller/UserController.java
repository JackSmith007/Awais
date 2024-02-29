package com.cnf.demo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cnf.demo.repositories.UserRepository;


/**
 * @author https://www.sourcecodeexamples.net/
 * HomeController handles HTTP Get request
 *
 */
@Controller
public class UserController
{
	@Autowired UserRepository userRepository;
	
	@GetMapping("/")
	public String home(Model model)
	{
		System.out.println( "sfasfas "+userRepository.findAll().toString());
		model.addAttribute("users", userRepository.findAll());
		return "index";
	}
	@GetMapping("/user")
	public String USER(Model model)
	{
		model.addAttribute("users", userRepository.findAll());
		return "index";
	}
}