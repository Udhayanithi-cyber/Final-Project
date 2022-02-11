package com.Smart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Smart.entity.User;

@Controller
public class HomeController
{
	
 
 
  @GetMapping("/home")
  public String home(Model model)
  
  {
	  model.addAttribute("title","Home-Smart Contact Manager");
	  return"home";
  }
  
 
  @GetMapping("/signup")
  public String signup(Model model)
 
  {
	  model.addAttribute("title","Register-Smart Contact Manager");
	  model.addAttribute("user",new User());
	  return"signup";
  }
  
 
  @GetMapping("/about")
  public String about(Model model)
  {
	  model.addAttribute("title","About-Smart Contact Manager");
	  return"about";
  }

  
 
}
