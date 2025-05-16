// Problem number 1017 - Gasto de combustível

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class GastoDeCombustivel {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        
        int horas, velocidade, distancia;
        double litros;

        Scanner scanner = new Scanner(System.in);
        horas = scanner.nextInt();
        velocidade = scanner.nextInt();
        scanner.close();

        distancia = velocidade * horas;
        litros = distancia/12.0;

        System.out.printf("%.3f\n", litros);
    }
}