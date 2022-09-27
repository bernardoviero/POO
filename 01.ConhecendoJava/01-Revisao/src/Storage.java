import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Storage {
    
    public boolean create(String nome, String email) {
        try {
            FileWriter fileWriter = new FileWriter(nome + ".txt");
            fileWriter.write(nome + ";" + email);
            fileWriter.close();
            return true;
        } catch (IOException e) {
            System.out.println(e);
            return false;
        }
    }
    public boolean create(String nome) {
        try {
            FileWriter fileWriter = new FileWriter(nome+ ".txt");
            fileWriter.write(nome);
            fileWriter.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    public Usuario read(String nome) {
        Usuario receberDados = new Usuario();
        String content="";
        try {
            File file = new File(nome + ".txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                content += scanner.nextLine();
            }
            scanner.close();
            String line[] = new String[2];
            line = content.split(";");
            receberDados.setNome(line[0]);
            receberDados.setEmail(line[1]);
        } catch (IOException e) {
            System.out.println("Error");
            System.out.println(e);
        }
        return receberDados;
    }
}