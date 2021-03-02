package Controler;

public class Client extends human{
protected String adresse;

    public Client(String adresse) {
        this.adresse = adresse;
    }

    public Client(String adresse, String login, int num, String email, String name) {
        super(login, num, email, name);
        this.adresse = adresse;
    }

    public Client() {
    }

    public String getAdresse() {
        return adresse;
    }
@Override
    public String getLogin() {
        return login;
    }
@Override
    public int getNum() {
        return num;
    }
@Override
    public String getEmail() {
        return email;
    }
@Override
    public String getName() {
        return name;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
@Override
    public void setLogin(String login) {
        this.login = login;
    }
@Override
    public void setNum(int num) {
        this.num = num;
    }
@Override
    public void setEmail(String email) {
        this.email = email;
    }
@Override
    public void setName(String name) {
        this.name = name;
    }



}