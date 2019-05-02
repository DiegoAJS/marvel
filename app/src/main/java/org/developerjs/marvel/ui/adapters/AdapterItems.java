package org.developerjs.marvel.ui.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.developerjs.marvel.R;
import org.developerjs.marvel.pojo.Item;
import org.developerjs.marvel.pojo.Personaje;
import org.developerjs.marvel.ui.activitys.DetailActivity;

import java.util.List;

public class AdapterItems extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements ItemClickListener {

    private Context context;
    private List<Item> items;

    public AdapterItems(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        RecyclerView.ViewHolder viewHolder=new HolderPersonaje(inflater.inflate(R.layout.item_personaje,viewGroup,false),this);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ((HolderPersonaje)viewHolder).bindData(context,(Personaje)items.get(i));

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onItemClick(View view, int position) {
        DetailActivity.createInstance(context,(Personaje)items.get(position));
    }
}
