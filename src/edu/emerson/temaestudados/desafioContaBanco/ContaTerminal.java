package edu.emerson.temaestudados.desafioContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        //TODO: Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuario
        //Obter pela scanner os valores digitador no terminal
        //Exibir a mensagem conta criada
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Inserir o numero para conta: ");
        int numero = scanner.nextInt();

        System.out.println("Inserir o numero da agencia: ");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.println("insira seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o valor do seu saldo ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +" conta " + numero +" e seu saldo " + saldo + " já está disponível para saque");

    }
}
