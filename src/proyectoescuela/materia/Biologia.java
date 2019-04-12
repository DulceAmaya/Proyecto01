/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.materia;

import java.util.ArrayList;
import proyectoescuela.profesor.*;

/**
 * Clase para una materia especifica
 * @author dulf2
 */
public class Biologia extends MateriaArea2 {
    
    ArrayList<ProfesorAsignatura> profesores;
    
    /**
     * Constructor vacio
     */
    public Biologia(){
        super();
    }
    
    @Override
    public String getNombre(){
        return "Biologia";
    }
    
    @Override
    public ArrayList<ProfesorAsignatura> getProfesores(){
        return profesores;
    }
    
}
