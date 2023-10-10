package com.example.conversion20.Models;

public class Celsius extends Grado
{
    public Celsius parse(Farenheit F){
        Celsius C = new Celsius();
        C.setValor(F.getValor()-32/1.8);
        C.setUnidad(C.getUnidad()+"C");
        return C;
    }

    public Celsius parse(Kelvin k){
        Celsius C = new Celsius();
        C.setValor(k.getValor()-273.15);
        C.setUnidad(C.getUnidad()+"C");
        return C;
    }


}
