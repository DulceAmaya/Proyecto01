/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.materia;

/**
 * Clase abstracta para las materias de Area 3
 * @author dulf2
 */
public abstract class MateriaArea3 extends Materia {
    
    /**
     * Constructor vacio
     */
    public MateriaArea3(){
        super();
    }
        
    @Override
    public String getArea(){
        return "Ciencias Sociales";
    }
    
    
}