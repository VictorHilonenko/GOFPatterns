package creational.singleton;

public class JuniorsSingleton {
    private static JuniorsSingleton singleton;

    private JuniorsSingleton() {
    }

    public synchronized static JuniorsSingleton getInstance() {
        if (singleton == null) {
            singleton = new JuniorsSingleton();
        }

        return singleton;
    }

    //business logic
}
