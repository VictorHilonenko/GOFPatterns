package creational.singleton.spring_singleton;

import creational.singleton.spring_singleton.singleton.BeanSingleton;
import creational.singleton.spring_singleton.singleton.ComponentSingleton;
import creational.singleton.spring_singleton.singleton.LazySingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        BeanSingleton beanSingleton = ctx.getBean("beanSingleton", BeanSingleton.class);
        beanSingleton.doBusinessLogic();

        ComponentSingleton componentSingleton = ctx.getBean("componentSingleton", ComponentSingleton.class);
        componentSingleton.doBusinessLogic();

        LazySingleton lazySingleton = ctx.getBean("lazySingleton", LazySingleton.class);
        lazySingleton.doBusinessLogic();

        SpringApplication.exit(ctx);
    }

}
