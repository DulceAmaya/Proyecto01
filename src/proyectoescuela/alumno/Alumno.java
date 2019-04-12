/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.alumno;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Arrays;
import proyectoescuela.materia.ExcepcionMateriaNoInscrita;
import proyectoescuela.administrador.IObservador;
import proyectoescuela.Grupo;
import proyectoescuela.opciontecnica.ExcepcionOpcionTecnicaInvalida;
import proyectoescuela.opciontecnica.FabricaOpcionTecnica;
import proyectoescuela.opciontecnica.OpcionTecnica;
import proyectoescuela.materia.Materia;
import proyectoescuela.profesor.*;

/**
 * Clase que maneja al tipo Alumno
 * @author dulf2
 */
public class Alumno implements IObservador{
    
    int calificacionOpcionTecnica;
    final String nombre;
    final String fechaDeNacimiento;
    public final int numeroDeCuenta;
    String correo;
    final Grupo grupo;
    Hashtable<Materia, Integer> materias = new Hashtable();
    OpcionTecnica opcionTecnica = null;
    private Materia[] materiasArray;
    private String certificado = null;
    public EstadoAlumno estado;

    /**
     * Constructor de alumno
     * @param nombre
     * @param fechaDeNacimiento
     * @param numeroDeCuenta
     * @param correo
     * @param grupo
     * @param materias 
     */
    public Alumno(String nombre, String fechaDeNacimiento, int numeroDeCuenta, String correo, Grupo grupo, Materia[] materias){
    	this.nombre = nombre;
    	this.fechaDeNacimiento = fechaDeNacimiento;
    	this.numeroDeCuenta = numeroDeCuenta;
    	this.correo = correo;
    	this.grupo = grupo;
    	this.materiasArray = materias;
    	this.materias.put(materiasArray[0], 0);
    	this.materias.put(materiasArray[1], 0);
        this.estado = (EstadoAlumno) new EstadoAlumnoNoGraduado();
    }

    /**
     * regresa el nombre del alumno
     * @return nombre 
     */
    public String getNombre(){
    	return nombre;
    }

    /**
     * regresa la fecha de nacimiento del alumno
     * @return fecha de nacimiento
     */
    public String getFechaDeNacimiento(){
    	return fechaDeNacimiento;
    }

    /**
     * regresa el numero de cuenta
     * @return numero de cuenta
     */
    public int getNumeroDeCuenta(){
    	return numeroDeCuenta;
    }

    /**
     * Define el correo
     * @param correo 
     */
    public void setCorreo(String correo){
    	this.correo = correo;
    }

    /**
     * regresa el correo de un alumno
     * @return correo
     */
    public String getCorreo(){
    	return correo;
    }

    /**
     * Regresa la version String de grupo
     * @return grupo as String
     */
    public String getToStringGrupo(){
    	return grupo.getNombre();
    }
    
    /**
     * Regresa el grupo del alumno
     * @return grupo
     */
    public Grupo getGrupo(){
        return this.grupo;
    }

    /**
     * regresa las materias del alumno
     * @return 
     */
    public Materia[] getMaterias(){
    	return materiasArray;
    }

    /**
     * Regresa las calificaciones del alumno
     * @return 
     */
    public String getCalificaciones(){
    	int c1 = materias.get(materiasArray[0]);
    	int c2 = materias.get(materiasArray[1]);
    	return materiasArray[0].getNombre() + " " + c1 + "\n" + materiasArray[1].getNombre() + " " +c2;
    }

    /**
     * Metodo que define la calificacion para alumno
     * @param materia
     * @param calificacion
     * @throws ExcepcionMateriaNoInscrita 
     */
    public void setCalificaciones(Materia materia, int calificacion) throws ExcepcionMateriaNoInscrita{
    	if(!materias.containsKey(materia))
            throw new ExcepcionMateriaNoInscrita("El alumno no esta inscrito");
        materias.remove(materia);
    	materias.put(materia, calificacion);
    }
    
    /**
     * Metodo que define la calificacion de una opcion tecnica
     * @param opciontecnica
     * @param calificacion 
     */
    public void setCalificacionOpcionTecnica(OpcionTecnica opciontecnica, int calificacion){
        calificacionOpcionTecnica = calificacion;
    }

    /**
     * Metodo que regresa la calificaion de la opcion tecnica
     * @return calificacion opcion tecnica
     */
    public int getCalificacionOpcionTecnica(){
        return calificacionOpcionTecnica;
    }

