package observer.headfirst.example;

/**
 * Created by Dasha on 21.02.15.
 */
public abstract class WeatherObserverImpl implements WeatherObserver{
    protected WeatherDataObject subject;
    public WeatherObserverImpl(WeatherDataObject subject){
        this.subject = subject;
    }

    public void setSubject(WeatherDataObject subject){
        this.subject = subject;
    }
}
