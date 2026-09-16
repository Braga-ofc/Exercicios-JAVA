package Lista2;

import java.util.Scanner;

/*
 * Questao 07 - Ler tres numeros e imprimi-los em ordem crescente.
 */
public class atv7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== ORDENACAO DE TRES NUMEROS ===");
        System.out.print("Digite o primeiro numero: ");
        double a = entrada.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double b = entrada.nextDouble();

        System.out.print("Digite o terceiro numero: ");
        double c = entrada.nextDouble();

        double aux;

        // Ordena trocando os valores de posicao (metodo da bolha simplificado)
        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }
        if (b > c) {
            aux = b;
            b = c;
            c = aux;
        }
        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }

        System.out.printf("Ordem crescente: %.2f, %.2f, %.2f%n", a, b, c);

        entrada.close();
    }
}
