/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.alumno;

import java.util.Hashtable;
import java.util.ArrayList;
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
    Hashtable<Materia, Integer> materias;
    OpcionTecnica opcionTecnica = null;
    private Materia[] materiasArray;
    private String certificado;
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
    	this.materias.put(materias[0], 0);
    	this.materias.put(materias[1], 0);
        this.materiasArray = materias;
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
    	return materiasArray[0].getNombre() + c1 + "\n" + materiasArray[1].getNombre() + c2;
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
    public void inscribirOpcionTecnica(int opcion)throws ExcepcionOpcionTecnicaInvalida{
        System.out.println("Selecciona la opcion deseada"
                + "\n 1: Agente de viajes y hoteleria"
                + "\n 2: Fotografo, laboratorista y prensa"
                + "\n 3: Nutriologia"
                + "\n 4: Laboratorista Quimico"
                + "\n 5: salir");
        
        if(opcionTecnica != null)
            System.out.println("Ya estas inscrito en la opción técnica: " + opcionTecnica.getNombre());
        else{
            switch (opcion){
                case 1: 
                    opcionTecnica = FabricaOpcionTecnica.generaOpcionTecnica("AgenteViajes");
                    opcionTecnica.inscribirAlumno(this);
                    break;
                case 2:
                    opcionTecnica = FabricaOpcionTecnica.generaOpcionTecnica("Fotografia");
                    opcionTecnica.inscribirAlumno(this);
                    break;
                case 3:
                    opcionTecnica = FabricaOpcionTecnica.generaOpcionTecnica("Nutriologia");
                    opcionTecnica.inscribirAlumno(this);
                    break;
                case 4: 
                    opcionTecnica = FabricaOpcionTecnica.generaOpcionTecnica("Laboratorista");
                    opcionTecnica.inscribirAlumno(this);
                case 5:
                    System.out.println("...");
                default:
                    System.out.println("Escoge una opción válida"); 
                    throw new ExcepcionOpcionTecnicaInvalida();
                }
            }
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
        System.out.println("F");
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
        
        if(this.getEstadoGraduacion().estaGradudado()){
            certificado = "El alumno: " + "\n" + this.nombre + "\n" +
                          "Que curso las materias: " + "\n" +
                          this.materiasArray[0] + " " + materias.get(materiasArray[0]) + "Profesor: " + buscaProfesor(materiasArray[0]) + "\n" +
                          this.materiasArray[1] + " " + materias.get(materiasArray[1]) + "Profesor: " + buscaProfesor(materiasArray[1]) + "\n" +
                          "Con promedio: " + this.getPromedio() + "\n";
            if(hasOpcionTecnica())
                certificado = certificado + "\n" + "Que curso la opción técnica de: " + getOpcionTecnicaAsString();
            certificado = certificado + "\n" + "Ha finalizado sus estudios satisfactoriamente en la ESCUELA NACIONAL PREPARATORIA No. 5" + "\n" + "¡FELICIDADES!";
            return certificado;
        }
        
        return "Debes n materias, amigo";
    }
    
    /**
    * Método auxiliar para buscar al profesor de una materia
    * @param materia
    * @return profesor
    */
    public String buscaProfesor(Materia materia){
        ArrayList<ProfesorAsignatura> tmp1 = this.grupo.getProfesores();
        ArrayList<ProfesorAsignatura> tmp2 = materia.getProfesores();
        for(int i = 0; i < tmp1.size(); i++){
            for(int j = 0; j < tmp2.size(); j++){
                if(tmp2.get(j).getId() == tmp1.get(i).getId())
                    return tmp2.get(j).getNombre();
            }
        }
        return null;
    }
       
}