package ru.netology

import java.lang.RuntimeException

class NotFoundException(message : String) : RuntimeException(message)
class WallService {

    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var reports = emptyArray<Report>()
    private var reasons = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8)

    fun addPost(post : Post) {
        posts += post
    }

    fun addComment(comment: Comment) {
        comments += comment
    }

    private fun findPostById(id: Long) : Post? {
        for (post in posts) {
            if (post.id == id) {
                return post
            }
        }
        return null
    }
    private fun findCommentById(id: Long) : Comment? {
        for (comment in comments) {
            if (comment.id == id) {
                return comment
            }
        }
        return null
    }

    fun createComment(postId: Long, comment: Comment) : Comment{
        findPostById(postId) ?: throw NotFoundException("No comments")
        comments += comment
        return comments.last()
    }

    fun wallReportComment(report: Report) : Int {
        findCommentById(report.commentId) ?: throw NotFoundException("No comments")
        reasons.getOrNull(report.reason) ?: throw NotFoundException("Wrong reason")
        reports += report
        return 1
    }
}