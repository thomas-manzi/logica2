package com.company;

import java.util.ArrayList;

import java.util.List;

public class Filme {
    private String titulo;
    private int ano;
    public List<Papel> papeis;

    public  Filme (String titulo, int ano){
        this.titulo = titulo;
        this.ano = ano;
        this.papeis= new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public void addPapel(Ator ator, String nome, boolean protagonista){
        int cont=0;
        Papel papel = new Papel(nome,ator,this,protagonista);
        ator.addPapel(papel);
        this.papeis.add(papel);
        for (Papel p: papeis) {
            if (p.getProtagonista()==true){
                cont++;
            }
            if (cont>1){
                //throw new IllegalArgumentException(" O filme pode conter apenas 1 protagonista");
                p.setProtagonista(false);
            }
        }
    }
    public List<Ator> getAtores(){
        List<Ator> atores = new ArrayList<>();
        for (Papel p : papeis) {
            atores.add(p.getAtor());
        }
        return atores;
    }

    public Ator getProtagonista(){
        Ator ator1 = new Ator(null);
        for (Papel p : papeis) {
            if(p.getProtagonista()==true){
                ator1=p.getAtor();
            }
        }
        return ator1;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<Papel> getPapeis() {
        return papeis;
    }

    public void setPapeis(List<Papel> papeis) {
        this.papeis = papeis;
    }


    @Override
    public String toString() {
        return "Filme " +
                "titulo ='" + titulo + '\'' +
                ", ano= " + ano +
                ", papeis= " + papeis +
                ' ';
    }
}
