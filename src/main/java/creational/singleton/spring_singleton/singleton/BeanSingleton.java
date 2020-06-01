package creational.singleton.spring_singleton.singleton;

public class BeanSingleton {
    public BeanSingleton() {
        System.out.println("created: " + getClass().getName());
    }

    public void doBusinessLogic() {
        System.out.println("doBusinessLogic " + getClass().getName());
    }
}
