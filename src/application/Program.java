package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {


        /*
           Calling Daofactory,that way my program doesn't know the implementation.
           He only knows the interface and also a way for us to do a dependency
           injection without specifying the implementation.
         */

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("==== TEST 1: seller findById ====");

        Seller seller = sellerDao.findByID(3);
        System.out.println(seller);

    }
}
