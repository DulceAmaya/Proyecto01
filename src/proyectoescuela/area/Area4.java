/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.area;

import proyectoescuela.Grupo;
import proyectoescuela.area.Area;
import proyectoescuela.materia.Materia;

/**
 * Clase especifica para area 4
 * @author dulf2
 */
public class Area4 extends Area{
    
    /**
     * Constructor de Area 4 que recibe su nombre y dos grupos
     * @param a
     * @param b 
     * @param m1
     * @param m2
     */
    public Area4(Grupo a, Grupo b, Materia m1, Materia m2){
        super(a, b, m1, m2);
    }
    
    @Override
    public String toString(){
        return "Humanidades y artes";
    }
}
