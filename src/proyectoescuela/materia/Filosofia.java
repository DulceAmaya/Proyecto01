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
public class Filosofia extends MateriaArea4 {
    
    ArrayList<ProfesorAsignatura> profesores;
    
    /**
     * Constructor vacio
     */
    public Filosofia(){
        super();
    }
    
    @Override
    public String getNombre(){
        return "Filosofia";
    }
    
    @Override
    public ArrayList<ProfesorAsignatura> getProfesores(){
        return profesores;
    }
    
}
