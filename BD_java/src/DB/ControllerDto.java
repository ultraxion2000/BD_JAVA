package DB;

import java.io.*;
import java.sql.*;
import java.util.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControllerDto {

    public List<RentDto> ListRent = new ArrayList<RentDto>();
    public List<ShopDto> ListShop = new ArrayList<ShopDto>();
    public List<UserDto> ListUser = new ArrayList<UserDto>();
    public List<WorkDto> ListWork = new ArrayList<WorkDto>();
    public List<Work_ESDto> ListWork_ES = new ArrayList<Work_ESDto>();
    private Connect connect = new Connect();

    public void LoadListRent() throws SQLException {

        Rent rent = new Rent(connect.GetConnection());

        ResultSet rs = rent.Getinfo();
        while (rs.next()) {
            RentDto rentdto = new RentDto();
            rentdto.SetId(rs.getInt("id"));
            rentdto.SetPrice(rs.getInt("price"));
            ListRent.add(rentdto);
        }

    }

    public void LoadListShop() throws SQLException {
        Shop shop = new Shop(connect.GetConnection());

        ResultSet rs = shop.Getinfo();
        while (rs.next()) {
            ShopDto shopdto = new ShopDto();
            shopdto.SetId(rs.getInt("id"));
            shopdto.SetName_Shop(rs.getString("name_shop"));
            shopdto.SetRoom_id(rs.getInt("room_id"));
            shopdto.SetUser_id(rs.getInt("user_id"));
            ListShop.add(shopdto);
        }
    }

    public void LoadListUser() throws SQLException {

        User user = new User(connect.GetConnection());

        ResultSet rs = user.Getinfo();

        while (rs.next()) {
            UserDto userdto = new UserDto();
            userdto.setId(rs.getInt("id"));

            userdto.setLogin(rs.getString("login"));
            userdto.setPassword(rs.getString("password"));
            userdto.setName(rs.getString("name"));
            userdto.setSurname(rs.getString("surname"));
            userdto.setPatronomic(rs.getString("patronomic"));
            userdto.setPhone(rs.getString("phone"));
            userdto.setE_mail(rs.getString("e_mail"));
            ListUser.add(userdto);

        }

    }

    public void LoadListWork() throws SQLException {
        Work work = new Work(connect.GetConnection());

        ResultSet rs = work.Getinfo();
        while (rs.next()) {
            WorkDto workdto = new WorkDto();

            workdto.setId_user(rs.getInt("id_user"));
            workdto.setId_work(rs.getInt("id_work"));
            ListWork.add(workdto);
        }
    }

    public void LoadListWork_ES() throws SQLException {
        Work_ES work_es = new Work_ES(connect.GetConnection());

        ResultSet rs = work_es.Getinfo();
        while (rs.next()) {
            Work_ESDto work_esdto = new Work_ESDto();
            work_esdto.setId(rs.getInt("id"));
            work_esdto.setSalary(rs.getInt("salary"));
            work_esdto.setName_work(rs.getString("name_work"));

            ListWork_ES.add(work_esdto);
        }
    }

    public List<UserDto> SaveUsers(DefaultTableModel table) {
        List<UserDto> SaveListUsers = new ArrayList<UserDto>();
        for (int i = 0; i < table.getRowCount(); i++) {
            UserDto userdto = new UserDto();

            userdto.setId((Integer) table.getValueAt(i, 0));
            userdto.setLogin((String) table.getValueAt(i, 1));
            userdto.setPassword((String) table.getValueAt(i, 2));
            userdto.setName((String) table.getValueAt(i, 3));
            userdto.setSurname((String) table.getValueAt(i, 4));
            userdto.setPatronomic((String) table.getValueAt(i, 5));
            userdto.setPhone((String) table.getValueAt(i, 6));
            userdto.setE_mail((String) table.getValueAt(i, 7));
            SaveListUsers.add(userdto);
        }
        return SaveListUsers;
    }

    public List<WorkDto> SaveWork(DefaultTableModel table) {
        List<WorkDto> SaveListWork = new ArrayList<WorkDto>();
        for (int i = 0; i < table.getRowCount(); i++) {
            WorkDto workdto = new WorkDto();

            workdto.setId_user((Integer) table.getValueAt(i, 0));
            workdto.setId_work((Integer) table.getValueAt(i, 1));
            SaveListWork.add(workdto);
        }
        return SaveListWork;
    }

    public List<RentDto> SaveRent(DefaultTableModel table) {
        List<RentDto> SaveListRent = new ArrayList<RentDto>();
        for (int i = 0; i < table.getRowCount(); i++) {
            RentDto rentdto = new RentDto();

            rentdto.SetId((Integer) table.getValueAt(i, 0));
            rentdto.SetPrice((Integer) table.getValueAt(i, 1));

            SaveListRent.add(rentdto);
        }
        return SaveListRent;
    }

    public List<Work_ESDto> SaveWork_ES(DefaultTableModel table) {
        List<Work_ESDto> SaveListWork_ES = new ArrayList<Work_ESDto>();
        for (int i = 0; i < table.getRowCount(); i++) {
            Work_ESDto work_esdto = new Work_ESDto();

            work_esdto.setId((Integer) table.getValueAt(i, 0));
            work_esdto.setSalary((Integer) table.getValueAt(i, 1));
            work_esdto.setName_work((String) table.getValueAt(i, 2));
            SaveListWork_ES.add(work_esdto);
        }
        return SaveListWork_ES;
    }

    public List<ShopDto> SaveShop(DefaultTableModel table) {
        List<ShopDto> SaveListShop = new ArrayList<ShopDto>();//"id", "Name Shop", "User_id", "Room_id"};
        for (int i = 0; i < table.getRowCount(); i++) {
            ShopDto shopdto = new ShopDto();

            shopdto.SetId((Integer) table.getValueAt(i, 0));
            shopdto.SetName_Shop((String) table.getValueAt(i, 1));
            shopdto.SetUser_id((Integer) table.getValueAt(i, 2));
            shopdto.SetRoom_id((Integer) table.getValueAt(i, 3));
            SaveListShop.add(shopdto);
        }
        return SaveListShop;
    }

    public void SavefileUser(DefaultTableModel table) {
        List<Object[]> FileListUsers = new ArrayList<Object[]>();
        for (int i = 0; i < table.getRowCount(); i++) {
            Object UserArray[] = new Object[8];
            UserArray[0] = (Integer) table.getValueAt(i, 0);
            UserArray[1] = (String) table.getValueAt(i, 1);

            UserArray[2] = (String) table.getValueAt(i, 2);
            UserArray[3] = (String) table.getValueAt(i, 3);
            UserArray[4] = (String) table.getValueAt(i, 4);
            UserArray[5] = (String) table.getValueAt(i, 5);
            UserArray[6] = (String) table.getValueAt(i, 6);
            UserArray[7] = (String) table.getValueAt(i, 7);
            FileListUsers.add(UserArray);
        }
        try {
            FileOutputStream outputStream = new FileOutputStream("Users.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(FileListUsers);
            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void SavefileShop(DefaultTableModel table) {
        List<Object[]> FileListShop = new ArrayList<Object[]>();
        for (int i = 0; i < table.getRowCount(); i++) {
            Object ShopArray[] = new Object[4];
            ShopArray[0] = (Integer) table.getValueAt(i, 0);
            ShopArray[1] = (String)table.getValueAt(i, 1);
            ShopArray[2] = (Integer) table.getValueAt(i, 2);
            ShopArray[3] = (Integer) table.getValueAt(i, 3);
            FileListShop.add(ShopArray);
        }
        try {
            FileOutputStream outputStream = new FileOutputStream("Shop.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(FileListShop);
            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void SavefileRent(DefaultTableModel table) {
        List<Object[]> FileListRent = new ArrayList<Object[]>();
        for (int i = 0; i < table.getRowCount(); i++) {
            Object RentArray[] = new Object[2];
            RentArray[0] = (Integer) table.getValueAt(i, 0);
            RentArray[1] = (Integer) table.getValueAt(i, 1);
            FileListRent.add(RentArray);

        }
        try {
            FileOutputStream outputStream = new FileOutputStream("Rent.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(FileListRent);
            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void SavefileWork(DefaultTableModel table) {
        List<Object[]> FileListWork = new ArrayList<Object[]>();
        for (int i = 0; i < table.getRowCount(); i++) {
            Object WorkArray[] = new Object[2];
            WorkArray[0] = (Integer) table.getValueAt(i, 0);
            WorkArray[1] = (Integer) table.getValueAt(i, 1);
            FileListWork.add(WorkArray);
        }
        try {
            FileOutputStream outputStream = new FileOutputStream("Work.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(FileListWork);
            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void SavefileWork_Es(DefaultTableModel table) {
        List<Object[]> FileListWork_Es = new ArrayList<Object[]>();
        for (int i = 0; i < table.getRowCount(); i++) {
            Object Work_ESArray[] = new Object[3];
            Work_ESArray[0] = (Integer) table.getValueAt(i, 0);
            Work_ESArray[1] = (Integer) table.getValueAt(i, 1);
            Work_ESArray[2] = (String) table.getValueAt(i, 2);
            FileListWork_Es.add(Work_ESArray);
        }
        try {
            FileOutputStream outputStream = new FileOutputStream("Work_Es.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(FileListWork_Es);
            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    
     public List<Object[]> loadFileUsers(){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("Users.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            System.out.println("Загрузка удалась");
            return (List<Object[]>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Загрузка не удалась");
        return null;
    }
     
       public List<Object[]> loadFileRent(){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("Rent.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            System.out.println("Загрузка удалась");
            return (List<Object[]>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Загрузка не удалась");
        return null;
    }
        public List<Object[]> loadFileShop(){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("Shop.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            System.out.println("Загрузка удалась");
            return (List<Object[]>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Загрузка не удалась");
        return null;
    }
         public List<Object[]> loadFileWork(){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("Work.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            System.out.println("Загрузка удалась");
            return (List<Object[]>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Загрузка не удалась");
        return null;
    }
          public List<Object[]> loadFileWork_ES(){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("Work_Es.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            System.out.println("Загрузка удалась");
            return (List<Object[]>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Загрузка не удалась");
        return null;
    }
    
    
}
