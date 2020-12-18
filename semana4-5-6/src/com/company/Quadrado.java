package com.company;

public class Quadrado {
    private double lado;

    public double calculaArea(){
        return lado*lado;
    }


    public double calculaPerimetro(){
        return 4*lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        validaLado(lado);
        this.lado = lado;
    }

    public boolean podeConter(Quadrado q) {
        if(lado >= q.lado){
            return true;
        }else {
            return false;
        }
    }
    private void validaLado(double lado){
        if (lado <=0){
            throw new IllegalArgumentException("lado deve ser maior que 0");
        }
    }
}
