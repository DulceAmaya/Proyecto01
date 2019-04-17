/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package ProyectoModelado20192;

import java.util.Scanner;
import java.util.ArrayList;
import proyectoescuela.Grupo;
import proyectoescuela.alumno.Alumno;
import proyectoescuela.area.Area1;
import proyectoescuela.area.Area2;
import proyectoescuela.area.Area3;
import proyectoescuela.area.Area4;
import proyectoescuela.materia.ArtesPlasticas;
import proyectoescuela.materia.Biologia;
import proyectoescuela.materia.CienciasSociales;
import proyectoescuela.materia.Filosofia;
import proyectoescuela.materia.Fisica;
import proyectoescuela.materia.Historia;
import proyectoescuela.materia.Matematicas;
import proyectoescuela.materia.MateriaArea1;
import proyectoescuela.materia.MateriaArea2;
import proyectoescuela.materia.MateriaArea3;
import proyectoescuela.materia.MateriaArea4;
import proyectoescuela.materia.Quimica;
import proyectoescuela.opciontecnica.FabricaOpcionTecnica;
import proyectoescuela.opciontecnica.OpcionTecnica;
import proyectoescuela.profesor.ProfesorAsignatura;
import proyectoescuela.profesor.ProfesorOpcionTecnica;
import proyectoescuela.administrador.*;


/**
 * Clase main para manejar el sistema por consola
 * @author josel
 */
