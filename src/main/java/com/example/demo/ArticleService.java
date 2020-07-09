package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

	@Autowired
	ArticleMapper mapper;
	
	public List<Article> getArticles() {
		return mapper.getArticles();
	}
	
}
