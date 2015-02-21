package observer.headfirst.example;

/**
 * Created by Dasha on 21.02.15.
 */
public class CurrentConditionsDisplay extends WeatherObserver{
    private String currentTemperature;
    private String currentHumidity;
    private String currentPressure;

    public CurrentConditionsDisplay(Subject subject){
        super(subject);
        initializeWithUnknown(currentTemperature);
        initializeWithUnknown(currentHumidity);
        initializeWithUnknown(currentPressure);
    }

    private void initializeWithUnknown(String variable) {
        variable = "Unknown";
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.currentTemperature = String.valueOf(temperature);
        this.currentHumidity = String.valueOf(humidity);
        this.currentPressure = String.valueOf(pressure);
        display();
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay at work");
        System.out.println("Current temperature is: " + currentTemperature);
        System.out.println("Current humidity is: " + currentHumidity);
        System.out.println("Current pressure is: " + currentPressure);
    }
}
