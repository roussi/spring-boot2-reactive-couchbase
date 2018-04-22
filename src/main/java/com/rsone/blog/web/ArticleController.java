package com.rsone.blog.web;

import com.rsone.blog.model.Article;
import com.rsone.blog.service.ArticleService;
import com.rsone.blog.web.handler.ArticleHandlerFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;

import java.util.stream.Collectors;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@RestController
public class ArticleController {

    ArticleHandlerFunction articleHandlerFn;

    @Autowired
    public ArticleController(ArticleHandlerFunction articleHandlerFn) {
        this.articleHandlerFn = articleHandlerFn;
    }

    @Bean
    RouterFunction<ServerResponse> routes(){
        return RouterFunctions
                .route(
                        GET("/articles"), articleHandlerFn::getAllArticles)
                .andRoute(
                        POST(  "/articles"), articleHandlerFn::createArticle
                );
    }
}