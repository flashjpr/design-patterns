package weatherstation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mihai-mbp on 19/10/2017.
 */
public class WeatherStation implements Observable {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.removeIf(observer1 -> observer.equals(observer1));
    }

    @Override
    public void broadcast() {
        observers.forEach(observer -> observer.update());
    }

    public Integer getTemperature() {
        return 17;
    }
}
