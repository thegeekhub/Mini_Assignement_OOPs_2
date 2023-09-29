package mini_assignment_3;
import java.util.*;

class Seller extends User {
    private List<Product> products;

    public Seller(String name, String email) {
        super(name, email);
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void viewProducts() {
        for (Product product : products) {
            System.out.println(product.getName());
        }
    }
}