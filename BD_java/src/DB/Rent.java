package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class Rent {

    private Connection connect;

    public Rent(Connection connect) {
        this.connect = connect;
    }

    public void CreateTable() {

        try {
            Statement st = connect.createStatement();
            st.execute("create table \"rent_of_premoses\" (id INT NOT NULL PRIMARY KEY, price INT)");

        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void DropTable() throws SQLException 
    {
        try
        {
            Statement st = connect.createStatement();
            st.execute("DROP TABLE IF EXISTS rent_of_premoses CASCADE;");

        }catch (SQLException ex) {
             throw ex;
        }
    }

    public void FillingTableRent(RentDto Rent) {
        try {
            Statement st = connect.createStatement();

            st.execute("INSERT INTO rent_of_premoses( id, price) VALUES (" + Rent.GetId() + "," + Rent.GetPrice() + ")");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet Getinfo() throws SQLException {
        ResultSet rs = null;
        try {
            Statement st = connect.createStatement();
            rs = st.executeQuery("Select * From rent_of_premoses");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;

    }

}
