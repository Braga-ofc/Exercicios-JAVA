import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        boolean recebeuNumero = false;
        System.out.print("Digite um numero negativo para encerrar.\n");
        System.out.print("Numero: ");
        int numero;
        do {
            numero = scanner.nextInt();
            if (numero >= 0) {
                if (numero > maior) maior = numero;
                if (numero < menor) menor = numero;
                recebeuNumero = true;
                System.out.print("Numero: ");
            }
        } while (numero >= 0);
        if (recebeuNumero) {
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
        } else System.out.println("Nenhum numero valido foi informado.");
        scanner.close();
    }
}