package observer.headfirst.example;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Dasha on 21.02.15.
 */
public abstract class WeatherObserverImpl implements Observer {
    Observable observable;
    protected WeatherDataObject subject;

    public WeatherObserverImpl(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
}
