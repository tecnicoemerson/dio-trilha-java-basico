package edu.emerson.temaestudados.poo.pilarespoo.abstracao;

public class FacebookMessenger3 extends ServicoMensagemInstantanea3 {
    public void enviarMensagem(){ System.out.println("Enviando mensagem pelo Facebook"); }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook");
    }
}
