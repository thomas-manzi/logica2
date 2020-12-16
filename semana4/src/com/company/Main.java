package com.company;

public class Main {

    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        q1.lado = 10.0;
        Quadrado q2 = new Quadrado();
        q2.lado = 15.5;

        Retangulo r1 = new Retangulo();
        r1.altura=10;
        r1.base=15;
        Retangulo r2 = new Retangulo();
        r2.altura=7;
        r2.base=17;

        Circulo c1 = new Circulo();
        c1.raio=3;
        Circulo c2 = new Circulo();
        c2.raio=2;

        System.out.println(c1.calculaPerimetro());

        System.out.println(c2.calculaArea());


        System.out.println(r1.podeConter(r2));

        System.out.println(q1.podeConter(q2)); // false

        System.out.println(q2.podeConter(q1)); // true
    }
}
