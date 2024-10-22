package eva2_14_binario;

import java.util.Scanner;

/**
 *
 * @Diana Sanchez
 */
public class EVA2_14_BINARIO {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = captu.nextInt();
        String binario = "";

        if (numero == 0) {
            binario = "0";
        
        } else {
            
            while (numero > 0) {
                int resto = numero % 2; 
                binario = resto + binario;
                numero = numero / 2; 
            }
        }

        System.out.println("El número en binario es: " + binario);
    }
}
