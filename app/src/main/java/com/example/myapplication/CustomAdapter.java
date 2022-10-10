package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    List<Student> list;

    public CustomAdapter(List<Student> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomViewHolder(LayoutInflater.from(
                parent.getContext()).inflate(R.layout.item_student, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.name1.setText(list.get(position).getName1());
        holder.name2.setText(list.get(position).getName2());
        holder.name3.setText(list.get(position).getName3());
        holder.name4.setText(list.get(position).getName4());
        holder.name5.setText(list.get(position).getName5());
        holder.name6.setText(list.get(position).getName6());
        holder.name7.setText(list.get(position).getName7());
        holder.name8.setText(list.get(position).getName8());
        holder.name9.setText(list.get(position).getName9());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView name1;
        TextView name2;
        TextView name3;
        TextView name4;
        TextView name5;
        TextView name6;
        TextView name7;
        TextView name8;
        TextView name9;


        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            name1 = itemView.findViewById(R.id.name1);
            name2 = itemView.findViewById(R.id.name2);
            name3 = itemView.findViewById(R.id.name3);
            name4 = itemView.findViewById(R.id.name4);
            name5 = itemView.findViewById(R.id.name5);
            name6 = itemView.findViewById(R.id.name6);
            name7 = itemView.findViewById(R.id.name7);
            name8 = itemView.findViewById(R.id.name8);
            name9 = itemView.findViewById(R.id.name9);
        }
    }

}
