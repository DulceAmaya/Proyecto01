/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela;

/**
 *
 * @author Lechuga
 */


public abstract class OpcionTecnica {

    public ProfesorInstructorOpcionTencnica instructor;
    
    
    public OpcionTecnica(ProfesorInstructorOpcionTencnica instructor){
        this.instructor = instructor;
    }
}
