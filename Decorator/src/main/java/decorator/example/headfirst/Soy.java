package decorator.example.headfirst;

/**
 * Created by Dasha on 23.02.15.
 */
public class Soy extends BeverageDecorator {
    protected Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
