package com.chandan.android.movieapp.data.remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by CHANDAN on 7/31/2017.
 * This class will create a singleton of Retrofit.
 * Retrofit used a base URL to build its instance,so we will pass a URL when
 * calling RetrofitClient.getClient
 * specified the JSON converter we need(GSON)
 *
 */


public class ApiClient {

    public static final String BASE_URL = "http://api.themoviedb.org/3/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
