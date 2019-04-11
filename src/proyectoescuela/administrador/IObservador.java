/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.administrador;

/**
 * Interface de el patron observer para los observadores
 * @author Lechuga
 */
public interface IObservador {
    
    /**
     * Metodod que se encargara de actualizar cuando un alumno se inscribe al sistema
     * @param observador
     */
    public void actualizaNuevoAlumno();
    
    /**
     * Metodo que se encarga de actualizar cuando un alumno se borra del sistema
     * @param admin 
     */
    public void actualizaBajaAlumno();
    
    /**
     * Metodo que se encarga de actualizar cuando un alumno se gradua
     */
    public void actualizaGraduacion();
    
    /**
     * Metodo que se encarga de actualizar cuando un profesor se integra a la escueal
     */
    public void actualizaNuevoProfesor();
    
    /**
     * Metodo que se encarga de actualizar cuando un profesor es despedido
     */
    public void actualizaBajaProfesor();
    
    
    
}
