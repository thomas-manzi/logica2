package com.company;

public class Cliente {
    private String cpf;

    public Cliente(String cpf){
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Cliente = " + cpf ;
    }
}
