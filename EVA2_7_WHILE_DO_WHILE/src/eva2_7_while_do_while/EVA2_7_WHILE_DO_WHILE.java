package eva2_7_while_do_while;

/**
 *
 * @Diana Sanchez
 */

public class EVA2_7_WHILE_DO_WHILE {

    public static void main(String[] args) {
        
        //While
        
        System.out.println("While");
        int val = 1;
        
        while(val<=10){
            System.out.print(val + "-");
            val++;
            
        }
        //Do while
        
        System.out.println();
        System.out.println("Do while");
        
        val = 1;
        do{
           System.out.print(val + "-");
            val++; 
        }while(val<=10);
    }
    
}
