package eva2_8_acceso;

import java.util.Scanner;

/**
 *
 * @Diana Sanchez
 */
public class EVA2_8_ACCESO {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String usu,con;

        do{
            System.out.println("Usuario");
            usu = scanner.nextLine();
        
            System.out.println("Contraseña");
            con = scanner.nextLine();
            
        }while(!(usu.equals("Diana") && con.equals("123")));
        //! --> Operador logico de negacion: NOT
        System.out.println("Programa principal");
    }
    
    
}
