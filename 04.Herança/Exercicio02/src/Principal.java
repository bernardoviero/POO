
import java.util.Scanner;


public class Principal extends Pessoa{
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        
        System.out.println("Digite um nome: ");
        pessoa.nome = leitura.nextLine();
        System.out.println("Digite uma idade: ");
        pessoa.idade = Integer.parseInt(leitura.nextLine());
        System.out.println("Digite um tipo: ");
        pessoa.tipo = leitura.nextLine();
        
        System.out.println("Nome: "+ pessoa.nome+"\n"+"Idade: "+ pessoa.idade+"\n"+"Falar: "+pessoa.falar()+"\n"+"Andar: "+pessoa.andar()+"Tipo: "+tipo+"\n");
    
    }
}
