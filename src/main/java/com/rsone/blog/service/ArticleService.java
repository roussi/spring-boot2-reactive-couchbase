package com.rsone.blog.service;

import com.rsone.blog.model.Article;
import reactor.core.publisher.Flux;

/**
 * @author Abdelghani Roussi
 */

public interface ArticleService {

    Flux<Article> findAllArticles();
    Flux<Article> findAllArticlesByTopicsName(String topicsName);
}
