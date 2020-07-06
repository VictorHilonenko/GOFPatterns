package behavioral.visitor;

public class Engine implements CarElement {
    private String abc;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitEngine(this);
    }
}
