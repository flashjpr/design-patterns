package weatherstation;

/**
 * Created by mihai-mbp on 19/10/2017.
 */
public class Context {

    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();
        Display display = new Display(station);
        station.add(display);
        station.broadcast();
    }
}
