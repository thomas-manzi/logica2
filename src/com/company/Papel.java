package com.company;

public class Papel {
    private String nome;
    private Boolean protagonista;
    private Ator ator;
    private Filme filme;

    public Papel (String nome, Ator ator, Filme filme, Boolean protagonista){
        this.nome = nome;
        this.ator = ator;
        this.filme = filme;
        this.protagonista = protagonista;

        //ator.addPapel(this);
        //filme.addPapel(this);
    }


    public String getNome() {
        return nome;
    }

    public Boolean getProtagonista() {
        return protagonista;
    }

    public Ator getAtor() {
        return ator;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setProtagonista(Boolean protagonista) {
        this.protagonista = protagonista;
    }

    @Override
    public String toString() {
        return "Papel " +
                "nome = '" + nome + '\'' +
                ", protagonista= " + protagonista +
                ", ator= " + ator.getNome() +
                ", filme= " + filme.getTitulo() +
                ' ';
    }
}
