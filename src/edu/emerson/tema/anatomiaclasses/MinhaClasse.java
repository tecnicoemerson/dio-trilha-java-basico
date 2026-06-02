package edu.emerson.tema.anatomiaclasses;

//aula 3
public class MinhaClasse {

    public static void main(String[] args) {
        String primeiroNome = "Emerson";
        String segundoNome = "Rodrigues";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
       return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
