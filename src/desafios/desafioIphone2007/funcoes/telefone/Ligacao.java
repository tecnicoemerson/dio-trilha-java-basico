package desafios.desafioIphone2007.funcoes.telefone;

public class Ligacao implements Telefone{
    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atender a ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz apos a chamada");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando");
    }
}
