package eva2_11_valor2;

import java.util.Scanner;

/**
 *
 * @Diana Sanchez
 */

public class EVA2_11_VALOR2 {

    public static void main(String[] args) {
      
        Scanner captu=new Scanner(System.in);
        int dia;
        
        while(true){
        System.out.println("Ingresa el dia de la semana (1 - 7)");
        dia=captu.nextInt();
        captu.nextLine();
         
        if(dia >=1 && dia <=7)
            break;
        }
        
        if(dia==1){
            System.out.println("Lunes");
        }else if (dia==2){
            System.out.println("Martes");
        }else if (dia==3){
            System.out.println("Miercoles");
        }else if (dia==4){
            System.out.println("Jueves");
        }else if (dia==5){
            System.out.println("Viernes");
        }else if (dia==6){
            System.out.println("Sabado");
        }else if (dia==7){
            System.out.println("Domingo");
        }else{
            System.out.println();
        }
        
    }
    
}
