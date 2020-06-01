package creational.singleton.spring_singleton.config;

import creational.singleton.spring_singleton.singleton.BeanSingleton;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "beanSingleton")
    public BeanSingleton beanSingleton() {
        return new BeanSingleton();
    }

}
