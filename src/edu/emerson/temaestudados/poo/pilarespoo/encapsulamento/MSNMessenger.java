package edu.emerson.temaestudados.poo.pilarespoo.encapsulamento;

public class MSNMessenger {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvaHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }
    private void validarConectadoInternet(){
        System.out.println("Validando se esta conectado a internet");
    }
    private void salvaHistoricoMensagem(){
        System.out.println("Salvando o historico de mensagem");
    }
}
