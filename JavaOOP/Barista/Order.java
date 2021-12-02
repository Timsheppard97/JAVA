import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    ArrayList<Item> items = new ArrayList<Item>();

    //constructor
    public Order() {
        this.name = "Guest";
    }

    public Order(String name) {
        this.name = name;
    }

    //methods
    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if (this.ready == true) {
            return "Your order is ready.";
        }
        return "Thank you for waiting. Your order will be ready soon.";
    }

    public double getOrderTotal() {
        double total = 0.0;
        for (Item i: this.items) {
            total += i.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.printf("Customer Name: %s", this.name);
        for (Item i: this.items) {
            System.out.println(i.getName() + " - $" + i.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }

    //getting and setting
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getReady() {
        return this.ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }
}