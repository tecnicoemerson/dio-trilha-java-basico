package edu.emerson.temaestudados.sintaxe.operadores;

public class Ternario {
    public static void main (String[] args){
    //O Operador de Condição Ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valores.
        // Você deve pensar numa condição ternária como se fosse uma condição IF normal, porém, de uma forma em que toda
        // a sua estrutura estará escrita numa única linha.
        //
        //O operador ternário é representado pelos símbolos ?: utilizados na seguinte estrutura de sintaxe:
        //
        //<Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição seja false>

        int a, b;

        a = 5;
        b = 6;

        String resultado = "";
        // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
           resultado = "verdadeiro";
        else
           resultado = "falso";

        System.out.println(resultado);


        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String valor = (a==b) ? "verdadeiro" : "false";

        System.out.println(valor);
    }
}
