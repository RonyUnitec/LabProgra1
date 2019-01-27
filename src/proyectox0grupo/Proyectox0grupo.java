
package proyectox0grupo;

//importando scanner
import java.util.Scanner;

public class Proyectox0grupo {

    public static void main(String[] args) {
        
         //definiendo scanner
        Scanner leer = new Scanner(System.in);
        
        //declarando Variables 
        String jugador1,jugador2;
        String seguirjugando ="";
        char simbolo1,simbolo2;
        int marca1,marca2;
        
        //________________________
        
        System.out.print("Ingrese nombre del jugador1 : ");
        jugador1 = leer.nextLine(); 
        System.out.print("\nIngrese nombre del jugador2 : ");
        jugador2 = leer.nextLine();

        
           System.out.print("Ingrese marca que usara el jugador " + jugador1 + " :" );
        simbolo1 = leer.next().charAt(0);
           System.out.print("Ingrese marca que usara el jugador " + jugador2 + " :" );
        simbolo2 = leer.next().charAt(0);
        
        
        
        
        
    }
    
}
