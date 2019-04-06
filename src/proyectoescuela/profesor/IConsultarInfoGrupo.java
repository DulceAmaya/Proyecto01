/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.profesor;

import java.util.ArrayList;
import proyectoescuela.Alumno;
import proyectoescuela.Grupo;
import proyectoescuela.Materia;
import proyectoescuela.opciontecnica.OpcionTecnica;

/**
 * Interface para manejar como regresa la informacion del grupo a los profesores
 * @author Lechuga
 */
public interface IConsultarInfoGrupo {
    
    /**
     * Metodo que regresa la informacion del grupo a un profesor de asignatura
     * @param alumnos
     * @param grupo
     * @param materiaUOpcionTecnica
     * @return 
     */
    public String consultaInformacionGrupo(ArrayList<Alumno> alumnos, Grupo grupo, Object materiaUOpcionTecnica);
        
}
