public class Main {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);
        System.out.println("Total Cost is: " + anOrder.totalCost());

        // Testing removeDigitalVideoDisc method
        anOrder.removeDigitalVideoDisc(dvd1); // remove dvd1 from the cart
        System.out.printf("Total Cost after removing dvd1 is: %.2f \n", anOrder.totalCost()); // removing dvd1 from the
                                                                                              // cart.
    }
}
