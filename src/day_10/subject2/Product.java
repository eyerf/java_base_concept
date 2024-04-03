package day_10.subject2;

public class Product {
    private int id;
    private String name;
    private int price;
    private int storedNumber;

    public Product() {
    }

    public Product(int id, String name, int price, int storedNumber) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.storedNumber = storedNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStoredNumber() {
        return storedNumber;
    }

    public void setStoredNumber(int storedNumber) {
        this.storedNumber = storedNumber;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", storedNumber=" + storedNumber +
                '}';
    }
}
