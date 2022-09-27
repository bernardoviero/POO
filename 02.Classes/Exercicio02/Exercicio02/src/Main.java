/*
Aplicação para:
- Solicitar, armazenar, listar;
- Cliente: nome/idade/cpf
*Menu principal: cadastro e a listagem(consulta dos clientes) utilizando ARQUIVOS;
*/
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        Client client = new Client();
        Files files = new Files();
        int optionMenu = menu();
        RequestData requestdata = new RequestData();

        while(optionMenu != 3){
            switch(optionMenu){
                case 1:{
                    client = requestdata.request();
                    files.register(client, "c:\\temp\\clientes.txt");
                    break;
                }
                case 2:{
                    System.out.println("LISTA DE VEÍCULOS CADASTRADOS:");
                    System.out.println(files.consult("c:\\temp\\clientes.txt"));
                    break;
                }
                case 3:{
                    System.exit(0);
                    break;
                }
                default:{
                    JOptionPane.showMessageDialog(null, "Você digitou uma opção inválida");
                    break;
                }
            }
        }
    }

    public static int menu(){
        String menu = "===== MENU DE REGISTRO DE CLIENTES =======\n\n"+
        "[1] - CADASTRAR NOVO CLIENTE\n"+
        "[2] - CONSULTAR CLIENTES\n"+
        "[3] - SAIR";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }
}
