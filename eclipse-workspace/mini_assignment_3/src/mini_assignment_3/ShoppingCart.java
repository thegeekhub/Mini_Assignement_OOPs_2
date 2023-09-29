package mini_assignment_3;
import java.util.*;

class ShoppingCart {
    private Map<Product, Integer> cartItems;

    public ShoppingCart() {
        cartItems = new HashMap<>();
    }

    public void addProduct(Product product, int quantity) {
        cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
    }

    public void removeProduct(Product product, int quantity) {
        if (cartItems.containsKey(product)) {
            int currentQuantity = cartItems.get(product);
            if (currentQuantity > quantity) {
                cartItems.put(product, currentQuantity - quantity);
            } else {
                cartItems.remove(product);
            }
        }
    }

    public void viewCart() {
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(product.getName() + " - Quantity: " + quantity);
        }
    }
    public List<Product> getProducts() {
        return new ArrayList<>(cartItems.keySet());
    }

    public void clearCart() {
        cartItems.clear();
    }
}
