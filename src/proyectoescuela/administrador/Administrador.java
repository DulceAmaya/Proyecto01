/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.administrador;

import java.lang.reflect.Array;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Arrays;
import proyectoescuela.alumno.Alumno;
import proyectoescuela.Grupo;
import proyectoescuela.alumno.EstadoAlumno;
import proyectoescuela.alumno.EstadoAlumnoGradudado;
import proyectoescuela.alumno.EstadoAlumnoNoGraduado;
import proyectoescuela.area.Area;
import proyectoescuela.materia.Materia;
import proyectoescuela.opciontecnica.OpcionTecnica;
import proyectoescuela.profesor.*;

/**
 *
 * @author Lechuga
 */
public class Administrador implements IObservado{
    
    Hashtable<Integer, Alumno> alumnos = new Hashtable();
    ArrayList<Alumno> alumnosArrayList;
    ArrayList<Alumno> alumnosPorArea;
    ArrayList<Alumno> alumnosPorOpcionTecnica;
    ArrayList<Profesor> profesores;
    Profesor[] auxiliar; 
    Area area;
    public ProfesorAsignatura[] profesoresAsignatura = new ProfesorAsignatura [100];
    public ProfesorOpcionTecnica[] profesoresOpcionTecnica = new ProfesorOpcionTecnica [100];
    ArrayList<IObservador> observadores;
    boolean hayEspacio;
    EstadoAlumno estado;
    private int countProfesoresAsignatura = 0;
    private int countProfesoresOpTec = 0;


    @Override
    public ArrayList<Alumno> AlumnosInscritos() {
        //Pasa el Hash de alumnos a un ArrayList y la devuelve
        return alumnosArrayList = new ArrayList<Alumno>(alumnos.values());
    }

    @Override
    public ArrayList<Alumno> AlumnosInscritosArea(Area area) {
        //Convertimos el Hash en arrayList y lo recorremos buscando coincidencias de area
        alumnosArrayList = new ArrayList<Alumno>(alumnos.values());
        for(Alumno alumno : alumnosArrayList){
            if(alumno.getGrupo().getArea() == area){
                alumnosPorArea.add(alumno);
            }
        }
        return alumnosPorArea;
    }

    @Override
    public ArrayList<Alumno> AlumnosOpcionesTecnicas(OpcionTecnica opcionTecnica) {
        //Convertimos el Hash en arrayList y lo recorremos buscando coincidencias de opcion tecnica
        alumnosArrayList = new ArrayList<Alumno>(alumnos.values());
        for(Alumno alumno : alumnosArrayList){
            if(alumno.getOpcionTecnica() == opcionTecnica){
                alumnosPorOpcionTecnica.add(alumno);
            }
        }
        return alumnosPorOpcionTecnica;
    }
    
    @Override
    public ArrayList<String> ProfesoresContratados() {
        ArrayList<String> profesoresComoString = new ArrayList();
        for(ProfesorAsignatura p : profesoresAsignatura){
            profesoresComoString.add(p.toString());
        }
        for(ProfesorOpcionTecnica p : profesoresOpcionTecnica){
            profesoresComoString.add(p.toString());
        }
        return profesoresComoString;
    }
    
    /**
     * Metodo que concatena dos Array de tipo Object
     * @param <T>
     * @param a
     * @param b
     * @return 
     */
    public <T> T[] concatenate(T[] a, T[] b) {
        int aLen = a.length;
        int bLen = b.length;

        @SuppressWarnings("unchecked")
        T[] c = (T[]) Array.newInstance(a.getClass().getComponentType(), aLen + bLen);
        System.arraycopy(a, 0, c, 0, aLen);
        System.arraycopy(b, 0, c, aLen, bLen);
        
        auxiliar = (Profesor[]) c;
        return c;
    }
    
    @Override
    public void inscribirAlumno(String nombre, String fechaDeNacimiento, int numeroDeCuenta, String correo, Grupo grupo, Materia[] materias) {
        //Creamos un alumno y le pasamos los valores 
        Alumno nuevoAlumno = new Alumno(nombre,fechaDeNacimiento,numeroDeCuenta,correo,grupo,materias);
        //Agregamos el alumno a la tabla Hash
        alumnos.put(numeroDeCuenta, nuevoAlumno);
        //Agregamos al alumno a la lista de grupos
        nuevoAlumno.getGrupo().inscribirAlumno(nuevoAlumno);
        //Llamamos a notificaNuevoAlumno del patron observer para que notifique a todos de que se agrego un nuevo alumno
        this.notificaNuevoAlumno();
        
    }

    /**
     * Inscribe un alumno ya creado en el main
     * @param alumno 
     */
    public void inscribirAlumnoExistente(Alumno alumno){
        alumnos.put(alumno.getNumeroDeCuenta(), alumno);
        alumno.getGrupo().inscribirAlumno(alumno);
    }


