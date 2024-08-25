package com.example.postsapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info

@SpringBootApplication
@OpenAPIDefinition(info = Info(title = "Posts API", version = "1.0", description = "API for managing posts"))
class PostsApiApplication

fun main(args: Array<String>) {
	runApplication<PostsApiApplication>(*args)
}
