/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import modelo.MotorBusqueda;
import modelo.Ruta;
import modelo.Tramo;

/**
 *
 * @author ESTUDIANTES
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MotorBusqueda motorBusqueda = new MotorBusqueda();
        
        Tramo tramo1 = new Tramo("valledupar-barranquilla", 5);
        Tramo tramo2 = new Tramo("barranquilla-santamarta", 4);
    
        Tramo tramo3 = new Tramo("valledupar-cartagena", 8);
        Tramo tramo4 = new Tramo("cartagena-santamarta", 5);

        Tramo tramo5 = new Tramo("valledupar-santamarta",10);
        
        Ruta ruta1 = new Ruta(1,"ruta valledupar-santamarta", "valledupar", "santamarta","habilitada");
        ruta1.agregarTramos(tramo1);
        ruta1.agregarTramos(tramo2);

        Ruta ruta2 = new Ruta(2,"ruta valledupar-santamarta", "valledupar", "santamarta","habilitada");
        ruta2.agregarTramos(tramo3);
        ruta2.agregarTramos(tramo4);
        
        Ruta ruta3 = new Ruta(3,"ruta valledupar-santamarta", "valledupar", "santamarta","no habilitada");
        ruta3.agregarTramos(tramo5);
        
        motorBusqueda.registrarRuta(ruta1);
        motorBusqueda.registrarRuta(ruta2);
        motorBusqueda.registrarRuta(ruta3);
        
        System.out.println(motorBusqueda);

        System.out.println(motorBusqueda.getRutaCorta());
    }
    
    
}
