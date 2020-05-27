package structural.proxy.logger;

import java.lang.reflect.Proxy;

public class Main {
    @SuppressWarnings("unchecked")
    public static <T> T withLogging(T target, Class<T> itf) {
        return (T) Proxy.newProxyInstance(
                itf.getClassLoader(),
                new Class<?>[] {itf},
                new LoggingHandler(target)
        );
    }

    public static void main(String[] args) {
        Person person = new Person();

        Human loggedHuman = withLogging(person, Human.class);

        loggedHuman.walk();
        loggedHuman.walk();
        loggedHuman.talk();

        System.out.println(loggedHuman);
    }
}
