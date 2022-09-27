import javax.swing.JOptionPane;

public class RequestData {

    public Client request(){
        Client client = new Client();
        client.setName(JOptionPane.showInputDialog("Digite nome do cliente"));
        client.setAge(JOptionPane.showInputDialog("Digite a idade do cliente"));
        client.setCpf(JOptionPane.showInputDialog("Digite o cpf do cliente"));
        return client;
    }

}
