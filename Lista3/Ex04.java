import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pares = 0, impares = 0, primos = 0, quantidade = 1;
        do {
            System.out.print("Digite o " + quantidade + "o numero: ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) pares++; else impares++;
            if (ehPrimo(numero)) primos++;
            quantidade++;
        } while (quantidade <= 10);
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        System.out.println("Primos: " + primos);
        scanner.close();
    }

    private static boolean ehPrimo(int numero) {
        if (numero < 2) return false;
        int divisor = 2;
        if (divisor > numero / divisor) return true;
        do {
            if (numero % divisor == 0) return false;
            divisor++;
        } while (divisor <= numero / divisor);
        return true;
    }
}
