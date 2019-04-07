/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.area;

import java.util.ArrayList;
import java.io.*;
import proyectoescuela.Grupo;
import proyectoescuela.materia.Materia;

/**
 * Clase abstracta del patron Template para la creacion de las diversas areas
 * @author dulf2
 */
public abstract class Area {
    
    String nombre;
    Grupo a;
    Grupo b;
    ArrayList<Materia> materias = new ArrayList();
    ArrayList<Grupo> grupos = new ArrayList();
    
    /**
     * Constructor de Area que recibe su nombre y dos grupos
     * @param m1
     * @param m2
     */
    public Area(Materia m1, Materia m2){
        materias.add(m1);
        materias.add(m2);
    }
    
    /**
     * Metodo que regresa un ArrayList de las materias 
     * @return 
     */
    public ArrayList<Materia> getMaterias(){
        return materias;
    }

    /**
     * Metodo que agrega un grupo
     * @param grupo
     * @throws UnsupportedOperationException 
     */
    public void agregarGrupo(Grupo grupo) throws UnsupportedOperationException{
        if(grupos.size() > 2)
            throw new UnsupportedOperationException("Esta área ya tiene 2 grupos");
        grupos.add(grupo);
    }

    /**
     * Metodo que regresa la lista de grupos
     * @return 
     */
    public ArrayList<Grupo> getGrupos(){
        ArrayList<Grupo> tmp = new ArrayList();
        tmp.add(a);
        tmp.add(b);
        return tmp;
    }
    
    /**
     * Metodo que regresa el area como entero
     * @return 
     */
    public abstract int getArea();
    
    /**
     * Metodo que regresa el toString
     * @return 
     */
    @Override
    public abstract String toString();
    
}
