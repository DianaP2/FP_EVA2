package practica5;

import java.util.Scanner;

/**
 *
 * @Diana Sanchez
 */

public class PRACTICA5 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
           for (int i = 1; i <= numero; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
}
