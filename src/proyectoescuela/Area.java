/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela;

/**
 *
 * @author dulf2
 */
public abstract class Area {
    
    String nombre;
    Grupo a;
    Grupo b;
    
    public Area(String nombre, Grupo a, Grupo b){
        this.nombre = nombre;
        this.a = a;
        this.b = b;
    }
    
}
