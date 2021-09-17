
package DB;

import java.sql.*;
import java.beans.Statement;


public class ControllerDB {
    Connect connect;
    Rent rent;
    Shop shop;
    User user;
    Work work;
    Work_ES work_es;
    public ControllerDB(){
    connect = new Connect();
    rent = new Rent(connect.GetConnection());
    shop = new Shop(connect.GetConnection());
    user = new User(connect.GetConnection());
    work = new Work(connect.GetConnection());
    work_es = new Work_ES(connect.GetConnection());
    } 
    
    public void CreateTable()  
    {
    user.CreateTable();
    rent.CreateTable();
    work_es.CreateTable();
    shop.CreateTable();
    work.CreateTable();
    }
     
    public void FillTable() throws SQLException{
        UserDto admin= new UserDto(1,"admin", "admin", "sasha", null, null, null, null);
        user.FillingTableUser(admin);
        UserDto user1dto= new UserDto(2,"user1", "user1", "lesha", null, null, null, null);
        user.FillingTableUser(user1dto);
        UserDto user2dto= new UserDto(3,"user2", "user2", "Dima", null, null, null, null);
        user.FillingTableUser(user2dto);
        UserDto user3dto= new UserDto(4,"user3", "user3", "Danya", null, null, null, null);
        user.FillingTableUser(user3dto);
        UserDto user4dto= new UserDto(5,"user4", "user4", "Misha", null, null, null, null);
        user.FillingTableUser(user4dto);
      
        RentDto rent1= new RentDto(1,1000);
        rent.FillingTableRent(rent1);
        RentDto rent5= new RentDto(2,2000);
        rent.FillingTableRent(rent5);
        RentDto rent2= new RentDto(3,3000);
        rent.FillingTableRent(rent2);
        RentDto rent3= new RentDto(4,4000);
        rent.FillingTableRent(rent3);
        RentDto rent4= new RentDto(5,5000);
        rent.FillingTableRent(rent4);
       
        Work_ESDto workes1= new Work_ESDto(1,500,"Уборшик");
        work_es.FillingTableWork_ES(workes1);
        Work_ESDto workes2= new Work_ESDto(2,700,"Грузчик");
        work_es.FillingTableWork_ES(workes2);
        Work_ESDto workes3= new Work_ESDto(3,1000,"Менеджер");
        work_es.FillingTableWork_ES(workes3);
        Work_ESDto workes4= new Work_ESDto(4,900,"Продавец");
        work_es.FillingTableWork_ES(workes4);
        Work_ESDto workes5= new Work_ESDto(5,2000,"Директор");
        work_es.FillingTableWork_ES(workes5);
        
        ShopDto shop1 =new ShopDto(6,"Спортмастер", 1, 1);
        shop.FillingTableShop(shop1);
        ShopDto shop2 =new ShopDto(2,"34Play", 1, 2);
        shop.FillingTableShop(shop2);
        ShopDto shop3 =new ShopDto(3,"Nike", 1, 3);
        shop.FillingTableShop(shop3);
        ShopDto shop4 =new ShopDto(4,"Аутлет", 2, 4);
        shop.FillingTableShop(shop4);
        ShopDto shop5 =new ShopDto(5,"Adidas", 3, 5);
        shop.FillingTableShop(shop5);
       
        WorkDto work1 = new WorkDto(1, 5);
        work.FillingTableWork(work1);
        WorkDto work2 = new WorkDto(2, 2);
        work.FillingTableWork(work2);
        WorkDto work3 = new WorkDto(3, 3);
        work.FillingTableWork(work3);
        WorkDto work4 = new WorkDto(3, 3);
        work.FillingTableWork(work4);
        WorkDto work5 = new WorkDto(4, 1);
        work.FillingTableWork(work5);
    
    }
    
    
    public void DropTables() throws SQLException {
       shop.DropTable();
       work.DropTable();
       user.DropTable();
       work_es.DropTable();
       rent.DropTable();
      
    }
}
