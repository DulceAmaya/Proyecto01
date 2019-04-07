/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.opciontecnica;

import java.util.ArrayList;
import proyectoescuela.Alumno;
import proyectoescuela.profesor.ProfesorOpcionTecnica;

/**
 * Clase que se encarga de manejar las opciones tecnicas (Patron Factory)
 * @author Lechuga
 */


public abstract class OpcionTecnica {

    public ProfesorOpcionTecnica instructor;
    private ArrayList<Alumno> alumnos;
    
    /**
     * Constructor vacio
     */
    public OpcionTecnica(){}
    
    /**
     * Metodo que regresa el nombre de la opcion tecnica
     * @return nombre
     */
    public abstract String getNombre();
    
    /**
     * Metodo que regresa al instructor de la opcion tecnica
     * @return instructor
     */
    public String getInstructor(){
        return instructor.toString();
    }
    
    /**
     * Metodo que genera un instrucor para la opcion tecnica
     * @param instructor 
     */
    public void setInstructor(ProfesorOpcionTecnica instructor){
        this.instructor = instructor;
    }
    
    /**
     * Metodo que agrega a los alumnos al ArrayList de alumnos
     * @param alumno 
     */
    public void inscribirAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    
    /**
     * Metodo que regresa la lista de alumnos inscritos en la opcion tecnica
     * @return alumnos Inscritos
     */
    public abstract ArrayList<Alumno> alumnosInscritos();
    
}
