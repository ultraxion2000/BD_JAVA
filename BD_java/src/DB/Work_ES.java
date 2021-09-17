package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class Work_ES {
    private Connection connect;

    public Work_ES(Connection connect) {
        this.connect = connect;
    }
    
     public void CreateTable() {

        try {
            Statement st = connect.createStatement();
            
            st.execute("create table \"work_es\" (id INT NOT NULL PRIMARY KEY, salary INT NOT NULL, name_work VARCHAR(100))");
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }

    } 
     
     
       public void FillingTableWork_ES(Work_ESDto Work_ES) {
     try {
            Statement st = connect.createStatement();            
            st.execute("INSERT INTO work_es(id,salary, name_work ) VALUES ("+Work_ES.getId()+","+Work_ES.getSalary()+",'"+Work_ES.getName_work()+"');");           
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
       public void DropTable() throws SQLException 
    {
        try
        {
            Statement st = connect.createStatement();
            st.execute("DROP TABLE IF EXISTS work_es CASCADE;");

        }catch (SQLException ex) {
             throw ex;
        }
    } 
       
         public ResultSet Getinfo() throws SQLException{
        ResultSet rs = null;
     try {
            Statement st = connect.createStatement();
            rs = st.executeQuery("Select * From work_es");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
   
     return rs;
     
       
    }
}
