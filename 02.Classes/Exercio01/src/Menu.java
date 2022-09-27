
import javax.swing.JOptionPane;


public class Menu {

    public int getOption(){
        String menuOpcoes = "::: VEÍCULOS - > MENU DE OPÇÕES :::\n" +
                "[1] - Cadastrar \n" +
                "[2] - Listar todos\n"+
                "[3] - Sair";
        return Integer.parseInt(JOptionPane.showInputDialog(menuOpcoes));
    }
    
    
}