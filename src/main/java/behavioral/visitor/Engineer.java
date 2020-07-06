package behavioral.visitor;

public class Engineer implements Visitor {

    public Engineer() {
        System.out.println("Engineer is ready to work!");
    }

    @Override
    public void visitEngine(Engine engine) {
        System.out.println("improve engine");
    }

    @Override
    public void visitGearBox(GearBox gearBox) {
        System.out.println("improve gear box");
    }

    @Override
    public void visitElectricCircuit(ElectricCircuit electricCircuit) {
        System.out.println("improve electric circuit");
    }
}
