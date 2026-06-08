package edu.emerson.tema.metodos;
public class Usuario {
    public static void main( String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();

        System.out.println("A TV esta ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> a TV esta ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> a TV esta ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Diminuir volume para o " + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Aumenta volume para o " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Aumentar Canal para " + smartTv.canal);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("diminuir Canal para " + smartTv.canal);

    }
}