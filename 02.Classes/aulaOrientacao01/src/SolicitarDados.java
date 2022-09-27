import javax.swing.JOptionPane;

public class SolicitarDados {
    public static int lerInt(String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
    public static String lerStr(String msg){
        return JOptionPane.showInputDialog(msg);
    }
}
