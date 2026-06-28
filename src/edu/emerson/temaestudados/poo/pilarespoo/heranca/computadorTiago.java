package edu.emerson.temaestudados.poo.pilarespoo.heranca;

public class computadorTiago {
    public static void main(String[] args){
        System.out.println("MSN");
        MSNMessenger2 msn2 = new MSNMessenger2();
        msn2.enviarMensagem();
        msn2.receberMensagem();

        System.out.println();
        System.out.println("Facebook");
        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println();
        System.out.println("Telegram4");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
