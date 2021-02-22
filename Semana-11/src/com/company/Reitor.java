package com.company;

public class Reitor extends EmpregadoDaFaculdade	{
    //	informações	extras
    public	String	getInfo() {
        return super.getInfo()	+	"	e	ele	é	um	reitor";
    }
    //	não	sobrescrevemos	o	getGastos!!!
}
