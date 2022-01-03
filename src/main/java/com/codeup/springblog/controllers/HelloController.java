package com.codeup.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

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
		model.addAttribute("username", username);
		return "profile";
	}

	@GetMapping("/roll-dice")
	public String TheDiceRoll() {
		return "dice";
	}

	@RequestMapping(path = "/roll-dice/{n}", method = RequestMethod.GET)
	@ResponseBody
	public String roll(@PathVariable int n){
		//store a random num here . . to use below :D
		int random = (int) Math.floor(Math.random()* 6 + 1 );
		if(n == random){
			return "Correct! You Guess " + n + " Dice rolled " + random + "!";
		}
		else {
			return n + " Incorrect! The dice rolled a " + random;
		}
	}

	@GetMapping("/join")
	public String showJoinForm() {
		return "join";
	}

	@PostMapping("/join")
	public String joinCohort(@RequestParam(name="cohort") String cohort, Model model){model.addAttribute("cohort", cohort);
		return "join";
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
