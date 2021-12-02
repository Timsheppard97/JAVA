import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");
        Order order5 = new Order("Mike");

        Item item1 = new Item("drip coffee", 1.50);
        Item item2 = new Item("latte", 3.75);
        Item item3 = new Item("cappuccino", 4.25);

        order2.addItem(item1);
        order1.addItem(item1);
        order1.addItem(item2);

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
        System.out.println(order4);
        System.out.println(order5);

        order2.setReady(true);
        System.out.println(order2.getStatusMessage());

        System.out.println(order1.getOrderTotal());

        order1.display();
        
    }
}