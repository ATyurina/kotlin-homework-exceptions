package ru.netology

import org.junit.Test

import org.junit.Assert.*
import java.lang.RuntimeException

class WallServiceTest {

    @Test
    fun getComment() {
        val service = WallService()
        service.addPost(Post())
        val comm = Comment()
        val result = service.createComment(1L, comm)
        assertEquals(result, comm)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val service = WallService()
        service.addPost(Post())
        val comm = Comment()
        service.createComment(2L, comm)
    }
}