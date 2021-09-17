package DB;



import java.io.Serializable;

public class DataException extends Exception implements Serializable {

    public DataException(String message){
        super(message);
    }

}
