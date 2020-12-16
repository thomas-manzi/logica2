package com.company;

public class Retangulo {
    public double base;
    public double altura;

    public double calculaArea(){
        return base * altura;
    }

    public double calculaPerimetro(){
        return 2*(base+altura);
    }

    public boolean podeConter(Retangulo r) {
        if (base >= r.base && altura >=r.altura){
            return true;
        }else {
            return false;
        }
    }
}
