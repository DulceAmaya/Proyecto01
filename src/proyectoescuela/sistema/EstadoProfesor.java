/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.sistema;

import proyectoescuela.administrador.Administrador;

/**
 * clase para definir el estado de profesor
 * @author josel
 */
public class EstadoProfesor implements EstadoSistema {
    
    Sistema sistema;
    EstadoAdministrador estadoA;
    EstadoProfesor estadoP;
    EstadoEstudiante estadoE;
    Administrador admin = new Administrador();
    
    @Override
    public void cambiaEstado() {
        sistema.cambiaEstado();
    }
   
}
