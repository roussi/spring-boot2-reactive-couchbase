package com.rsone.blog.repository;

import com.rsone.blog.model.Article;
import org.springframework.data.couchbase.repository.ReactiveCouchbaseRepository;

/**
 * @author Abdelghani Roussi
 */

public interface ArticleRepository extends ReactiveCouchbaseRepository<Article, String> {
}
