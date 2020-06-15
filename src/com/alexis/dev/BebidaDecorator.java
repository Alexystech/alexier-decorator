package com.alexis.dev;

public abstract class BebidaDecorator implements IBebida {
    private IBebida bebida;

    public BebidaDecorator (IBebida bebida) {
        this.bebida = bebida;
    }

    protected IBebida getBebida() {
        return bebida;
    }
}
