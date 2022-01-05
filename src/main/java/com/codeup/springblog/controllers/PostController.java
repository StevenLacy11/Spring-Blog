package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

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

	@GetMapping("/jpa/{name}")
	public String postIndex(@PathVariable String name, Model model) {
		model.addAttribute("name", postDao.findByName(name));
		return "jpa";
	}

	@PostMapping("jpa/{id}/delete")
	public String delete(@PathVariable long id) {
		postDao.deleteById((id));
		return "jpa";
	}
}
