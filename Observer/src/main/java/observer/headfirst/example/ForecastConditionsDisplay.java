package observer.headfirst.example;

/**
 * Created by Dasha on 21.02.15.
 */
public class ForecastConditionsDisplay extends WeatherObserver {


    public ForecastConditionsDisplay(Subject subject) {
        super(subject);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        display();
    }

    @Override
    public void display() {
        System.out.println("ForecastConditionsDisplay at work");
        System.out.println("Forecast is - weather is always good!");
    }
}
