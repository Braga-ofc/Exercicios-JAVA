import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;
        do {
            System.out.print("Digite um valor inteiro de 1 a 10: ");
            valor = scanner.nextInt();
        } while (valor < 1 || valor > 10);
        int multiplicador = 1;
        do {
            System.out.println(valor + " x " + multiplicador + " = " + (valor * multiplicador));
            multiplicador++;
        } while (multiplicador <= 10);
        scanner.close();
    }
}
