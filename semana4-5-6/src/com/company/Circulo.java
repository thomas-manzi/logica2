package com.company;

public class Circulo {
    private double raio;

    public double calculaPerimetro(){
        return 2 * 3.14 * raio;
    }

    public double calculaArea(){
        return 3.14*(raio*raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        validaRaio(raio);
        this.raio = raio;
    }

    private void validaRaio(double raio){
        if (raio <=0){
            throw new IllegalArgumentException("raio deve ser maior que 0");
        }
    }
}
