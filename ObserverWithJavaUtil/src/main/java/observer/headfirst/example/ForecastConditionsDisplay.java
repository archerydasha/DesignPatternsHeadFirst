package observer.headfirst.example;

import java.util.Observable;

/**
 * Created by Dasha on 21.02.15.
 */
public class ForecastConditionsDisplay extends WeatherObserverImpl {


    public ForecastConditionsDisplay(Observable observable) {
        super(observable);
    }

    public void display() {
        System.out.println("ForecastConditionsDisplay at work");
        System.out.println("Forecast is - weather is always good!");
    }

    @Override
    public void update(Observable o, Object arg) {
        display();
    }
}
