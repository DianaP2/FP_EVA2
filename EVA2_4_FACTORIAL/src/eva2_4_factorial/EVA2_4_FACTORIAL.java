package eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @Diana Sanchez
 */
public class EVA2_4_FACTORIAL {

    public static void main(String[] args) {
      
        int base;
        Scanner captu=new Scanner(System.in);
        
        System.out.println("Introduce el numero");
        base = captu.nextInt();
        captu.nextLine();
          
        int acum = 1; 
        
        for (int i = 1; i <= base; i++) {
            acum *= i; 
        }
        System.out.println("Factorizacion: " + acum);
    }
    
}
