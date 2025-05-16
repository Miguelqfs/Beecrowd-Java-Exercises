// Problem number 1003 - Soma Simples

import java.util.Scanner;
import java.io.IOException;

public class Soma {
    
    public static void main(String[] args) throws IOException {
        int n1, n2, soma;

        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        scanner.close();
    
        soma = n1 + n2;
    
        System.out.printf("SOMA = %d\n", soma);
    }
}
