package eva2_18_restaurante;

import java.util.Scanner;

/**
 *
 * @author melan
 */
public class EVA2_18_RESTAURANTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu=new Scanner(System.in);
        
        String menu[] = {"Dogos","Hamburguesa","Boneless",
                        "Tacos","Montados","Camarones"};
       
        int precios[] = {50, 80, 120, 150, 70, 200};
        
        for(int i=0; i<menu.length; i++){
            System.out.println(i + " - " + menu[i] + " $" + precios[i]);
        }
        
        System.out.println("¿Que desea consumir?");
        System.out.println("Ingresa el numero del producto");
        int producto=captu.nextInt();
        captu.nextLine();
        
        System.out.println("Ingrese cantidad de ordenes");
        int cantidad=captu.nextInt();
        captu.nextLine();
        
        System.out.println("El costo es de: " + cantidad * precios[producto]);
        
    }
    
}
