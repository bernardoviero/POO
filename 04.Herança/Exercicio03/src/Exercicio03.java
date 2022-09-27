
import java.util.Scanner;

/*
3. Uma empresa cadastra funcionarios na DB;
Funcionario é uma pessoa; (nome/idade/telefone)
funcionario sao dividos por (setor/cargo/funcao)
Classe executável, cadastre 3 funcionários; solicitando as informações
Exibir os funcionarios na tela;
Classe funcionario herdará as características da classe Pessoa
*/
public class Exercicio03 extends Funcionarios {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        
        Funcionarios funcionario1 = new Funcionarios();
        System.out.println("Digite um nome: ");
        funcionario1.nome = leitura.nextLine();
        System.out.println("Digite uma idade: ");
        funcionario1.idade = Integer.parseInt(leitura.nextLine());
        System.out.println("Digite um telefone: ");
        funcionario1.telefone = leitura.nextLine();
        System.out.println("Digite um setor: ");
        funcionario1.setor = leitura.nextLine();
        System.out.println("Digite um cargo: ");
        funcionario1.cargo = leitura.nextLine();
        System.out.println("Digite uma funcao: ");
        funcionario1.funcao = leitura.nextLine();
        
        Funcionarios funcionario2 = new Funcionarios();
        System.out.println("Digite um nome: ");
        funcionario2.nome = leitura.nextLine();
        System.out.println("Digite uma idade: ");
        funcionario2.idade = Integer.parseInt(leitura.nextLine());
        System.out.println("Digite um telefone: ");
        funcionario2.telefone = leitura.nextLine();
        System.out.println("Digite um setor: ");
        funcionario2.setor = leitura.nextLine();
        System.out.println("Digite um cargo: ");
        funcionario2.cargo = leitura.nextLine();
        System.out.println("Digite uma funcao: ");
        funcionario2.funcao = leitura.nextLine();
        
        Funcionarios funcionario3 = new Funcionarios();
        System.out.println("Digite um nome: ");
        funcionario3.nome = leitura.nextLine();
        System.out.println("Digite uma idade: ");
        funcionario3.idade = Integer.parseInt(leitura.nextLine());
        System.out.println("Digite um telefone: ");
        funcionario3.telefone = leitura.nextLine();
        System.out.println("Digite um setor: ");
        funcionario3.setor = leitura.nextLine();
        System.out.println("Digite um cargo: ");
        funcionario3.cargo = leitura.nextLine();
        System.out.println("Digite uma funcao: ");
        funcionario3.funcao = leitura.nextLine();
        
        System.out.println("DADOS FUNCIONARIO 1:\n");
        System.out.println(funcionario1.nome+"\n"+funcionario1.idade+"\n"+funcionario1.telefone+"\n"+funcionario1.setor+"\n"+funcionario1.cargo+"\n"+funcionario1.funcao+"\n");
        
        System.out.println("DADOS FUNCIONARIO 2:\n");
        System.out.println(funcionario2.nome+"\n"+funcionario2.idade+"\n"+funcionario2.telefone+"\n"+funcionario2.setor+"\n"+funcionario2.cargo+"\n"+funcionario2.funcao+"\n");
        
        System.out.println("DADOS FUNCIONARIO 3:\n");
        System.out.println(funcionario3.nome+"\n"+funcionario3.idade+"\n"+funcionario3.telefone+"\n"+funcionario3.setor+"\n"+funcionario3.cargo+"\n"+funcionario3.funcao+"\n");
        
    }
    
}
