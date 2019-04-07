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
