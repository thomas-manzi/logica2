package com.company;



public class Main {

    public static void main(String[] args) {
       /* Gerente	gerente	=	new	Gerente();
        gerente.setSalario(5000.0);
        System.out.println(gerente.getBonificacao());*/

        ControleDeBonificacoes	controle	=	new	ControleDeBonificacoes();
        Gerente	funcionario1	=	new	Gerente();
        funcionario1.setSalario(5000.0);
        controle.registra(funcionario1);

        Funcionario	funcionario2	=	new	Funcionario();
        funcionario2.setSalario(1000.0);
        controle.registra(funcionario2);

        System.out.println(controle.getTotalDeBonificacoes());

    }

}

