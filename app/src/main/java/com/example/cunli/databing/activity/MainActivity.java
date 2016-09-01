package com.example.cunli.databing.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


import com.example.cunli.databing.R;
import com.example.cunli.databing.databinding.ActivityMainBinding;
import com.example.cunli.databing.server.TeachLogServer;
import com.example.cunli.databing.web.CheckTeachLog;
import com.example.cunli.databing.web.TeachLog;
import com.example.cunli.databing.web.User;

public class MainActivity extends AppCompatActivity {

    private TeachLogServer teachLogServer = new TeachLogServer();
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        user = new User("haliluya", "thankyoulord");
        binding.setUser(user);

    }

    public void hello(View view){


        Log.e("password","------getEmail------- "+user.getEmail());

        Toast.makeText(this,user.getEmail()+"\t"+user.getPassword(), Toast.LENGTH_SHORT).show();
    }

    //    查看教学日志列表
    public void checkTeachLogs(){

        CheckTeachLog checkTeachLog = new CheckTeachLog("zhuanye", "2016-08-17 12:28:57", "2016-08-29 12:45:00");
        teachLogServer.teachLogList(checkTeachLog);

    }

    //保存教学日志
    public void saveTeachLog() {
//        listView = (ListView) findViewById(R.id.myList);

        TeachLog teachLog = new TeachLog("zhuanye100", "oneTwo100", "threFour100", "fiveSix100", "sevenEight100");
        teachLogServer.saveTeachLogServer(teachLog,this);

    }

}
