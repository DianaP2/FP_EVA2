package eva2_12_num_mayor;

import java.util.Scanner;

/**
 *
 * @author melan
 */
public class EVA2_12_NUM_MAYOR {

    public static void main(String[] args) {

        Scanner captu=new Scanner(System.in);
        int num;
        int mayor=Integer.MIN_VALUE; //Contienen los valores que un objeto Integer puede contener como valores mínimo y máximo. 
      
        do{
            System.out.println("Ingresa num");
            num=captu.nextInt();
            captu.nextLine();
                    
                    if(num >=1){
                        if(num>mayor){
                            mayor=num;
                        }
                    }
            
        }while(num >= 1);
        
        System.out.println("Num " + mayor);
        
    }
    
}
