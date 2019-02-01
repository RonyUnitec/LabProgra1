
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
        boolean VA1=false,VA2=false,VA3=false,
                VB1=false,VB2=false,VB3=false,
                VC1=false,VC2=false,VC3=false;
        
        //________________________
        
        
         //Contador de victorias
        int victoriasjug1 = 0,
            victoriasjug2 = 0,
            empate= 0    ;
        
        System.out.print("Ingrese nombre del jugador1 : ");
        jugador1 = leer.nextLine(); 
        System.out.print("\nIngrese nombre del jugador2 : ");
        jugador2 = leer.nextLine();

        
           System.out.print("Ingrese marca que usara el jugador " + jugador1 + " :" );
        simbolo1 = leer.next().charAt(0);
           System.out.print("Ingrese marca que usara el jugador " + jugador2 + " :" );
        simbolo2 = leer.next().charAt(0);
        
      while(true){
          //Asignando valores para seguir jugando
                VA1 = false;VA2=false;VA3 = false ;
                VB1 = false;VB2=false;VB3 = false ;
                VC1 = false;VC2=false;VC3 = false;
                
                A1="1";A2="2";A3="3";B1="4";B2="5";B3="6";C1="7";C2="8";C3="9";
                
                
          
          
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
        
       while(true){
           marca1 = 0;
           marca2 = 0;
           
           if (turnos == true) {
               System.out.print("Ingrese la posicion donde desea la marca el jugador 1 : ");
               marca1 = leer.nextInt();
           }else{
               System.out.print("Ingrese la posicion donde desea la marca el jugador 2 : ");
               marca2 = leer.nextInt(); 
           
           }
                      
           
           if (marca1 > 0 && marca1 <10 ){
             
               switch(marca1){
               
               case(1):
                   if(VA1 ==false){
                   A1 = String.valueOf(simbolo1);
                   VA1 = true;
                   turnos = !turnos;
                   }else{System.out.println("Posicion ocupada o numero invalido");}
               break;
               
               case(2):
                   if(VA2 ==false){
                   A2 = String.valueOf(simbolo1);
                   VA2 = true;
                   turnos = !turnos;
                   }else{System.out.println("Posicion ocupada o numero invalido");}
               break;
               
               case(3):
                   if(VA3 ==false){
                   A3 = String.valueOf(simbolo1);
                   VA3 = true;
                   turnos = !turnos;
                   }else{System.out.println("Posicion ocupada o numero invalido");}
               break;
               
               case(4):
                   if(VB1 ==false){
                   B1= String.valueOf(simbolo1);
                   VB1 = true;
                   turnos = !turnos;
                   }else{System.out.println("Posicion ocupada o numero invalido");}
               break;
               
               case(5):
                   if(VB2 ==false){
                   B2= String.valueOf(simbolo1);
                   VB2 = true;
                   turnos = !turnos;
                   }else{System.out.println("Posicion ocupada o numero invalido");}
               break;
               
               case(6):
                   if(VB3 ==false){
                   B3= String.valueOf(simbolo1);
                   VB3 = true;
                   turnos = !turnos;
                   }else{System.out.println("Posicion ocupada o numero invalido");}
               break;
               
               case(7):
                   if(VC1 ==false){
                   C1= String.valueOf(simbolo1);
                   VC1 = true;
                   turnos = !turnos;
                   }else{System.out.println("Posicion ocupada o numero invalido");}
               break;
               
               case(8):
                   if(VC2 ==false){
                   C2= String.valueOf(simbolo1);
                   VC2 = true;
                   turnos = !turnos;
                   }else{System.out.println("Posicion ocupada o numero invalido");}
               break;
               
               case(9):
                   if(VC3 ==false){
                   C3= String.valueOf(simbolo1);
                   VC3 = true;
                   turnos = !turnos;
                   }else{System.out.println("Posicion ocupada o numero invalido");}
               break;   
               }

           }      
           else if(marca2  >0 && marca2 <10 ){
         
            
              
                    switch(marca2){
                    case(1):
                        if(VA1 ==false){
                        A1 = String.valueOf(simbolo2);
                        VA1 = true;
                        turnos = !turnos;
                     
                        }else{System.out.println("Posicion ocupada o numero invalido");}
                    break;

                    case(2):
                        if(VA2 ==false){
                        A2 = String.valueOf(simbolo2);
                        VA2 = true;
                        turnos = !turnos;
                        }else{System.out.println("Posicion ocupada o numero invalido");}
                    break;

                    case(3):
                        if(VA3 ==false){
                        A3 = String.valueOf(simbolo2);
                        VA3 = true;
                        turnos = !turnos;
                        }else{System.out.println("Posicion ocupada o numero invalido");}
                    break;

                    case(4):
                        if(VB1 ==false){
                        B1= String.valueOf(simbolo2);
                        VB1 = true;
                        turnos = !turnos;
                        }else{System.out.println("Posicion ocupada o numero invalido");}
                    break;

                    case(5):
                        if(VB2 ==false){
                        B2= String.valueOf(simbolo2);
                        VB2 = true;
                        turnos = !turnos;
                        }else{System.out.println("Posicion ocupada o numero invalido");}
                    break;

                    case(6):
                        if(VB3 ==false){
                        B3= String.valueOf(simbolo2);
                        VB3 = true;
                        turnos = !turnos;
                        }else{System.out.println("Posicion ocupada o numero invalido");}
                    break;

                    case(7):
                        if(VC1 ==false){
                        C1= String.valueOf(simbolo2);
                        VC1 = true;
                        turnos = !turnos;
                        }else{System.out.println("Posicion ocupada o numero invalido");}
                    break;

                    case(8):
                        if(VC2 ==false){
                        C2= String.valueOf(simbolo2);
                        VC2 = true;
                        turnos = !turnos;
                        }else{System.out.println("Posicion ocupada o numero invalido");}
                    break;

                    case(9):
                        if(VC3 ==false){
                        C3= String.valueOf(simbolo2);
                        VC3 = true;
                        turnos = !turnos;
                        }else{System.out.println("Posicion ocupada o numero invalido");}
                    break;
                    
                
                    }
                    
                


        }else{System.out.println("POSICION INVALIDA!!");} 
        
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
            
            
            
            //Condiciones de victoria para jugador 1
            
            if(A1.equals(String.valueOf(simbolo1)) && A2.equals(String.valueOf(simbolo1)) && A3.equals(String.valueOf(simbolo1))  ){
                
                System.out.println("EL JUGADOR " + jugador1 + " GANO !!");
                victoriasjug1 ++;
                break;
            }
            
            
            if(B1.equals(String.valueOf(simbolo1)) && B2.equals(String.valueOf(simbolo1)) && B3.equals(String.valueOf(simbolo1))  ){
                
                System.out.println("EL JUGADOR " + jugador1 + " GANO !!");
                victoriasjug1 ++;
                break;
            }
            
            
            if(C1.equals(String.valueOf(simbolo1)) && C2.equals(String.valueOf(simbolo1)) && C3.equals(String.valueOf(simbolo1))  ){
                
                System.out.println("EL JUGADOR " + jugador1 + " GANO !!");
                victoriasjug1 ++;
                break;
            }
            
            
            if(A1.equals(String.valueOf(simbolo1)) && B1.equals(String.valueOf(simbolo1)) && C1.equals(String.valueOf(simbolo1))  ){
                
                System.out.println("EL JUGADOR " + jugador1 + " GANO !!");
                victoriasjug1 ++;
                break;
            }
            
            
            if(A2.equals(String.valueOf(simbolo1)) && B2.equals(String.valueOf(simbolo1)) && C2.equals(String.valueOf(simbolo1))  ){
                
                System.out.println("EL JUGADOR " + jugador1 + " GANO !!");
                victoriasjug1 ++;
                break;
            }
            
            
            if(A3.equals(String.valueOf(simbolo1)) && B3.equals(String.valueOf(simbolo1)) && C3.equals(String.valueOf(simbolo1))  ){
                
                System.out.println("EL JUGADOR " + jugador1 + " GANO !!");
                victoriasjug1 ++;
                break;
            }
            
            if(A1.equals(String.valueOf(simbolo1)) && B2.equals(String.valueOf(simbolo1)) && C3.equals(String.valueOf(simbolo1))  ){
                
                System.out.println("EL JUGADOR " + jugador1 + " GANO !!");
                victoriasjug1 ++;
                break;
            }
            
            if(A3.equals(String.valueOf(simbolo1)) && B2.equals(String.valueOf(simbolo1)) && C1.equals(String.valueOf(simbolo1))  ){
                
                System.out.println("EL JUGADOR " + jugador1 + " GANO !!");
                victoriasjug1 ++;
                break;
            }
            
            
            
            
             //Condiciones de victoria para jugador 2
            
            if(A1.equals(String.valueOf(simbolo2)) && A2.equals(String.valueOf(simbolo2)) && A3.equals(String.valueOf(simbolo2))  ){
                
                System.out.println("EL JUGADOR " + jugador2 + " GANO !!");
                victoriasjug2 ++;
                break;
            }
            
            
            if(B1.equals(String.valueOf(simbolo2)) && B2.equals(String.valueOf(simbolo2)) && B3.equals(String.valueOf(simbolo2))  ){
                
                System.out.println("EL JUGADOR " + jugador2 + " GANO !!");
                victoriasjug2 ++;
                break;
            }
            
            
            if(C1.equals(String.valueOf(simbolo2)) && C2.equals(String.valueOf(simbolo2)) && C3.equals(String.valueOf(simbolo2))  ){
                
                System.out.println("EL JUGADOR " + jugador2 + " GANO !!");
                victoriasjug2 ++;
                break;
            }
            
            
            if(A1.equals(String.valueOf(simbolo2)) && B1.equals(String.valueOf(simbolo2)) && C1.equals(String.valueOf(simbolo2))  ){
                
                System.out.println("EL JUGADOR " + jugador2 + " GANO !!");
                victoriasjug2 ++;
                break;
            }
            
            
            if(A2.equals(String.valueOf(simbolo2)) && B2.equals(String.valueOf(simbolo2)) && C2.equals(String.valueOf(simbolo2))  ){
                
                System.out.println("EL JUGADOR " + jugador2 + " GANO !!");
                victoriasjug2 ++;
                break;
            }
            
            
            if(A3.equals(String.valueOf(simbolo2)) && B3.equals(String.valueOf(simbolo2)) && C3.equals(String.valueOf(simbolo2))  ){
                
                System.out.println("EL JUGADOR " + jugador2 + " GANO !!");
                victoriasjug2 ++;
                break;
            }
            
            if(A1.equals(String.valueOf(simbolo2)) && B2.equals(String.valueOf(simbolo2)) && C3.equals(String.valueOf(simbolo2))  ){
                
                System.out.println("EL JUGADOR " + jugador2 + " GANO !!");
                victoriasjug2 ++;
                break;
            }
            
            if(A3.equals(String.valueOf(simbolo2)) && B2.equals(String.valueOf(simbolo2)) && C1.equals(String.valueOf(simbolo2))  ){
                
                System.out.println("EL JUGADOR " + jugador2 + " GANO !!");
                victoriasjug2 ++;
                break;
            }
            
            
            //Condicion de empate
            
            
            if (VA1 == true && VA2 == true &&  VA3 ==true &&  VB1 ==true && VB2 == true && VB3 ==true && VC1 == true && VC2 == true && VC3 == true) {
                
                System.out.println("EMPATE!!!!!");
                empate ++;
                break;
           
               
           }
        
        
        }
       
       while (true) {              
              System.out.println("Desea seguir jugando ?? (y/n)");
            seguirjugando= leer.next().toLowerCase();
            
          
           if (seguirjugando.equals("y")) {
               break;
               
           }else if(seguirjugando.equals("n")){
               break;
           }
           
           
           
          }
       if(seguirjugando.equals("n")){
       break;
       }
       
    }
      
        System.out.println("Juego terminado");
        System.out.println("Jugador "+ jugador1 + " gano :"+victoriasjug1);
        System.out.println("Jugador "+ jugador2 + " gano :"+victoriasjug2);
        System.out.println("hubieron "+ empate + " empates ");
    
}
}
