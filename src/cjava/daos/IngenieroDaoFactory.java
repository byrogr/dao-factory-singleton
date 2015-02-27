package cjava.daos;

import cjava.servicios.IngenieroDao;
import static cjava.util.Constantes.*;
/**
 *
 * @author CJAVAPERU
 */
public final class IngenieroDaoFactory {
    
    private static IngenieroDaoFactory instancia;
    
    private IngenieroDaoFactory() {
    }
    
    public static IngenieroDao getIngenieroDao( int tipo ) {
        IngenieroDao dao = null;
        switch(tipo) {
            case FIL: dao = new IngenieroDaoFile(); break;
            case JDB: dao = new IngenieroDaoJdbc(); break;
            case MEM: dao = new IngenieroDaoMemory(); break;
            case XLS: dao = new IngenieroDaoXls(); break;
            case XML: dao = new IngenieroDaoXml(); break;
        }
        
        return dao;
    }
    
    public static IngenieroDaoFactory getInstancia() {
        if(instancia == null) {
            instancia = new IngenieroDaoFactory();
        }
        return instancia;
    }  
}
