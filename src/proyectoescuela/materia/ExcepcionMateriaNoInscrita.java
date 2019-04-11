/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela.materia;

/**
 *
 * @author dulf2
 */
public class ExcepcionMateriaNoInscrita extends Exception {

    /**
     * Creates a new instance of <code>ExcepcionMateriaNoInscrita</code> without
     * detail message.
     */
    public ExcepcionMateriaNoInscrita() {
    }

    /**
     * Constructs an instance of <code>ExcepcionMateriaNoInscrita</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public ExcepcionMateriaNoInscrita(String msg) {
        super(msg);
    }
}
