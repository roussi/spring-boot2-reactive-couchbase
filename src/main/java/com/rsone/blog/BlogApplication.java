package com.rsone.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.couchbase.repository.config.EnableReactiveCouchbaseRepositories;

/**
 * @author Abdelghani Roussi
 */

@SpringBootApplication
@EnableReactiveCouchbaseRepositories // is added explicitly only to confirm the bug
public class BlogApplication {
	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}
}