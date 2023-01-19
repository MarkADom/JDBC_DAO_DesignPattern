package model.dao;

import model.entities.Seller;
import java.util.List;

public interface SellerDao {

    //Operation responsible for inserting the object into the database, when sent as a parameter.
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findByID(Integer id);

    //findAll(): return all sellers, using a List
    List<Seller> findAll();
}
