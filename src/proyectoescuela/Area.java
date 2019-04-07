/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela;

import java.util.ArrayList;
import proyectoescuela.materia.Materia;

/**
 * Clase abstracta del patron Template para la creacion de las diversas areas
 * @author dulf2
 */
public abstract class Area {
    
    String nombre;
    Grupo a;
    Grupo b;
    ArrayList<Materia> materias;
    
    /**
     * Constructor de Area que recibe su nombre y dos grupos
     * @param nombre
     * @param a
     * @param b 
     * @param m1
     * @param m2
     */
    public Area(String nombre, Grupo a, Grupo b, Materia m1, Materia m2){
        this.nombre = nombre;
        this.a = a;
        this.b = b;
        materias.add(m1);
        materias.add(m2);
    }
    
    public ArrayList<Materia> getMaterias(){
        return materias;
    }
    
    public abstract String toString();
    
}
