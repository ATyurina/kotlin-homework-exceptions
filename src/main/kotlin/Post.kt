package ru.netology

data class Post (
    var id: Long = 1L,
    var authorId: Int = 213,
    val authorName: String = "Steve",
    val content: String = "lolololoo",
    var published: Long = 2345678956,

    val canEdit: Boolean = true,
    val postponedId: Int = 0,
    val postType: String = "reply",
    val date: Int = 12047,
    val isFavorite: Boolean = false,
    val canDelete: Boolean = true,
    val canPin: Boolean = true,
    val markedAsAds: Boolean = false,
    val isPinned: Int = 0,
    val friendsOnly: Int = 0,
    val comments: Comments = Comments(),
    val likes: Likes = Likes()
)

data class Comments(
    val count: Int = 9,
    val canPost: Boolean = true,
    val groupsCanPost: Boolean = false
)
data class Likes(
    val count: Int = 29,
    val canPublish: Boolean = true,
)