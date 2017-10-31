/**
 * Key points: private constructor; static methods.
 * Creates a new instance of the class at compile time, before being requested requested the first time -> EAGER
 * Although it might be considered a bad practice, some use cases when the creation of the instance is not too
 * demanding might suit this scenario.
 *
 * Not thread-safe; In a multithreaded scenario, use the keyword synchronized for the getInstance class method, but take
 * into consideration the performance cost overhead.
 */
public class SingletonClassEager {

    private static final SingletonClassEager instance = new SingletonClassEager();

    private SingletonClassEager(){}

    public static SingletonClassEager getInstance() {
        return instance;
    }
}
