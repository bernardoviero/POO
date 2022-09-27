public class Subtracao extends Calculadora {
    double resultado;
    @Override
    public void calcular(double valor1, double valor2){
        resultado = valor1-valor2;
   }
    @Override
    public void exibeResultado(){
       System.out.println("Subtracao: "+resultado);
   }
}
