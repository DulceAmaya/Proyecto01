/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.area;

import proyectoescuela.Grupo;
import proyectoescuela.materia.Materia;

/**
 * Clase especifica para area 2
 * @author dulf2
 */
public class Area2 extends Area {
    
    /**
     * Constructor de Area 2 que recibe su nombre y dos grupos
     * @param a
     * @param b 
     * @param m1
     * @param m2
     */
    public Area2(Grupo a, Grupo b, Materia m1, Materia m2){
        super(m1, m2);
    }
    
    @Override
    public int getArea(){
        return 2;
    }
    
    @Override
    public String toString(){
        return "Ciencias biologicas y de la salud";
    }
    
}
