package com.example.timmy.recelycleviewdemo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.timmy.recelycleviewdemo.recyclerAdapter.recyclerAdapter;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private RecyclerView recyclerview;
    private ArrayList<String> datas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
        //准备数据集合
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        datas = new ArrayList<>();


        for(int i=0;i<100;i++)
            datas.add(""+i);


        //实现recyclerview自己的适配器
        recyclerAdapter myrecyclerview =new recyclerAdapter(MainActivity.this,datas);

        //设置适配器
       recyclerview.setAdapter(myrecyclerview);


        //设置LayoutManger
        recyclerview.setLayoutManager(new GridLayoutManager(MainActivity.this,4,GridLayoutManager.VERTICAL,false));

    }
}
