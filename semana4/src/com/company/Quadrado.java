package com.company;

public class Quadrado {
    public double lado;

    public double calculaArea(){
        return lado*lado;
    }


    public double calculaPerimetro(){
        return 4*lado;
    }

    public boolean podeConter(Quadrado q) {
        if(lado >= q.lado){
            return true;
        }else {
            return false;
        }
    }
}
