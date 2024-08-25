package com.example.postsapi.controller

import com.example.postsapi.model.Post
import com.example.postsapi.service.PostService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/posts")
class PostController(private val postService: PostService) {

    @GetMapping
    fun getAllPosts(): List<Post> = postService.getAllPosts()

    @GetMapping("/{id}")
    fun getPostById(@PathVariable id: Long): Post = postService.getPostById(id)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createPost(@RequestBody post: Post): Post = postService.createPost(post)

    @PutMapping("/{id}")
    fun updatePost(@PathVariable id: Long, @RequestBody post: Post): Post = postService.updatePost(id, post)

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deletePost(@PathVariable id: Long) = postService.deletePost(id)
}
