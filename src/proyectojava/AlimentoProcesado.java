
package proyectojava;

import java.io.Serializable;
import java.util.Date;

public class AlimentoProcesado extends Alimento implements Serializable{
    private String listaIngredientes;

    public AlimentoProcesado(String codigo, String nombre, double proteinasPorCienGramos, double carbohidratosPorCienGramos, double grasasPorCienGramos, Date fechaCreacion, String listaIngredientes) {
        super(codigo, nombre, proteinasPorCienGramos, carbohidratosPorCienGramos, grasasPorCienGramos, fechaCreacion);
        this.listaIngredientes = listaIngredientes;
    }

    // Getters y setters

    public String getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(String listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    @Override
    public String toString() {
        return super.toString()+ "AlimentoProcesado{" + "listaIngredientes=" + listaIngredientes + '}';
    }
    
    
}