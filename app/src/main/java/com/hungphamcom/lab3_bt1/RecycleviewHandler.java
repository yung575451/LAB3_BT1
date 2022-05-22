package com.hungphamcom.lab3_bt1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleviewHandler extends RecyclerView.Adapter<RecycleviewHandler.ViewHolder> {

    private Context context;
    private List<user> userList;

    public RecycleviewHandler(Context context,List<user> userList){
        this.context=context;
        this.userList=userList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        user user=userList.get(position);

        holder.name.setText(user.getName());
        holder.region.setText(user.getHomeTown());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView name;
        public TextView region;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.username);
            region=itemView.findViewById(R.id.userRegion);
        }
    }
}
