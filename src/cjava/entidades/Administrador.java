package cjava.entidades;

/**
 *
 * @author CJAVAPERU
 */
public class Administrador extends Empleado{
    private String area;

    public Administrador(String area, int id, String nombre, double sueldo) {
        super(id, nombre, sueldo);
        this.area = area;
    }

    public Administrador() {
    }

    @Override
    public String toString() {
        return "Administrador{" + super.toString() + "area=" + area + '}';
    }
      
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
}
