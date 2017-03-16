
package alarma_reloj;

import javax.swing.JOptionPane;

/**
 * This class (Alarma) contains two methods (confAlarmaHora, confAlarmaMinutos)
 * @author Miguel Sánchez Blanco
 */
public class Alarma {
    
/**
    * The horaAlarma and minutosAlarma parameters are declared in the class
    * @param horaAlarma Of type int
    * @param minutosAlarma Of type int
    * The method confAlarmaHora declares that if horaAlarma is equal to 23, horaAlarma becomes 0, if it does not increase by 1 horaAlarma
    * The method confAlarmaMinutos declares that if confAlarmaMinutos is equal to 59, confAlarmaMinutos becomes 0, if it does not increase by 1 confAlarmaMinutos
    */
    
    int horaAlarma;
    int minutosAlarma;
   
    public void confAlarmaHora(){
        if(horaAlarma==23)
            horaAlarma=0;
        else
            horaAlarma++;
            System.out.println("Hora de la alarma "+horaAlarma);
    }
    public void confAlarmaMinutos(){
        if(minutosAlarma==59)
            minutosAlarma=0;
        else
            minutosAlarma++;
            System.out.println("Minutos de la alarma "+minutosAlarma);
    }
    
    
    
    
    
    
}
