package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Autowired
	ArticleService service;
	
	@GetMapping("/")
	public @ResponseBody String index() {
		return "hello";
	}
	
	@GetMapping("/articles")
	public @ResponseBody List<Article> articles() {
		return service.getArticles();
	}
	
}
