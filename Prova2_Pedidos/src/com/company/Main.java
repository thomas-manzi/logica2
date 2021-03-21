package com.company;

public class Main {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("123.123.123-10");
        Item i1 = new Item("BigMac",2,"Sem picles",20.0);
        Pedido pedido1 = new Pedido(123,c1,i1);

        pedido1.addItens("Coca-Cola",1," ",10.0);

        System.out.println(pedido1);

        Cliente c2 = new Cliente("032.032.032-10");
        Pedido pedido2= new Pedido(57,c2);

        pedido2.addItens("McNuggets",3, "com molho bbq",10.0);
        pedido2.addItens("MilkShake",2,"1 de Morango e 1 Ovomaltine",20.0);

        System.out.println("\n"+pedido2);
    }
}
