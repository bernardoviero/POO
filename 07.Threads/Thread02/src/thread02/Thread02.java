/*
Fazer uma thread como corrida de fórmula 1.
Os pilotos dão a largada ao mesmo tempo!
Exemplo:
"
public void run(){
    sout("!!!! LARGADA !!!!!);
    sout("@@ PRIMIERA VOLTA"+nome);
    fot(int i =0; i <1000; cont++){};
    sout(nome+"-> TERMINOU A CORRIDA !!!");
}
"
*/

package thread02;
public class Thread02 {
    static int i =0;
    public static void main(String[] args) {
        
        new Thread(CLAUDIO).start();
        new Thread(RUBENS).start();
        new Thread(FERNANDO).start();  
        
    }
    private static Runnable RUBENS = new Runnable(){
        String RUBENS = "Rubens";
        @Override
        public void run(){
            try{
                System.out.println("LARGADA!");
                System.out.println("Primeira volta: "+RUBENS);
                Thread.sleep(10000);
                System.out.println(RUBENS+" TERMINOU A CORRIDA");
            }catch(Exception e){
                System.out.println(e);
            }
        }
    };
    private static Runnable CLAUDIO = new Runnable(){
        String CLAUDIO = "Claudio";
        @Override
        public void run(){
            try{
                System.out.println("LARGADA!");
                System.out.println("Primeira volta: "+CLAUDIO);
                Thread.sleep(10000);
                System.out.println(CLAUDIO+" TERMINOU A CORRIDA");
            }catch(Exception e){
                System.out.println(e);
            }
        }
    };
    private static Runnable FERNANDO = new Runnable(){
        String FERNANDO = "Fernando";
        @Override
        public void run(){
            try{
                System.out.println("LARGADA!");
                System.out.println("Primeira volta: "+FERNANDO);
                Thread.sleep(10000);
                System.out.println(FERNANDO+" TERMINOU A CORRIDA");
            }catch(Exception e){
                System.out.println(e);
            }
        }
    };
    
}
