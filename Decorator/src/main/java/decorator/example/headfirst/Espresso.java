package decorator.example.headfirst;

/**
 * Created by Dasha on 23.02.15.
 */
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
