/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.materia;

/**
 * Clase abstracta para las materias de Area 1
 * @author dulf2
 */
public abstract class MateriaArea1 extends Materia {
    
    /**
     * Constructor vacio
     */
    public MateriaArea1(){
        super();
    }

    @Override
    public String getArea(){
        return "Fisico-Matematicas";
    }
    
}
