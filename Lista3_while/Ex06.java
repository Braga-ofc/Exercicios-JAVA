package Lista3_while;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int inicio = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int fim = scanner.nextInt();
        if (inicio > fim) { int auxiliar = inicio; inicio = fim; fim = auxiliar; }
        int numero = inicio, somaPares = 0;
        long produtoImpares = 1;
        boolean haImpar = false;
        while (numero <= fim) {
            if (numero % 2 == 0) somaPares += numero;
            else { produtoImpares *= numero; haImpar = true; }
            numero++;
        }
        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Produto dos impares: " + (haImpar ? produtoImpares : 0));
        scanner.close();
    }
}
