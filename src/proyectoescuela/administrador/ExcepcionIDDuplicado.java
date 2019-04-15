/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela.administrador;

/**
 *
 * @author dulf2
 */
public class ExcepcionIDDuplicado extends Exception {

    /**
     * Creates a new instance of <code>ExcepcionNumeroDeCuentaDuplicado</code>
     * without detail message.
     */
    public ExcepcionIDDuplicado() {
    }

    /**
     * Constructs an instance of <code>ExcepcionNumeroDeCuentaDuplicado</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public ExcepcionIDDuplicado(String msg) {
        super(msg);
    }
}
