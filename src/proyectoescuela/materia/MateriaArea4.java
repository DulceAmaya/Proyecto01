/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.materia;

/**
 * Clase abstracta para las materias de Area 4
 * @author dulf2
 */
public abstract class MateriaArea4 extends Materia {
    
    /**
     * Constructor vacio
     */
    public MateriaArea4(){
        super();
    }
    
    @Override
    public String getArea(){
        return "Humanidades y Artes";
    }
    
}
