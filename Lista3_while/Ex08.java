package Lista3_while;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0, quantidade = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        System.out.print("Idade (0 para encerrar): ");
        int idade = scanner.nextInt();
        while (idade != 0) {
            if (idade < 0) System.out.println("Informe uma idade nao negativa.");
            else {
                soma += idade;
                quantidade++;
                if (idade > maior) maior = idade;
                if (idade < menor) menor = idade;
            }
            System.out.print("Idade (0 para encerrar): ");
            idade = scanner.nextInt();
        }
        if (quantidade > 0) {
            System.out.printf("Media: %.2f%n", (double) soma / quantidade);
            System.out.println("Maior idade: " + maior);
            System.out.println("Menor idade: " + menor);
        } else System.out.println("Nenhuma idade valida foi informada.");
        scanner.close();
    }
}
