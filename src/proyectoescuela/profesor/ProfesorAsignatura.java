/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.profesor;

import proyectoescuela.alumno.Alumno;
import proyectoescuela.Grupo;
import proyectoescuela.materia.Materia;

/**
 * Clase que se encarga de definir a los profesores de asignatura
 * @author Lechuga
 */
public class ProfesorAsignatura extends Profesor {
    
    public String nombre;
    public int id = 0;
    public Materia materia;
    public Grupo grupo;
    public Alumno alumno;
    public AsignarCalificacionProfesorAsignatura pCalificacion;
    public ConsultarInfoGrupoProfesorAsignatura pInformacion;

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
        id++;
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
        
    @Override
    public String consultaInformacionGrupo(){
        return pInformacion.consultaInformacionGrupo(grupo.getAlumnos(), grupo, materia);
    }
    
    @Override
    public void asignarCalificacion(Alumno alumno, int calificacion){
        pCalificacion.asignarCalificacion(alumno, calificacion);
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
