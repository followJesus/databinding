package com.example.cunli.databing.server;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.example.cunli.databing.TeachLogInterface;
import com.example.cunli.databing.utils.Help;
import com.example.cunli.databing.web.CheckTeachLog;
import com.example.cunli.databing.web.TeachLog;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by cunli on 16-8-18.
 */
public class TeachLogServer {

    private List<TeachLog> teachLogList;
    private TeachLog tl;

    //    保存教学日志
    public void saveTeachLogServer(TeachLog teachLog, final Context context) {
        TeachLogInterface serverInterface = Help.connectionService().create(TeachLogInterface.class);
        Call<TeachLog> call = serverInterface.teachLogs(teachLog);
        call.enqueue(new Callback<TeachLog>() {
            @Override
            public void onResponse(Call<TeachLog> call, Response<TeachLog> response) {
                int statusCode = response.code();
                Log.e("MainActivity", "--------------statusCode-----" + statusCode);
                tl = response.body();

                if (tl.getId() == 1){
                    Log.e("MainActivity", "----------save success---------");
                    Toast.makeText(context,"保存成功",Toast.LENGTH_SHORT).show();
                }else {
                    Log.e("MainActivity", "----------save error---------");
                    Toast.makeText(context,"保存失败",Toast.LENGTH_SHORT).show();
                }


            }

            @Override
            public void onFailure(Call<TeachLog> call, Throwable t) {
                t.printStackTrace();

                Log.e("MainActivity", "---------出错了-----" + t.toString());
            }
        });
    }

    //    查看教学日志列表
    public void teachLogList(CheckTeachLog checkTeachLog){
        TeachLogInterface serverInterface = Help.connectionService().create(TeachLogInterface.class);
        Call<List<TeachLog>> call = serverInterface.teachLogList(checkTeachLog);
        call.enqueue(new Callback<List<TeachLog>>() {
            @Override
            public void onResponse(Call<List<TeachLog>> call, Response<List<TeachLog>> response) {
                int statusCode = response.code();
                Log.e("MainActivity", "--------------statusCode-----" + statusCode);
                teachLogList = response.body();

                for (int i=0;i<teachLogList.size();i++){
                    Log.e("MainActivity", "-------------------" + teachLogList.get(i).getId());
                }


            }

            @Override
            public void onFailure(Call<List<TeachLog>> call, Throwable t) {
                t.printStackTrace();

                Log.e("MainActivity", "---------出错了-----" + t.toString());
            }
        });
    }
}
