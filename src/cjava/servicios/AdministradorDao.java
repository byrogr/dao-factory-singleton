package cjava.servicios;

import cjava.entidades.Administrador;
import java.util.List;

public interface AdministradorDao {
    public void create(Administrador administrador);
    public void update(Administrador administrador);
    public void delete(int id);
    public Administrador find(int id);
    public List<Administrador> findAll();
}
