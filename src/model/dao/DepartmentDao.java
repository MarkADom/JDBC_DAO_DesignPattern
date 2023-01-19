package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDao {

    //Operation responsible for inserting the object into the database, when sent as a parameter.
    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findByID(Integer id);

    //findAll(): return all departments, using a List
    List<Department> findAll();

}
