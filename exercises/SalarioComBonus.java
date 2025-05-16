// Problem number 1009 - Salário com Bônus

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class SalarioComBonus {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);

        String nome;
        double salario, totalVendas;

        Scanner scanner = new Scanner(System.in);
        nome = scanner.nextLine();
        salario = scanner.nextDouble();
        totalVendas = scanner.nextDouble();
        scanner.close();

        salario += totalVendas * 0.15;

        System.out.printf("TOTAL = R$ %.2f\n", salario);
    }
}