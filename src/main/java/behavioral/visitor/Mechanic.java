package behavioral.visitor;

public class Mechanic implements Visitor {

    public Mechanic() {
        System.out.println("Mechanic is ready to work!");
    }

    @Override
    public void visitEngine(Engine engine) {
        System.out.println("fix engine");
    }

    @Override
    public void visitGearBox(GearBox gearBox) {
        System.out.println("fix gear box");
    }

    @Override
    public void visitElectricCircuit(ElectricCircuit electricCircuit) {
        System.out.println("fix electric circuit");
    }
}
