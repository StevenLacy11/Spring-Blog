package com.codeup.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

	@RequestMapping(path = "/posts", method = RequestMethod.GET)
	@ResponseBody
	public String posts() {
		return "POST INDEX PAGE";
	}

	@RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String postByID(@PathVariable long id) {
		return "View an individual post " + id;
	}

	@RequestMapping(path = "/posts/create", method = RequestMethod.GET)
	@ResponseBody
	public String postCreateGet() {
		return "view the form for creating a post";
	}

	@RequestMapping(path = "/posts/create", method = RequestMethod.POST)
	@ResponseBody
	public String postCreatePost() {
		return "create a new post";
	}


}
