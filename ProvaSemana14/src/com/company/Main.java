package com.company;

public class Main {
    public static void main(String[] args) {
	    Sessao s = new Sessao();

	    Ingresso a = new Ingresso(10,false);
        Ingresso b = new Ingresso(10,false);
        Ingresso c = new Ingresso(10,true);
        Ingresso d = new Ingresso(10,true);

        s.adicionar(a);
        s.adicionar(b);
        s.adicionar(c);
        s.adicionar(d);


        System.out.println(s.getIngressos());
        System.out.println(s.qntIngressos());
        System.out.println(s.qntMeiaEntradas());
        System.out.println(s.totalFaturado());
    }
}
