package decorator.example.headfirst;

/**
 * Created by Dasha on 23.02.15.
 */
public abstract class Beverage {
    protected String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

