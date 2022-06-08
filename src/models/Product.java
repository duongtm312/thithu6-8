package models;

public class Product {
    private String idName;
    private String name;
    private double price;
    private int amount;
    private String describe;

    public Product(String idName, String name, double price, int amount, String describe) {
        this.idName = idName;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.describe = describe;
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
