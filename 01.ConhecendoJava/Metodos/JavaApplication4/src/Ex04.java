
import javax.swing.JOptionPane;

/*
Criar uma classe, em Java, para solicitar 
o nome, a idade e o gênero (M ou F) 
de uma pessoa e apresentar, 
na tela do computador, esses dados 
solicitados. Adicionalmente, 
informe a idade mínima de 
aposentadoria para essa pessoa.
*/
public class Ex04 {
    public static void main(String[] args) {
        String nome = solicitarDados("Digite seu nome");
        char sexo = solicitarDados("Digite seu sexo: 'M' OU 'F'").charAt(0);
        int idade = Integer.parseInt(solicitarDados("Digite sua idade"));
        int idadeMinima = verificarAposentadoria(sexo);
        exibirNaTela(nome, idade, sexo, idadeMinima);
    }
    public static String solicitarDados(String solicitacao){
        return JOptionPane.showInputDialog(solicitacao);
    }
    public static int verificarAposentadoria(char sexo){
        int idade = 0;
        switch (sexo) {
            case 'M':
                idade = 65;
                break;
            case 'F':
                idade = 55;
                break;
            default:
                JOptionPane.showMessageDialog(null,"Erro!");
                break;
        }
        return idade;
    }
    public static void exibirNaTela(String nome,int idade, char sexo, int idadeMinima){
        String respota = "EXIBIÇÃO:\n"+
                "NOME:"+nome+"\n"+
                "IDADE:"+idade+"\n"+
                "SEXO:"+sexo+"\n"+
                "IDADE MINIMA PARA APOSENTAR:" + idadeMinima;
        JOptionPane.showMessageDialog(null,respota);
    }
}
