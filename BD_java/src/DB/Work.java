
 
package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class Work {
    private Connection connect;

    public Work(Connection connect) {
        this.connect = connect;
    }
     public void CreateTable() {

        try {
            Statement st = connect.createStatement();
            
            st.execute("create table \"work\" (id_user INT REFERENCES users (id), id_work INT REFERENCES work_es (id))");
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     public void DropTable() 
    {
        try
        {
            Statement st = connect.createStatement();
            st.execute("DROP TABLE IF EXISTS work CASCADE;");

        }catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   public void FillingTableWork(WorkDto Work) throws SQLException {
     try {
            Statement st = connect.createStatement();            
            st.execute("INSERT INTO work(id_user,id_work) VALUES ("+Work.getId_user()+","+Work.getId_work()+")");           
        } catch (SQLException ex) {
             throw ex;
        }
     
     
     }   
       public ResultSet Getinfo() throws SQLException{
        ResultSet rs = null;
     try {
            Statement st = connect.createStatement();
            rs = st.executeQuery("Select * From work");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
   
     return rs;
     
      
    } 
    
}
