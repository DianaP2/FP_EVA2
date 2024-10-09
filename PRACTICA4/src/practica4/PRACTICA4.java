package practica4;

import java.util.Scanner;

/**
 *
 * @Diana Sanchez
 */

public class PRACTICA4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escribe algo: ");
        String cadena = scanner.nextLine();
        System.out.println("Acontinuacion tu texto separara las vocales");
        
        
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            
            if ( caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
                 caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'  ) {
               
                System.out.println(caracter);
            }
        }
        
        }
    }
    
