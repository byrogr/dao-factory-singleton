package cjava.entidades;

/**
 *
 * @author CJAVAPERU
 */
public class Ingeniero extends Empleado{
    private int colegiatura;

    public Ingeniero(int colegiatura, int id, String nombre, double sueldo) {
        super(id, nombre, sueldo);
        this.colegiatura = colegiatura;
    }

    public Ingeniero() {
    }

    @Override
    public String toString() {
        return "Ingeniero{" + super.toString() + "colegiatura=" + colegiatura + '}';
    }
    
    public int getColegiatura() {
        return colegiatura;
    }

    public void setColegiatura(int colegiatura) {
        this.colegiatura = colegiatura;
    }
    
    
}
