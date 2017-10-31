import javax.sound.midi.Track;
import java.awt.*;

public class FactoryManager {

    private static FactoryManager instance = null;
    private FactoryManager() {};

    public static FactoryManager getInstance() {
        if(instance == null) {
            instance = new FactoryManager();
        }
        return instance;
    }

    private int numberOfSongs = 12;

    public void playSongs() throws InterruptedException {
        for (int i = 0; i < numberOfSongs; i++) {
            System.out.println("Playing song " + i);
            java.awt.Toolkit.getDefaultToolkit().beep();
            Thread.sleep(1000);
        }
    }

}
