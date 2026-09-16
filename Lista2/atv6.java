package Lista2;

import java.util.Scanner;

/*
 * Questao 06 - Ler tres numeros e imprimir o maior de todos.
 */
public class atv6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== MAIOR DE TRES NUMEROS ===");
        System.out.print("Digite o primeiro numero: ");
        double a = entrada.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double b = entrada.nextDouble();

        System.out.print("Digite o terceiro numero: ");
        double c = entrada.nextDouble();

        double maior = a;

        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }

        System.out.printf("O maior valor digitado foi: %.2f%n", maior);

        entrada.close();
    }
}
