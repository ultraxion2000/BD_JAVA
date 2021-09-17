package DB;

public class WorkDto
{

   

 
    private int id_user;
    private int id_work;
 
 public WorkDto(int id_user, int id_work) {
        this.id_user = id_user;
        this.id_work = id_work;
    }

    public WorkDto() {
    }

    public int getId_user() {
        return id_user;
    }

    public int getId_work() {
        return id_work;
    }

 

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setId_work(int id_work) {
        this.id_work = id_work;
    }
    
}
