/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoModelado20192;
import proyectoescuela.materia.*;
import proyectoescuela.area.*;
import proyectoescuela.Grupo;
import proyectoescuela.profesor.Profesor;
import proyectoescuela.profesor.ProfesorAsignatura;

/**
 *
 * @author josel
 */
public class main {
    public static void main (String args[]){
        
        Grupo g1 = new Grupo("Prueba1");
        Grupo g2 = new Grupo("Prueba2");
        Fisica fisica = new Fisica();
        Matematicas matematicas = new Matematicas();
        Area1 a1 = new Area1(g1, g2, fisica, matematicas);
        g1.agregarMateria(fisica);
        g1.agregarMateria(matematicas);
        System.out.println(g1.getMaterias());
        
    }
    
}
