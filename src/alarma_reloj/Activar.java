
package alarma_reloj;

import java.util.Scanner;

/**
 * This class (Activar) contain a method (OnOffAlarma)
 * @author Miguel Sanchez Blanco
 */
public class Activar {
/**    
    * The keyboard parameter is declared in the class
    * @param keyboard Use the Scanner class to enter the keyboard decision on the console
    * The OnOffAlarma method gives two options, if you type ON activates the alarm and skips the message "Alarma ON", and if you type OFF it deactivates the alarm and skips the message "Alarma OFF"
 */
    
    Scanner keyboard = new Scanner(System.in);
    
    public String OnOffAlarma(){
        
    System.out.print("Alarma \"ON\" o \"OFF\"? ");
        String alarma = keyboard.next(); 
        System.out.println();
    
        if (alarma.equalsIgnoreCase("ON")){
            System.out.println("Alarma ON");
                    System.exit(0);
                }
        
        if (alarma.equalsIgnoreCase("OFF")){
            System.out.println("Alarma OFF");
                    System.exit(0);        
                }
        return alarma;
        }        
}
    
