package DB;

public class Work_ESDto {

   

 private int id;
    private int salary;
    private String name_work;
 public Work_ESDto(int id, int salary, String name_work) {
        this.id = id;
        this.salary = salary;
        this.name_work = name_work;
    }

    public Work_ESDto() {
    }
    public void setId(int id) {
        this.id = id;
    }

    
    public int getId() {
        return id;
    }
    public int getSalary() {
        return salary;
    }

    public String getName_work() {
        return name_work;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName_work(String name_work) {
        this.name_work = name_work;
    }
    
}
