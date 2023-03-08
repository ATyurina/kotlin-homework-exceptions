package ru.netology


fun main(args: Array<String>) {
    val service = WallService()
    service.addPost(Post())
    val comm = service.createComment(2L, Comment())
    println(comm)
}



