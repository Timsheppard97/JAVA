public class Cafe {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = " your total is $";

        double mochaPrice = 3.50;
        double dripCoffeePrice = 4.70;
        double lattePrice = 5.40;
        double cappuccinoPrice = 4.20;

        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        boolean isOrderReady1 = false;
        boolean isOrderReady2 = false;
        boolean isOrderReady3 = false;
        boolean isOrderReady4 = false;

        System.out.println(generalGreeting + customer1);
        
        if (isOrderReady4) {
            System.out.println(customer4 + readyMessage + "and" + displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer4 + pendingMessage);
        }

        if (isOrderReady2) {
            System.out.println(generalGreeting + customer2 + displayTotalMessage + lattePrice*2);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        System.out.println(customer3 + displayTotalMessage + (lattePrice - dripCoffeePrice));
    }
}