    /**
     * Metodo que regresa si el alumno aprobo la opcion tecnica
     * @return 
     */
    public boolean aproboOpcionTecnica(){
        return (calificacionOpcionTecnica > 5) ? true : false;
    }

    /**
     * Metodo que regresa el promedio del alumno
     * @return promedio
     */
    public double getPromedio(){
    	int promedio = materias.get(materiasArray[0]) + (materias.get(materiasArray[1]));
    	return promedio/2;
    }


    /**
     * Metodo para que un alumno se inscriba en una opcion tecnica
     * @param opcion
     * @throws ExcepcionOpcionTecnicaInvalida 
     */
    public void inscribirOpcionTecnica(OpcionTecnica opcion){
        
        opcion.inscribirAlumno(this);
    }

    /**
     * Metodo que nos regresa la opcion tecnica del alumno como String
     * @return opcion tecnica
     */
    public String getOpcionTecnicaAsString(){
    	return (opcionTecnica == null) ? "Aún no te haz inscrito a una opcion técnica" : opcionTecnica.getNombre();
    }
    
    /**
     * Metodo que regresa la opcion tecnica del alumno
     * @return opcion tecnica
     */
    public OpcionTecnica getOpcionTecnica(){
        return this.opcionTecnica;
    }
    
    /**
     * Metodo que elimina a un alumno de la opcion tecnica
     */
    public void darDeBajaOpcionTecnica(){
        opcionTecnica.darDeBajaAlumno(this);
    }
    
    /**
     * Metodo que regresa si un alumno tiene opcion tecnica
     * @return hasOpciontecnica
     */
    public boolean hasOpcionTecnica(){
        return (opcionTecnica != null);
    }
    
//    /**
//     * Metodo que cambia el estado graduado de un alumno
//     * @param estaGraduado 
//     */
//    public void estaGraduado(boolean estaGraduado){
//        this.estaGraduado = estaGraduado;
//    }
    
    @Override
    public void actualizaNuevoAlumno(){
        System.out.println("Bienvenido a Prepa 5!");
    }

    @Override
    public void actualizaBajaAlumno(){
        System.out.println("Te extrañaremos!");
    }
    
    @Override
    public void actualizaGraduacion(){
        System.out.println("Felicidades por graduarte!");
    }

    @Override
    public void actualizaNuevoProfesor() {
        System.out.println("Bienvenido profesor!");
    }

    @Override
    public void actualizaBajaProfesor() {
        System.out.println("Hasta pronto!");
    }
    
    ///////////////////////////////PATRON STATE///////////////////////////
    
    /**
     * Hace el set de un nuevo estado a un alumno
     * @param estado 
     */
    public void setEstadoGraduacion(EstadoAlumno estado){
        this.estado = estado;
    }
    
    /**
     * Regresa el estado de un alumno
     * @return 
     */
    public EstadoAlumno getEstadoGraduacion(){
        return estado;
    }
    
    /**
     * Metodo que genera el certificado de un alumno
     * @return certificado
     */
    public String certificadoAlumno(){
        if(this.certificado != null)
            return certificado;
        
        ArrayList<ProfesorAsignatura> auxiliarProfesores = this.getGrupo().getProfesores();
        ArrayList<Materia> auxiliarMaterias = new ArrayList<Materia>(Arrays.asList(this.getMaterias()));
        if(this.getEstadoGraduacion().estaGradudado()){
            certificado = "El alumno: " + "\n" + this.nombre + "\n" +
                          "Que curso las materias con los profesores: " + "\n" +
                          auxiliarProfesores.toString() + auxiliarMaterias.toString() + "\n" +
                          "Con promedio: " + this.getPromedio() + "\n";
            if(hasOpcionTecnica())
                certificado = certificado + "\n" + "Que curso la opción técnica de: " + getOpcionTecnicaAsString();
            certificado = certificado + "\n" + "Ha finalizado sus estudios satisfactoriamente en la ESCUELA NACIONAL PREPARATORIA No. 5" + "\n" + "¡FELICIDADES!";
            return certificado;
        }
        
        return "Debes n materias, amigo";
    }
    

    /**
    * Método que devuelve un alumno como una cadena
    * @return alumno
    */
    public String toString(){
        String alumnoCadena = this.nombre + " " + this.numeroDeCuenta + " " + this.fechaDeNacimiento + " " + "Grupo: " + this.grupo.getNombre();
        return alumnoCadena;
    }
       
}