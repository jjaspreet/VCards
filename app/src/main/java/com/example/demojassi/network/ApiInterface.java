package com.example.demojassi.network;

import com.example.demojassi.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("users")
    Call<List<User>> userList();
}
