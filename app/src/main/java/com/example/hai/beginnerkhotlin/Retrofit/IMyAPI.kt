package com.example.hai.beginnerkhotlin.Retrofit

import com.example.hai.beginnerkhotlin.Model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface IMyAPI {
    @get:GET("posts")
    val posts:Observable<List<Post>>
}