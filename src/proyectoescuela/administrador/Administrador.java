/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.administrador;

import java.lang.reflect.Array;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Arrays;
import proyectoescuela.Alumno;
import proyectoescuela.Grupo;
import proyectoescuela.area.Area;
import proyectoescuela.materia.Materia;
import proyectoescuela.opciontecnica.OpcionTecnica;
import proyectoescuela.profesor.*;

/**
 *
 * @author Lechuga
 */
public class Administrador implements IObservado{
    
    Hashtable<Integer, Alumno> alumnos;
    ArrayList<Alumno> alumnosArrayList;
    ArrayList<Alumno> alumnosPorArea;
    ArrayList<Alumno> alumnosPorOpcionTecnica;
    ArrayList<Profesor> profesores;
    Profesor[] auxiliar; 
    Area area;
    ProfesorAsignatura[] profesoresAsignatura = new ProfesorAsignatura [100];
    ProfesorOpcionTecnica[] profesoresOpcionTecnica = new ProfesorOpcionTecnica [100];
    ArrayList<IObservador> observadores;
    boolean hayEspacio;

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
    public ArrayList<Profesor> ProfesoresContratados() {
        this.concatenate(profesoresAsignatura, profesoresOpcionTecnica);
        profesores = new ArrayList<Profesor>(Arrays.asList(auxiliar));
        return profesores;
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
        //Cambiamos el estado de graduado a true
        alumno.estaGraduado(true);
        //Llamamos a notificaGraduacionAlumno del patron observer para que notifique a todos 
        this.notificaGraduacionAlumno();
    }

    @Override
    public void cancelarGraduacionAlumno(Alumno alumno) {
        //Cambiamos el estado de graduado a false
        alumno.estaGraduado(false);
    }

    @Override
    public void contrataProfesorAsignatura(String nombre, Materia materia, Grupo grupo) {
        //Suponemos que todo esto va encerrado en un IF que sabe si hay espacio para profesores nuevos
        ProfesorAsignatura nuevoProfesor = new ProfesorAsignatura(nombre,materia,grupo);
        //Esto se tiene que generalizar para que se busque un espacio en el array (lo dejo como 0 por que la neta quien sabe)
        nuevoProfesor = profesoresAsignatura[0];
        //Agregamos al nuevo profesor al gurpo
        nuevoProfesor.getGrupo().agregarProfesor(nuevoProfesor);
        //Llamamos a notifica del patron observer para que notifique a todos 
        this.notificaNuevoProfesor();
    }

    @Override
    public void despedirProfesorAsignatura(ProfesorAsignatura profesorA) {
        //Suponemos que sabemos donde esta el profesor (falta el algoritmo de busqueda en el arreglo)
        profesoresAsignatura[0] = null;
        //Borramos a profesor de grupo
        profesorA.getGrupo().eliminarProfesor(profesorA);
        //Llamamos a notifica del patron observer para que notifique a todos 
        this.notificaBajaProfesor();
        
    }

    @Override
    public void contrataProfesorOpcionTecnica(String nombre, OpcionTecnica opcionTecnica) {
        //Suponemos que todo esto va encerrado en un IF que sabe si hay espacio para profesores nuevos
        ProfesorOpcionTecnica nuevoProfesor = new ProfesorOpcionTecnica(nombre, opcionTecnica);
        //Esto se tiene que generalizar para que se busque un espacio en el array (lo dejo como 0 por que la neta quien sabe)
        nuevoProfesor = profesoresOpcionTecnica[0];
        //Agregamos al nuevo profesor a la opcion tecnica
        nuevoProfesor.getOpcionTecnica().setInstructor(nuevoProfesor);
        //Llamamos a notifica del patron observer para que notifique a todos 
        this.notificaNuevoProfesor();
    }

    @Override
    public void despedirProfesorOpcionTecnica(ProfesorOpcionTecnica profesorOT) {
        //Suponemos que sabemos donde esta el profesor (falta el algoritmo de busqueda en el arreglo)
        profesoresOpcionTecnica[0] = null;
        //Llamamos a notifica del patron observer para que notifique a todos 
        this.notificaBajaProfesor();
    }

    @Override
    public void notificaNuevoAlumno() {
        //Llamamos a forEach para que recorra la tabla Hash y ejecute el metodo para cada alumno
        alumnos.forEach((Integer, Alumno) -> {Alumno.actualizaNuevoAlumno();});
        //Aqui hacemos lo mismo con ambos profesores recorriendo el Array
        for(ProfesorAsignatura profesor : profesoresAsignatura){
            profesor.actualizaNuevoAlumno();
        }
        for(ProfesorOpcionTecnica profesor : profesoresOpcionTecnica){
            profesor.actualizaNuevoAlumno();
        }
        
    }

    @Override
    public void notificaBajaAlumno() {
        //Llamamos a forEach para que recorra la tabla Hash y ejecute el metodo para cada alumno
        alumnos.forEach((Integer, Alumno) -> {Alumno.actualizaBajaAlumno();});
        //Aqui hacemos lo mismo con ambos profesores recorriendo el Array
        for(ProfesorAsignatura profesor : profesoresAsignatura){
            profesor.actualizaBajaAlumno();
        }
        for(ProfesorOpcionTecnica profesor : profesoresOpcionTecnica){
            profesor.actualizaBajaAlumno();
        }
    }

    @Override
    public void notificaGraduacionAlumno() {
        //Llamamos a forEach para que recorra la tabla Hash y ejecute el metodo para cada alumno
        alumnos.forEach((Integer, Alumno) -> {Alumno.actualizaGraduacion();});
        //Aqui hacemos lo mismo con ambos profesores recorriendo el Array
        for(ProfesorAsignatura profesor : profesoresAsignatura){
            profesor.actualizaGraduacion();
        }
        for(ProfesorOpcionTecnica profesor : profesoresOpcionTecnica){
            profesor.actualizaGraduacion();
        }
    }

    @Override
    public void notificaNuevoProfesor() {
        //Llamamos a forEach para que recorra la tabla Hash y ejecute el metodo para cada alumno
        alumnos.forEach((Integer, Alumno) -> {Alumno.actualizaNuevoProfesor();});
        //Aqui hacemos lo mismo con ambos profesores recorriendo el Array
        for(ProfesorAsignatura profesor : profesoresAsignatura){
            profesor.actualizaNuevoProfesor();
        }
        for(ProfesorOpcionTecnica profesor : profesoresOpcionTecnica){
            profesor.actualizaNuevoProfesor();
        }
    }

    @Override
    public void notificaBajaProfesor() {
        //Llamamos a forEach para que recorra la tabla Hash y ejecute el metodo para cada alumno
        alumnos.forEach((Integer, Alumno) -> {Alumno.actualizaBajaProfesor();});
        //Aqui hacemos lo mismo con ambos profesores recorriendo el Array
        for(ProfesorAsignatura profesor : profesoresAsignatura){
            profesor.actualizaBajaProfesor();
        }
        for(ProfesorOpcionTecnica profesor : profesoresOpcionTecnica){
            profesor.actualizaBajaProfesor();
        }
    }
}
