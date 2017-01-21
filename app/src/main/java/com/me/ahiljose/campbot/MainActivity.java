package com.me.ahiljose.campbot;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
//recent chat messages shown xml handled activity
public class MainActivity extends AppCompatActivity {
    private List<recentData> recentList = new ArrayList<>();
    private RecyclerView recyclerView;
    private recentAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        prepareMovieData();
        mAdapter = new recentAdapter(recentList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);


    }

    private void prepareMovieData() {
        recentData recent = new recentData("Mad Max: Fury Road", "Action & Adventure", "2015");
        recentList.add(recent);

        recent = new recentData("Inside Out", "Animation, Kids & Family", "2015");
        recentList.add(recent);

        recent = new recentData("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        recentList.add(recent);

        recent = new recentData("Shaun the Sheep", "Animation", "2015");
        recentList.add(recent);

        recent = new recentData("The Martian", "Science Fiction & Fantasy", "2015");
        recentList.add(recent);

        recent = new recentData("Mission: Impossible Rogue Nation", "Action", "2015");
        recentList.add(recent);

        recent = new recentData("Up", "Animation", "2009");
        recentList.add(recent);

        recent = new recentData("Star Trek", "Science Fiction", "2009");
        recentList.add(recent);

        recent = new recentData("The LEGO Movie", "Animation", "2014");
        recentList.add(recent);

        recent = new recentData("Iron Man", "Action & Adventure", "2008");
        recentList.add(recent);

        recent = new recentData("Aliens", "Science Fiction", "1986");
        recentList.add(recent);

        recent = new recentData("Chicken Run", "Animation", "2000");
        recentList.add(recent);

        recent = new recentData("Back to the Future", "Science Fiction", "1985");
        recentList.add(recent);

        recent = new recentData("Raiders of the Lost Ark", "Action & Adventure", "1981");
        recentList.add(recent);

        recent = new recentData("Goldfinger", "Action & Adventure", "1965");
        recentList.add(recent);

        recent = new recentData("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        recentList.add(recent);

//        mAdapter.notifyDataSetChanged();
    }
}