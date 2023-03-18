package productjavaprojects;

public class Product {
    
    private String name;
    private String description;
    private float price;

    public Product () {

    }

    public Product (String name, String description, float price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

}