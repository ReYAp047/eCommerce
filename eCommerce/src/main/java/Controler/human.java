package Controler;

public class human {
protected String login ;
protected int num;
protected String email;
public String name;

    public human() {
    }

    public human(String login, int num, String email, String name) {
        this.login = login;
        this.num = num;
        this.email = email;
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public int getNum() {
        return num;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }


}
