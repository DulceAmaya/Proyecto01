/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela.profesor;

import proyectoescuela.opciontecnica.OpcionTecnica;

/**
 *
 * @author Lechuga
 */
public class ProfesorInstructorOpcionTencnica extends Profesor{
    
    public String nombre;
    public OpcionTecnica opcionTecnica;

    public ProfesorInstructorOpcionTencnica(String nombre, OpcionTecnica opcionTecnica) {
        this.nombre = nombre;
        this.opcionTecnica = opcionTecnica;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getOpcionTecnica(){
        return opcionTecnica.getNombre();
    }
    
    public 
    
    
}
