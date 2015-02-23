package decorator.example.headfirst;

/**
 * Created by Dasha on 23.02.15.
 */
public class Decaf extends Beverage {
    public Decaf() {
       description = "Decaf coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
