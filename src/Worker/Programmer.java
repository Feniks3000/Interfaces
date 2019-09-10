package Worker;

public class Programmer extends Worker implements CanProgramming {
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void writeCode() {
        System.out.println("Не спал всю ночь, писал код");
    }
}
