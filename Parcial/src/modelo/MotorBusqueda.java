/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTES
 */
public class MotorBusqueda {

    private Ruta rutaCorta;
    private ArrayList<Ruta> rutas;

    public MotorBusqueda() {
        this.rutaCorta = calcularRutaCorta();
        this.rutas = new ArrayList();
    }

    public void registrarRuta(Ruta r) {
        this.rutas.add(r);
    }

    public Ruta calcularRutaCorta() {
        if(this.rutas == null){
            System.out.println("no hay rutas por calcular"); 
        }else
        for (int i = 0; i < rutas.size(); i++) {
            if (this.rutas.get(i).calcularDuracionRuta() < this.rutas.get(i + 1).calcularDuracionRuta()) {
                rutaCorta = this.rutas.get(i);
            }
        }
        return rutaCorta;
    }

    public Ruta getRutaCorta() {
        return rutaCorta;
    }

    public void setRutaCorta(Ruta rutaCorta) {
        this.rutaCorta = rutaCorta;
    }
    
    

    public ArrayList<Ruta> getRutas() {
        return rutas;
    }

    public void setRutas(ArrayList<Ruta> rutas) {
        this.rutas = rutas;
    }

    @Override
    public String toString() {
        return "motorBusqueda{" + "rutaCorta=" + rutaCorta + ", rutas=" + rutas + '}';
    }

}
