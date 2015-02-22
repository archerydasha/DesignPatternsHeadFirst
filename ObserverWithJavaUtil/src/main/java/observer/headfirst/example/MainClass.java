package observer.headfirst.example;

import java.util.Observer;

/**
 * Created by Dasha on 21.02.15.
 */
public class MainClass {
    public static void main(String[] args){
        WeatherDataObject subject = new WeatherDataObject();
        Observer currentConditionsObserver = new CurrentConditionsDisplay(subject);
        Observer statisticsConditionsObserver = new StatisticsConditionsDisplay(subject);
        Observer forecastConditionsObserver = new ForecastConditionsDisplay(subject);

        System.out.println("Updating data for current and statistics observers");
        subject.updateData(20, 37, 60);
        System.out.println();

        System.out.println("Updating data for current, statistics and forecast observers");
        subject.updateData(22, 35, 62);
        System.out.println();

        System.out.println("Updating data for statistics and forecast observers");
        subject.updateData(25, 37, 59);
        System.out.println();
    }
}
