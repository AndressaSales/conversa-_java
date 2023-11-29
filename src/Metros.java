import java.util.Scanner;

public class Metros {
    public static void main(String[] args) throws Exception {
        Scanner tela4 = new Scanner(System.in);

        System.out.println("CONVERÇÃO DE METROS PARA CENTÍMETROS");

        System.out.println("Digite o valor: (M):");
        double valor = tela4.nextDouble();
        double calculo = valor * 100;
        System.out.println("A conversão para (CM): " + calculo);
    }
}
