/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.opciontecnica;

import java.util.ArrayList;
import proyectoescuela.Alumno;
import proyectoescuela.profesor.InstructorOpcionTecnica;

/**
 * Clase de la opcion tecnica Agente de viajes
 * @author Lechuga
 */
public class AgenteViajes extends OpcionTecnica {
    
    private ArrayList<Alumno> alumnos;
    
    protected AgenteViajes(){}
    
    @Override
    public  String getNombre() {
        return "Agente de viajes";
    }

    @Override
    public String getInstructor() {
        return super.getInstructor();
    }
    
    @Override
    public void setInstructor(InstructorOpcionTecnica instructor){
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
