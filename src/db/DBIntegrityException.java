package db;

public class DBIntegrityException extends RuntimeException {

    /*
      Reference Integrity Error
      By default we can delete a department where exists sellers.
      To be able to specifically identify this type of error, we are
       going to create a personalized exception
     */

    public DBIntegrityException(String msg) {
        super(msg);
    }
}
