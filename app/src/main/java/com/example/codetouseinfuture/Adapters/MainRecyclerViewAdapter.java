package com.example.codetouseinfuture.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.codetouseinfuture.Models.Item;
import com.example.codetouseinfuture.R;

import java.util.List;

public class MainRecyclerViewAdapter extends RecyclerView.Adapter<MainRecyclerViewAdapter.ViewHolder> {
    private List<Item> itemList;
    public MainRecyclerViewAdapter(List<Item> itemList){
        this.itemList = itemList;
    }
    @NonNull
    @Override
    public MainRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainRecyclerViewAdapter.ViewHolder holder, int position) {
        Item item = itemList.get(position);
        holder.textView.setText(item.getText());
        holder.linearLayout.setBackgroundColor(item.getBackgroundColor());
        holder.linearLayout.setBackgroundColor(item.getTextColor());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clickListener != null){
                    clickListener.onItemClick(item);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        LinearLayout linearLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.item_text_view);
            linearLayout = itemView.findViewById(R.id.linearLayout);
        }
    }
    public interface OnItemClickListener{
        void onItemClick(Item item);
    }
    private OnItemClickListener clickListener;
    public MainRecyclerViewAdapter(List<Item> itemList,OnItemClickListener clickListener){
        this.itemList = itemList;
        this.clickListener = clickListener;
    }
}
