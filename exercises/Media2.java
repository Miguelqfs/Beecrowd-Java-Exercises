// Problem number 1002 - Média 2

import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Media2 {
    
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        
        float n1, n2, n3, media;

        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextFloat();
        n2 = scanner.nextFloat();
        n3 = scanner.nextFloat();
        scanner.close();
    
        media = (n1*2 + n2*3 + n3*5)/10;
    
        System.out.printf("MEDIA = %.1f\n", media);
    }
}
