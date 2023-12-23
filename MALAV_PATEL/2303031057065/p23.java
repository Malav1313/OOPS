import java.util.ArrayList;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Product{name='" + name + "', price=" + price + '}';
    }
}

public class p23 {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1499.99));
        products.add(new Product("Smartphone", 499.99));

        System.out.println("Products in the shop:");
        for (Product product : products) {
            System.out.println(product);
        }

        products.add(new Product("Headphones", 199.99));

        System.out.println("\nProducts after adding new item:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
