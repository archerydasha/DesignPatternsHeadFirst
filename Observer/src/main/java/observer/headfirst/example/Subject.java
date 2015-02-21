package observer.headfirst.example;

/**
 * Created by Dasha on 21.02.15.
 */
public interface Subject {
    void registerObserver(WeatherObserver observer);
    void unRegisterObserver(WeatherObserver observer);
    void notifyAllObservers();
}
