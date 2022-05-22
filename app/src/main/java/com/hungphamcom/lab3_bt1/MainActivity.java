package com.hungphamcom.lab3_bt1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecycleviewHandler recycleviewHandler;
    private List<user> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycleView);
        userList=new ArrayList<>();

        user user1=new user("Harry","San Diego");
        user user2=new user("Marla","San Francisco");
        user user3=new user("Sarah","San Marco");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recycleviewHandler=new RecycleviewHandler(this,userList);
        recyclerView.setAdapter(recycleviewHandler);
        recycleviewHandler.notifyDataSetChanged();
    }
}