package behavioral.visitor;

public interface Visitor {

    void visitEngine(Engine engine);

    void visitGearBox(GearBox gearBox);

    void visitElectricCircuit(ElectricCircuit electricCircuit);

}
