package com.company;

import java.util.ArrayList;
import java.util.List;

public class Ator {
    private String nome;
    public List<Papel> papeis;

    public Ator (String nome){
        this.nome = nome;
        this.papeis = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void addPapel(Papel papel){
        papeis.add(papel);
    }

    public List<Filme> getFilmes(){
        List<Filme> ff = new ArrayList<>();
        for (Papel p: papeis) {
            if(this.getNome().equals(p.getFilme())){
                ff.add(p.getFilme());
            }
        }
        return ff;
    }

    public boolean atuouNoAno(int ano){
        for (Papel p: papeis) {
            if(p.getFilme().getAno()==ano){

            }
        }
        return true;
    }


    @Override
    public String toString() {
        return "Ator " +
                "nome=' " + nome + '\'' +
                ", papeis= " + papeis +
                ' ';
    }
}
