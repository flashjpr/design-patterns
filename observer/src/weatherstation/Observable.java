package weatherstation;

/**
 * Created by mihai-mbp on 19/10/2017.
 */
public interface Observable {
    public void add(Observer observer);
    public void remove(Observer observer);
    public void broadcast();
}
