/*
Aplicação para:
- Solicitar, armazenar, listar;
- Veiculo: mode/marca/número da placa;
*Menu principal: cadastro e a listagem(consulta dos veículos) utilizando ARQUIVOS;
*/
import javax.swing.JOptionPane;


public class Principal {

    public static void main(String[] args) {
        int op = 0;
        Menu menu = new Menu();
        Controle controle = new Controle();
        Veiculo veiculo = new Veiculo();
        Arquivo arquivo = new Arquivo();
        
        while (op != 3) {
            op = menu.getOption();
            switch (op) {
                case 1: {
                    veiculo = controle.solicitarDados();
                    arquivo.cadastrar(veiculo, "c:\\temp\\meus_veiculos.txt");
                    break;
                }
                case 2: {
                    System.out.println("LISTA DE VEÍCULOS CADASTRADOS:");
                    System.out.println(arquivo.consultar("c:\\temp\\meus_veiculos.txt"));
                    break;
                }
                case 3:{
                    System.exit(0);
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Você digitou uma opção inválida");
                    break;
                }
            }
        }
        
    }
    
}