package cjava.pruebas;

import cjava.daos.IngenieroDaoFactory;
import cjava.entidades.Ingeniero;
import cjava.servicios.IngenieroDao;
import static cjava.util.TipoGrabado.*;

/**
 *
 * @author CJAVAPERU
 */
public class Prueba02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ingeniero ing = new Ingeniero(1, 100, "Roger Rojas", 4000);
        IngenieroDaoFactory fabrica = IngenieroDaoFactory.getInstancia();
        IngenieroDao dao = fabrica.getIngenieroDao(MEM);
        dao.create(ing);
    }
    
}
