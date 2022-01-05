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
			model.addAttribute("allPosts", postDao.findAll());

			return "jpa";
		}

	@PostMapping("jpa/delete/{id}")
	public String delete(@PathVariable long id) {
		long deletePostId = id;
		postDao.deleteById((deletePostId));
		return "jpa";
	}
}
