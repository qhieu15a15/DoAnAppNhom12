package com.example.lib.InterfaceResponsitory;

import com.example.lib.model.BinhLuan;
import com.example.lib.model.DanhMuc;
import com.example.lib.model.Mon;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface AppFoodMethods {
    @GET("danhmuc.php")
    Observable<DanhMuc> GET_DanhMuc();

    @GET("monngaunhien.php")
    Observable<Mon> GET_MonNgauNhien();

    @POST("chitietdanhmuc.php")
    @FormUrlEncoded
    Observable<Mon> POST_MonTheoDanhMuc(
            @Field("madanhmuc") int madanhmuc
    );

    @POST("timkiemmon.php")
    @FormUrlEncoded
    Observable<Mon> POST_TimKiemMon(
            @Field("tenmon") String tenmon
    );

    @POST("binhluan.php")
    @FormUrlEncoded
    Observable<BinhLuan> POST_BinhLuan(
            @Field("mamon") String mamon
    );

}
