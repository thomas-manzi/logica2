package com.company;

public class Main {

    public static void main(String[] args) {
            Conta conta1 = new Conta();
            conta1.setNumero(1);
            conta1.saldo=500.0;

            conta1.setLimite(1000); // prof no set do limite eu fiz *-1 pra ficar negativo ai o limite eh 1000 mas na vdd é -1000
            conta1.sacar(600);
            System.out.println(conta1.getSaldo());

            conta1.sacar(900);
            System.out.println(conta1.getSaldo());

            conta1.sacar(100);
            System.out.println(conta1.getSaldo());

            //System.out.println(conta1.getLimite());

    }
}
