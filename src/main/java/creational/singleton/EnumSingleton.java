package creational.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void doBusinessLogic() {
        System.out.println("doBusinessLogic");
    }

    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        singleton.doBusinessLogic();
    }
}

