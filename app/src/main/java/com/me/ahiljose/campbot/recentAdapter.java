package com.me.ahiljose.campbot;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by AJ on 1/20/2017.
 */
//Adapter set to recent message view
public class recentAdapter extends RecyclerView.Adapter<recentAdapter.MyViewHolder> {

    private List<recentData> recentList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            year = (TextView) view.findViewById(R.id.year);
        }
    }

    public recentAdapter(List<recentData> recentList) {
        this.recentList = recentList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.main_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        recentData recent = recentList.get(position);
        holder.title.setText(recent.getTitle());
        holder.genre.setText(recent.getGenre());
        holder.year.setText(recent.getYear());
    }

    @Override
    public int getItemCount() {
        return recentList.size();
    }
}