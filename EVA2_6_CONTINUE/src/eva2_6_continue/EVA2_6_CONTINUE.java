
package eva2_6_continue;

/**
 *
 * @author melan
 */
public class EVA2_6_CONTINUE {

    public static void main(String[] args) {

        for(int i=1; i<=10; i++){
            if((i%2)>0)//Numero impar
                continue;//Interrumpe la repeticion desde este punto
            
            System.out.print(i+ "-");
        }
    }
    
}
