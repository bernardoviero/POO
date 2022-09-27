
/*
Criar classe para solicitar:
5 numeros inteiros;
ordenar de forma crescente;
exibir na tela como foram enviandos e
como ficaram pós ordenação;

-> utilizando-se de te metodos;
*/
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ordena {
    public static void main(String[] args) {
        int numeros[] = solicitarNumeros();
        // int numerosOrdenados[] = ordenarVetor(numeros);
        // exibirValores(numeros, numerosOrdenados);

        System.out.println("Números não ordenados:");
        for (int numero : numeros)
            System.out.println(numero);
        System.out.println();

        Arrays.sort(numeros);

        System.out.println("Números ordenados:");
        for (int numero : numeros)
            System.out.println(numero);
        System.out.println();
    }

    public static int[] solicitarNumeros() {
        int vetor[] = new int[5];
        int i;
        for (i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da posição: " + i));

        }
        return vetor;
    }

    public static void exibirValores(int[] original, int[] ordenada) {
        String msgOriginal = "";
        String msgOrdenada = "";
        for (int i = 0; i < 5; i++) {
            msgOriginal = msgOriginal + original[i] + "";
            msgOrdenada = msgOrdenada + ordenada[i] + "";
        }
        JOptionPane.showMessageDialog(null, "Vetor original: " + msgOriginal + "\n" + "Vetor ordenado: " + msgOrdenada);
    }

}
