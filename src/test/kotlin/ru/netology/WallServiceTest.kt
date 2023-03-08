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

    @Test(expected = NotFoundException::class)
    fun shouldThrow() {
        val service = WallService()
        service.addPost(Post())
        val comm = Comment()
        service.createComment(2L, comm)
    }

    @Test
    fun addReport() {
        val service = WallService()
        val comm = Comment()
        val rep = Report(1L, 1L, 4)
        service.addComment(comm)
        val result = service.wallReportComment(rep)
        assertEquals(result, 1)
    }
    @Test(expected = NotFoundException::class)
    fun throwException() {
        val service = WallService()
        val comm = Comment()
        val rep = Report(1L, 2L, 4)
        service.addComment(comm)
        service.wallReportComment(rep)
    }
    @Test(expected = NotFoundException::class)
    fun throwSecondException() {
        val service = WallService()
        val comm = Comment()
        val rep = Report(1L, 1L, 9)
        service.addComment(comm)
        service.wallReportComment(rep)
    }
}