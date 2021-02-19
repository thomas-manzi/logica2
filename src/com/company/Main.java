package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Ator a = new Ator("Alberto");
        Ator b = new Ator("Vagner moura");
        Ator c = new Ator("Ator 1");

        Filme f= new Filme("Tropa de elite", 2011);

        f.addPapel(a,"papel 1", false);
        f.addPapel(b,"papel 2", true);
        f.addPapel(c,"papel 3", true);


        System.out.println(a.getFilmes());
        /*System.out.println(f.getProtagonista());
        System.out.println(f);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/


    }
}
