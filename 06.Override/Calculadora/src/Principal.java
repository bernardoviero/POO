public class Principal {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Soma1 soma1 = new Soma1();
        
        soma.calcular(2,3);
        soma.exibeResultado();
        Multiplicacao multiplicacao = new Multiplicacao();
        multiplicacao.calcular(2,3);
        multiplicacao.exibeResultado();
        
        System.out.println("\nRetorno da soma, sobrecarga: ");
        soma1.calcular(2);
        soma1.exibeResultado();
        soma1.calcular(2,6);
        soma1.exibeResultado();
        
        System.out.println(soma1.calcular("85"));
    }
}
