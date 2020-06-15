package com.alexis.condimentos;

import com.alexis.dev.BebidaDecorator;
import com.alexis.dev.IBebida;

public class Chocolate extends BebidaDecorator {
    public Chocolate(IBebida bebida) {
        super(bebida);
    }

    @Override
    public String getNombreBebida() {
        return getBebida().getNombreBebida() + " con chocolate";
    }

    @Override
    public int getPrecioBebida() {
        return getBebida().getPrecioBebida() + 10;
    }
}
