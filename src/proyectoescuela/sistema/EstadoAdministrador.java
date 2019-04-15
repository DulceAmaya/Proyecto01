/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.sistema;

import static java.lang.System.in;
import java.util.Scanner;
import proyectoescuela.administrador.Administrador;

/**
 * Clase para definie el estado de administrador
 * @author josel
 */
public class EstadoAdministrador implements EstadoSistema{
    
    int seleccion;
    Sistema sistema;
    EstadoAdministrador estadoA;
    EstadoProfesor estadoP;
    EstadoEstudiante estadoE;
    Administrador admin = new Administrador();

    @Override
    public void cambiaEstado() {
        sistema.cambiaEstado();
    }
    
//    public void usaAdministrador(){
//         System.out.println("Selecciona la accion a ejecutar"
//                 + "\n1 Inscribir alumno"
//                 + "\n2 Dar de baja alumno"
//                 + "\n3 Graduar alumno"
//                 + "\n4 Cancelar graduacion"
//                 + "\n5 Contratar profesor asignatura"
//                 + "\n6 Despedir profesor asignatura"
//                 + "\n7 Contratar profesor Opcion tecnica"
//                 + "\n8 Despedir profesor Opcion tecnica"
//                 + "\n9 Ver lista alumnos inscritos"
//                 + "\n10 Ver lista alumnos inscritos por area"
//                 + "\n11 Ver lista de alumnos por opcion tecnica"
//                 + "\n12 Ver lista de profesores contratados");
//         
//        Scanner sc = new Scanner(in); 
//        seleccion = sc.nextInt();
//        
//        switch(seleccion){
//            case 1:
//                String nombre;
//                String fechaDeNacimiento;
//                int numeroDeCuenta;
//                String correo;
//                
//        }
//         
//    }

    
}
