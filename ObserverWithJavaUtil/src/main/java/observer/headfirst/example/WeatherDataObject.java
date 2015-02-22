package observer.headfirst.example;

import java.util.HashSet;
import java.util.Observable;
import java.util.Set;

/**
 * Created by Dasha on 21.02.15.
 */
public class WeatherDataObject extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public void updateData(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        setChanged();
        notifyObservers();
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getTemperature() {
        return temperature;
    }

}