    @Override
    public void bajaAlumno(Alumno alumno) {
        //Borramos al alumno del Hash
        alumnos.remove(alumno.numeroDeCuenta);
        //Borramos al alumno de la lista de su grupo
        alumno.getGrupo().darDeBajaAlumno(alumno);
        //Buscamos si alumno tenia opcion tecnica
        if(alumno.hasOpcionTecnica()){
            alumno.darDeBajaOpcionTecnica();
        }
        //Llamamos a notificaBajaAlumno del patron observer para que notifique a todos de que se dio de baja un alumno
        this.notificaBajaAlumno();
    }

    @Override
    public void graduarAlumno(Alumno alumno) {
        //Asignamos estado a graduado
        this.estado = new EstadoAlumnoGradudado();
        //Llamamos a set
        alumno.setEstadoGraduacion(estado);
        //Llamamos a notificaGraduacionAlumno del patron observer para que notifique a todos 
        this.notificaGraduacionAlumno();
    }

    @Override
    public void cancelarGraduacionAlumno(Alumno alumno) {
        //Asugnamos estado a no graduado
        this.estado = new EstadoAlumnoNoGraduado();
        //Cambiamos el estado de graduado a false
        alumno.setEstadoGraduacion(estado);
    }

    @Override
    public void contrataProfesorAsignatura(String nombre, Materia materia, Grupo grupo) {
        //Si no hay espacio, debemos cachar la excepcion ArrayIndexOutOfBound
        ProfesorAsignatura nuevoProfesor = new ProfesorAsignatura(nombre,materia,grupo);
        //Agregamos al array de profesores al nuevo profesor en la primer posicion libre.
        profesoresAsignatura[countProfesoresAsignatura] = nuevoProfesor;
        //Incrementamos el contador
        countProfesoresAsignatura ++;
        //Agregamos al nuevo profesor al gurpo
        nuevoProfesor.getGrupo().agregarProfesor(nuevoProfesor);
        //Llamamos a notifica del patron observer para que notifique a todos 
        this.notificaNuevoProfesor();
    }

    /**
     * Metodo que agrega un profesor existente
     * @param nuevoProfesor 
     */
    public void contrataProfesorAsignaturaExistente(ProfesorAsignatura nuevoProfesor){
        profesoresAsignatura[countProfesoresAsignatura] = nuevoProfesor;
        countProfesoresAsignatura ++;
        nuevoProfesor.getGrupo().agregarProfesor(nuevoProfesor);  
    }

    @Override
    public void despedirProfesorAsignatura(ProfesorAsignatura profesorA) {
        // Buscamos el profesor en el arreglo de profesores de Asignatura
        int tmp = buscarProfesorAsignatura(profesorA);
        if(tmp < profesoresAsignatura.length){
            //Decrementamos el contador de profesores
            countProfesoresAsignatura --;
            // Bestialidad para evitar null's a la mitad del arreglo
            profesoresAsignatura[tmp] = profesoresAsignatura[countProfesoresAsignatura];
            profesoresAsignatura[countProfesoresAsignatura] = null;
            //Borramos al profesor de su grupo
            profesorA.getGrupo().eliminarProfesor(profesorA);
            //Llamamos a notifica del patron observer para que notifique a todos 
            this.notificaBajaProfesor();
        }        
        
    }

    @Override
    public void contrataProfesorOpcionTecnica(String nombre, OpcionTecnica opcionTecnica) {
        //Si no hay espacio, debemos cachar la excepcion ArrayIndexOutOfBound
        ProfesorOpcionTecnica nuevoProfesor = new ProfesorOpcionTecnica(nombre, opcionTecnica);
        //Agregamos al nuevo profesor al array de profesores
        profesoresOpcionTecnica[countProfesoresOpTec] = nuevoProfesor;
        //Incrementamos el contador
        countProfesoresOpTec ++;
        //Agregamos al nuevo profesor a la opcion tecnica
        nuevoProfesor.getOpcionTecnica().setInstructor(nuevoProfesor);
        //Llamamos a notifica del patron observer para que notifique a todos 
        this.notificaNuevoProfesor();
    }

    /**
     * Agrega un profesor existente
     * @param nuevoProfesor 
     */
    public void contrataProfesorOpcionTecnicaExistente(ProfesorOpcionTecnica nuevoProfesor){
        profesoresOpcionTecnica[countProfesoresOpTec] = nuevoProfesor;
        countProfesoresOpTec ++;
        nuevoProfesor.getOpcionTecnica().setInstructor(nuevoProfesor);
    }

