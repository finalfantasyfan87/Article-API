package com.article.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.article.model.Author;

public interface AuthorRepository extends JpaRepository<Author,Long>{

}
