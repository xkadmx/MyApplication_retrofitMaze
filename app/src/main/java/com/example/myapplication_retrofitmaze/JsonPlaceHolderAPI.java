package com.example.myapplication_retrofitmaze;

import java.util.List;

import retrofit2.Call;

public interface JsonPlaceHolderAPI {

    Call<List<Post>> getPosts(); // in interfaces we do not provide method body, we only declare method
}
