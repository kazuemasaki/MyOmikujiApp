package com.example.kazuemasaki.myomikujiapp;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getOmikuji(View view) {
        //TextView取得
        TextView tv = (TextView) findViewById(R.id.myTextView);
        String[] results = {
                "大吉",
                "吉",
                "凶"
        };
        //乱数の生成
        Random randomGenerator = new Random();
        int num = randomGenerator.nextInt(results.length); // 0-2
        //結果の表示
        //String result = Integer.toString(num);

        if (num == 0) {
            tv.setTextColor(Color.RED);
        } else {
            tv.setTextColor(Color.rgb(0, 0, 0));
        }
        tv.setText(results[num]);
    }

}
