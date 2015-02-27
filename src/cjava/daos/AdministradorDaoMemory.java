package cjava.daos;

import cjava.entidades.Administrador;
import cjava.servicios.AdministradorDao;
import java.util.ArrayList;
import java.util.List;

public class AdministradorDaoMemory implements AdministradorDao{

    private List<Administrador> lista;
    
    public AdministradorDaoMemory() {
        lista = new ArrayList<>();
    }
    
    @Override
    public void create(Administrador administrador) {
        System.out.println("grabando datos en memoria");
        lista.add(administrador);
    }

    @Override
    public void update(Administrador administrador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Administrador find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Administrador> findAll() {
        return lista;
        
    }
    
}
