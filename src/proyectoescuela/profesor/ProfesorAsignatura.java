/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.profesor;

import java.util.concurrent.atomic.AtomicInteger;
import proyectoescuela.alumno.Alumno;
import proyectoescuela.Grupo;
import proyectoescuela.materia.Materia;

/**
 * Clase que se encarga de definir a los profesores de asignatura
 * @author Lechuga
 */
public class ProfesorAsignatura extends Profesor {
    
    public String nombre;
    public int id;
    private static final AtomicInteger count = new AtomicInteger(0); 
    public Materia materia;
    public Grupo grupo;
    public Alumno alumno;
    public AsignarCalificacionProfesorAsignatura pCalificacion = new AsignarCalificacionProfesorAsignatura();
    public ConsultarInfoGrupoProfesorAsignatura pInformacion = new ConsultarInfoGrupoProfesorAsignatura();

    /**
     * Constructor que recibe el nombrem, materia y grupo de un profesor de asignatura
     * @param nombre
     * @param materia
     * @param grupo 
     */
    public ProfesorAsignatura(String nombre, Materia materia, Grupo grupo) {
        this.nombre = nombre;
        this.materia = materia;
        this.grupo = grupo;
        id = count.incrementAndGet();
        setId(id);
    }

    /**
     * metodo que obtiene el nombre de el profesor
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo hace el set de nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que obtiene el id del profesor
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo que hace el set de ID
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo que regresa la materia asignada
     * @return Materia
     */
    public Materia getMateria() {
        return materia;
    }

    /**
     * Metodo que define la materia del profesor
     * @param materia 
     */
    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    /**
     * Metodo que regresa el grupo del profesor
     * @return 
     */
    public Grupo getGrupo() {
        return grupo;
    }

    /**
     * Metodo que define el grupo del profesor
     * @param grupo 
     */
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    /**
    * Método que regresa un proesor como una cadena
    * @return profesor
    */
    public String toString(){
        String profesorCadena = this.nombre + " " + this.id + " " + this.materia.getNombre() + " " + "Grupo: " + this.grupo.getNombre();
        return profesorCadena;
    }
        
    @Override
    public String consultaInformacionGrupo(){
        return pInformacion.consultaInformacionGrupo(grupo.getAlumnos(), grupo, materia);
    }
    
    @Override
    public void asignarCalificacion(Object profesor, Alumno alumno, int calificacion){
        pCalificacion.asignarCalificacion(this, alumno, calificacion);
    }

    @Override
    public void actualizaNuevoAlumno() {
        System.out.println("Bienvenido nuevo alumno!");
    }

    @Override
    public void actualizaBajaAlumno() {
        System.out.println("Adios alumno");
    }

    @Override
    public void actualizaGraduacion() {
        System.out.println("Se graduo copiando...");
    }

    @Override
    public void actualizaNuevoProfesor() {
        System.out.println("OwO whos dis?");
    }

    @Override
    public void actualizaBajaProfesor() {
        System.out.println("Adios Vaquero");
    }
        
}
