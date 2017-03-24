package com.pheonixdev.weblog.network;


import com.pheonixdev.weblog.model.Article;
import com.pheonixdev.weblog.model.AuthenticationRequest;
import com.pheonixdev.weblog.model.MessageResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;



public interface ApiInterface {

    @POST(NetworkURL.LOGIN)
    Call<MessageResponse> login(@Body AuthenticationRequest body);

    @POST(NetworkURL.REGISTRATION)
    Call<MessageResponse> registration(@Body AuthenticationRequest body);

    @GET(NetworkURL.GET_ARTICLES)
    Call<List<Article>> getArticles();

    @GET(NetworkURL.LOGOUT)
    Call<Void> logout();

}
