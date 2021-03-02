package com.company;

public class Gerente extends Funcionario implements Autenticavel	{
    private int	senha;

    @Override
    public double getBonificacao() {
        return 0;
    }

    //	outros	atributos	e	métodos
    public	boolean	autentica(int	senha) {
        if(this.senha	!=	senha)	{
            return false;
        }
        //	pode	fazer	outras	possíveis	verificações,	como	saber	se	esse
        //	departamento	do	gerente	tem	acesso	ao	Sistema
        return true;
    }

}

