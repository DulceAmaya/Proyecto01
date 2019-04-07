/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.materia;

/**
 * Clase abstracta para las materias de Area 2
 * @author dulf2
 */
public abstract class MateriaArea2 extends Materia {

    /**
     * Constructor vacio
     */
    public MateriaArea2(){
        super();
    }
    
    @Override
    public String getArea(){
        return "Ciencias biologicas y de la salud";
    }
    
}