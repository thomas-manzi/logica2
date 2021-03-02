package com.company;

public class Ingresso {
    private double valor;
    private boolean meia;

    public Ingresso (double valor, boolean meia){
        this.valor = valor;
        this.meia = meia;
        if(meia==true){
            this.valor= valor/2;
        }
    }

    public double getValor() {
        return valor;
    }

    public boolean isMeia() {
        return meia;
    }


    @Override
    public String toString() {
        return "Ingresso{" +
                "valor=" + valor +
                ", meia=" + meia +
                '}';
    }
}
