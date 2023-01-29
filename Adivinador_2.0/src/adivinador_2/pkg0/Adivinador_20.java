
package adivinador_2.pkg0;
import java.util.Scanner;

public class Adivinador_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int MAX_INTENTOS=10, intentos, valorLeido=0;
        int numeroSecreto= (int) (Math.random()*99+1);
        boolean adivino= false;
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Adivinador 2.0 - Dispones de 10 intentos");

        for(intentos=1;intentos<=MAX_INTENTOS;intentos++){
            
            System.out.print("Intento "+intentos+": ");
            valorLeido=entrada.nextInt();            
            entrada.nextLine();
            
            if(valorLeido>numeroSecreto){
                System.out.println("El número a adivinar es menor"); }
            
            if(valorLeido<numeroSecreto){
                System.out.println("El numero a adivinar es mayor"); }
            
            if(numeroSecreto==valorLeido){
                adivino=true;  
                System.out.println("¡¡¡GANASTE!!!");
                break;}
           
        }
        
        if(!adivino){
            System.out.println("¡¡¡PERDISTE!!! El número era "+ numeroSecreto);
        }
            
    }
        
}
    

