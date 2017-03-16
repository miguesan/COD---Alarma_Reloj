
package alarma_reloj;

/**
 * This class (Display) contains four methods (hora, horaAlarmaActual,onOffAlarma,estadoAlarma)
 * @author Miguel Sánchez Blanco
 */
public class Display {
    
    /**
     * Access the class method Activar
     */
    
        Activar activar = new Activar();
    /**
     * Displays the message with current time
     */
    public void hora(){
        System.out.println("9:04 AM");
    }
    
    /**
     * Shows the message with the current alarm time
     */
    public void horaAlarmaActual(){
        System.out.println("17:05 PM");
    }
        
    /**
     * Access the class method Activar
     */
    public void onOffAlarma(){
        activar.OnOffAlarma();
    }
    
    /**
     * Shows the message with the status of the alarm
     */
    public void estadoAlarma(){
        System.out.println("Alarma OFF");
    }
    
    
}
