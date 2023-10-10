package com.example.conversion20.Models;

public class Farenheit extends Grado{
    public Farenheit parse(Kelvin k){
        Farenheit F = new Farenheit();
        F.setValor(k.getValor()-273.15 * 9/5 + 32);
        F.setUnidad(k.getUnidad()+"F");
        return F;
    }

    public Farenheit parse(Celsius c){
        Farenheit F = new Farenheit();
        F.setValor(c.getValor()* 9/5 + 32);
        F.setUnidad(c.getUnidad()+"F");
        return  F;
    }
}
