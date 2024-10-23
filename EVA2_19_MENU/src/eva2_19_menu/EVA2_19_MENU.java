/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_menu;

import java.util.Scanner;

/**
 *
 * @author melan
 */
public class EVA2_19_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        
        String menu[];
        int precio[];
      
        int cant;
        
        System.out.println("¿Cuantos productos tebdra el menu?");
        cant= captu.nextInt();
        captu.nextLine();
        menu= new String[cant]; //Tamaño de los arreglos (cant)
        precio = new int[cant];
        
        for(int i=0; i<menu.length; i++){
            System.out.println("Nombre del producto: ");
            menu[i] = captu.nextLine();
            System.out.println("Precio");
            precio[i] = captu.nextInt();
            captu.nextLine();
        }
        
         for(int i=0; i<menu.length; i++){
            System.out.println(i + " - " + menu[i] + " $" + precio[i]);
        }
        
    }
    
}
