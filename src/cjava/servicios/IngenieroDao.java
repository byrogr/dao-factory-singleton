package cjava.servicios;

import cjava.entidades.Ingeniero;
import java.util.List;

/**
 *
 * @author CJAVAPERU
 */
public interface IngenieroDao {
    public void create(Ingeniero ingeniero);
    public void update(Ingeniero ingeniero);
    public void delete(int id);
    public Ingeniero find(int id);
    public List<Ingeniero> findAll();
}