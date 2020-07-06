package behavioral.visitor;

public class ElectricCircuit implements CarElement {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElectricCircuit(this);
    }
}
