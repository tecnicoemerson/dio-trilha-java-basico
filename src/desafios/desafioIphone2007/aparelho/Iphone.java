package desafios.desafioIphone2007.aparelho;

import desafios.desafioIphone2007.funcoes.musica.ReprodutorMusical;
import desafios.desafioIphone2007.funcoes.navegador.Safari;
import desafios.desafioIphone2007.funcoes.telefone.Ligacao;

public class Iphone {
    public static void main(String[] args) {

        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        Safari safari = new Safari();
        Ligacao ligacao = new Ligacao();

        System.out.println("Reprodutor de musica");
        reprodutorMusical.selecionarMusica();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        System.out.println();

        System.out.println("Navegador Safari");
        safari.exibirPagina();
        safari.adicionarNovaAba();
        safari.atualizarPagina();
        System.out.println();

        System.out.println("Telefone");
        ligacao.ligar();
        ligacao.atender();
        ligacao.iniciarCorreioVoz();
        ligacao.desligar();
    }
}