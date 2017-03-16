
package alarma_reloj;

import javax.swing.JOptionPane;

/**
    * This class (Reloj) is a main class and Contains a static method (main)
    * @author Miguel Sánchez Blanco
    */
public class Reloj {

    /**
        * @param args the command line arguments
        * @param opciones1 Of type int
        * @param opciones2 Of type int
        * The method declares the variables alarma,activar and display to use the methods of the classes Alarma,Activar and Display
        * Contains two loops "do while" Which contains a case menu (switch)
        * The first loop "do while" contains menu opciones1 and The second loop "do while"
        * Menu opciones1 contains menu opciones2 with the second loop "do while" where it closed
        */
    public static void main(String[] args) {
        
        Alarma alarma = new Alarma();
        Activar activar = new Activar();
        Display display = new Display();
        
        int opciones1,opciones2;
        do{
            opciones1=Integer.parseInt(JOptionPane.showInputDialog("1- Mostrar Hora actual \n2- Mostrar Hora de Alarma \n3- Mostar Estado de Alarma  \n4- Establecer hora para Alarma \n5- Activar/Desactivar Alarma"));
                switch(opciones1){
                    case 1:
                        display.hora();
                        break;
                    case 2:
                        display.horaAlarmaActual();
                        break;
                    case 3:
                        display.estadoAlarma();
                        break;
                    case 4:
                        do{
                        opciones2=Integer.parseInt(JOptionPane.showInputDialog("1- Configurar Hora de la Alarma \n2- Configurar Minutos de la Alarma \n0- Volver"));
                            switch(opciones2){
                                case 1:
                                alarma.confAlarmaHora();
                                    break;
                                case 2:
                                alarma.confAlarmaMinutos();
                                    break;
                                }
                            }while(opciones2!=0);
                        break;
                    case 5:
                        display.onOffAlarma();
                        break;
                }
            }while(opciones1!=0);
    }
    
}
