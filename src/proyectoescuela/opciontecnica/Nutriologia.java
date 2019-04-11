/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.opciontecnica;

import java.util.ArrayList;
import proyectoescuela.alumno.Alumno;
import proyectoescuela.profesor.ProfesorOpcionTecnica;

/**
 * Clase de la opcion tecnica Nutriologia
 * @author Lechuga
 */
public class Nutriologia extends OpcionTecnica {
    
    private ArrayList<Alumno> alumnos;

    protected Nutriologia(){}
    
    @Override
    public String getNombre() {
        return "Nutriologia";
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
