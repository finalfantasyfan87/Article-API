package com.article.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.article.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Long>{
	Article findByTitle(String title);

}