    @Override
    public void despedirProfesorOpcionTecnica(ProfesorOpcionTecnica profesorOT) {
        // Buscamos el profesor en el arreglo de profesores de Opcion Tecnica
        int tmp = buscarProfesorOpTec(profesorOT);
        if(tmp < profesoresOpcionTecnica.length){
            //Decrementamos el contador de profesores
            countProfesoresOpTec --;
            //Bestialidad para hacer eliminar al instructor de la Opcion Tecnica.
            profesorOT.getOpcionTecnica().instructor = null;
            // Bestialidad para evitar null's intercalados del arreglo
            profesoresOpcionTecnica[tmp] = profesoresOpcionTecnica[countProfesoresOpTec];
            profesoresOpcionTecnica[countProfesoresOpTec] = null;
            //Llamamos a notifica del patron observer para que notifique a todos 
            this.notificaBajaProfesor();
        }  
    }
    
    /**
    * Método que busca a un profesor en un arreglo
    * @param profesor
    * @return indice
    */
    public int buscarProfesorAsignatura(ProfesorAsignatura profesor){
        for(int i = 0; i<profesoresAsignatura.length; i++){
            if(profesoresAsignatura[i].getId() == profesor.getId())
                return i;
        }
        return profesoresAsignatura.length+1;
    }

    /**
    * Método que busca a un profesor en un arreglo
    * @param profesor
    * @return indice
    */
    public int buscarProfesorOpTec(ProfesorOpcionTecnica profesor){
        for(int i = 0; i<profesoresOpcionTecnica.length; i++){
            if(profesoresAsignatura[i].getId() == profesor.getId())
                return i;
        }
        return profesoresAsignatura.length+1;
    }

    @Override
    public void notificaNuevoAlumno() {
        //Llamamos a forEach para que recorra la tabla Hash y ejecute el metodo para cada alumno
        alumnos.forEach((Integer, Alumno) -> {Alumno.actualizaNuevoAlumno();});
        //Aqui hacemos lo mismo con ambos profesores recorriendo el Array
        for(ProfesorAsignatura profesor : profesoresAsignatura){
            if(profesor != null)
                profesor.actualizaNuevoAlumno();
        }
        for(ProfesorOpcionTecnica profesor : profesoresOpcionTecnica){
            if(profesor != null)
                profesor.actualizaNuevoAlumno();
        }
        
    }

    @Override
    public void notificaBajaAlumno() {
        //Llamamos a forEach para que recorra la tabla Hash y ejecute el metodo para cada alumno
        alumnos.forEach((Integer, Alumno) -> {Alumno.actualizaBajaAlumno();});
        //Aqui hacemos lo mismo con ambos profesores recorriendo el Array
        for(ProfesorAsignatura profesor : profesoresAsignatura){
            if(profesor != null)
                profesor.actualizaBajaAlumno();
        }
        for(ProfesorOpcionTecnica profesor : profesoresOpcionTecnica){
            if(profesor != null)
                profesor.actualizaBajaAlumno();
        }
    }

    @Override
    public void notificaGraduacionAlumno() {
        //Llamamos a forEach para que recorra la tabla Hash y ejecute el metodo para cada alumno
        alumnos.forEach((Integer, Alumno) -> {Alumno.actualizaGraduacion();});
        //Aqui hacemos lo mismo con ambos profesores recorriendo el Array
        for(ProfesorAsignatura profesor : profesoresAsignatura){
            if(profesor != null)
                profesor.actualizaGraduacion();
        }
        for(ProfesorOpcionTecnica profesor : profesoresOpcionTecnica){
            if(profesor != null)
                profesor.actualizaGraduacion();
        }
    }

    @Override
    public void notificaNuevoProfesor() {
        //Llamamos a forEach para que recorra la tabla Hash y ejecute el metodo para cada alumno
        alumnos.forEach((Integer, Alumno) -> {Alumno.actualizaNuevoProfesor();});
        //Aqui hacemos lo mismo con ambos profesores recorriendo el Array
        for(ProfesorAsignatura profesor : profesoresAsignatura){
            if(profesor != null)
                profesor.actualizaNuevoProfesor();
        }
        for(ProfesorOpcionTecnica profesor : profesoresOpcionTecnica){
            if(profesor != null)
                profesor.actualizaNuevoProfesor();
        }
    }

    @Override
    public void notificaBajaProfesor() {
        //Llamamos a forEach para que recorra la tabla Hash y ejecute el metodo para cada alumno
        alumnos.forEach((Integer, Alumno) -> {Alumno.actualizaBajaProfesor();});
        //Aqui hacemos lo mismo con ambos profesores recorriendo el Array
        for(ProfesorAsignatura profesor : profesoresAsignatura){
            if(profesor != null)
                profesor.actualizaBajaProfesor();
        }
        for(ProfesorOpcionTecnica profesor : profesoresOpcionTecnica){
            if(profesor != null)
                profesor.actualizaBajaProfesor();
        }
    }
}
