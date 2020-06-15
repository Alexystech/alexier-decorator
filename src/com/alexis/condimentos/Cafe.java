package com.alexis.condimentos;

import com.alexis.dev.IBebida;

public class Cafe implements IBebida {
    public Cafe() {}

    @Override
    public String getNombreBebida() {
        return "Cafe";
    }

    @Override
    public int getPrecioBebida() {
        return 30;
    }
}
