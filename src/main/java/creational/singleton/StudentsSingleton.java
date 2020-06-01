package creational.singleton;

public class StudentsSingleton {
    private static StudentsSingleton singleton;

    private StudentsSingleton() {
    }

    public static StudentsSingleton getInstance() {
        if (singleton == null) {
            singleton = new StudentsSingleton();
        }

        return singleton;
    }

    //business logic
}
