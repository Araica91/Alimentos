
package proyectojava;

import java.io.Serializable;
import java.util.Date;

public class AlimentoNatural extends Alimento implements Serializable {
    private String tipoAlimento;
    private Date fechaCreacion;

    public AlimentoNatural(String tipoAlimento, String codigo, String nombre, double proteinasPorCienGramos, double carbohidratosPorCienGramos, double grasasPorCienGramos, Date fechaCreacion) {
        super(codigo, nombre, proteinasPorCienGramos, carbohidratosPorCienGramos, grasasPorCienGramos, fechaCreacion);
        this.tipoAlimento = tipoAlimento;
        this.fechaCreacion = fechaCreacion;
    }

    // Getters y setters

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "AlimentoNatural{" + "tipoAlimento=" + tipoAlimento + ", fechaCreacion=" + fechaCreacion + '}';
    }

   
}


