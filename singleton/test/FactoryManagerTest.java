import org.junit.Test;

public class FactoryManagerTest {

    @Test
    public void testFactoryManager() throws InterruptedException {
        FactoryManager factoryManager = FactoryManager.getInstance();
        factoryManager.playSongs();
    }
}
