/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.opciontecnica;

import java.util.ArrayList;
import proyectoescuela.Alumno;
import proyectoescuela.profesor.ProfesorOpcionTecnica;


/**
 * Clase de la opcion tecnica Fotografo
 * @author Lechuga
 */
public class Fotografia extends OpcionTecnica {
    
    private ArrayList<Alumno> alumnos;

    protected Fotografia(){}
    
    @Override
    public String getNombre() {
        return "Fotografia";
    }

    @Override
    public String getInstructor() {
        return super.getInstructor();
    }
    
    @Override
    public void setInstructor(ProfesorOpcionTecnica instructor){
        super.setInstructor(instructor);
    }
    
    @Override
    public void inscribirAlumno(Alumno alumno){
        super.inscribirAlumno(alumno);
    }
    
    @Override
    public ArrayList<Alumno> alumnosInscritos() {
        return alumnos;
    }
}
