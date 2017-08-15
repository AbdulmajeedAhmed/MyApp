package com.abdulmajeed_ahmed.myapp.data.model.remote_service;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 *  This interface contains methods we are going to use to execute HTTP requests such as
 *  GET, POST, PUT, PATCH, and DELETE. GET is used here only.
 */
public interface SOService {

    @GET
    Call<ResponseBody> listRepos(@Url String url); // this is to be used in this task.

   /* @GET("http://api.fixer.io/latest") // this will use it to convert JSON to POJO (Plain Old Java Objects)... You can use it later.
    Call<WebServiceResponce> getAnswers();*/

}
