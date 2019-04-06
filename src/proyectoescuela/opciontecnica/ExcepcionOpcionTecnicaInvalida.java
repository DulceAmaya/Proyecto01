/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.opciontecnica;

/**
 * Clase para manejar las excepciones de opcion tecnica
 * @author josel
 */
public class ExcepcionOpcionTecnicaInvalida extends Exception {

    /**
     * Creates a new instance of <code>ExcepcionMateriaNoInscrita</code> without
     * detail message.
     */
    public ExcepcionOpcionTecnicaInvalida() {
    }

    /**
     * Constructs an instance of <code>ExcepcionMateriaNoInscrita</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public ExcepcionOpcionTecnicaInvalida(String msg) {
        super(msg);
    }
}