/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.profesor;

import java.util.ArrayList;
import proyectoescuela.Alumno;
import proyectoescuela.Grupo;
import proyectoescuela.materia.Materia;


/**
 * Strategy Pattern
 * Clase que consulta la info de un grupo de un profesor de asignatura
 * *Hacemos un casteo de object a opcion materia para no romper el patron
 * @author Lechuga
 */
public class ConsultarInfoGrupoProfesorAsignatura implements IConsultarInfoGrupo{

    String info;
    
    public String consultaInformacionGrupo(ArrayList<Alumno> alumnos, Grupo grupo, Object materia) {
        Materia temp = (Materia)materia;
        info = "Informacion del grupo: " + grupo.getNombre() + " " + temp.getNombre() + " " + alumnos.toString();
        return info;
    }

    
}
