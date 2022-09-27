package threadteste;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Piloto extends Thread {

    private String nomePiloto;

    public Piloto(String nomePiloto) {
        this.nomePiloto = nomePiloto;
    }

    @Override
    public void run() {
        System.out.println("LARGADA!");
        System.out.println("Primeira volta: " + nomePiloto);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Piloto.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(nomePiloto + " TERMINOU A CORRIDA");
    }
}