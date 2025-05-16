// Problem number 1004 - Produto Simples

import java.util.Scanner;
import java.io.IOException;

public class ProdutoSimples {
    
    public static void main(String[] args) throws IOException {
        int n1, n2, prod;

        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        scanner.close();
    
        prod = n1 * n2;
    
        System.out.printf("PROD = %d\n", prod);
    }
}
