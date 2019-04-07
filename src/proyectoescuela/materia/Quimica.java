/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.materia;

import java.util.ArrayList;
import proyectoescuela.profesor.Profesor;

/**
 * Clase para una materia especifica
 * @author dulf2
 */
public class Quimica extends MateriaArea2 {
    
    ArrayList<Profesor> profesores;
    
    /**
     * Constructor vacio
     */
    public Quimica(){
        super();
    }
    
    @Override
    public String getNombre(){
        return "Quimica";
    }
    
    @Override
    public ArrayList<Profesor> getProfesores(){
        return profesores;
    }
    
}