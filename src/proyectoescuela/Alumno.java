/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela;

import java.util.Hashtable;
import java.util.Enumeration;


/**
 *
 * @author dulf2
 */
public class Alumno {
    
    final String nombre;
    final int noCuenta;
    final int fechaDeNacimiento;
    final String sexo;
    String correo;
    Grupo grupo;
    Hashtable<Materia> materias;

    public Alumno(String nombre, int noCuenta, int fechaDeNacimiento, String sexo, String correo, 
            Grupo grupo, Materia materias[]) {
        this.nombre = nombre;
        this.noCuenta = noCuenta;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sexo = sexo;
        this.correo = correo;
        this.grupo = grupo;
        this.materias = materias.put(materias[0], 0);
        this.materias = materias.put(materias[1], 0); 
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Hashtable<Materia> getMaterias() { 
        return materias;
    }

    public void setCalificacion(Materia materia, int calificacion) {
        this.materias = materias.put(materia, calificacion);
    }
    
   public int promedio(){
       int sum = 0;
       String key;
       Enumeration names = materias.keys();
       while(names.hasMoreElements()){
           key = (String) names.nextElement();
           sum += materias.get(key);
       }
       return sum / 2;
   }
    
}
