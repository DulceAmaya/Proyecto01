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
public class Fisica extends MateriaArea1 {
    
    ArrayList<ProfesorAsignatura> profesores;
    
    /**
     * Constructor vacio
     */
    public Fisica(){
        super();
    }
    
    @Override
    public String getNombre(){
        return "Física";
    }
    
    @Override
    public ArrayList<ProfesorAsignatura> getProfesores(){
        return profesores;
    }
    
}