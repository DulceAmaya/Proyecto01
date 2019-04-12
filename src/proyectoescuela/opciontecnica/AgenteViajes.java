/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.opciontecnica;

import java.util.ArrayList;
import proyectoescuela.alumno.Alumno;
import proyectoescuela.profesor.ProfesorOpcionTecnica;

/**
 * Clase de la opcion tecnica Agente de viajes
 * @author Lechuga
 */
public class AgenteViajes extends OpcionTecnica {
    
    private ArrayList<Alumno> alumnos = new ArrayList();
    
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
    public void setInstructor(ProfesorOpcionTecnica instructor){
        super.setInstructor(instructor);
    }
    
    @Override
    public void inscribirAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    
    @Override
    public ArrayList<Alumno> alumnosInscritos() {
        return alumnos;
    }
    
}
