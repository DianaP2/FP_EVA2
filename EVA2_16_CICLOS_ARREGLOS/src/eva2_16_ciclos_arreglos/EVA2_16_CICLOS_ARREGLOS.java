package eva2_16_ciclos_arreglos;

/**
 *
 * @author melan
 */

public class EVA2_16_CICLOS_ARREGLOS {

    public static void main(String[] args) {
        int arreglo[]; //Si no esta pegado al tipo de dato NO es arreglo (Ej: int d, f[]) solo f es arreglo
                       //Si se inicia la instruccion con int y [] toda su linea es de arreglos (Ej: int[] d, f)
        
        arreglo = new int[10]; //Recuerda que el resultado del arreglo siempre se le resta 1
        
        for(int i = 0; i < 10; i++){
            arreglo[i] = (int)(Math.random()*100);
        }
        
        for(int i = 0; i < 10; i++){
           System.out.println(arreglo[i]);
        }
        
    }
    
}
