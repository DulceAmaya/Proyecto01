/*
 *Modelado y Programacion | Proyecto 1 | 2019-2
 */
package proyectoescuela.opciontecnica;

/**
 * Clase del patron Factory para crear los distintos tipos de opciones tecnicas
 * @author josel
 */
public class FabricaOpcionTecnica {
    
    /**
     * Metodo estatico para elegir la opcion tecnica
     * @param tipo
     * @return
     * @throws ExcepcionOpcionTecnicaInvalida 
     */
    public static OpcionTecnica generaOpcionTecnica(String tipo){
        switch(tipo){
            case "AgenteViajes":
                return new AgenteViajes();
            case "Nutriologia":
                return new Nutriologia();
            case "Laboratorista":
                return new Laboratorista();
            case "Fotografia":
                return new Laboratorista();
        }
        return null;
    }
}
