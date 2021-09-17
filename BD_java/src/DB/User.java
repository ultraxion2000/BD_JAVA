
package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class User {
   private Connection connect;

    public User(Connection connect) {
        this.connect = connect;
    }
     public void CreateTable() {

        try {
            Statement st = connect.createStatement();
            
            st.execute("create table \"users\" (id INT NOT NULL PRIMARY KEY ,login VARCHAR(100) NOT NULL,password VARCHAR(100) NOT NULL, name VARCHAR(100),surname VARCHAR(100),patronomic VARCHAR(100),phone VARCHAR(100),e_mail VARCHAR(100))");
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
      public void DropTable() 
    {
        try
        {
            Statement st = connect.createStatement();
            st.execute("DROP TABLE IF EXISTS users CASCADE;");

        }catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
      public void FillingTableUser(UserDto User) throws SQLException {
     try {
            Statement st = connect.createStatement();            
            st.execute("INSERT INTO users(id, login,password,name,surname,patronomic,phone,e_mail) VALUES ("+User.getId()+",'"+User.getLogin()+"','"+User.getPassword()+"','"+User.getName()+"','"+User.getSurname()+"','"+User.getPatronomic()+"','"+User.getPhone()+"','"+User.getE_mail()+"')");           
        } catch (SQLException ex) {
             throw ex;
        }
     }
      
          public ResultSet Getinfo() throws SQLException{
        ResultSet rs = null;
     try {
            Statement st = connect.createStatement();
            rs = st.executeQuery("Select * From users");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
   

     return rs;

    }
      
      
}
