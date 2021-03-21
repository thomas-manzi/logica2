package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private Cliente cliente;
    private List<Item> itens;

    public Pedido(int id,Cliente cliente){
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }
    public Pedido(int id,Cliente cliente, Item item){
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.itens.add(item);
    }

    public void addItens(String produto, int quantidade, String descricao, double valor){
        Item i = new Item(produto,quantidade,descricao,valor);
        itens.add(i);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    public int getId() {
        return id;
    }

    public double totalPedido(){
        double total=0;
        for (Item i:itens) {
            total += i.getValorTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido " + id +
                "\n"+ cliente +
                "\n"+"itens=" + itens +
                "\n"+"Valor total do pedido R$"+totalPedido();
    }
}
