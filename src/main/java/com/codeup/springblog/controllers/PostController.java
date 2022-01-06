package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

	private final PostRepository postDao;
	private final UserRepository userDao;

	// setting up the post controller
	public PostController(PostRepository postDao, UserRepository userDao) {
		this.postDao = postDao;
		this.userDao = userDao;
	}

	// getting the show post page
	@GetMapping("/posts")
	public String posts(Model model) {
		model.addAttribute("post", postDao.findAll());
		model.addAttribute("user", userDao.findAll());
		return "posts/show";
	}

	// delete a post method
	@PostMapping("/posts/{id}")
	public String deletePost(@PathVariable Long id) {
		postDao.deleteById(id);
		return "redirect:/posts";
	}

	@GetMapping("posts/edit/{id}")
	public String editPost(@PathVariable long id, Model model) {
		Post editPost = postDao.getById(id);
		model.addAttribute("postToEdit", editPost);
		return "posts/edit";
	}

	@PostMapping("/posts/edit/{id}")
	public String saveEditedPost(@PathVariable long id, @RequestParam(name="postTitle") String postTitle, @RequestParam(name="postBody") String postBody) {
		Post postToEdit = postDao.getById(id);
		postToEdit.setBody(postBody);
		postToEdit.setTitle(postTitle);

		postDao.save(postToEdit);
		return "redirect:/posts";
	}

}
