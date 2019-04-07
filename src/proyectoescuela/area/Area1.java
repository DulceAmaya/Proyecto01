/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.area;

import proyectoescuela.Grupo;
import proyectoescuela.materia.Materia;

/**
 * Clase especifica para area 1
 * @author dulf2
 */
public class Area1 extends Area {

    /**
     * Constructor de Area 1 que recibe su nombre y dos grupos
     * @param m1
     * @param m2
     */
    public Area1(Materia m1, Materia m2){
        super(m1, m2);
    }
    
    @Override
    public int getArea(){
        return 1;
    }
    
    @Override
    public String toString(){
        return "Fisico-Matematicas";
    }
    
}
