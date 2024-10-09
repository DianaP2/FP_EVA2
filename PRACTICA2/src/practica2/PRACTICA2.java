package practica2;

import java.util.Scanner;

/**
 *
 * @Diana Sanchez
 */

public class PRACTICA2 {

    public static void main(String[] args) {
         int num1,num2;
        
        Scanner captu=new Scanner(System.in);
        
        System.out.println("Num 1");
             num1= captu.nextInt();
            captu.nextLine();
        
        System.out.println("Num 2");
            num2= captu.nextInt();
            captu.nextLine();
            
            if(num1 < num2){
                for(int i=num1 + 1; i<num2; i++){
                    System.out.println(i);
            }   
            }else{
                for(int i=num2 + 1; i<num1; i++){
                        System.out.println(i);
                        }
                }
    
    }
    
    
    
}
