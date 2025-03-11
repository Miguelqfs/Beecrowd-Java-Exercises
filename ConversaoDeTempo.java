// Problem number 1019 - Conversão de Tempo

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class ConversaoDeTempo {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int horas = n / 3600;
        int minutos = (n % 3600) / 60;
        int segundos = n % 60;
        
        System.out.println(horas + ":" + minutos + ":" + segundos);
        
        scanner.close();
    }
}