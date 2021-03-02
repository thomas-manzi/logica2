package com.company;

import java.util.ArrayList;
import java.util.List;

public class Sessao implements SessaoInterface{
    private List<Ingresso> ingressos;

    public Sessao (){
        this.ingressos = new ArrayList<>();
    }

    @Override
    public void adicionar(Ingresso ingresso) {
        ingressos.add(ingresso);
    }

    @Override
    public int qntIngressos() {
        return ingressos.size();
    }

    @Override
    public int qntMeiaEntradas() {
        int cont = 0;
        for (Ingresso i : ingressos) {
            if(i.isMeia()==true){
                cont++;
            }
        }
        return cont;
    }

    @Override
    public double totalFaturado() {
        double total=0;
        for (Ingresso i : ingressos ) {
            total = total + i.getValor();
        }
        return total;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    @Override
    public String toString() {
        return "Sessao{" +
                "ingressos=" + ingressos +
                '}';
    }
}
