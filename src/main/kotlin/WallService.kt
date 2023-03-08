package ru.netology

import java.lang.RuntimeException

class PostNotFoundException(message : String) : RuntimeException(message)
class WallService {

    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    fun addPost(post : Post) {
        posts += post
    }

    private fun findById(id: Long) : Post? {
        for (post in posts) {
            if (post.id == id) {
                return post
            }
        }
        return null
    }

    fun createComment(postId: Long, comment: Comment) : Comment{
        findById(postId) ?: throw PostNotFoundException("No comments")
        comments += comment
        return comments.last()
    }
}