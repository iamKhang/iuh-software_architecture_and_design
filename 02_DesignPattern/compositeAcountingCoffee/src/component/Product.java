package component;

public class Product implements IMenuComponent {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double getPrice() {
        return price * quantity;
    }

    @Override
    public void print() {
        System.out.printf("%s (Quantity: %d) - Price: %.2f VND%n", 
            name, quantity, getPrice());
    }
} 