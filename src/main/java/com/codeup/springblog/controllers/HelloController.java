package com.codeup.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

	@GetMapping("/")
	@ResponseBody
	public String landing(){
		return "This is a landing page!";
	}

	@GetMapping("/home")
	public String welcome(){
		return "Home";
	}
	@GetMapping("/profile/{username}")
	public String profile(@PathVariable String username, Model model) {
		model.addAttribute("name", username);
		return "profile";
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello(){
		return "Hello from Quasar! Happy Holidays!";
	}

	@GetMapping("/hello/{name}")
	@ResponseBody
	public String sayHello(@PathVariable String name){
		return "Hello there " + name + "!";
	}

	@RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
	@ResponseBody
	public String addOne(@PathVariable int number){
		return "Hey, your number plus one is " + (number + 1) + "!";
	}


}
