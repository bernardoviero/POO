
/*
CONSTRUTOR: é um método utilizado para inicializar
    e configurar um objeto;
    - Possui o mesmo o nome da classe;
    - É o primeiro método a ser executado quando
        uma classe é instanciada, ou seja: quando
        um objeto é criado (new)
    - Uma classe pode conter mais de um método
        construtor, sendo eles diferenciados apenas
        pela quantidade, tipo e ordem dos parâmetros
        definidos no método construtor;
    - O prórpio Java, em tempo de execução (quando o
        objeto for criado) escolhe qual o método
        construtor entrar/chamar/executar de acordo
        com as características dele: se tem parâmetro,
        quantos tem, qual a ordem, qual o tipo.
*/

public class Principal {

    
    public static void main(String[] args) {
        
        // UTILIZANDO OS CONSTRUTORES DE DIFERENTES FORMAS E NECESSIDADES
        Aluno aluno = new Aluno("Alan");
        aluno.setIdade(20);
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        aluno.setNome("Pedro");
        System.out.println("Novo nome: " + aluno.getNome());
        
        Aluno aluno2 = new Aluno("Paulo", 25);
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Idade: " + aluno2.getIdade());
        
        Aluno aluno3 = new Aluno();
        aluno3.setNome("João");
        aluno3.setIdade(23);
        
        System.out.println("Nome: " + aluno3.getNome());
        System.out.println("Idade: " + aluno3.getIdade());
        
        
        
        //REAPROVEITANDO O OBJETO
        aluno = new Aluno();
        aluno.setNome("Maria");
        aluno.setIdade(35);
        
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        
    
    }
    
}
