/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoModelado20192;
import proyectoescuela.Materia;
import proyectoescuela.grupo.Grupo;
import proyectoescuela.profesor.Profesor;
import proyectoescuela.profesor.ProfesorAsignatura;

/**
 *
 * @author josel
 */
public class main {
    public static void main (String args[]){
        
        Materia m = new Materia();
        Grupo g = new Grupo();
        Profesor a = new ProfesorAsignatura("nombre", 2, m, g);
        
        
    }
    
}
