import javax.swing.JOptionPane;

/*
class ArmazenarDados
String nome;
String usuario;

Armazenar arquivo de Txt
-> nome arq = nome usuario;

Class main(ler os arquivos)
se:
se os dois dados forem realizados, 1 sobrecarga;
Se so o nome do usuário: outra sobrecarga;

Menu:
ler o conteúdo
*/
public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Usuario usuario = new Usuario();
        
        usuario.setNome(JOptionPane.showInputDialog("Digite o nome"));
        usuario.setEmail(JOptionPane.showInputDialog("Digite o e-mail"));
        
        if (!usuario.getEmail().isEmpty()) {
            if(storage.create(usuario.getNome(),usuario.getEmail())){
                JOptionPane.showMessageDialog(null, "Usuario" + usuario.getNome() + " cadastrado com sucesso!");
                JOptionPane.showMessageDialog(null, "Email" + usuario.getEmail() + " cadastrado com sucesso!"); 
            }else{
                System.out.println("erro");
            }
        }else{
            if(storage.create(usuario.getNome())){
                JOptionPane.showMessageDialog(null, "Usuario" + usuario.getNome() + " cadastrado com sucesso!"); 
            }
        }
        Usuario usuario1 = new Usuario();
        usuario1 = storage.read(JOptionPane.showInputDialog("Digite o nome do arquivo a ser pesquisado"));
        System.out.println("Nome: "+usuario1.getNome()+"\n"+"Email: "+usuario1.getEmail());
    }
}