package eva2_2_prom;

import java.util.Scanner;

/**
 *
 * @Diana Sanchez
 */
public class EVA2_2_PROM {

    public static void main(String[] args) {
  
        int cal, acum;
        Scanner captu=new Scanner(System.in);
        
        acum=0;
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Estudiante " + i);
            System.out.println("Ingresa cali");
            cal=captu.nextInt();
            captu.nextLine();
            
            acum=acum + cal;
        }
          System.out.println("Promedio: " + (acum / 5.0));
    }
    
}
