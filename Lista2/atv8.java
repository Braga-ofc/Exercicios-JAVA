package Lista2;

import java.util.Scanner;

/*
 * Questao 08 - Classificar um triangulo em equilatero, isosceles ou escaleno,
 * verificando antes a condicao de existencia.
 */
public class atv8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== CLASSIFICACAO DE TRIANGULOS ===");
        System.out.print("Digite a medida do lado A: ");
        double a = entrada.nextDouble();

        System.out.print("Digite a medida do lado B: ");
        double b = entrada.nextDouble();

        System.out.print("Digite a medida do lado C: ");
        double c = entrada.nextDouble();

        // Condicao de existencia: cada lado deve ser menor que a soma dos outros dois
        boolean existe = (a > 0 && b > 0 && c > 0)
                && (a < b + c) && (b < a + c) && (c < a + b);

        if (!existe) {
            System.out.println("Nao e um triangulo");
        } else if (a == b && b == c) {
            System.out.println("Triangulo EQUILATERO (os tres lados sao iguais).");
        } else if (a == b || b == c || a == c) {
            System.out.println("Triangulo ISOSCELES (dois lados iguais).");
        } else {
            System.out.println("Triangulo ESCALENO (todos os lados diferentes).");
        }

        entrada.close();
    }
}
