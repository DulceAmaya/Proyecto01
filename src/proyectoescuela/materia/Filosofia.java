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
public class Filosofia extends MateriaArea4 {
    
    ArrayList<Profesor> profesores;
    
    public Filosofia(){
        super();
    }
    
    @Override
    public String getNombre(){
        return "Filosofia";
    }
    
    @Override
    public ArrayList<Profesor> getProfesores(){
        return profesores;
    }
    
}
