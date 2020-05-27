package structural.proxy.logger;

public class Person implements Human {
    public void walk() {
        System.out.println("I'm walking...");
    }

    public void talk() {
        System.out.println("I'm talking...");
    }
}
