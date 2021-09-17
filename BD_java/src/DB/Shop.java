
package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class Shop {
    private Connection connect;
    public Shop(Connection connect) {
        this.connect = connect;
    } 
    
     public void CreateTable() {

        try {
            Statement st = connect.createStatement();
            
            st.execute("create table \"shop\" (id INT NOT NULL PRIMARY KEY, name_shop VARCHAR(100),user_id INT REFERENCES users (id),room_id INT REFERENCES rent (id))");
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
      public void DropTable() 
    {
        try
        {
            Statement st = connect.createStatement();
            st.execute("DROP TABLE IF EXISTS shop CASCADE;");

        }catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
       public void FillingTableShop( ShopDto Shop) throws SQLException {
     try {
            Statement st = connect.createStatement();            
            st.execute("INSERT INTO shop(id, name_shop ,user_id,room_id) VALUES ("+Shop.GetId()+",'"+Shop.GetName_Shop()+"',"+Shop.GetUser_id()+","+Shop.GetRoom_id()+")");           
        } catch (SQLException ex) {
             throw ex;
        }
     }
       
        public ResultSet Getinfo() throws SQLException{
        ResultSet rs = null;
     try {
            Statement st = connect.createStatement();
            rs = st.executeQuery("Select * From shop");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
   
     return rs;
    
       
    }
}
