// Getter and Setter methods
// Getter and Setter methods are used to access and update the private variables of a class.

class Product{
    private int id;
    private String name;
    private double price;

    public Product(int i,String n,double p){
        id=i;
        name=n;
        price=p;
    }

    public void setId(int i){
        id=i;
    }
    public void setName(String n){
        name=n;
    }
    public void setPrice(double p){
        price=p;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}

public class Getter_Setter {
    public static void main(String[] args) {
        Product p = new Product(1001, "Laptop", 41000);
        // p.setId(1001);
        // p.setPrice(41000);
        System.out.println("Product ID: " + p.getId());
        System.out.println("Product Name: " + p.getName());
        System.out.println("Product Price: " + p.getPrice());
        p.setName("Mobile");
        System.out.println("After changing name");
        System.out.println("Product ID: " + p.getId());
        System.out.println("Product Name: " + p.getName());
        System.out.println("Product Price: " + p.getPrice());

    }
}
