package com.example.postsapi.service

import com.example.postsapi.model.Post
import com.example.postsapi.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class PostService(private val postRepository: PostRepository) {

    fun getAllPosts(): List<Post> = postRepository.findAll()

    fun getPostById(id: Long): Post = postRepository.findById(id).orElseThrow { RuntimeException("Post not found") }

    fun createPost(post: Post): Post = postRepository.save(post)

    fun updatePost(id: Long, post: Post): Post {
        val existingPost = getPostById(id)
        val updatedPost = existingPost.copy(title = post.title, content = post.content)
        return postRepository.save(updatedPost)
    }

    fun deletePost(id: Long) {
        postRepository.deleteById(id)
    }
}
