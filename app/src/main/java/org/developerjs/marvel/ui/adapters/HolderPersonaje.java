package org.developerjs.marvel.ui.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.developerjs.marvel.R;
import org.developerjs.marvel.pojo.Personaje;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HolderPersonaje extends RecyclerView.ViewHolder implements View.OnClickListener {

    @BindView(R.id.iv_item_foto) ImageView foto;
    @BindView(R.id.tv_item_nombre) TextView nombre;
    @BindView(R.id.tv_item_estado) TextView estado;
    @BindView(R.id.tv_item_descripcion) TextView descripcion;

    public ItemClickListener listener;

    public HolderPersonaje(View v, ItemClickListener listener){
        super(v);
        ButterKnife.bind(this, v);

        this.listener = listener;
        v.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        listener.onItemClick(v, getAdapterPosition());
    }

    public void bindData(Context context, Personaje personaje){

        nombre.setText(personaje.getNombre());
        estado.setText(personaje.getEstado());
        descripcion.setText(personaje.getDescripcion());
        Glide.with(context).load(personaje.getFoto()).centerCrop().into(foto);
    }
}
