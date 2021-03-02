package com.company;

public class Diretor extends Funcionario	{
    public	boolean	autentica(int	senha) {
        //	verifica	aqui	se	a	senha	confere	com	a	recebida	como	parametro
        return true;
    }

    @Override
    public double getBonificacao() {
        return 0;
    }
}
