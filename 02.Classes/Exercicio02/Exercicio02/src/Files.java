import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Files {

    public void register(Client client, String fileName) {
        try {
            File file = new File(fileName);
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write(client.getName() + ";" + client.getAge() + ";" + client.getCpf() + "\n");
            fileWriter.close();
            JOptionPane.showMessageDialog(null, "O Cliente "+ client.getName() + " foi cadastrado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro");
        }
    }

    public String consult(String fileName) {
        String conteudo="";
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                conteudo += scanner.nextLine();
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Erro");
        }
        return conteudo;
    }
    
}