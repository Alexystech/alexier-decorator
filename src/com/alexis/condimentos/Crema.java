package com.alexis.condimentos;

import com.alexis.dev.IBebida;
import com.alexis.dev.BebidaDecorator;

public class Crema extends BebidaDecorator {
    public Crema (IBebida bebida) {
        super(bebida);
    }

    @Override
    public String getNombreBebida() {
        return getBebida().getNombreBebida() + " con crema";
    }

    @Override
    public int getPrecioBebida() {
        return getBebida().getPrecioBebida() + 4;
    }
}
