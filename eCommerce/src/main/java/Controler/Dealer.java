
package Controler;
public class Dealer extends human {
    public Dealer() {
    }

    public Dealer(String login, int num, String email, String name) {
        super(login, num, email, name);
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