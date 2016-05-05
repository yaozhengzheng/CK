package com.edu.feicui.ck.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.edu.feicui.ck.R;

public class TelmsgActivity extends AppCompatActivity {

    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telmsg);
        //初始控件
        listview = (ListView) findViewById(R.id.lv_list);
    }
}
