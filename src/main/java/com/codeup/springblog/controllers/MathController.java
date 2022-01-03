package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

	@RequestMapping(path = "/add/{number1}/and/{number2}", method = RequestMethod.GET)
	@ResponseBody
	public int add(@PathVariable int number1, @PathVariable int number2){
		return (number1 + number2);
	}

	@RequestMapping(path = "/subtract/{number3}/from/{number4}", method = RequestMethod.GET)
	@ResponseBody
	public int subtract(@PathVariable int number3, @PathVariable int number4){
		return (number4 - number3);
	}

	@RequestMapping(path = "/multiply/{number5}/and/{number6}", method = RequestMethod.GET)
	@ResponseBody
	public int multiply(@PathVariable int number5, @PathVariable int number6){
		return (number5 * number6);
	}

	@RequestMapping(path = "/divide/{number7}/by/{number8}", method = RequestMethod.GET)
	@ResponseBody
	public int divide(@PathVariable int number7, @PathVariable int number8){
		return (number7 / number8);
	}
};
