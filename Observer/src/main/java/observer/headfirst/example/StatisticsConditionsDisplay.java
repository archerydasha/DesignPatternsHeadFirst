package observer.headfirst.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dasha on 21.02.15.
 */
public class StatisticsConditionsDisplay extends WeatherObserver {
    private List<Float> temperatureStatistics = new ArrayList<Float>();
    private List<Float> humidityStatistics = new ArrayList<Float>();
    private List<Float> pressureStatistics = new ArrayList<Float>();

    public StatisticsConditionsDisplay(Subject subject) {
        super(subject);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        temperatureStatistics.add(temperature);
        humidityStatistics.add(humidity);
        pressureStatistics.add(pressure);
        display();
    }

    @Override
    public void display() {
        System.out.println("StatisticsConditionsDisplay at work");
        printStatistics(temperatureStatistics, "temperature");
        printStatistics(humidityStatistics, "humidity");
        printStatistics(pressureStatistics, "pressure");
    }

    private void printStatistics(List<Float> statistics, String statisticsName) {
        if (statistics.size() == 0) {
            System.out.println("There is no statistics for " + statisticsName + " yet.");
        } else {
            System.out.print(statisticsName + " log: ");
            for (int i = 0; i < statistics.size(); i++) {
                Float value = statistics.get(i);
                System.out.print(value);
                if (i != statistics.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