public class main {
    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);
        int seleccion;
        String f1 = "AgenteViajes";
        String f2 = "Nutriologia";
        String f3 = "Laboratorista";
        String f4 = "Fotografia";
        Administrador admin = new Administrador();
        ProfesorAsignatura profesorAsignaturaTemporal;
        ProfesorOpcionTecnica profesorOpcionTecnicaTemporal;
        
        //Opciones Tecnicas
        //Opciones
        OpcionTecnica agente = FabricaOpcionTecnica.generaOpcionTecnica(f1);
        OpcionTecnica nutriologia = FabricaOpcionTecnica.generaOpcionTecnica(f2);
        OpcionTecnica laboratorista = FabricaOpcionTecnica.generaOpcionTecnica(f3);
        OpcionTecnica fotografo = FabricaOpcionTecnica.generaOpcionTecnica(f4);
            
        //Profesores Opcion Tecnica
        ProfesorOpcionTecnica op1 = new ProfesorOpcionTecnica("Kojima", agente);
        ProfesorOpcionTecnica op2 = new ProfesorOpcionTecnica("Neil", nutriologia);
        ProfesorOpcionTecnica op3 = new ProfesorOpcionTecnica("Toby", laboratorista);
        ProfesorOpcionTecnica op4 = new ProfesorOpcionTecnica("Cage", fotografo);
            
        //los agregamos al sistema
        admin.contrataProfesorOpcionTecnicaExistente(op1);
        admin.contrataProfesorOpcionTecnicaExistente(op2);
        admin.contrataProfesorOpcionTecnicaExistente(op3);
        admin.contrataProfesorOpcionTecnicaExistente(op4);
        
        //Materias
        Fisica m1 = new Fisica();
        Matematicas m2 = new Matematicas();
        Biologia m3 = new Biologia();
        Quimica m4 = new Quimica();
        CienciasSociales m5 = new CienciasSociales();
        Historia m6 = new Historia();
        ArtesPlasticas m7 = new ArtesPlasticas();
        Filosofia m8 = new Filosofia();
        
        //Array de materias
        MateriaArea1[] amA1 = {m1,m2};
        MateriaArea2[] amA2 = {m3,m4};
        MateriaArea3[] amA3 = {m5,m6};
        MateriaArea4[] amA4 = {m7,m8};
        
        //Areas
        Area1 ar1 = new Area1(m1,m2);
        Area2 ar2 = new Area2(m3,m4);
        Area3 ar3 = new Area3(m5,m6);
        Area4 ar4 = new Area4(m7,m8);
        
        //Grupos
        Grupo g1 = new Grupo("a", ar1);
        Grupo g2 = new Grupo("b", ar1);
        Grupo g3 = new Grupo("a", ar2);
        Grupo g4 = new Grupo("a", ar2);
        Grupo g5 = new Grupo("b", ar3);
        Grupo g6 = new Grupo("a", ar3);
        Grupo g7 = new Grupo("a", ar4);
        Grupo g8 = new Grupo("a", ar4);
        
        //Alumnos (Pide minimo 4 por grupo)
        Alumno a1 = new Alumno("Hanzo", "14-08-1998", 314325749, "Hanzo@Gmail.com", g1, amA1);
        Alumno a2 = new Alumno("Genji", "15-08-1997", 315487905, "Genji@Gmail.com", g1, amA1);
        Alumno a3 = new Alumno("RoadHog", "24-08-1998", 31547894, "RoadHog@Gmail.com", g1, amA1);
        Alumno a4 = new Alumno("Junkrat", "27-08-1998", 3256498, "Junkrat@Gmail.com", g1, amA1);
        
        Alumno a5 = new Alumno("Mei", "29-08-1998", 325647891, "Mei@Gmail.com", g2, amA1);
        Alumno a6 = new Alumno("Phara", "11-08-1998", 325647890, "Phara@Gmail.com", g2, amA1);
        Alumno a7 = new Alumno("Tracer", "01-08-1998", 254780648, "Tracer@Gmail.com", g2, amA1);
        Alumno a8 = new Alumno("Torb", "15-08-1998", 365987405, "Torb@Gmail.com", g2, amA1);
        
        Alumno a9 = new Alumno("Widow", "21-08-1998", 325478904, "Widow@Gmail.com", g3, amA2);
        Alumno a10 = new Alumno("Reaper", "10-08-1998", 315264780, "Reaper@Gmail.com", g3, amA2);
        Alumno a11 = new Alumno("DVA", "20-08-1998", 54197819, "DVA@Gmail.com", g3, amA2);
        Alumno a12 = new Alumno("Zen", "23-08-1998", 69519874, "Zen@Gmail.com", g3, amA2);
        
        Alumno a13 = new Alumno("Mercy", "16-08-1998", 156497848, "Mercy@Gmail.com", g4, amA2);
        Alumno a14 = new Alumno("Rein", "22-08-1998", 189159149, "Rein@Gmail.com", g4, amA2);
        Alumno a15 = new Alumno("Bastion", "17-08-1998", 6189148, "Bastion@Gmail.com", g4, amA2);
        Alumno a16 = new Alumno("Lucio", "19-08-1998", 8418912, "Lucio@Gmail.com", g4, amA2);
        
        Alumno a17 = new Alumno("Nick", "20-08-1998", 1891913, "Nick@Gmail.com", g5, amA3);
        Alumno a18 = new Alumno("Ratchet", "30-08-1998", 1491982, "Ratchet@Gmail.com", g5, amA3);
        Alumno a19 = new Alumno("Clank", "01-08-1998", 48184181, "Clank@Gmail.com", g5, amA3);
        Alumno a20 = new Alumno("Ellie", "17-08-1998", 51184769, "Ellie@Gmail.com", g5, amA3);
        
        Alumno a21 = new Alumno("Joel", "25-08-1998", 6918998, "Joel@Gmail.com", g6, amA3);
        Alumno a22 = new Alumno("Tez", "20-08-1998", 5169128, "Tez@Gmail.com", g6, amA3);
        Alumno a23 = new Alumno("Rick", "15-08-1998", 89189285, "Rick@Gmail.com", g6, amA3);
        Alumno a24 = new Alumno("Morty", "13-08-1998", 51298518, "Morty@Gmail.com", g6, amA3);
        
        Alumno a25 = new Alumno("Nathan", "10-08-1998", 87159814, "Nathan@Gmail.com", g7, amA4);
        Alumno a26 = new Alumno("Sully", "05-08-1998", 25828269, "Sully@Gmail.com", g7, amA4);
        Alumno a27 = new Alumno("Ellena", "06-08-1998", 78489914, "Ellena@Gmail.com", g7, amA4);
        Alumno a28 = new Alumno("Snake", "09-08-1998", 92895189, "Snake@Gmail.com", g7, amA4);
        
        Alumno a29 = new Alumno("Raiden", "10-08-1998", 514717425, "Raiden@Gmail.com", g8, amA4);
        Alumno a30 = new Alumno("Ocelot", "15-08-1998", 89492921, "Ocelot@Gmail.com", g8, amA4);
        Alumno a31 = new Alumno("Asriel", "28-08-1998", 41789158, "Asriel@Gmail.com", g8, amA4);
        Alumno a32 = new Alumno("Asgore", "22-08-1998", 58148187, "Asgore@Gmail.com", g8, amA4);
        
        //Añadimos los alumnos al arreglo
        Alumno[] alumnos = {a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21,a22,a23,a24,a25,a26,a27,a28,a29,a30,a31,a32};
        
        //Los inscribimos
        for(Alumno alumno: alumnos){
            admin.inscribirAlumnoExistente(alumno);
        }

        //Profesores Asignatura
        ProfesorAsignatura pAsig01 = new ProfesorAsignatura("Naruto", m1, g1);
        ProfesorAsignatura pAsig02 = new ProfesorAsignatura("Sasuke", m2, g1);
        ProfesorAsignatura pAsig03 = new ProfesorAsignatura("Sakura", m1, g2);
        ProfesorAsignatura pAsig04 = new ProfesorAsignatura("Kakashi", m2, g2);

        ProfesorAsignatura pAsig05 = new ProfesorAsignatura("Kurenai", m3, g3);
        ProfesorAsignatura pAsig06 = new ProfesorAsignatura("Jiraya", m4, g3);
        ProfesorAsignatura pAsig07 = new ProfesorAsignatura("Tsunade", m3, g4);
        ProfesorAsignatura pAsig08 = new ProfesorAsignatura("Kabuto", m4, g4);

        ProfesorAsignatura pAsig09 = new ProfesorAsignatura("Naruto", m5, g5);
        ProfesorAsignatura pAsig010 = new ProfesorAsignatura("Sasuke", m6, g5);
        ProfesorAsignatura pAsig011 = new ProfesorAsignatura("Sakura", m5, g6);
        ProfesorAsignatura pAsig012 = new ProfesorAsignatura("Kakashi", m6, g6);

        ProfesorAsignatura pAsig013 = new ProfesorAsignatura("Kurenai", m7, g7);
        ProfesorAsignatura pAsig014 = new ProfesorAsignatura("Jiraya", m8, g7);
        ProfesorAsignatura pAsig015 = new ProfesorAsignatura("Tsunade", m7, g8);
        ProfesorAsignatura pAsig016 = new ProfesorAsignatura("Kabuto", m8, g8);
        
        ProfesorAsignatura[] profesores = {pAsig01,pAsig02,pAsig03,pAsig04,pAsig05,pAsig06,pAsig07,pAsig08,pAsig09,pAsig010,pAsig011,pAsig012,pAsig013,pAsig014,pAsig015,pAsig016};
        
        for(ProfesorAsignatura profesor : profesores){
            admin.contrataProfesorAsignaturaExistente(profesor);
        }

        //--------------------- Inicio del menú-----------------------------
        int seleccionInicial;
        do{
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.println("Bienvenido la Proyecto 1 de Modelado y Programación | Alumnos: Amaya Dulce , Lechuga Eduardo");
            System.out.println("Para ingresar, selecciona una opción: ");
            System.out.println("1. Administrador" + "\n" + "2. Profesor" + "\n" + "3. Estudiante " + "\n" + "0. Para salir");
            seleccionInicial = sc.nextInt();
            switch(seleccionInicial){
                case 1:
                    System.out.println("¿Que deseas hacer?");
                    System.out.println("1. Consultar lista de alumnos inscritos." + "\n" +
                                       "2. Consultar lista de alumnos de un área." + "\n" +
                                       "3. Consultar lista de alumnos en una opcion técnica." + "\n" +
    		                       "4. Consultar lista de profesores." + "\n" +
    			       	       "5. Inscribir a un alumno." + "\n" +
    				       "6. Graduar a un alumno." + "\n" +
    				       "7. Dar de baja a un alumno" + "\n" +
    				       "8. Contratar a un profesor" + "\n" +
    				       "9. Despedir a un profesor" + "\n" +
    				       "0. Para salir");
                    seleccion = sc.nextInt();
                    switch(seleccion){
                        case 0:
    	        	    System.out.println("Vuelve pronto");
                            break;
                        case 1:
    			    ArrayList<Alumno> tmp = admin.AlumnosInscritos();
    			    for(Alumno a: tmp){
    			       	System.out.println(a.toString());
                            }
    			    break;
                        case 2:
                            ArrayList<Alumno> area = new ArrayList();
                            System.out.println("Selecciona un area: ");
                            System.out.println("1. Area Fisico-Matematica" + "\n" + 
                                               "2. Area de Ciencias Biologicas y de la Salud" + "\n" + 
                                               "3. Area de Ciencias Sociales" + "\n" + 
                                               "4. Area de Humanidades y Artes");
                            seleccion = sc.nextInt();
                            switch(seleccion){
                                case 1:
                                    area = admin.AlumnosInscritosArea(ar1);
            			    for(Alumno a : area){
                                        System.out.println(a.toString());
                                    }
                                    break;
                                case 2:
                                    area = admin.AlumnosInscritosArea(ar2);
                                    for(Alumno a : area){
                                        System.out.println(a.toString());
                                    }
                                    break;
                                case 3:
                                    area = admin.AlumnosInscritosArea(ar3);
                                    for(Alumno a : area){
                                        System.out.println(a.toString());
                                    }
                                    break;
                                case 4:
                                    area = admin.AlumnosInscritosArea(ar4);
                                    for(Alumno a : area){
                                        System.out.println(a.toString());
                                    }
                                    break;
                                default:
                                    System.out.println("Selecciona una opcion válida");
                                    break;
            			}
                            break;
            		case 3:
                            ArrayList<Alumno> opTec = new ArrayList();
                            System.out.println("Selecciona una opcion técnica: ");
                            System.out.println("1. Agente de viajes y hotelería" + "\n" + 
                                               "2. Fotógrafo, Laboratorista y Prensa" + "\n" + 
                                               "3. Nutriólogo" + "\n" + 
            		                       "4. Laboratorista Químico");
                            seleccion = sc.nextInt();
                            switch(seleccion){
                                case 1:
                                    opTec = admin.AlumnosOpcionesTecnicas(agente);
                                    for(Alumno a : opTec){
                                        System.out.println(a.toString());
                                    }
                                    break;
                                case 2:
                                    opTec = admin.AlumnosOpcionesTecnicas(fotografo);
                                    for(Alumno a : opTec){
                                        System.out.println(a.toString());
                                    }
                                    break;
                                case 3:
                                    opTec = admin.AlumnosOpcionesTecnicas(nutriologia);
                                    for(Alumno a : opTec){
                                        System.out.println(a.toString());
                                    }
                                    break;
                                case 4:
                                    opTec = admin.AlumnosOpcionesTecnicas(laboratorista);
                                    for(Alumno a : opTec){
                                        System.out.println(a.toString());
                                    }
                                    break;
                                default:
                                    System.out.println("Selecciona una opcion válida");
                                    break;
            			}
            		case 4:
                            ArrayList<String> prof = admin.ProfesoresContratados();
                            for(String p: prof){
            			System.out.println(p);
                            }
                            break;
            		case 5: 
                            System.out.println("Ingresa el nombre: ");
                            String nombreAlumnoNuevo = sc.next();
                            System.out.println("Ingresa la fecha de Nacimiento: ");
                            sc.nextLine();
                            String fDN = sc.next();
                            System.out.println("Ingresa el nuevo Numero de Cuenta: ");
                            int nDC = sc.nextInt();
                            System.out.println("Ingresa un correo: ");
                            sc.nextLine();
                            String correo2 = sc.nextLine();
                            System.out.println("Selecciona el área a la que el alumno pertenecerá: \n" +
                                           "1. Fisico-Matematica \n" +
                                           "2. Ciencias Biologicas y de la Salud \n" +
                                           "3. Ciencias Sociales \n" +
                                           "4. Humanidades y Artes");
                            int ar = sc.nextInt();
                            try{
                                if(ar == 1)
                                    admin.inscribirAlumno(nombreAlumnoNuevo, fDN, nDC, correo2, g1, amA1);
            			else if (ar == 2)
            			    admin.inscribirAlumno(nombreAlumnoNuevo, fDN, nDC, correo2, g3, amA2);
            			else if (ar == 3)
            			    admin.inscribirAlumno(nombreAlumnoNuevo, fDN, nDC, correo2, g5, amA3);
            			else if (ar == 4)
            			    admin.inscribirAlumno(nombreAlumnoNuevo, fDN, nDC, correo2, g7, amA4);
                            }catch (ExcepcionIDDuplicado e){
            			System.out.println(e.getMessage());
                            }
                            break;
            		case 6:
                            System.out.println("Ingresa el numero de cuenta del alumno que va a graduarse: ");
                            int tmpGraduado = sc.nextInt();
                            if(admin.existeAlumno(tmpGraduado)){
                                ArrayList<Alumno> alumnosTemp2 = admin.AlumnosInscritos();
                                for(Alumno a : alumnosTemp2){
                                    if(a.getNumeroDeCuenta() == tmpGraduado){
                                        admin.graduarAlumno(a);
                                        System.out.println(a.certificadoAlumno());
                                    }
                                }
                            }
                            break;
            		case 7:
                            System.out.println("Ingresa el numero de cuenta del alumno que va a ser dado de baja: ");
                            int tmpExpulsado = sc.nextInt();
                            if(admin.existeAlumno(tmpExpulsado)){
                                ArrayList<Alumno> alumnosTemp = admin.AlumnosInscritos();
                                for(Alumno a : alumnosTemp){
                                    if(a.getNumeroDeCuenta() == tmpExpulsado){
                                        admin.bajaAlumno(a);
                                        System.out.println("El alumno has sido dado de baja");
                                    }
                                }
                            }else{ 
                                System.out.println("El numero de cuenta no existe");
                            }
                            break;
            		case 8:
                            try{
                                
                                System.out.println("Selecciona una opción");
                                System.out.println("1. Contratar profesor de Asignatura" + "\n" + "2. Contratar profesor de Opcione técnica");
                                seleccion = sc.nextInt();
                                switch(seleccion){
                                    case 1:
                                        System.out.println("Ingresa el nombre: ");
                                        sc.next();
                                        String nombreProfesorNuevo = sc.nextLine();
                                        System.out.println("¿Que materia impartira?");
                                        System.out.println("1. Física" + "\n" +
                                                           "2. Matemáticas" + "\n" +
                                                           "3. Biologia" + "\n" +
                                                           "4. Quimica" + "\n" +
                                                           "5. Historia" + "\n" +
                                                           "6. Ciencias Sociales" + "\n" +
                                                           "7. Filosofia" + "\n" + 
                                                           "8. Artes Plasticas");
                                        seleccion = sc.nextInt();
                                        if(seleccion == 1)
                                            admin.contrataProfesorAsignatura(nombreProfesorNuevo, m1, g1);
                                        else if(seleccion == 2)
                                            admin.contrataProfesorAsignatura(nombreProfesorNuevo, m2, g1);
                                        else if (seleccion == 3)
                                            admin.contrataProfesorAsignatura(nombreProfesorNuevo, m3, g3);
                                        else if (seleccion == 4)
                                            admin.contrataProfesorAsignatura(nombreProfesorNuevo, m4, g3);
                                        else if (seleccion == 5)
                                            admin.contrataProfesorAsignatura(nombreProfesorNuevo, m5, g5);
                                        else if (seleccion == 6)
                                            admin.contrataProfesorAsignatura(nombreProfesorNuevo, m6, g5);
                                        else if (seleccion == 7)
                                            admin.contrataProfesorAsignatura(nombreProfesorNuevo, m7, g7);
                                        else if (seleccion == 8)
                                            admin.contrataProfesorAsignatura(nombreProfesorNuevo, m8, g7);
                                        else
                                            System.out.println("Selecciona una opción válida");
                                        break;
                                        

                                    case 2:
                                        System.out.println("Ingresa el nombre: ");
                                        String nombreProfesorNuevo2 = sc.nextLine();
                                        System.out.println("¿Que opcion técnica impartira?");
                                        System.out.println("1. Agente de viajes y hotelería" + "\n" +
                                                           "2. Fotógrafo, Laboratorista y Prensa" + "\n" +
                                                           "3. Nutriologia" + "\n" +
                                                           "4. Laboratorista Químico");
                                        seleccion = sc.nextInt();
                                        if(seleccion == 1)
                                            admin.contrataProfesorOpcionTecnica(nombreProfesorNuevo2, agente);
                                        else if(seleccion == 2)
                                            admin.contrataProfesorOpcionTecnica(nombreProfesorNuevo2, fotografo);
                                        else if(seleccion == 3)
                                            admin.contrataProfesorOpcionTecnica(nombreProfesorNuevo2, nutriologia);
                                        else if(seleccion == 4)
                                            admin.contrataProfesorOpcionTecnica(nombreProfesorNuevo2, laboratorista);
                                        else
                                            System.out.println("Selecciona una opción válida");
                                        break;
                                }
                                
                            }catch(ArrayIndexOutOfBoundsException e){
                                    System.out.println("Ya no puedes contratar mas profesores!");
                            }
                            break;
                         
            		case 9:
                            //Aqui truena bien hermoso cuando le paso un id > 1
                            int tmpDespedido;
                            System.out.println("Selecciona una opcion: ");
                            System.out.println("1. Profesor de Asignatura" + "\n" + "2. Profesor de opcion Técnica");
                            seleccion = sc.nextInt();
                            switch(seleccion){
                                case 1:
                                    System.out.println("Ingresa el id del profesor que despediras: ");
                                    tmpDespedido = sc.nextInt();
                                    profesorAsignaturaTemporal = admin.getProfesorAsignaturaPorID(tmpDespedido);
                                    admin.despedirProfesorAsignatura(profesorAsignaturaTemporal);
                                    System.out.println("El profesor ha sido despedido, ¡Adios!");
                                    break;
                                case 2:
                                    System.out.println("Ingresa el id del profesor que despediras: ");
                                    tmpDespedido = sc.nextInt();
                                    profesorOpcionTecnicaTemporal = admin.getProfesorOpcionTecnicaPorID(tmpDespedido);
                                    admin.despedirProfesorOpcionTecnica(profesorOpcionTecnicaTemporal);
                                    System.out.println("El profesor ha sido despedido, ¡Adios!");
                                
                            }
                            break;
                    }
                    break;
                    
    		case 2:
                    System.out.println("Selecciona una opción: ");
                    System.out.println("1. Profesor de Asignatura" + "\n" + "2. Profesor de opcion Técnica" + "\n" + "0. Para salir");
                    seleccion = sc.nextInt();
                    switch(seleccion){
                        case 1:
                            System.out.println("Ingresa tu id: ");
                            int idProfesorUsuario = sc.nextInt();
                            if(admin.existeProfesorAsignatura(idProfesorUsuario)){
                                profesorAsignaturaTemporal = admin.getProfesorAsignaturaPorID(idProfesorUsuario);
                                System.out.println("¿Qué deseas hacer?");
                                System.out.println("1. Consultar información de mi grupo" + "\n" +
            				       "2. Asignar calificación a un alumno" + "\n" + 
                                               "0. Para salir");
                            
                            seleccion = sc.nextInt();
                                    switch(seleccion){
                                        case 1:
                                            System.out.println(profesorAsignaturaTemporal.consultaInformacionGrupo());
                                            break;
					case 2:
                                            System.out.println("Introduce el número de cuenta del alumno: ");
                                            int noCuentaAlumnoCalif = sc.nextInt();
                                            if(admin.existeAlumno(noCuentaAlumnoCalif)){
                                                ArrayList<Alumno> alumnosGrupoProfesor = profesorAsignaturaTemporal.getGrupo().getAlumnos();
                                                for(Alumno a : alumnosGrupoProfesor){
                                                    if(a.getNumeroDeCuenta() == noCuentaAlumnoCalif){
                                                        System.out.println("Ingresa la calificación correspondiente en formato entero");
                                                        int califAsignada = sc.nextInt();
                                                        profesorAsignaturaTemporal.asignarCalificacion(profesorAsignaturaTemporal, a, califAsignada);
                                                        System.out.println("Calificación Asignada :)");
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            System.out.println("Hasta luego!");
                                    }
                            break;
                            }else{
                                System.out.println("El profesor no existe");
                            }
   			case 2:
                            System.out.println("Ingresa tu id: ");
                            int idProfesorUsuarioOT = sc.nextInt();
                            profesorOpcionTecnicaTemporal = admin.getProfesorOpcionTecnicaPorID(idProfesorUsuarioOT);
                                    System.out.println("¿Qué deseas hacer?");
                                    System.out.println("1. Consultar información de mi grupo" + "\n" +
            				               "2. Asignar calificación a un alumno");
                                    seleccion = sc.nextInt();
                                    switch(seleccion){
                                        case 1:
                                            System.out.println(profesorOpcionTecnicaTemporal.consultaInformacionGrupo());
                                            break;
					case 2:
                                            System.out.println("Introduce el número de cuenta del alumno: ");
                                            int noCuentaAlumnoCalif = sc.nextInt();
                                            if(admin.existeAlumno(noCuentaAlumnoCalif)){
                                                ArrayList<Alumno> alumnosOTProfesor = profesorOpcionTecnicaTemporal.getOpcionTecnica().alumnosInscritos();
                                                for(Alumno a : alumnosOTProfesor){
                                                    if(a.getNumeroDeCuenta() == noCuentaAlumnoCalif){
                                                        System.out.println("Ingresa la calificación correspondiente en formato entero");
                                                        int califAsignada = sc.nextInt();
                                                        profesorOpcionTecnicaTemporal.asignarCalificacion(profesorOpcionTecnicaTemporal, a, califAsignada);
                                                        System.out.println("Calificación Asignada :)");
                                                    }
                                                }
                                            }else{
                                                System.out.println("El alumno no existe");
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                            break;
                    }
                    break;
                    
    		case 3:
                    System.out.println("Por favor, ingresa tu número de cuenta: ");
                    int numCuentaUsuario = sc.nextInt();
                    if(admin.existeAlumno(numCuentaUsuario)){
                        ArrayList<Alumno> laMemoriaEsBarata = admin.AlumnosInscritos();
                        for(Alumno a: laMemoriaEsBarata){
                            if(a.getNumeroDeCuenta() == numCuentaUsuario){
                                System.out.println("¿Que deseas hacer?");
                                System.out.println("1. Consultar mis calificaciones" + "\n" +
                                                   "2. Consultar mi promedio" + "\n" +
                                                   "3. Inscribirme a una opciín técnica" + "\n" +
                                                   "4. Ver certificado" + "\n" +
                                                   "0. Para salir");
                                seleccion = sc.nextInt();
                                switch(seleccion){
                                    case 1:
                                        System.out.println(a.getCalificaciones());
                                        break;
                                    case 2:
                                        System.out.println(a.getPromedio());
                                        break;
                                    case 3:
                                        System.out.println("Selecciona la opcion deseada" + "\n" +
                                                           "1: Agente de viajes y hoteleria" + "\n" +
                                                           "2: Fotografo, laboratorista y prensa" + "\n" +
                                                           "3: Nutriologia" + "\n" +
                                                           "4: Laboratorista Quimico" + "\n" +
                                                           "0: salir");
                                        seleccion = sc.nextInt();
                                        if(seleccion == 1){
                                            a.inscribirOpcionTecnica(agente);
                                            System.out.println("Carrera inscrita!");
                                        }
                                        else if (seleccion == 2){
                                            a.inscribirOpcionTecnica(fotografo);
                                            System.out.println("Carrera inscrita!");
                                        }
                                        else if(seleccion == 3){
                                            a.inscribirOpcionTecnica(nutriologia);
                                            System.out.println("Carrera inscrita!");
                                        }
                                        else if (seleccion == 4){
                                            a.inscribirOpcionTecnica(laboratorista);
                                            System.out.println("Carrera inscrita!");
                                        }
                                        else if(seleccion > 4)
                                            System.out.println("Selecciona una opción válida");
                                        else
                                            System.out.println("Adiós...");
                                        break;                                             
                                    case 4:
                                        System.out.println(a.certificadoAlumno());
                                }
                            }
                        }
                    }
                    System.out.println("Este numero de cuenta no existe, intentalo otra vez");
            }
        }
        while(seleccionInicial > 0);
        System.out.println("¡Adios!");
    }
}
