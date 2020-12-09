package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here java Main 10.2 5.1 12.3 6.4 8.0 4.2
        double[] seq = new double[6];
/*        seq[0]= 10.2 ;
        seq[1]= 5.1;
        seq[2]= 12.3;
        seq[3] = 6.4;
        seq[4] = 8.0;
        seq[5] = 4.2;*/
        for (int i = 0; i < seq.length ; i++) {
            seq[i] = Double.parseDouble(args[i]);
        }
        System.out.println("Conjunto "+ retornaString(seq));
        System.out.println("Media "+ retornaMedia(seq));
        System.out.println("Maior valor "+ retornaMaior(seq));
        System.out.println("Menor valor "+retornaMenor(seq));
    }

    public static String retornaString(double[] x){
        return (Arrays.toString(x).replace("["," ").replace("]"," ").trim());
    }
    public static Double retornaMedia(double[] x){
        double media =0;
        for (int i = 0; i < x.length; i++) {
            media += x[i];
        }
        media = media/x.length;
        return media;
    }
    public static Double retornaMaior(double[] x){
        double maior = 0;
        for (int i = 0; i <x.length ; i++) {
            if(i==0){
                maior = x[i];
            }else if(x[i]>maior){
                maior= x[i];
            }
        }
        return maior;
    }
    public static Double retornaMenor(double[] x){
        double menor = 0;
        for (int i = 0; i <x.length ; i++) {
            if(i==0){
                menor=x[i];
            }else if(x[i]<menor){
                menor = x[i];
            }
        }
        return menor;
    }
}
