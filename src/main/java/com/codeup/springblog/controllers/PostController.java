package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
	private final PostRepository postDao;

	public PostController(PostRepository postDao) {
		this.postDao = postDao;
	}

		@GetMapping("/jpa")
		public String postIndex(Model model) {
			model.addAttribute("name", postDao.findAll());

			return "jpa";
		}
}
