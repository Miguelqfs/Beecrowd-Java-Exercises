// Problem number 1015 - Distância Entre Dois Pontos    

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class DistanciaDoisPontos {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        
        double x1, x2, y1, y2, distancia;

        Scanner scanner = new Scanner(System.in);
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        scanner.close();

        distancia = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));

        System.out.printf("%.4f\n", distancia);

    }
}