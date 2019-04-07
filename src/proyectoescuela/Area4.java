/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela;

import proyectoescuela.materia.Materia;

/**
 * Clase especifica para area 4
 * @author dulf2
 */
public class Area4 extends Area{
    
    /**
     * Constructor de Area 1 que recibe su nombre y dos grupos
     * @param nombre
     * @param a
     * @param b 
     * @param m1
     * @param m2
     */
    public Area4(String nombre, Grupo a, Grupo b, Materia m1, Materia m2){
        super(nombre, a, b, m1, m2);
    }
    
    @Override
    public String toString(){
        return "Humanidades y artes";
    }
}
