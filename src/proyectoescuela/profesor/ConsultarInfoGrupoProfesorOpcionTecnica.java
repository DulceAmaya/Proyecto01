/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.profesor;

import java.util.ArrayList;
import proyectoescuela.alumno.Alumno;
import proyectoescuela.opciontecnica.OpcionTecnica;

/**
 * Strategy Pattern
 * Clase que consulta la info de un grupo de un profesor de opcion Tecnica
 * *Hacemos un casteo de object a opcion tecnica para no romper el patron
 * @author Lechuga
 */
public class ConsultarInfoGrupoProfesorOpcionTecnica implements IConsultarInfoGrupo {

    String info;
    
    public String consultaInformacionGrupo(ArrayList<Alumno> alumnos, Object opcionTecnica) {
        OpcionTecnica temp = (OpcionTecnica)opcionTecnica;
        info = "Informacion del grupo: " + temp.getNombre() + " " + alumnos.toString();
        return info;
    }

    
}
