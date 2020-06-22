package behavioral.visitor;

public class GearBox implements CarElement {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitGearBox(this);
    }
}
