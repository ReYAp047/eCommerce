
package Controler;
public class Dealer {
private String loginV;
public String  nameV;
private int  numV;
private String  emailV;

    public Dealer(String loginV, String nameV, int numV, String emailV) {
        this.loginV = loginV;
        this.nameV = nameV;
        this.numV = numV;
        this.emailV = emailV;
    }

    public Dealer() {
    }

    public String getLoginV() {
        return loginV;
    }

    public String getNameV() {
        return nameV;
    }

    public int getNumV() {
        return numV;
    }

    public String getEmailV() {
        return emailV;
    }

    public void setLoginV(String loginV) {
        this.loginV = loginV;
    }

    public void setNameV(String nameV) {
        this.nameV = nameV;
    }

    public void setNumV(int numV) {
        this.numV = numV;
    }

    public void setEmailV(String emailV) {
        this.emailV = emailV;
    }
    
}
