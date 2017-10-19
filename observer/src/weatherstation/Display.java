package weatherstation;

/**
 * Created by mihai-mbp on 19/10/2017.
 */
public class Display implements Observer{

    WeatherStation station;

    public Display(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        System.out.println(this.station.getTemperature());;
    }
}
