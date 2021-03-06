package observer.headfirst.example;

/**
 * Created by Dasha on 21.02.15.
 */
public class CurrentConditionsDisplay extends WeatherObserverImpl {
    private String currentTemperature;
    private String currentHumidity;
    private String currentPressure;

    public CurrentConditionsDisplay(WeatherDataObject subject){
        super(subject);
        initializeWithUnknown(currentTemperature);
        initializeWithUnknown(currentHumidity);
        initializeWithUnknown(currentPressure);
    }

    private void initializeWithUnknown(String variable) {
        variable = "Unknown";
    }

    @Override
    public void update() {
        this.currentTemperature = String.valueOf(subject.getTemperature());
        this.currentHumidity = String.valueOf(subject.getHumidity());
        this.currentPressure = String.valueOf(subject.getPressure());
        display();
    }

    public void display() {
        System.out.println("CurrentConditionsDisplay at work");
        System.out.println("Current temperature is: " + currentTemperature);
        System.out.println("Current humidity is: " + currentHumidity);
        System.out.println("Current pressure is: " + currentPressure);
    }
}
