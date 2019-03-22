/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela;

import java.util.ArrayList;

/**
 *
 * @author dulf2
 */
public class CarreraTecnica {
    
    String  nombre;
    ArrayList<Alumno> alumnosInscritos;
    Profesor instructor;

    public CarreraTecnica(String nombre, ArrayList<Alumno> alumnosInscritos, Profesor instructor) {
        this.nombre = nombre;
        this.alumnosInscritos = alumnosInscritos;
        this.instructor = instructor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Alumno> getAlumnosInscritos() {
        return alumnosInscritos;
    }

    public void inscribirAlumno(Alumno alumno) {
        alumnosInscritos.add(alumno);
    }
    
    public void darDeBajaAlumno(Alumno alumno){
        alumnosInscritos.remove(alumno);
    }

    public Profesor getInstructor() {
        return instructor;
    }

    public void setInstructor(Profesor instructor) {
        this.instructor = instructor;
    }
    
    
    
}
