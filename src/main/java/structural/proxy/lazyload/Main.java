package structural.proxy.lazyload;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int randomNum = 1 + (int) (Math.random() * 2);

        if (randomNum == 1) {
            System.out.println("no need to work...");
        } else {
            System.out.println("need to work...");
        }

        System.out.println("using real device:");
        Device realDevice = new RealDevice();
        if (randomNum == 2) {
            realDevice.doSomeWork();
        } else {
            System.out.println("but no work is done");
        }
        System.out.println("");

        System.out.println("using proxy device:");
        Device proxyDevice = new ProxyDevice();
        if (randomNum == 2) {
            proxyDevice.doSomeWork();
        } else {
            System.out.println("besides no work is done");
        }
    }
}
