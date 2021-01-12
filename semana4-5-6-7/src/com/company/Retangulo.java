package com.company;

public class Retangulo {
    private double base;
    private double altura;

    public Retangulo (double base, double altura){
        this.setBase(base);
        this.setAltura(altura);
    }

    public Retangulo (double valor){
        this.setAltura(valor);
        this.setBase(valor);
    }

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

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        validaValor(base);
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        validaValor(altura);
        this.altura = altura;
    }
    private void validaValor(double valor){
        if (valor <=0){
            throw new IllegalArgumentException("Altura e Base devem ser maior que 0");
        }
    }
}
