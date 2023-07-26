package com.example.codetouseinfuture.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.codetouseinfuture.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ModelRecyclerView extends RecyclerView.Adapter<ModelRecyclerView.ViewHolder> {
    Context context;
    ArrayList<RVModel> arrayList = new ArrayList<>();

    public ModelRecyclerView(Context context, ArrayList<RVModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ModelRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_card_view,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ModelRecyclerView.ViewHolder holder, int position) {
        holder.imageView.setImageResource(arrayList.get(position).getImage());
        holder.textView1.setText(arrayList.get(position).getName());
        holder.textView2.setText(arrayList.get(position).getHistory());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Country" + position,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context,SecondRecyclerView.class);
                intent.putExtra("flag",arrayList.get(position).getImage());
                intent.putExtra("name",arrayList.get(position).getName());
                intent.putExtra("history",arrayList.get(position).getHistory());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView1,textView2;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.recyclerview_card_view_ImageView_1);
            textView1 = itemView.findViewById(R.id.recyclerview_card_view_textView_1);
            textView2 = itemView.findViewById(R.id.recyclerview_card_view_textView_2);
            cardView = itemView.findViewById(R.id.recyclerview_card_view);
        }
    }
}
