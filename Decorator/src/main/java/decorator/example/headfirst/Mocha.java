package decorator.example.headfirst;

/**
 * Created by Dasha on 23.02.15.
 */
public class Mocha extends BeverageDecorator {
    protected Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
