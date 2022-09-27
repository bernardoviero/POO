/*
Estudos de metodos;

Qual nome do metodo:
Possui retorno ?(se sim, qual o TIPO de retorno), se não é void;
Possui parametros?(se sim, qual tipo e quantos ?), se não ();
*/
public class Ex05 {
    public static void main(String[] args) throws Exception {
        System.out.println(exibirMsg());
        exibirResultadoSoma(2, 7);
        float precoGasolinaHoje = getGasValue();
        System.out.println("R$: " + precoGasolinaHoje);
        float largura = 2;
        float comprimento = 4;
        float profundidade = (float) 1.32;
        calcularVolumePiscina(largura, comprimento, profundidade);

    }

    public static String exibirMsg() {
        return "ola mundo";
    }

    public static void exibirResultadoSoma(int v1, int v2) {
        System.out.println("Bom dia! Bem-vindo aos métodos em java. Resposta da soma: " + (v1 + v2));
    }

    public static float getGasValue() {
        return (float) 6.59;
    }

    public static void calcularVolumePiscina(float largura, float comprimento, float profundidade) {
        System.out.println("o volume da piscina com medidas " + largura + "x" + comprimento + "x" + profundidade
                + "m é: " + (largura * comprimento * profundidade) + "m3");
    }
}
