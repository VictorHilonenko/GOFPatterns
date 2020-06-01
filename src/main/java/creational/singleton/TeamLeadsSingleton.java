package creational.singleton;

public class TeamLeadsSingleton {
    private static volatile TeamLeadsSingleton singleton;

    private TeamLeadsSingleton() {
    }

    public static TeamLeadsSingleton getInstance() {
        if (singleton == null) {
            synchronized (TeamLeadsSingleton.class) {
                if (singleton == null) {
                    singleton = new TeamLeadsSingleton();
                }
            }
        }

        return singleton;
    }

    //business logic
}
