package cjava.pruebas;

import cjava.daos.AdministradorDaoFactory;
import cjava.entidades.Administrador;
import cjava.servicios.AdministradorDao;
import static cjava.util.TipoGrabado.*;

public class Prueba01 {


    public static void main(String[] args) {
        Administrador admin = new Administrador("marketing",100,"juan",3000);
        AdministradorDaoFactory fabrica = AdministradorDaoFactory.getInstancia();
        AdministradorDao dao = fabrica.getAdminitradorDao(XML);
        
        dao.create(admin);
        
    }
    
}
