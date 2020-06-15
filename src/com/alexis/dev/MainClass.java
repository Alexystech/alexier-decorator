package com.alexis.dev;

import com.alexis.condimentos.Azucar;
import com.alexis.condimentos.Cafe;
import com.alexis.condimentos.Chocolate;
import com.alexis.condimentos.Crema;

public class MainClass {
    public static void main(String[] args) {
        IBebida cafeCremaAzucarChocolate = new Chocolate(new Crema(new Azucar(new Cafe())));
        IBebida cafeConCremayChocolate = new Chocolate(new Crema(new Cafe()));
        IBebida cafeConcrema = new Crema(new Cafe());
        IBebida cafe = new Cafe();

        System.out.println(cafeCremaAzucarChocolate.getNombreBebida() + " cuesta " +cafeCremaAzucarChocolate.getPrecioBebida());
        System.out.println(cafeConCremayChocolate.getNombreBebida() + " cuesta " + cafeConCremayChocolate.getPrecioBebida());
        System.out.println(cafeConcrema.getNombreBebida() + " cuesta " + cafeConcrema.getPrecioBebida());
        System.out.println(cafe.getNombreBebida() + " cuesta " + cafe.getPrecioBebida());
    }
}
