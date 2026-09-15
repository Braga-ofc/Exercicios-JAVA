import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maiorMedia = Double.NEGATIVE_INFINITY;
        int aluno = 1;
        do {
            System.out.println("Aluno " + aluno + ":");
            double soma = 0;
            int nota = 1;
            do {
                System.out.print("Nota " + nota + ": ");
                soma += scanner.nextDouble();
                nota++;
            } while (nota <= 3);
            double media = soma / 3;
            System.out.printf("Media do aluno %d: %.2f%n", aluno, media);
            if (media > maiorMedia) maiorMedia = media;
            aluno++;
        } while (aluno <= 10);
        System.out.printf("Maior media calculada: %.2f%n", maiorMedia);
        scanner.close();
    }
}
