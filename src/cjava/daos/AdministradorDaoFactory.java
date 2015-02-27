package cjava.daos;

import cjava.servicios.AdministradorDao;
import static cjava.util.Constantes.*;

public final class AdministradorDaoFactory {
    
    private static AdministradorDaoFactory instancia;
    
    private AdministradorDaoFactory(){
    }
    
    public AdministradorDao getAdminitradorDao(int tipo){
        AdministradorDao dao=null;
        switch(tipo){
            case MEM:dao=new AdministradorDaoMemory();break;
            case FIL:dao=new AdministradorDaoFile();break;
            case XML:dao=new AdministradorDaoXml();break;
            case JDB:dao=new AdministradorDaoJdbc();break;
            case XLS:dao=new AdministradorDaoXLS();break;
        }
        return dao;
    }
    
    public static AdministradorDaoFactory getInstancia(){
        if(instancia==null)
            instancia = new AdministradorDaoFactory();
        return instancia;
    }
}
