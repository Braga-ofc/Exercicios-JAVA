package Lista2;

import java.util.Scanner;

/*
 * Questao 15 - Ler tres valores inteiros (A, B e C), soma-los e apresentar
 * o resultado somente se for maior ou igual a 100.
 */
public class atv15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== SOMA DE TRES VALORES ===");
        System.out.print("Digite o valor de A: ");
        int a = entrada.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = entrada.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = entrada.nextInt();

        int soma = a + b + c;

        if (soma >= 100) {
            System.out.println("Resultado da soma: " + soma);
        } else {
            System.out.println("A soma e menor que 100, portanto nao sera apresentada.");
        }

        entrada.close();
    }
}
