package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Connect {

    private Connection connection;
    private Statement statement;
    private String url = "jdbc:postgresql://localhost:5432/";
    private String NameDB = "ShopingDB";
    private String user = "postgres";
    private String password = "admin";

    public Connect() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.getMessage();
        }
        try {
            connection = DriverManager.getConnection(url + NameDB, user, password);
          
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    
    
   public Statement GetStatment(){
   return this.statement;
   } 
   
   public Connection GetConnection(){
   return this.connection;
   } 
}
