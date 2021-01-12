package com.company;

public class Main {

    public static void main(String[] args) {

            Quadrado q1= new Quadrado(20.2);
            System.out.println("lado quadrado "+q1.getLado()+"\n");

            Circulo c1= new Circulo(10.4);
            System.out.println("raio circulo "+c1.getRaio()+"\n");

            Retangulo r1 = new Retangulo(10.2, 3.5);
            System.out.println("base retangulo "+r1.getBase());
            System.out.println("altura retangulo "+r1.getAltura()+"\n");


            Retangulo r2 = new Retangulo(20.9);
            System.out.println("base retangulo "+r2.getBase());
            System.out.println("altura retangulo "+r2.getAltura()+"\n");

            Conta conta1 = new Conta(1);
            System.out.println("numero da conta "+conta1.getNumero());
            System.out.println("saldo da conta "+conta1.getSaldo());
            System.out.println("limite da conta "+conta1.getLimite()+"\n");

            Conta conta2 = new Conta(2,200.0);
            System.out.println("numero da conta "+conta2.getNumero());
            System.out.println("saldo da conta "+conta2.getSaldo());
            System.out.println("limite da conta "+conta2.getLimite()+"\n");

            Conta conta3 = new Conta(3,500,1000);
            System.out.println("numero da conta "+conta3.getNumero());
            System.out.println("saldo da conta "+conta3.getSaldo());
            System.out.println("limite da conta "+conta3.getLimite()+"\n");

    }
}
