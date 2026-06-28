package edu.emerson.temaestudados.poo.pilarespoo.polimorfismo.apps;

public class FacebookMessenger4 extends ServicoMensagemInstantanea4 {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pela MSN");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook");
    }
    public void salvarHistoricoMensagem() { System.out.println("Salvando o historico de mensagem"); }
}
