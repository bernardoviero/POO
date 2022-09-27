public class Principal {
    
    static int i =0;
    public static void main(String[] args) {
        new Thread(t1).start();
        new Thread(t2).start();
    }
    private static void exibeValor(String nomeThread){
        i++;
        System.out.println("A contagem é: "+i+" update by "+nomeThread);
    }
    private static Runnable t1 = new Runnable(){
        @Override
        public void run(){
            try{
                for(int i = 0; i<5; i++){
                    exibeValor("t1");
                    Thread.sleep(15000);
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
    };
     private static Runnable t2 = new Runnable(){
        @Override
        public void run(){
            try{
                for(int i = 0; i<5; i++){
                    exibeValor("t2");
                    Thread.sleep(15000);
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
    };
}
