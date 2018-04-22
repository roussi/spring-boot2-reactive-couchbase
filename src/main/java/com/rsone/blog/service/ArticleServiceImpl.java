package com.rsone.blog.service;

import com.rsone.blog.model.Article;
import com.rsone.blog.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Abdelghani Roussi
 */

@Service
public class ArticleServiceImpl implements ArticleService{

    ArticleRepository articleRepository;

    @Autowired
    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public Flux<Article> findAllArticles() {
        return articleRepository.findAll();
    }

    @Override
    public Flux<Article> findAllArticlesByTopicsName(String topicsName){
        return Flux.empty();
    }

    @Override
    public Mono<Article> createArticle(Article article) {
         return articleRepository.save(article);
    }
}
