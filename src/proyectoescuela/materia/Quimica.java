/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela.materia;

import java.util.ArrayList;
import proyectoescuela.materia.MateriaArea1;
import proyectoescuela.profesor.Profesor;

/**
 *
 * @author dulf2
 */
public class Quimica extends MateriaArea2 {
    
    ArrayList<Profesor> profesores;
    
    public Quimica(){
        super();
    }
    
    @Override
    public String getNombre(){
        return "Quimica";
    }
    
    @Override
    public ArrayList<Profesor> getProfesores(){
        return profesores;
    }
    
}
