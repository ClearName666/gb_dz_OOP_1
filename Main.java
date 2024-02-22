public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        market.addPeople("паша1");
        market.addPeople("паша2");
        market.addPeople("паша3");
        market.addPeople("паша4");
        market.addPeople("паша5");
        market.addPeople("паша6");
        market.addPeople("паша7");
        for (int i = 0; i < 10; i++) market.update();
    }
}
