package com.company;

public class ProfessorDaFaculdade extends EmpregadoDaFaculdade	{
    private int	horasDeAula;
    public	double	getGastos() {
        return this.getSalario()	+	this.horasDeAula	*	10;
    }
    public	String	getInfo() {
        String	informacaoBasica	=	super.getInfo();
        String	informacao	=	informacaoBasica	+	"	horas	de	aula:	"
                +	this.horasDeAula;
        return	informacao;
    }
    //	métodos	de	get,	set	e	outros	que	forem	necessários
}

