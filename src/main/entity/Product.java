package src.main.entity;

public class Product {

    private String name;

    private String factory;

    private Double price;

    public Product() {}

    public Product(String name, String factory, Double price) {
        this.name = name;
        this.factory = factory;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", factory='" + factory + '\'' +
                ", price=" + price +
                '}';
    }
}
