package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler_view;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initAdapter();
    }

    private void initAdapter() {
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CustomAdapter(getListData());
        recycler_view.setAdapter(adapter);
        recycler_view.setHasFixedSize(true);
    }

    private List<Student> getListData() {
        List<Student> listData = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listData.add(new Student(""+i, "Nguyen Phuong Anh" + i, "zxcvfgfdgdfgdfgfdfgbnm" + i, "zxcvfgfdgdfgdfgfdfgbnm" + i, "zxcvfgfdgdfgdfgfdfgbnm" + i, "zxcvfgfdgdfgdfgfdfgbnm" + i, "zxcvfgfdgdfgdfgfdfgbnm" + i, "zxcvfgfdgdfgdfgfdfgbnm" + i, "zxcvfgfdgdfgdfgfdfgbnm" + i));
        }
        return listData;
    }

    private void initView() {
        recycler_view = findViewById(R.id.recycler_view);
    }
}