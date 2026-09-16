package Lista2;

import java.util.Scanner;

/*
 * Questao 10 - Ler os coeficientes de uma equacao do 2o grau, calcular o delta
 * e imprimir as raizes.
 */
public class atv10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== EQUACAO DO 2o GRAU (ax^2 + bx + c = 0) ===");
        System.out.print("Digite o coeficiente A: ");
        double a = entrada.nextDouble();

        System.out.print("Digite o coeficiente B: ");
        double b = entrada.nextDouble();

        System.out.print("Digite o coeficiente C: ");
        double c = entrada.nextDouble();

        if (a == 0) {
            System.out.println("O coeficiente A nao pode ser zero (nao e equacao do 2o grau).");
        } else {
            double delta = (b * b) - (4 * a * c);
            System.out.printf("Delta = %.2f%n", delta);

            if (delta < 0) {
                System.out.println("Delta negativo: a equacao nao possui raizes reais.");
            } else if (delta == 0) {
                double raiz = -b / (2 * a);
                System.out.println("Delta igual a zero: a equacao possui uma unica raiz real.");
                System.out.printf("X1 = X2 = %.2f%n", raiz);
            } else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Delta positivo: a equacao possui duas raizes reais distintas.");
                System.out.printf("X1 = %.2f%n", raiz1);
                System.out.printf("X2 = %.2f%n", raiz2);
            }
        }

        entrada.close();
    }
}
