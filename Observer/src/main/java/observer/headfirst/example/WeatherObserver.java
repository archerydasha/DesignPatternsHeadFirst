package observer.headfirst.example;

/**
 * Created by Dasha on 21.02.15.
 */
public abstract class WeatherObserver {
    protected Subject subject;
    public WeatherObserver(Subject subject){
        this.subject = subject;
    }
    public abstract void update(float temperature, float humidity, float pressure);
    public abstract void display();
}
