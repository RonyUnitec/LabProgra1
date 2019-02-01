
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
        String A1="1String",A2="2",A3="3",B1="4",B2="5",B3="6",C1="7",C2="8",C3="9";
        boolean turnos = true;
        
        //________________________
        
        System.out.print("Ingrese nombre del jugador1 : ");
        jugador1 = leer.nextLine(); 
        System.out.print("\nIngrese nombre del jugador2 : ");
        jugador2 = leer.nextLine();

        
           System.out.print("Ingrese marca que usara el jugador " + jugador1 + " :" );
        simbolo1 = leer.next().charAt(0);
           System.out.print("Ingrese marca que usara el jugador " + jugador2 + " :" );
        simbolo2 = leer.next().charAt(0);
        
        
        System.out.println("______________________________");
            System.out.println("||      ||         ||        ||");
            System.out.println("||  "+A1+"   ||    "+A2+"    ||    "+A3+"   ||");
            System.out.println("||      ||         ||        ||");
            System.out.println("______________________________");
            System.out.println("||      ||         ||        ||");
            System.out.println("||  "+B1+"   ||    "+B2+"    ||    "+B3+"   ||");
            System.out.println("||      ||         ||        ||");
            System.out.println("______________________________");
            System.out.println("||      ||         ||        ||"); 
            System.out.println("||  "+C1+"   ||    "+C2+"    ||    "+C3+"   ||");
            System.out.println("||      ||         ||        ||");
            System.out.println("______________________________");
        
              marca1 = 0;
           marca2 = 0;
           
           if (turnos == true) {
               System.out.print("Ingrese la posicion donde desea la marca el jugador 1 : ");
               marca1 = leer.nextInt();
           }else{
               System.out.print("Ingrese la posicion donde desea la marca el jugador 2 : ");
               marca2 = leer.nextInt(); 
           
           }
        
    }
    
}
