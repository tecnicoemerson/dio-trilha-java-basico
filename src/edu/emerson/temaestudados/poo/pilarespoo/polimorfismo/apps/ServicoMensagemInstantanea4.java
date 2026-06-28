package edu.emerson.temaestudados.poo.pilarespoo.polimorfismo.apps;

public abstract class ServicoMensagemInstantanea4 {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    public abstract void salvarHistoricoMensagem();

    //somente os filhos conhecem este metodo
    protected void validarConectadoInternet(){ System.out.println("Validando se esta conectado a internet"); }
}
