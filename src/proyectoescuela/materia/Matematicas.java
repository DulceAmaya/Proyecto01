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
public class Matematicas extends MateriaArea1 {
    
    ArrayList<Profesor> profesores;
    
    /**
     * Constructor vacio
     */
    public Matematicas(){
        super();
    }
    
    @Override
    public String getNombre(){
        return "Matematicas";
    }
    
    @Override
    public ArrayList<Profesor> getProfesores(){
        return profesores;
    }
    
}
