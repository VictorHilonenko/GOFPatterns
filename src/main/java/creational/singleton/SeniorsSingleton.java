package creational.singleton;

public class SeniorsSingleton {
    private static SeniorsSingleton singleton;

    private SeniorsSingleton() {
    }

    public static SeniorsSingleton getInstance() {
        if (singleton == null) {
            synchronized (SeniorsSingleton.class) {
                if (singleton == null) {
                    singleton = new SeniorsSingleton();
                }
            }
        }

        return singleton;
    }

    //business logic
}
