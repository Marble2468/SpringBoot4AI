package com.mysite.springboot4.repository;

import com.mysite.springboot4.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
