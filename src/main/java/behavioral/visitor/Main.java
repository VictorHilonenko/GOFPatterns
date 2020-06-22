package behavioral.visitor;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CarElement> carElements = Arrays.asList(new Engine(), new GearBox(), new ElectricCircuit());

        Mechanic mechanic = new Mechanic();

        for (CarElement carElement : carElements) {
            carElement.accept(mechanic);
        }

        System.out.println("");

        Engineer engineer = new Engineer();

        for (CarElement carElement : carElements) {
            carElement.accept(engineer);
        }
    }
}
