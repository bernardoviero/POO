
import javax.swing.JOptionPane;

/*
Implementar uma calculadora, com as 4
operações básicas (+ - * /) entre dois números
utilizando métodos

*/
public class Ex03 {
   
    public static void main(String[] args) {
        float v1 = Float.parseFloat(solicitarDados("Digite o 1º valor"));
        char op = solicitarDados("Escolha uma operação + - * /").charAt(0);
        float v2 = Float.parseFloat(solicitarDados("Digite o 2º valor"));
        float resposta = calcular(v1, op, v2);
        exibirResultado(resposta);
    }
    
    public static String solicitarDados(String solicitacao) {
        return JOptionPane.showInputDialog(solicitacao);
    }
    
    public static float calcular(float v1, char op, float v2) {
        float resultado=0;
        switch(op) {
            case '+': {
                resultado = v1 + v2;
                break;
            }
            case '-': {
                resultado = v1 - v2;
                break;
            }
            case '*': {
                resultado = v1 * v2;
                break;
            }
            case '/': {
                resultado = v1 / v2;
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null, "Operação inválida");
                break;
            }     
        }
        return resultado;      
    }
    
    public static void exibirResultado(float resposta) {
        //System.out.println("RESPOSTA: " + resposta);
        JOptionPane.showMessageDialog(null, "RESPOSTA: " + resposta);
    }
}
