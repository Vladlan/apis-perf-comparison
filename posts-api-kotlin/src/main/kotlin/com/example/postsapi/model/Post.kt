package com.example.postsapi.model

import jakarta.persistence.*

@Entity
@Table(name = "posts")
data class Post(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val title: String,

    val content: String
) {
    // No-argument constructor
    constructor() : this(null, "", "")
}
