package com.company;

public class Item {
    private String produto;
    private int quantidade;
    private String descricao;
    private double valor;

    public Item (String produto, int quantidade, String descricao, double valor){
        this.produto = produto;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getValorTotal(){
        double total = 0;
        total = valor*quantidade;
        return total;
    }

    @Override
    public String toString() {
        return "\n"+"Item " +
                "produto = " + produto + " " +
                ", "+ quantidade + " Unidades" +
                ", descricao = " + descricao + " " +
                ", valor unitário = " + valor+ " " +
                "valor total = " + getValorTotal();
    }
}
