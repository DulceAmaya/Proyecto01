/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.sistema;

import proyectoescuela.administrador.Administrador;

/**
 * Clase para definir el estado de estudiante
 * @author josel
 */
public class EstadoEstudiante implements EstadoSistema{

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
