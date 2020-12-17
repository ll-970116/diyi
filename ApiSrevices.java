package com.example.wanapplication.utils;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ApiSrevices {
    @GET
    Observable<ResponseBody> getData(@Url String string);
}
