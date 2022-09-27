/*1.
Criar uma classe principal, e exiba na tela as informções: NOME /E-MAIL / TELEFONE do usuario.
Atributos herdados da calsse USUARIO;
*/
import java.util.Scanner;

public class Principal extends Usuario {
    public static void main(String[] args) {
        receberDados();
        exibirDados();
        
    }
    public static void receberDados(){
        Scanner leitura = new Scanner(System.in);
        
        System.out.println("Digite o nome do usuario: ");
        nomeUsuario = leitura.nextLine();
        System.out.println("Digite o email do usuario: ");
        emailUsuario = leitura.nextLine();
        System.out.println("Digite o telefone do usuario: ");
        telefoneUsuario = leitura.nextLine();
    }
    public static void exibirDados(){
        System.out.println("NOME: "+nomeUsuario);
        System.out.println("E-MAIL: "+emailUsuario);
        System.out.println("TELEFONE: "+telefoneUsuario);
    }
}
