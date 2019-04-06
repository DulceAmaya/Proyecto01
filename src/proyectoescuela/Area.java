/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela;

/**
 * Clase abstracta del patron Template para la creacion de las diversas areas
 * @author dulf2
 */
public abstract class Area {
    
    String nombre;
    Grupo a;
    Grupo b;
    
    /**
     * Constructor de Area que recibe su nombre y dos grupos
     * @param nombre
     * @param a
     * @param b 
     */
    public Area(String nombre, Grupo a, Grupo b){
        this.nombre = nombre;
        this.a = a;
        this.b = b;
    }
    
}
