package com.rsone.blog.web.handler;

import com.rsone.blog.model.Article;
import com.rsone.blog.service.ArticleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class ArticleHandlerFunction {

    ArticleService articleService;

    public ArticleHandlerFunction(ArticleService articleService) {
        this.articleService = articleService;
    }

    public Mono<ServerResponse> createArticle(ServerRequest request){
        Mono<Article> articleMono = request.bodyToMono(Article.class);
        return articleMono.flatMap(article -> {
            return ServerResponse.status(HttpStatus.CREATED)
                    .contentType(MediaType.ALL)
                    .body(articleService.createArticle(article), Article.class);
        });
    }
    public Mono<ServerResponse> getAllArticles(ServerRequest request){
        return ServerResponse.ok().body(articleService.findAllArticles(), Article.class);
    }
}
