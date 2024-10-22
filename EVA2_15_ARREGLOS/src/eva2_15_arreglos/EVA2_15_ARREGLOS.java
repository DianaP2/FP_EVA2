package eva2_15_arreglos;

/**
 *
 * @Diana Sanchez
 */

public class EVA2_15_ARREGLOS {

    public static void main(String[] args) {
        // Declaracion de arreglos: 
        int[] arreglo = new int[10];//Ocupa 40 bytes
        //Manejo por indice
        //Primer elemento de un arreglo --> Cero
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600;
        arreglo[6] = 700;
        arreglo[7] = 800;
        arreglo[8] = 900;
        //Ultimo elemento de un arreglo --> Tamaño - 1
        arreglo[9] = 1000;
        
        //El acceso siempre es a traves de las posiciones
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
        System.out.println(arreglo[3]);


        
    }
    
}
