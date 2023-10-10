package com.example.conversion20.Models;
public class Kelvin extends  Grado
{
    public Kelvin parse(Celsius c){
        Kelvin K = new Kelvin();
        K.setValor(c.getValor()+273.15);
        K.setUnidad(c.getUnidad()+"K");

        return K;
    }

    public Kelvin parse(Farenheit f){
        Kelvin K = new Kelvin();
        K.setValor(f.getValor()-32*5/9+273.15);
        K.setUnidad(f.getUnidad()+"K");
        return K;
    }
}
