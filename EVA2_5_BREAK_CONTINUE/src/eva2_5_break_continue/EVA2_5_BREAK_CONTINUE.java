
package eva2_5_break_continue;

/**
 *
 * @author melan
 */
public class EVA2_5_BREAK_CONTINUE {
    
    public static void main(String[] args) {
        
        for(int i=1; i<= 10; i++){
            //Continue --> Se salta la iteracion actual
            if(i==8)
                continue; //Detiene el ciclo por completo en este punto
            System.out.print(i + "-");
            
        }
    }
    
}
