package constructor;

/**
 * Created by Asus on 2016/9/4.
 */
public class Product {
    private String name;
    private String description;

    public Product(String name, String description){
        this.name = name;
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
