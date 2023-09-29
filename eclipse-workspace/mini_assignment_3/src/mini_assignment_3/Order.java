package mini_assignment_3;
import java.util.*;

class Order {
    private List<Product> products;
    private Customer customer;
    private Date orderDate;

    public Order(List<Product> products, Customer customer) {
        this.products = products;
        this.customer = customer;
        this.orderDate = new Date();
    }


	public double getTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder orderDetails = new StringBuilder();
        orderDetails.append("Order Date: ").append(orderDate).append("\n");
        orderDetails.append("Customer: ").append(customer.getName()).append("\n");
        orderDetails.append("Products:\n");
        for (Product product : products) {
            orderDetails.append("- ").append(product.getName()).append(": $").append(product.getPrice()).append("\n");
        }
        orderDetails.append("Total: $").append(getTotal());
        return orderDetails.toString();
    }
}




