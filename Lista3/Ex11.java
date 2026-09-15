public class Ex11 {
    public static void main(String[] args) {
        int numero = 1, pares = 0, impares = 0, somaPares = 0, somaImpares = 0;
        System.out.println("20 primeiros numeros pares:");
        do {
            if (numero % 2 == 0) { System.out.println(numero); somaPares += numero; pares++; }
            numero++;
        } while (pares < 20);
        numero = 1;
        System.out.println("20 primeiros numeros impares:");
        do {
            if (numero % 2 != 0) { System.out.println(numero); somaImpares += numero; impares++; }
            numero++;
        } while (impares < 20);
        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Soma dos impares: " + somaImpares);
    }
}
