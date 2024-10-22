package eva2_17_arreglos;

/**
 *
 * @author melan
 */
public class EVA2_17_ARREGLOS {

    public static void main(String[] args) {
       
        String diaS[] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        int valores[] = {20,50,100,200,500,1000};
        for(int i = 0; i < diaS.length; i++){ //Regresa la cantidad de numeros que tiene el arreglo
            System.out.print(diaS[i] + "-");
            
        }
        System.out.println("");
        for(int i = 0; i < valores.length; i++){
            System.out.print(valores[i] + "-");
        }
    }
    
}
