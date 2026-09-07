
package proyectojava;

import java.io.Serializable;
import java.util.Date;

public abstract class Alimento implements Serializable {
    
    private String codigo;
    private String nombre;
    private double proteinasPorCienGramos;
    private double carbohidratosPorCienGramos;
    private double grasasPorCienGramos;
    private Date fechaCreacion;

    public Alimento(String codigo, String nombre, double proteinasPorCienGramos, double carbohidratosPorCienGramos, double grasasPorCienGramos, Date fechaCreacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.proteinasPorCienGramos = proteinasPorCienGramos;
        this.carbohidratosPorCienGramos = carbohidratosPorCienGramos;
        this.grasasPorCienGramos = grasasPorCienGramos;
        this.fechaCreacion = fechaCreacion;
    }

    // Getters y setters

    
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getProteinasPorCienGramos() {
        return proteinasPorCienGramos;
    }

    public double getCarbohidratosPorCienGramos() {
        return carbohidratosPorCienGramos;
    }

    public double getGrasasPorCienGramos() {
        return grasasPorCienGramos;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProteinasPorCienGramos(double proteinasPorCienGramos) {
        this.proteinasPorCienGramos = proteinasPorCienGramos;
    }

    public void setCarbohidratosPorCienGramos(double carbohidratosPorCienGramos) {
        this.carbohidratosPorCienGramos = carbohidratosPorCienGramos;
    }

    public void setGrasasPorCienGramos(double grasasPorCienGramos) {
        this.grasasPorCienGramos = grasasPorCienGramos;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return super.toString()+ "Alimento{" + "codigo=" + codigo + ", nombre=" + nombre + ", proteinasPorCienGramos=" + proteinasPorCienGramos + ", carbohidratosPorCienGramos=" + carbohidratosPorCienGramos + ", grasasPorCienGramos=" + grasasPorCienGramos + ", fechaCreacion=" + fechaCreacion + '}';
    }
    
    
}