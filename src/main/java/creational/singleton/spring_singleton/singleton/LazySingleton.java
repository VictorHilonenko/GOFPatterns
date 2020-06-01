package creational.singleton.spring_singleton.singleton;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazySingleton {
    public LazySingleton() {
        System.out.println("created: " + getClass().getName());
    }

    public void doBusinessLogic() {
        System.out.println("doBusinessLogic " + getClass().getName());
    }
}
