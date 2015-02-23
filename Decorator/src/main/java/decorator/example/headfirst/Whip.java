package decorator.example.headfirst;

/**
 * Created by Dasha on 23.02.15.
 */
public class Whip extends BeverageDecorator {
    protected Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
