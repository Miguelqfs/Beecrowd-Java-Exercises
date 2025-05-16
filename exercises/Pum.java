// Problem number 1142 - PUM

import java.util.Scanner;

public class Pum {
    public static void main(String[] args) {
        int cont, nSequencias, num = 1;

        Scanner scanner = new Scanner(System.in);

        nSequencias = scanner.nextInt();

        scanner.close();

        while (nSequencias > 0) {
            for(cont = 0; cont < 3; cont++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println("PUM");
            nSequencias--;
            num++;
        }
    
    }

}