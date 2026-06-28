package edu.emerson.temaestudados.poo.pilarespoo.abstracao;

public class computadorMaria {
    public static void main(String[] args){
        System.out.println("MSN");
        MSNMessenger3 msn2 = new MSNMessenger3();
        msn2.enviarMensagem();
        msn2.receberMensagem();

        System.out.println();
        System.out.println("Facebook");
        FacebookMessenger3 fcb = new FacebookMessenger3();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println();
        System.out.println("Telegram4");
        Telegram3 tlg = new Telegram3();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
