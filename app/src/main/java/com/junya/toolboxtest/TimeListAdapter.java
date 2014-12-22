package com.junya.toolboxtest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class TimeListAdapter extends RecyclerView.Adapter<TimeListAdapter.ViewHolder>{

    private List<TimeTable> times;
    private int rowLayout;
    private Context mContext;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(rowLayout,viewGroup,false);
        ViewHolder holder=new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        TimeTable time = times.get(i);
        viewHolder.tv.setText(time.name);
    }

    public TimeListAdapter(List<TimeTable> times, int rowLayout,
                           Context context) {
        this.times = times;
        this.rowLayout = rowLayout;
        this.mContext = context;
    }

    @Override
    public int getItemCount() {
        return times==null?0:times.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tv;

        public ViewHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.text);
        }

    }
}
