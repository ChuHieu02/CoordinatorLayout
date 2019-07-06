package com.example.chuhieu.coordinatorlayout.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chuhieu.coordinatorlayout.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.UserHolder> {
    List<Model> models ;

    public Adapter(List<Model> models) {
        this.models = models;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new UserHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder holder, int position) {
        Model model = models.get(position);
        holder.tvname.setText(model.getName());
        holder.tvphone.setText(model.getPhone()+"");



    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class UserHolder extends RecyclerView.ViewHolder {
        public  TextView tvname,tvphone;
        public ImageView img;
        public UserHolder(View itemView) {
            super(itemView);
            tvname= (TextView) itemView.findViewById(R.id.tvname);
            tvphone= (TextView) itemView.findViewById(R.id.tvphone);

        }
    }
}
