package com.infinite5.app.activity;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.infinite5.app.R;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {

   private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> aJudul = new ArrayList<>();
    private ArrayList<String> aGambar = new ArrayList<>();
    private ArrayList<String> aTag = new ArrayList<>();
    private Context context;

    public MenuAdapter(Context bContext,ArrayList<String> bJudul, ArrayList<String> bGambar, ArrayList<String> bTag){
        aJudul = bJudul;
        aGambar = bGambar;
        aTag = bTag;
        context = bContext;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_item, parent, false);
        ViewHolder holder = new ViewHolder(view) ;
        return holder;
    }


    @Override
    public void onBindViewHolder(final ViewHolder holder , final int position){
        Log.d(TAG, "onBindViewHolder: called");

        Glide.with(context)
                .asBitmap()
                .load(aGambar.get(position))
                .into(holder.image);
        holder.judul.setText(aJudul.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               Log.d(TAG, "onClick: clicked on");


               Intent i = new Intent(context, ListPanti.class);
               i.putExtra("gambar", aGambar.get(position));
               i.putExtra("judul", aJudul.get(position));
               i.putExtra("tag", aTag.get(position));
               context.startActivity(i);
           }
        });
    }
    @Override
    public int getItemCount(){
        return aGambar.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView judul;
        LinearLayout parentLayout;


        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.MenuGambar);
            judul = itemView.findViewById(R.id.MenuJudul);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}

