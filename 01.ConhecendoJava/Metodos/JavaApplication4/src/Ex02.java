
import javax.swing.JOptionPane;

public class Ex02 {
    public static void main(String[] args) {
       // exibirMensagem();
        exibirMsgDinamica("noite!");
        // exibirMensagem("");
        exibirMsgDinamica(calcularNumDiasVividos(10)+"");
        exibirMsgDinamica(String.valueOf(calcularNumDiasVividos(10)));
    }
    // metodo sem retorno e com parametro
    public static void exibirMsgDinamica(String msg) {
        JOptionPane.showMessageDialog(null, "Essa é uma msg dinâmica: " + msg);
    }
    // metodo com retorno e com parametro
    public static int calcularNumDiasVividos(int idadeEmAnos){
        return idadeEmAnos * 365;
    }
}
    
