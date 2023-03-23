/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTES
 */
public class Tramo {
    private String nombreTramo;
    private int tiempoPromedioRecorrido;

    public Tramo(String nombreTramo, int tiempoPromedioRecorrido) {
        this.nombreTramo = nombreTramo;
        this.tiempoPromedioRecorrido = tiempoPromedioRecorrido;
    }

    public String getNombreTramo() {
        return nombreTramo;
    }

    public void setNombreTramo(String nombreTramo) {
        this.nombreTramo = nombreTramo;
    }

    public int getTiempoPromedioRecorrido() {
        return tiempoPromedioRecorrido;
    }

    public void setTiempoPromedioRecorrido(int tiempoPromedioRecorrido) {
        this.tiempoPromedioRecorrido = tiempoPromedioRecorrido;
    }

    @Override
    public String toString() {
        return "Tramo{" + "nombreTramo=" + nombreTramo + ", tiempoPromedioRecorrido=" + tiempoPromedioRecorrido + '}';
    }
    
    
}
