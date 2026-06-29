package desafios.desafioIphone2007.funcoes.musica;

public class ReprodutorMusical implements Musica{
    @Override
    public void tocar() {
        System.out.println("Tocando uma musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecinando uma musica");
    }
}
