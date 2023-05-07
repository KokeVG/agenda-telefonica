/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreta.de.teléfonos;

/**
 *
 * @author Jse_0
 */
public class LibretaDeTeléfonos {


    public static AgendaAñadir a = new AgendaAñadir();
    public static AgendaModificar b = new AgendaModificar();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MenuPrincipal agenda = new MenuPrincipal();
        agenda.setLocationRelativeTo(null);
        agenda.setVisible(true);
        
    }
    
}
