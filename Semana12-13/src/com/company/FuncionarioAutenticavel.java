package com.company;

public class FuncionarioAutenticavel extends Funcionario	{
    public	boolean	autentica(int	senha) {
        //	faz	autenticacao	padrão
        return true;
    }
    //	outros	atributos	e	métodos

    @Override
    public double getBonificacao() {
        return 0;
    }
}