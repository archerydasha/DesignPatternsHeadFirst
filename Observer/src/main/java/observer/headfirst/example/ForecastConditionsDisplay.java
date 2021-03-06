package observer.headfirst.example;

/**
 * Created by Dasha on 21.02.15.
 */
public class ForecastConditionsDisplay extends WeatherObserverImpl {


    public ForecastConditionsDisplay(WeatherDataObject subject) {
        super(subject);
    }

    @Override
    public void update() {
        display();
    }

    public void display() {
        System.out.println("ForecastConditionsDisplay at work");
        System.out.println("Forecast is - weather is always good!");
    }
}
