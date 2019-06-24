package com.example.myapplication_retrofitmaze;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderAPI {
    @GET("posts")

    Call<List<Post>> getPosts(); // in interfaces we do not provide method body, we only declare method
}
