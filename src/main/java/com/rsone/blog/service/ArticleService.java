package com.rsone.blog.service;

import com.rsone.blog.model.Article;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Abdelghani Roussi
 */

public interface ArticleService {

    Flux<Article> findAllArticles();
    Flux<Article> findAllArticlesByTopicsName(String topicsName);
    Mono<Article> createArticle(Article article);
}
