# JDBC DAO Design Pattern 
This Project is made for study and to be added to my personal Library of Implementations.

##  Description  

#### JDBC
The JDBC API is a Java API that can access any kind of tabular data, especially data stored in a relational database.
JDBC helps you to write Java applications that manage these three programming activities:

  - Connect to a data source, like a database

  - Send queries and update statements to the database
  
  - Retrieve and process the results received from the database in answer to your query

#### DAO
The Data Access Object (DAO) pattern is a structural pattern that allows us to isolate the application/business 
layer from the persistence layer (usually a relational database but could be any other persistence mechanism) 
using an abstract API.
The API hides from the application all the complexity of performing CRUD operations in the underlying storage mechanism. 
This permits both layers to evolve separately without knowing anything about each other.

## Project Description
A small system of sales people and departments.

This program will access database and will allow you to manipulate the information contained in the tables and access the data by making insertions, data recovery, updates.

## What you need
 - Create a dataBase on mySQL or other similar. You can use the script `database.sql` in folder `resouces` to create database.
After date use the file `db.properties` to insert the correct info, your data base user, password and in the `dburl=jdbc:mysql://localhost:3306/jdbc` 
you only need to sustitute `jdbc` for the name of your data base.

 - You need to install the Java Connecor/J, import `mysql-connector-j-8.0.32` to your user library
https://dev.mysql.com/downloads/connector/j/?os=26

 
 ## Project structure
 
 - Package `DB`:
      - DB class 
      - DBException: personalized exception.
      - DBIntegretyException: personalized exception

 - Package `model.entities`
      - Departement class
      - Seller class
 
 - Package `model.dao`:
      - DaoFactory class
      - DepartmentDao Interface
      - SellerDao Interface

 - Package `model.dao.impl`:
      - DepartmentDaoJDBC    
      - SellerDaoJDBC

 - Package `application`:
      - Program: tests for the Seller implementation
      - Program2: tests for the Department implementation
      

