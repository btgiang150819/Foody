package com.example.cycelview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StoreAdapter extends RecyclerView.Adapter<StoreAdapter.MyViewHolder> {
    private ArrayList<Store> storeArrayList;
    private Context context;
    private int layout;

    public StoreAdapter(ArrayList<Store> storeArrayList, Context context, int layout) {
        this.storeArrayList = storeArrayList;
        this.context = context;
        this.layout = layout;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Store store = storeArrayList.get(position);
        if(store.getName().length() > 18){
            String temp = store.getAddress().substring(0,15).concat("...");
            holder.name.setText(temp);
        }
        else {
            holder.name.setText(store.getName());
        }

        //xử lý address thành maxlength 29
        if(store.getAddress().length() > 29){
            String temp = store.getAddress().substring(0,26).concat("...");
            holder.address.setText(temp);
        }
        else {
            holder.address.setText(store.getAddress());
        }
        holder.sale.setText(store.getSale());
        holder.avatar.setImageResource(store.getAvatar());
        holder.status.setImageResource(R.drawable.ic_baseline_brightness_1_24);
        holder.sale_tag.setImageResource(R.drawable.ic_black_shop_tag);
        String string = "Xem thêm " + store.getEndow() + " ưu đãi khác...";
        holder.endow.setText(string);
    }

    @Override
    public int getItemCount() {
        return storeArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name, address, sale, endow;
        ImageView avatar, status, sale_tag;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name_store);
            address = itemView.findViewById(R.id.address);
            sale = itemView.findViewById(R.id.sale);
            avatar = itemView.findViewById(R.id.avatar);
            status = itemView.findViewById(R.id.status);
            sale_tag = itemView.findViewById(R.id.sale_tag);
            endow = itemView.findViewById(R.id.endow);
        }
    };
}
