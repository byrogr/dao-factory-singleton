package cjava.daos;

import cjava.entidades.Ingeniero;
import cjava.servicios.IngenieroDao;
import java.util.List;
/**
 *
 * @author CJAVAPERU
 */
public class IngenieroDaoJdbc implements IngenieroDao {

    @Override
    public void create(Ingeniero ingeniero) {
        System.out.println("grabando datos en base de datos");
    }

    @Override
    public void update(Ingeniero ingeniero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ingeniero find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ingeniero> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
