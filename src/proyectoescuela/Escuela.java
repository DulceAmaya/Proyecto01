/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela;

import java.util.Hashtable;
import java.util.ArrayList;
import proyectoescuela.profesor.*;

/**
 *
 * @author dulf2
 */
public class Escuela {
    public Hashtable<Integer, Alumno> alumnosInscritos = new Hashtable<Integer, Alumno>();
    public Profesor[] profesores = new Profesor[100];
    public ArrayList<Grupo> grupos = new ArrayList();
    public String nombre = "Escuela Nacional Preparatorio No. 5";
    
    public Escuela(){}
     
     
}
