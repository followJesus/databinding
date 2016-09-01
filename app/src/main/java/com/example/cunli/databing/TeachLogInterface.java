package com.example.cunli.databing;

import com.example.cunli.databing.web.CheckTeachLog;
import com.example.cunli.databing.web.TeachLog;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by cunli on 16-8-16.
 */
public interface TeachLogInterface {
//    查看教学日志列表
    @POST("teachLogList")
    Call<List<TeachLog>> teachLogList(@Body CheckTeachLog checkTeachLog);

//    保存教学日志
    @POST("teachLogSave")
    Call<TeachLog> teachLogs(@Body TeachLog teachLog);
}
