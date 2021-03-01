package Controler;

public class Client {
public String login ;
private String password;
private String adresse;
private int num;
private String email;

    public Client(String login, String password, String adresse, int num, String email) {
        this.login = login;
        this.password = password;
        this.adresse = adresse;
        this.num = num;
        this.email = email;
    }
    
    public Client() {
    }

    public String getLogin() {
        return login;
    }



    public String getPassword() {
        return password;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNum() {
        return num;
    }

    public String getEmail() {
        return email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}