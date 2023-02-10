package ru.netology.nmedia.repository

import androidx.lifecycle.LiveData
import ru.netology.nmedia.dto.Post

interface PostRepository {

    fun getAll(): LiveData<List<Post>>
    fun save(post: Post)
    fun removeById(id: Long) //Для удаления постов

    fun likeById(id: Long)
    fun shareById(id: Long)
    fun look(id: Long)
}