package org.developerjs.marvel.ui.activitys;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.developerjs.marvel.R;
import org.developerjs.marvel.pojo.Personaje;

import butterknife.BindView;
import butterknife.ButterKnife;


public class DetailActivity extends AppCompatActivity {

    @BindView(R.id.iv_details_foto) ImageView foto;
    @BindView(R.id.tv_details_nombre) TextView nombre;
    @BindView(R.id.tv_details_estado) TextView estado;
    @BindView(R.id.tv_details_descripcion) TextView descripcion;

    public static final String FOTO = "Persona.foto";
    public static final String NOMBRE = "Persona.nombre";
    public static final String ESTADO = "Persona.estado";
    public static final String DESCRIPCION = "Persona.descripcion";

    private Personaje personaje=new Personaje();

    public static void createInstance(Context context, Personaje personaje) {
        Intent intent = getLaunchIntent(context,personaje);
        context.startActivity(intent);
    }

    public static Intent getLaunchIntent(Context context, Personaje personaje) {
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra(FOTO,personaje.getFoto());
        intent.putExtra(NOMBRE,personaje.getNombre());
        intent.putExtra(ESTADO,personaje.getEstado());
        intent.putExtra(DESCRIPCION,personaje.getDescripcion());
        return intent;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ButterKnife.bind(this);

        getPersonaje();

        nombre.setText(personaje.getNombre());
        estado.setText(personaje.getEstado());
        descripcion.setText(personaje.getDescripcion());
        Glide.with(this).load(personaje.getFoto()).centerCrop().into(foto);


    }

    public void getPersonaje(){
        Intent i = getIntent();
        personaje.setFoto(i.getStringExtra(FOTO));
        personaje.setNombre(i.getStringExtra(NOMBRE));
        personaje.setEstado(i.getStringExtra(ESTADO));
        personaje.setDescripcion(i.getStringExtra(DESCRIPCION));
    }
}
