package practica1;

import java.util.Scanner;

/**
 *
 * @Diana Sanchez
 */
public class PRACTICA1 {

    public static void main(String[] args) {
        int num;
        String nom;
        Scanner captu=new Scanner(System.in);
        
        System.out.println("Nombre");
            nom=captu.nextLine();
        
        System.out.println("Introduce el numero");
            num= captu.nextInt();
            captu.nextLine();
    
        for (int i = 1; i <=num; i++){
            System.out.println(nom);
       
        }
    }
    
}
