// Problem number 1008 - Salário

import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Salario {
    
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        
        int numero, horas;
        float valor, salario;

        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();
        horas = scanner.nextInt();
        valor = scanner.nextFloat();
        scanner.close();
    
        salario = horas * valor;

        System.out.printf("NUMBER = %d\n", numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}