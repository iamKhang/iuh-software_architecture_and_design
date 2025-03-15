package component;

import java.util.ArrayList;
import java.util.List;

public class Table implements IMenuComponent {
    private int tableNumber;
    private List<IMenuComponent> items;

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
        this.items = new ArrayList<>();
    }

    public void add(IMenuComponent component) {
        items.add(component);
    }

    public void remove(IMenuComponent component) {
        items.remove(component);
    }

    @Override
    public double getPrice() {
        return items.stream()
                   .mapToDouble(IMenuComponent::getPrice)
                   .sum();
    }

    @Override
    public void print() {
        System.out.println("\n=== Table " + tableNumber + " ===");
        items.forEach(IMenuComponent::print);
        System.out.printf("Total for Table %d: %.2f VND%n", 
            tableNumber, getPrice());
    }
} 