package structural.proxy.lazyload;

public class ProxyDevice implements Device {
    private Device deviceInstance;

    public ProxyDevice() throws InterruptedException {
        System.out.println("[ProxyDevice] I've started and ready to work!");
    }

    public void doSomeWork() throws InterruptedException {
        if (deviceInstance == null) {
            deviceInstance = new RealDevice();
        }

        deviceInstance.doSomeWork();
    }
}
