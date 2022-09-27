import java.util.Scanner;

/*
Crie uma classe Calculadora, com 4 operaoções matematicas; com 2 n°.
Faça a sobrescrita de métodos de acordo com o tipo de operacao;
A classe principal irá solicitar os dados para o usuário.
*/
public class Main {
    public static void main(String[] args) {
        double valor1 = solicitarDados();
        double valor2 = solicitarDados();
        
        Soma soma = new Soma();
        soma.calcular(valor1,valor2);
        soma.exibeResultado();
        
        Subtracao subtracao = new Subtracao();
        subtracao.calcular(valor1,valor2);
        subtracao.exibeResultado();
        
        Divisao divisao = new Divisao();
        divisao.calcular(valor1,valor2);
        divisao.exibeResultado();
        
        Multiplicacao multiplicacao = new Multiplicacao();
        multiplicacao.calcular(valor1,valor2);
        multiplicacao.exibeResultado();
    }
    public static double solicitarDados(){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o Valor: ");
        int valor = Integer.parseInt(leitura.nextLine());
        
        return valor;
    }
}
