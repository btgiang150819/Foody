package com.example.cycelview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import java.util.ArrayList;

import static androidx.recyclerview.widget.RecyclerView.HORIZONTAL;

public class TypeAdapter extends RecyclerView.Adapter<TypeAdapter.TypeHolder> {
    @NonNull
    private Context context;
    private int layout;
    private ArrayList<Type> typeArrayList;

    public TypeAdapter(@NonNull Context context, int layout, ArrayList<Type> typeArrayList) {
        this.context = context;
        this.layout = layout;
        this.typeArrayList = typeArrayList;
    }


    @NonNull
    @Override
    public TypeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(layout, parent, false);

        return new TypeHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TypeHolder holder, int position) {
        Type type = typeArrayList.get(position);
        StoreAdapter storeAdapter = new StoreAdapter(type.getStoreArrayList(), context, R.layout.store);
        if(type.getTitle().equals("")){
            holder.title.setTextSize(0);
            holder.title.setBottom(0);
        }
        else {
            holder.title.setText(type.getTitle());
        }
        holder.recyclerView.setAdapter(storeAdapter);
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, HORIZONTAL, false));
    }

    @Override
    public int getItemCount() {
        return typeArrayList.size();
    }

    public static class TypeHolder extends RecyclerView.ViewHolder {
        TextView title;
        RecyclerView recyclerView;
        public TypeHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title1);
            recyclerView = itemView.findViewById(R.id.list_type);
        }
    }
}
