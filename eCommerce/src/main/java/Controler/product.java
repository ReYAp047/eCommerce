package Controler;
public class product {
private int idP;
private String name;
private String category;
private int price;
private String description;
private int amoount;
private int idV;

    public product() {
    }

    public product(int idP, String name, String category, int price, String description, int amoount, int idV) {
        this.idP = idP;
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
        this.amoount = amoount;
        this.idV = idV;
    }

    public int getIdP() {
        return idP;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getAmoount() {
        return amoount;
    }

    public int getIdV() {
        return idV;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmoount(int amoount) {
        this.amoount = amoount;
    }

    public void setIdV(int idV) {
        this.idV = idV;
    }

}
