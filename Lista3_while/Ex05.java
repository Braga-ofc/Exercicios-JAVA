package Lista3_while;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos numeros serao lidos? ");
        int quantidade = scanner.nextInt();
        if (quantidade <= 0) {
            System.out.println("A quantidade deve ser positiva.");
        } else {
            int contador = 1, maior = Integer.MIN_VALUE, vezesMaior = 0;
            while (contador <= quantidade) {
                System.out.print("Digite o " + contador + "o numero: ");
                int numero = scanner.nextInt();
                if (numero > maior) { maior = numero; vezesMaior = 1; }
                else if (numero == maior) vezesMaior++;
                contador++;
            }
            System.out.println("Maior numero: " + maior);
            System.out.println("Quantidade de vezes lido: " + vezesMaior);
        }
        scanner.close();
    }
}
