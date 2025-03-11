// Problem number 1011 - Esfera

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Esfera {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        
        double pi = 3.14159, raio, volume;

        Scanner scanner = new Scanner(System.in);
        raio = scanner.nextInt();
        scanner.close();

        volume = 4/3.0 * pi * raio * raio * raio;

        System.out.printf("VOLUME = %.3f\n", volume);
    }
}