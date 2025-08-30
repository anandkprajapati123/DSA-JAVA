import java.util.*;
class Product {
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();
        // Adding Products
        productList.add(new Product(1, "HONOR Laptop", 42000f));
        productList.add(new Product(2, "Dell Laptop", 40000f)); 
        productList.add(new Product(3, "Lenevo Laptop", 28000f));
        productList.add(new Product(4, "HP Laptop", 28000f));
        long count = productList.stream().filter(product -> product.price > 30000).count(); 
        System.out.println("Number of products with price > 30000: " + count);
    }
}
