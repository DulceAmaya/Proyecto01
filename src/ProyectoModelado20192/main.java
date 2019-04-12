/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package ProyectoModelado20192;

import java.util.Scanner;
import proyectoescuela.*;
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
import proyectoescuela.materia.Materia;
import proyectoescuela.materia.MateriaArea1;
import proyectoescuela.materia.MateriaArea2;
import proyectoescuela.materia.MateriaArea3;
import proyectoescuela.materia.MateriaArea4;
import proyectoescuela.materia.Quimica;
import proyectoescuela.opciontecnica.AgenteViajes;
import proyectoescuela.opciontecnica.ExcepcionOpcionTecnicaInvalida;
import proyectoescuela.opciontecnica.FabricaOpcionTecnica;
import proyectoescuela.opciontecnica.OpcionTecnica;
import proyectoescuela.profesor.ProfesorAsignatura;
import proyectoescuela.profesor.ProfesorOpcionTecnica;



/**
 * Clase main para manejar el sistema por consola
 * @author josel
 */
public class main {
    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);
        int seleccion;
        String texto;
        String f1 = "AgenteViajes";
        String f2 = "Nutriologia";
        String f3 = "Laboratorista";
        String f4 = "Fotografia";
        
        //Opciones Tecnicas
        try{
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
            
            
        }catch(ExcepcionOpcionTecnicaInvalida e){
            
        }
        
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
        
        Alumno a5 = new Alumno("Mei", "29-08-1998", 325647890, "Mei@Gmail.com", g2, amA1);
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
        
        
        
        
        System.out.println("Bienvenido al proyecto 1 de modelado | Alumnos: Amaya fernanda, Lechuga Eduardo | 2019-2");
        System.out.println("Selecciona como deseas entrar al sistema: "
                + "\n1 Administrador"
                + "\n2 Profesor"
                + "\n3 Alumno"
                + "\n4 Salir");
        seleccion = sc.nextInt();
        
        switch(seleccion){
            case 1:
                
            case 2:
                
            case 3:
                
            default:
                System.out.println("Hasta luego!");
        }
    }
    
}
