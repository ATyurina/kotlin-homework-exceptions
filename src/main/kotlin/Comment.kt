package ru.netology

data class Comment (
    val id: Long = 1L,
    val fromId: Long = 2L,
    val date: Int = 3,
    val text: String = "LOL",
    val donut: Donut = Donut(),
    val replyToUser: Long = 4L,
    val replyToComment: Long = 5L,
    val attachments: Array<String> = emptyArray(),
    val parentsStack: Array<Long> = emptyArray(),
    val thread: Thread = Thread(),
)

data class Donut(
    val isDon: Boolean = false,
    val placeholder: String = "пфф"
)

data class Thread(
    val count: Int = 0,
    val items: Array<String> = emptyArray(),
    val canPost: Boolean = true,
    val showReplyButton: Boolean = true,
    val groupsCanPost: Boolean = true,
)
