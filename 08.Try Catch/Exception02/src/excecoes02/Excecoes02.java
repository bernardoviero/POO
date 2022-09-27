package excecoes02;

public class Excecoes02 {

    private static void aumentarLetras() throws Exception {
        String frase = null;
        String novaFrase = null;
    
        try{
         novaFrase = frase.toUpperCase();
        }catch(NullPointerException e){
            throw new Exception(e);
        }
        System.out.println(frase);
        System.out.println(novaFrase);
    }

    public static void main(String[] args) {
        try{
            aumentarLetras();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
