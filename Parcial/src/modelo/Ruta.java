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
public class Ruta {
    private int id;
    private String nombre;
    private String ciudadOrigen;
    private String ciudadDestino;
    private String estado;
    private int duracionRuta;
    private ArrayList<Tramo> tramos;

    public Ruta(int id, String nombre, String ciudadOrigen, String ciudadDestino, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.estado = estado;
        this.tramos = new ArrayList();
    }
    
    public void agregarTramos(Tramo t){
        this.tramos.add(t);
    }
    
    public int calcularDuracionRuta(){
        for(Tramo r:this.tramos){
            duracionRuta += r.getTiempoPromedioRecorrido();
        }
        return duracionRuta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Tramo> getTramos() {
        return tramos;
    }

    public void setTramos(ArrayList<Tramo> tramos) {
        this.tramos = tramos;
    }

    @Override
    public String toString() {
        return "Ruta{" + "id=" + id + ", nombre=" + nombre + ", ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino + ", estado=" + estado + ", tramos=" + tramos + '}';
    }
    
    
    
}
