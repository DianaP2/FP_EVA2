package eva2_9_acceso_while;

import java.util.Scanner;

/**
 *
 * @author melan
 */
public class EVA2_9_ACCESO_WHILE {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String usu="",con="";
            
        while(!(usu.equals("Diana") && con.equals("123"))){
            System.out.println("Usuario");
            usu = scanner.nextLine();
        
            System.out.println("Contraseña");
            con = scanner.nextLine();
        }
        //! --> Operador logico de negacion: NOT
        System.out.println("Programa principal");
    }
    
}
