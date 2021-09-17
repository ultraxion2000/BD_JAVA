package db_lab1;

import DB.*;
import Window.*;
import java.sql.SQLException;

public class ShopingDB {

    public static void main(String[] args) throws SQLException {
        
      
        
        
        
        ControllerDB controller = new ControllerDB();
       //controller.DropTables();
       // controller.CreateTable();
        //controller.FillTable();
        
        
        
        
       MainWindow window = new MainWindow();
        
        window.setVisible(true);
        
        
        
        
        

    }

}
