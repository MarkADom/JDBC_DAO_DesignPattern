package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    /*
     * Class will expose a method that returns the interface type,
     * but internally it will instantiate an implementation.
     */

    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
}
