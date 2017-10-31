/**
 * Key points: private constructor; static methods.
 * Creates a new instance of the class if it does not exist ONLY when requested the first time -> LAZY
 *
 * Not thread-safe; In a multithreaded scenario, use the keyword synchronized for the getInstance class method, but take
 * into consideration the performance cost overhead.
 */
public class SingletonClassLazy {

    private static SingletonClassLazy instance = null;

    private SingletonClassLazy(){}

    public static SingletonClassLazy getInstance() {
        if(instance == null) {
            instance = new SingletonClassLazy();
        }
        return instance;
    }
}
