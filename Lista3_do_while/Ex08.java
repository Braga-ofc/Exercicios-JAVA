import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0, quantidade = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        System.out.print("Idade (0 para encerrar): ");
        int idade;
        do {
            idade = scanner.nextInt();
            if (idade < 0) System.out.println("Informe uma idade nao negativa.");
            else if (idade != 0) {
                soma += idade;
                quantidade++;
                if (idade > maior) maior = idade;
                if (idade < menor) menor = idade;
            }
            if (idade != 0) System.out.print("Idade (0 para encerrar): ");
        } while (idade != 0);
        if (quantidade > 0) {
            System.out.printf("Media: %.2f%n", (double) soma / quantidade);
            System.out.println("Maior idade: " + maior);
            System.out.println("Menor idade: " + menor);
        } else System.out.println("Nenhuma idade valida foi informada.");
        scanner.close();
    }
}