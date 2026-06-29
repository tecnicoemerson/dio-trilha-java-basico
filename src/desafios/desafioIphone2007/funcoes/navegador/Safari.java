package desafios.desafioIphone2007.funcoes.navegador;

public class Safari implements Navegador{
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina");
    }
}
