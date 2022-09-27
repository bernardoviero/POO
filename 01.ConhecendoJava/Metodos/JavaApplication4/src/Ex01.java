import javax.swing.JOptionPane;

/*

Ler 3 números, calcular a média aritmética 
simples entre esses números e exibir na tela
do computador o resultado

COM O USO DE MÉTODOS/FUNÇÕES

*/
public class Ex01 {
    public static void main(String[] args) {
       float v1 = solicitarValor('a');
       float v2 = solicitarValor('b');
       float v3 = solicitarValor('c');
       // declaro em x/y/z os valores de v1/v2/v3
       calcular(v1,v2,v3);
    }
    // funcao para solicitar os dados, 'contador' so serve para substituir 'a/b/c';
    public static float solicitarValor(char contador){
        float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para: "+contador));
        return valor;
    }
    // aqui calculamos, recebemos 'a/b/c' como x/y/z. ((v1+v2+v3)/3)
    public static void calcular(float x, float y, float z){
        JOptionPane.showMessageDialog(null,"resultado da média: "+((x+y+z)/3));
    }
}
