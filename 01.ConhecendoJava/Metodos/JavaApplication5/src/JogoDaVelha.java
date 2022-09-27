import java.util.Scanner;

import javax.swing.JOptionPane;

/*
Jogo da velha em JAVA;

Req:
- Computador sempre inicia a jogada;
- Computador joga em posições aleátorias;
- Verificar se a posição está livre para não sobrepor;
- Ambos podem vencer;
- Utilizar funções
- Apresentar resultado final
*/

public class JogoDaVelha {

    public static char tabuleiro[][] = new char[3][3];
    static boolean fimDeJogo = false;

    public static void main(String[] args) {
        inicioTabuleiro();
        while (!fimDeJogo) {
            jogadaMaquina();
            mostrarTabuleiro();
            verificarVencedor();
            jogadaUsuario();
            mostrarTabuleiro();
            verificarVencedor();
        }
    }

    public static void inicioTabuleiro() {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                tabuleiro[linha][coluna] = '?';
            }
        }
    }

    public static void mostrarTabuleiro() {
        String tabuleiroGrafico = "";
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                tabuleiroGrafico = tabuleiroGrafico + tabuleiro[linha][coluna] + "     ";
            }
            System.out.println(tabuleiroGrafico + "\n");
        }
    }

    public static void jogadaMaquina() {
        // jogada do computador 'sorteada'
        int linha = (int) (Math.random() * 3);
        int coluna = (int) (Math.random() * 3);
        if (tabuleiro[linha][coluna] == '?') {
            tabuleiro[linha][coluna] = 'X';
        } else {
            jogadaMaquina();
        }
    }

    public static void jogadaUsuario() {
        int linha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a linha: "));
        int coluna = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a coluna: "));
        if (tabuleiro[linha][coluna] == '?') {
            tabuleiro[linha][coluna] = 'O';
        } else {
            JOptionPane.showMessageDialog(null, "Jogada já realizada");
            jogadaUsuario();
        }
    }

    public static void verificarVencedor() {
        // PARA O COMPUTADOR VENCER:
        // linha:
        if (tabuleiro[0][0] == tabuleiro[0][1] && (tabuleiro[0][1] == tabuleiro[0][2]) && (tabuleiro[0][2] == 'X')) {
            System.out.println("Computador venceu !");
            fimDeJogo = true;
        } else if (tabuleiro[1][0] == tabuleiro[1][1] && (tabuleiro[1][1] == tabuleiro[1][2])
                && (tabuleiro[1][2] == 'X')) {
            System.out.println("Computador venceu !");
            fimDeJogo = true;
        } else if (tabuleiro[2][0] == tabuleiro[2][1] && (tabuleiro[2][1] == tabuleiro[2][2])
                && (tabuleiro[2][2] == 'X')) {
            System.out.println("Computador venceu !");
            fimDeJogo = true;
        }
        // colunas:
        else if (tabuleiro[0][0] == tabuleiro[1][0] && (tabuleiro[1][0] == tabuleiro[2][0])
                && (tabuleiro[2][0] == 'X')) {
            System.out.println("Computador venceu !");
            fimDeJogo = true;
        } else if (tabuleiro[0][1] == tabuleiro[1][1] && (tabuleiro[1][1] == tabuleiro[2][1])
                && (tabuleiro[2][1] == 'X')) {
            System.out.println("Computador venceu !");
            fimDeJogo = true;
        } else if (tabuleiro[0][2] == tabuleiro[1][2] && (tabuleiro[1][2] == tabuleiro[2][2])
                && (tabuleiro[2][2] == 'X')) {
            System.out.println("Computador venceu !");
            fimDeJogo = true;
        }
        // diagonais:
        else if (tabuleiro[0][0] == tabuleiro[1][1] && (tabuleiro[1][1] == tabuleiro[2][2])
                && (tabuleiro[2][2] == 'X')) {
            System.out.println("Computador venceu !");
            fimDeJogo = true;
        } else if (tabuleiro[0][2] == tabuleiro[1][1] && (tabuleiro[1][1] == tabuleiro[2][0])
                && (tabuleiro[2][0] == 'X')) {
            System.out.println("Computador venceu !");
            fimDeJogo = true;
        }

        // PARA O USUARIO VENCER:
        // linha:
        if (tabuleiro[0][0] == tabuleiro[0][1] && (tabuleiro[0][1] == tabuleiro[0][2]) && (tabuleiro[0][2] == 'O')) {
            System.out.println("Computador venceu !");
            fimDeJogo = true;
        } else if (tabuleiro[1][0] == tabuleiro[1][1] && (tabuleiro[1][1] == tabuleiro[1][2])
                && (tabuleiro[1][2] == 'O')) {
            System.out.println("Computador venceu !");
            fimDeJogo = true;
        } else if (tabuleiro[2][0] == tabuleiro[2][1] && (tabuleiro[2][1] == tabuleiro[2][2])
                && (tabuleiro[2][2] == 'O')) {
            System.out.println("Computador venceu !");
            fimDeJogo = true;
        }
        // colunas:
        else if (tabuleiro[0][0] == tabuleiro[1][0] && (tabuleiro[1][0] == tabuleiro[2][0])
                && (tabuleiro[2][0] == 'O')) {
            System.out.println("Computador venceu !");
            fimDeJogo = true;
        } else if (tabuleiro[0][1] == tabuleiro[1][1] && (tabuleiro[1][1] == tabuleiro[2][1])
                && (tabuleiro[2][1] == 'O')) {
            System.out.println("Computador venceu !");
            fimDeJogo = true;
        } else if (tabuleiro[0][2] == tabuleiro[1][2] && (tabuleiro[1][2] == tabuleiro[2][2])
                && (tabuleiro[2][2] == 'O')) {
            System.out.println("Computador venceu !");
            fimDeJogo = true;
        }
        // diagonais:
        else if (tabuleiro[0][0] == tabuleiro[1][1] && (tabuleiro[1][1] == tabuleiro[2][2])
                && (tabuleiro[2][2] == 'O')) {
            System.out.println("Computador venceu !");
            fimDeJogo = true;
        } else if (tabuleiro[0][2] == tabuleiro[1][1] && (tabuleiro[1][1] == tabuleiro[2][0])
                && (tabuleiro[2][0] == 'O')) {
            System.out.println("Computador venceu !");
            fimDeJogo = true;
        }
    }
}
