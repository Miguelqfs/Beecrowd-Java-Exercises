// Problem number 1002 - Área do Círculo

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
import javax.swing.JOptionPane;

public class AreaDoCirculo {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);

        double pi = 3.14159, raio, area;
        String caixa = JOptionPane.showInputDialog("Insira o seu nome:");

        Scanner scanner = new Scanner(System.in);
        raio = scanner.nextDouble();
        scanner.close();

        area = pi * raio * raio;
        int x = (int)area;
        
        System.out.printf("A=%.4f\n", area);
        System.out.printf("A=%d\n", x);
        JOptionPane.showMessageDialog(null, "Hello, " + caixa);

    }
}