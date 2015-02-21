package observer.headfirst.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Dasha on 21.02.15.
 */
public class WeatherDataObject implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;
    private Set<WeatherObserver> observers = new HashSet<WeatherObserver>();

    public void updateData(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyAllObservers();
    }

    @Override
    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unRegisterObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for(WeatherObserver observer : observers){
            observer.update(temperature, humidity, pressure);
        }
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

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
        notifyAllObservers();
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
        notifyAllObservers();
    }
}
