package mini_assignment_3;

import java.util.*;

class Customer extends User {
    private List<Order> orders;
    private ShoppingCart shoppingCart;

    public Customer(String name, String email) {
        super(name, email);
        this.orders = new ArrayList<>();
        this.shoppingCart = new ShoppingCart();
    }

    public void addToCart(Product product, int quantity) {
        shoppingCart.addProduct(product, quantity);
    }

    public void removeFromCart(Product product, int quantity) {
        shoppingCart.removeProduct(product, quantity);
    }

    public void viewCart() {
        shoppingCart.viewCart();
    }

    public void placeOrder() {
        Order order = new Order(shoppingCart.getProducts(), this);
        orders.add(order);
        shoppingCart.clearCart();
    }
}