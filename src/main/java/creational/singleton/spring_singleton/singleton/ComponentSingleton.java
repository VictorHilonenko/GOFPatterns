package creational.singleton.spring_singleton.singleton;

import org.springframework.stereotype.Component;

@Component
public class ComponentSingleton {
    public ComponentSingleton() {
        System.out.println("created: " + getClass().getName());
    }

    public void doBusinessLogic() {
        System.out.println("doBusinessLogic " + getClass().getName());
    }
}
