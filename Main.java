package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leia = new Scanner(System.in);
        System.out.println("Escolha uma das Operações: Soma, Multiplicação, Divisão, Subtração");
        String op = leia.nextLine();

        System.out.println("Escolha um numero");
        double x = leia.nextDouble();
        System.out.println("Escolha um numero");
        double y = leia.nextDouble();


        if (op.equals("soma")  || op.equals("somar") || op.equals("som") ){

            System.out.println(soma(x,y));

        }else if(op.equals("multiplicação")  || op.equals("multiplicacao") || op.equals("multi") || op.equals("vezes")){

            System.out.println(multiplicacao(x,y));

        }else if(op.equals("div") || op.equals("divisao") || op.equals("Divisao") || op.equals("divisão") || op.equals("Divisão")){

            while (y==0){
                System.out.println("O divisor nao pode ser igual a 0 tente outro numero");
                double a = leia.nextDouble(); // erro ao tentar atribuir um novo valor ao y - double y = leia.nextDouble()
                y=a;

            }
            System.out.println(divisao(x,y));
        }else if (op.equals("Subtracao") || op.equals("sub")  || op.equals("subtracao") || op.equals("subtração") || op.equals("Subtração")){

            System.out.println(subtracao(x,y));
        }else {
            System.out.println("Operação invalida");
        }

    }

    public static double soma (double x, double y) {
        return x + y;
    }

    public static double multiplicacao(double x, double y) {
        return x * y;
    }

    public static double subtracao(double x, double y) {
        return x - y;
    }

    public static double divisao(double x, double y) {
        return x / y;
    }

}
