package exception03;

import java.util.Scanner;

public class Exception03 {

    public static void main(String[] args) throws SemLetraBException {
        boolean validacao = true;
        try {
            receberFrase(validacao);
        } catch (SemLetraBException e) {
            receberFrase(validacao);
        }
    }

    public static void receberFrase(boolean validacao) throws SemLetraBException {
        String recebendoFrase;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite uma frase com B! ");
        recebendoFrase = leitura.nextLine();
        if (!recebendoFrase.contains("b") && !recebendoFrase.contains("B")) {
            System.out.println("Sua frase não tem a letra B !");
            throw new SemLetraBException();
        }
    }
}
