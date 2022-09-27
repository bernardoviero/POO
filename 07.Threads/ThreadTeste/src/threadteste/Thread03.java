package threadteste;

import threadteste.Piloto;

public class Thread03 {
    public static void main(String[] args) {

        Piloto piloto1 = new Piloto("Joao");
        Piloto piloto2 = new Piloto("Vitor");
        Piloto piloto3 = new Piloto("Gabriel");
        piloto1.start();
        piloto2.start();
        piloto3.start();
    }
}
