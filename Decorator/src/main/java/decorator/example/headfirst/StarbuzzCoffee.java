package decorator.example.headfirst;

/**
 * Created by Dasha on 23.02.15.
 */
public class StarbuzzCoffee {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        printBeverage(beverage);

        Beverage beverage2 = new Whip(new Mocha(new Mocha(new DarkRoast())));
        printBeverage(beverage2);

        Beverage beverage3 = new Whip(new Mocha(new Soy(new HouseBlend())));
        printBeverage(beverage3);
    }

    private static void printBeverage(Beverage beverage) {
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
