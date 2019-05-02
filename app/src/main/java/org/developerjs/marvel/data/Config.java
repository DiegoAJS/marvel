package org.developerjs.marvel.data;

import org.developerjs.marvel.pojo.Item;
import org.developerjs.marvel.pojo.Personaje;

import java.util.ArrayList;
import java.util.List;

public class Config {
    public static List<Item> getPersonajes(){
        List<Item> personajes=new ArrayList<Item>();
        personajes.add(new Personaje("Iro man","https://st-listas.20minutos.es/images/2012-07/336025/3604282_640px.jpg?1526198580","Heroe","Personaje que usa un traje robotico"));
        personajes.add(new Personaje("Thor","https://st-listas.20minutos.es/images/2012-07/336025/3604295_640px.jpg?1526198580","Heroe","Dios nortico"));
        personajes.add(new Personaje("Capitan America","https://st-listas.20minutos.es/images/2012-07/336025/3604271_640px.jpg?1526198580","Heroe","El primer vengador"));
        personajes.add(new Personaje("Spiderman","https://st-listas.20minutos.es/images/2012-07/336025/3604296_640px.jpg?1526198580","Heroe","El hombre araña su vesino amigable"));
        personajes.add(new Personaje("Loki","https://st-listas.20minutos.es/images/2012-07/336025/3604494_640px.jpg?1526198580","Villano","El hombre araña su vesino amigable"));


        return personajes;
    }
}
