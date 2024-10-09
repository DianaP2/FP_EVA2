package practica3;

import java.util.Scanner;

/**
 *
 * @Diana Sanchez
 */

public class PRACTICA3 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();
        
        
        for (int i = 0; i < cadena.length(); i++) { // cadena.lenght --> devuelve la longitud de la cadena, es decir, la cantidad de caracteres que contiene la cadena. 
            System.out.println(cadena.charAt(i)); // Para obtener cada carácter en la posición i.
        }
        
    }
}
   
    
