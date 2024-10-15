public class Main {
    public static void main(String[] args) {
            double price = 0;
            double shipCost = 0;
            final double MIN_PRICE = 100;
            final double RATE = 0.02;
            System.out.println("Please enter price of item");
            System.out.println("120");
            price = 120;
            if (price >= MIN_PRICE) {
                shipCost = 0;
            }
            else {
                shipCost = price * RATE;
            }
            price = price + shipCost;
            System.out.println("Your shipping price is $" + shipCost + " and your total price is $" + price);
    }
}