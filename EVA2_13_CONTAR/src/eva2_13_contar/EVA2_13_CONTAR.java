package eva2_13_contar;

import java.util.Scanner;

/**
 *
 * @author melan
 */

public class EVA2_13_CONTAR {
    public static void main(String[] args) { 
      Scanner captu = new Scanner(System.in);
        
        int acumA = 0, acumE = 0, acumI = 0, acumO = 0, acumU = 0;
        
        System.out.print("Escribe algo: ");
        String cadena = captu.nextLine().toLowerCase(); 
        
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            
            switch (caracter) {
                case 'a': acumA++; break;
                case 'e': acumE++; break;
                case 'i': acumI++; break;
                case 'o': acumO++; break;
                case 'u': acumU++; break;
            }
        }
        
        System.out.println();
        System.out.println("La cantidad de vocales utilizadas fueron:");
        System.out.println();
        System.out.println("Vocales A: " + acumA);
        System.out.println("Vocales E: " + acumE);
        System.out.println("Vocales I: " + acumI);
        System.out.println("Vocales O: " + acumO);
        System.out.println("Vocales U: " + acumU);
    }
}
