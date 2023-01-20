# JDBC DAO Design Pattern 
##This Repositoy is made for study and to be add to my personal Library of Implementation

The Data Access Object (DAO) pattern is a structural pattern that allows us to isolate the application/business 
layer from the persistence layer (usually a relational database but could be any other persistence mechanism) 
using an abstract API.

The API hides from the application all the complexity of performing CRUD operations in the underlying storage mechanism. 
This permits both layers to evolve separately without knowing anything about each other.

In this tutorial, we'll take a deep dive into the pattern's implementation, and we'll learn how to use it for abstracting 
calls to a JPA entity manager.
