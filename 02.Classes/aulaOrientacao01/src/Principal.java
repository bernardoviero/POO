/*
Exercicio 01:
classe: computador;
(memoriaRam/processador/memoriaHD/)
*/

public class Principal {
    public static void main(String[] args){
        Computador computador = new Computador();
        
        SolicitarDados solicitarDados = new SolicitarDados();

        Computador.processador = solicitarDados.lerStr("Qual processador possui seu computador ?");
        Computador.qntMemoriaRam = solicitarDados.lerInt("Quantos giga de RAM possui seu computador ?");
        Computador.qntMemoriaHD = solicitarDados.lerInt("Quantos giga de memória possui seu computador ?");

        Exibicao exibicao = new Exibicao();

        exibicao.mostrarDados(computador);


    }
}
