package observer.headfirst.example;

/**
 * Created by Dasha on 21.02.15.
 */
public class MainClass {
    public static void main(String[] args){
        WeatherDataObject subject = new WeatherDataObject();
        WeatherObserver currentConditionsObserver = new CurrentConditionsDisplay(subject);
        WeatherObserver statisticsConditionsObserver = new StatisticsConditionsDisplay(subject);
        WeatherObserver forecastConditionsObserver = new ForecastConditionsDisplay(subject);

        subject.registerObserver(currentConditionsObserver);
        subject.registerObserver(statisticsConditionsObserver);
        System.out.println("Updating data for current and statistics observers");
        subject.updateData(20, 37, 60);
        System.out.println();

        subject.registerObserver(forecastConditionsObserver);
        System.out.println("Updating data for current, statistics and forecast observers");
        subject.updateData(22, 35, 62);
        System.out.println();

        subject.unRegisterObserver(currentConditionsObserver);
        System.out.println("Updating data for statistics and forecast observers");
        subject.updateData(25, 37, 59);
        System.out.println();
    }
}
