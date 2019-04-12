/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.profesor;

import proyectoescuela.alumno.Alumno;
import proyectoescuela.opciontecnica.OpcionTecnica;

/**
 * Clase que maneja a los maestros de una opcion tecnica (Patron Strategy)
 * @author Lechuga
 */
public class ProfesorOpcionTecnica extends Profesor{
    
    
    public String nombre;
    public int id = 0;
    public OpcionTecnica opcionTecnica;
    public AsignarCalificacionProfesorOpcionTecnica pCalificacion;
    public ConsultarInfoGrupoProfesorOpcionTecnica pInformacion;

    /**
     * Constructor que recibe nombre y opcion tecnica del instructor y 
     * asigna un id unico
     * @param nombre
     * @param opcionTecnica 
     */
    public ProfesorOpcionTecnica(String nombre, OpcionTecnica opcionTecnica) {
        this.nombre = nombre;
        this.opcionTecnica = opcionTecnica;
        id++;
        this.setId(id);
    }

    /**
     * metodo que obtiene el nombre de el profesor
     * @return nombre
     */
    public String getNombre(){
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
     * Metodo que obtiene un String de la opcion tecnica que enseñe el instructor
     * @return opcion tecnica
     */
    public OpcionTecnica getOpcionTecnica(){
        return this.opcionTecnica;
    }
    
    /**
     * Metodo que hace el set de la opcion tecnica
     * @param opcionTecnica 
     */
    public void setOpcionTecnica(OpcionTecnica opcionTecnica) {
        this.opcionTecnica = opcionTecnica;
    }
    
    public String OpcionTecnicaToString(){
        return opcionTecnica.getNombre();
    }

    /**
     * Metodo que obtiene el id del profesor
     * @return id
     */
    public int getId(){
        return this.id;
    }

    /**
     * Metodo que hace el set de ID
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
    * Método que regresa un proesor como una cadena
    * @return profesor
    */
    public String toString(){
        String profesorCadena = this.nombre + " " + this.id + " " + this.opcionTecnica.getNombre();
        return profesorCadena;
    }

    @Override
    public String consultaInformacionGrupo(){
        return pInformacion.consultaInformacionGrupo(opcionTecnica.alumnosInscritos(), opcionTecnica);
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