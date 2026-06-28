package edu.emerson.temaestudados.poo.pilarespoo.polimorfismo;

import edu.emerson.temaestudados.poo.pilarespoo.polimorfismo.apps.FacebookMessenger4;
import edu.emerson.temaestudados.poo.pilarespoo.polimorfismo.apps.MSNMessenger4;
import edu.emerson.temaestudados.poo.pilarespoo.polimorfismo.apps.ServicoMensagemInstantanea4;
import edu.emerson.temaestudados.poo.pilarespoo.polimorfismo.apps.Telegram4;

public class computadorVictor {
    public static void main(String[] args){
        ServicoMensagemInstantanea4 smi = null;
        /*
        Não se sabe qual app
        Mas qualquer um devera enviar e receber mensagem
        */
        String appEscolhido="fbm";
        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger4();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessenger4();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram4();

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}

