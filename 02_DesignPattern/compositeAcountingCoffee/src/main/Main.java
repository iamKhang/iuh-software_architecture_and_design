package main;

import component.*;

public class Main {
    public static void main(String[] args) {
        // Create coffee shop
        CoffeeShop coffeeShop = new CoffeeShop("IUH Coffee Shop");

        // Create Table 1
        Table table1 = new Table(1);
        table1.add(new Product("Black Sugar Milk Tea (Size L)", 45000, 1));
        table1.add(new Product("Flan Cake", 15000, 2));
        
        // Create Table 2
        Table table2 = new Table(2);
        table2.add(new Product("Vietnamese Coffee", 29000, 2));
        table2.add(new Product("Green Tea", 25000, 1));
        table2.add(new Product("Cheese Cake", 35000, 1));

        // Create Table 3
        Table table3 = new Table(3);
        table3.add(new Product("Espresso", 35000, 1));
        table3.add(new Product("Cappuccino", 45000, 2));
        table3.add(new Product("Croissant", 25000, 2));
        table3.add(new Product("Tiramisu", 40000, 1));

        // Add tables to coffee shop
        coffeeShop.add(table1);
        coffeeShop.add(table2);
        coffeeShop.add(table3);

        // Print the entire coffee shop revenue report
        coffeeShop.print();
    }
} 