package com.company;

public class Circulo {
    public double raio;

    public double calculaPerimetro(){
        return 2 * 3.14 * raio;
    }

    public double calculaArea(){
        return 3.14*(raio*raio);
    }
}
