package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);
        System.out.println(obj);
        System.out.println(seller);

        /*
           Calling Daofactory,that way my program doesn't know the implementation.
           He only knows the interface and also a way for us to do a dependency
           injection without specifying the implementation.
         */

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);


    }
}
