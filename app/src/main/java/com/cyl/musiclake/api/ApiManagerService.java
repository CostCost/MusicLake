package com.cyl.musiclake.api;

import com.cyl.musiclake.ui.login.user.User;
import com.cyl.musiclake.ui.map.location.Location;
import com.cyl.musiclake.ui.onlinemusic.model.OnlineArtistInfo;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;

/**
 * Created by yonglong on 2017/9/11.
 */

public interface ApiManagerService {

    //http://c.y.qq.com/soso/fcgi-bin/search_cp?
    /*
        'p': page,
        'n': limit,
        'w': key,
        'aggr': 1,
        'lossless': 1,
        'cr': 1
     */
    @GET
    Observable<String> getSongUrl(@Url String baseUrl);

    @GET
    Observable<QQApiModel> searchByQQ(@Url String baseUrl, Map<String, Object> params);

    @POST
    Observable<ApiModel<User>> getUserInfo(@Url String baseUrl, Map<String, String> params);

    @GET
    Observable<ApiModel<List<Location>>> getNearPeopleInfo(@Url String baseUrl, Map<String, String> params);

    @GET
    Observable<ApiModel<OnlineArtistInfo>> getArtistInfo(@Url String baseUrl, Map<String, String> params);
}
