
import javax.swing.JOptionPane;


public class Controle {
    
    public Veiculo solicitarDados(){
        Veiculo veiculo = new Veiculo();
        veiculo.setMarca(JOptionPane.showInputDialog("Digite a marca do veículo"));
        veiculo.setModelo(JOptionPane.showInputDialog("Digite o modelo do veículo"));
        veiculo.setPlaca(JOptionPane.showInputDialog("Digite a placa do veículo"));
        return veiculo;
    }
    
}