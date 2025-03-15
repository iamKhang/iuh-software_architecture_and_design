package component;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop implements IMenuComponent {
    private String name;
    private List<IMenuComponent> tables;

    public CoffeeShop(String name) {
        this.name = name;
        this.tables = new ArrayList<>();
    }

    public void add(IMenuComponent component) {
        tables.add(component);
    }

    public void remove(IMenuComponent component) {
        tables.remove(component);
    }

    @Override
    public double getPrice() {
        return tables.stream()
                    .mapToDouble(IMenuComponent::getPrice)
                    .sum();
    }

    @Override
    public void print() {
        System.out.println("\n====== " + name + " ======");
        tables.forEach(IMenuComponent::print);
        System.out.printf("\nTotal Revenue: %.2f VND%n", getPrice());
        System.out.println("=====================");
    }
} 