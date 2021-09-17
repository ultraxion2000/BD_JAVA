package DB;

public class UserDto {

    private int id;
    private String login;
    private String password;
    private String name;
    private String surname;
    private String patronomic;
    private String phone;
    private String e_mail;

    public UserDto() {
    }

    public UserDto(int id, String login, String password, String name, String surname, String patronomic, String phone, String e_mail) {
        

 setId(id);

   setLogin(login);

  setPassword(password);

   setName(name);

  setSurname( surname);

    setPatronomic( patronomic);

    setPhone(phone);

   setE_mail(e_mail);
}
        
public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronomic(String patronomic) {
        this.patronomic = patronomic;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronomic() {
        return patronomic;
    }

    public String getPhone() {
        return phone;
    }

    public String getE_mail() {
        return e_mail;
    }

}
