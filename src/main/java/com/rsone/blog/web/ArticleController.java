package com.rsone.blog.web;

import com.rsone.blog.model.Article;
import com.rsone.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@RestController
public class ArticleController {

    ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @Bean
    RouterFunction<ServerResponse> routes(){
        return RouterFunctions
                .route(
                        GET("/articles"), serverRequest -> {
                                return ok().body(articleService.findAllArticles(), Article.class);
                        })
                .andRoute(
                        GET("/hello"), request ->{
                            return ok().body(Flux.just("Hello", "World"), String.class);
                        }
                );
    }
}
