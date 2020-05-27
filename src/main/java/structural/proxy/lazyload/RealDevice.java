package structural.proxy.lazyload;

public class RealDevice implements Device {
    public RealDevice() throws InterruptedException {
        System.out.print("[RealDevice] I'm starting");
        for (int i = 0; i < 15; i++) {
            Thread.sleep(500);
            System.out.print(".");
        }
        System.out.println("");

        System.out.println("Huh, I'm ready to work!");
    }

    public void doSomeWork() throws InterruptedException {
        System.out.print("I work");
        for (int i = 0; i < 15; i++) {
            Thread.sleep(100);
            System.out.print(".");
        }
        System.out.println("");

        System.out.println("The work is done!");
    }
}
