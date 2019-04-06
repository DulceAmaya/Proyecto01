/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela.profesor;

import java.util.ArrayList;
import proyectoescuela.Alumno;
import proyectoescuela.Grupo;
import proyectoescuela.opciontecnica.OpcionTecnica;

/**
 * Strategy Pattern
 * Clase que consulta la info de un grupo de un profesor de opcion Tecnica
 * *Hacemos un casteo de object a opcion tecnica para no romper el patron
 * @author Lechuga
 */
public class ConsultarInfoGrupoProfesorOpcionTecnica implements IConsultarInfoGrupo {

    String info;
    
    @Override
    public String consultaInformacionGrupo(ArrayList<Alumno> alumnos, Grupo grupo, Object opcionTecnica) {
        OpcionTecnica temp = (OpcionTecnica)opcionTecnica;
        info = "Informacion del grupo: " + alumnos.toString() + " " + grupo.getNombre() + " " + temp.getNombre();
        return info;
    }

    
}
