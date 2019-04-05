/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela;

/**
 *
 * @author dulf2
 */
public class Alumno{
    
    final String nombre;
    final String fechaDeNacimiento;
    final int numeroDeCuenta;
    String correo;
    final Grupo grupo;
    Hashtable<Materia> materias;
    OpcionTecnica opcionTecnica = null;
    private Materia materiasArray;

    public Alumno(String nombre, String fechaDeNacimiento, int numeroDeCuenta, String correo, Grupo grupo, Materia[] materias){
    	this.nombre = nombre;
    	this.fechaDeNacimiento = fechaDeNacimiento;
    	this.numeroDeCuenta = numeroDeCuenta;
    	this.correo = correo;
    	this.grupo = grupo;
    	this.materiasArray = materias;
    	this.materias = materias.put(materias[0], 0);
    	this.materias = materias.put(materias[1], 0);
    }

    public String getNombre(){
    	return nombre;
    }

    public String getFechaDeNacimiento(){
    	return fechaDeNacimiento;
    }

    public int getNumeroDeCuenta(){
    	return numeroDeCuenta;
    }

    public void setCorreo(String correo){
    	this.correo = correo;
    }

    public String getCorreo(){
    	return correo;
    }

    public String getGrupo(){
    	return grupo.getNombre();
    }

    public String[] getMaterias(){
    	return materiasArray;
    }

    public String getCalificaciones(){
    	int c1 = materias.get(materiasArray[0]);
    	int c2 = materias.get(materiasArray[1]);
    	return materiasArray[0] + c1 + "\n" + materiasArray[1] + c2;
    }

    // Hay que cachar la excepcion en algun lado
    public void setCalificaciones(Materia materia, int calificacion) throws ExcepcionMateriaNoInscrita{
    	if(!materiasArray.contains(materia))
    		throw new ExcepcionMateriaNoInscrita("El alumno no esta inscrito");
    	materias.remove(materia);
    	materias.put(materia, calificacion);
    }

    public double getPromedio(){
    	int promedio = materias.get(materiasArray[0]) + (materias.get(materiasArray[1]));
    	return promedio/2;
    }


    public void inscribirOpcionTecnica(int opcion){
    	if(opcionTecnica != null)
    		System.out.println("Ya estas inscrito en la opción técnica: " + opcionTecnica.getNombre());
    	else{
    		switch (opcion){
    			case 1: 
    				opcionTecnica = new AgenteViajes();
    				break;
    			case 2:
    				opcionTecnica = new Fotografo();
    				break;
    			case 3:
    				opcionTecnica = new Laboratorista();
    				break;
    			case 4:
    				opcionTecnica = new Nutriologo();
    				break;
    			case default:
    				System.out.println("Escoge una opción válida");
    		}
    	}

    	opcionTecnica.inscribirAlumno(this.nombre, this.numeroDeCuenta);
    }

    public String getOpcionTecnica(){
    	return (opcionTecnica == null) ? "Aún no te haz inscrito a una opcion técnica" : opcionTecnica.getNombre();
    	/*if(opcionTecnica == null)
    		return "Aún no te haz inscrito a una opcion técnica";
    	else
    		return opcionTecnica.getNombre();*/

    }
    
}
