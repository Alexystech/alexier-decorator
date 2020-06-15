package com.alexis.condimentos;

import com.alexis.dev.BebidaDecorator;
import com.alexis.dev.IBebida;

public class Azucar extends BebidaDecorator {
    public Azucar(IBebida bebida) {
        super(bebida);
    }

    @Override
    public String getNombreBebida() {
        return getBebida().getNombreBebida() + " con azucar";
    }

    @Override
    public int getPrecioBebida() {
        return getBebida().getPrecioBebida() + 1;
    }
}
